package anasalbassam.com.interactivestory.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import anasalbassam.com.interactivestory.Model.Page;
import anasalbassam.com.interactivestory.R;

public class StoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent intent = getIntent();
        String name = intent.getStringExtra(getString(R.string.name_key));
        if(name == null){
            name = "Friend";
        }

    }
}
