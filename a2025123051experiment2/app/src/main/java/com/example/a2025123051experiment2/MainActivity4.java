package com.example.a2025123051experiment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RelativeLayout;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity4 extends AppCompatActivity {

    private RelativeLayout uc3layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uc3);

        uc3layout = (RelativeLayout) findViewById(R.id.myLayout);

        Timer t = new Timer();
        MyTimer mt = new MyTimer();

        t.schedule(mt,2000,2000);

    }
    class MyTimer extends TimerTask{

        public void run(){
            runOnUiThread(new Runnable() {
                Random r = new Random();

                @Override
                public void run() {
                    int Images[] = {R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,R.drawable.image5};
                    uc3layout.setBackgroundResource(Images[getRandomNumber()]);
                }
                private int getRandomNumber(){
                    return new Random().nextInt(5);

                }

            });
        }  
    }
}