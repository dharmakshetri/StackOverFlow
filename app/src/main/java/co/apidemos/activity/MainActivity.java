package co.apidemos.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import co.apidemos.BaseActivity;
import co.apidemos.R;

/**
 * Created by dharma kshetri on 12/27/16.
 */
public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        creatingLayouts();
    }

    public void creatingLayouts(){
        setContentView(R.layout.activity_main);
    }
    // stackoverflow onclick
    public void onClickStackOverFlow(View view){

        Intent intentStackOverFlow= new Intent(MainActivity.this, StackOverFlowActivity.class);
        startActivity(intentStackOverFlow);
    }

    // github onclick
    public void onClickGitHub(View view){

        Intent intentGitHub= new Intent(MainActivity.this, GitHubActivity.class);
        startActivity(intentGitHub);
    }

}
