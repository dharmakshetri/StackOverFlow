package co.apidemos.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import co.apidemos.R;
import co.apidemos.model.GitHubData;

/**
 * Created by horror on 12/29/16.
 */

public class GitHubAdapter extends RecyclerView.Adapter<GitHubAdapter.GitHubUserViewHolder> {
    private List<GitHubData> repoData;
    private int rowLayout;
    private Context context;


    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public int getRowLayout() {
        return rowLayout;
    }

    public void setRowLayout(int rowLayout) {
        this.rowLayout = rowLayout;
    }

    public List<GitHubData> getRepoData() {
        return repoData;
    }

    public void setRepoData(List<GitHubData> repoData) {
        this.repoData = repoData;
    }


    public GitHubAdapter(Context context, int rowLayout, List<GitHubData> repoData) {
        this.setContext(context);
        this.setRowLayout(rowLayout);
        this.setRepoData(repoData);
    }

    @Override
    public GitHubAdapter.GitHubUserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new GitHubUserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(GitHubUserViewHolder holder, int position) {

        holder.tvGitHubRepoName.setText(repoData.get(position).getName() +" ("+ repoData.get(position).getLanguage()+" )");

        String description=repoData.get(position).getDescription();
        /*if(description.equals(null) || description==null){
            description=getContext().getResources().getString(R.string.no_description_found);
        }*/
        holder.tvGitHubRepoDescription.setText(description);
    }

    @Override
    public int getItemCount() {
        return repoData.size();
    }

    public  class GitHubUserViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.tvGitHubReposName)
        TextView tvGitHubRepoName;

        @BindView(R.id.tvGitHubRepoDescription)
        TextView tvGitHubRepoDescription;


        public GitHubUserViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
