package com.example.a2025123051experiment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uc1);
    }
    public void horizontallayout(View view){
        setContentView(R.layout.horizontallayout);
    }
    public void verticallayout(View view){
        setContentView(R.layout.verticallayout);
    }
    public void alignleftlayout(View view){
        setContentView(R.layout.alignleftlayout);
    }

    public void homeButton(View view){
        findViewById<ImageView>(R.id.backButton).setOnClickListener(View.OnClickListener {
            finish()
        })
//        setContentView(R.layout.activity_main);
    }
}