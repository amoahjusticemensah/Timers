package com.amjustice.timersdemo;



import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;





public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        new CountDownTimer(10000, 1000) {

            public void onTick(long millisecondsUntilDone){


                //Countdown is counting down (every second)


                Log.i("Seconds left", String.valueOf(millisecondsUntilDone / 1000));
            }

            public void onFinish() {

                // Counter is finished!

                Log.i("Done!", "Countdown Timer Finished");

            }
        }.start();

        /*
        android.os.Handler handler = new android.os.Handler();
        Runnable run = new Runnable() {
            @Override
            public void run() {
                // Insert code to be run every second

                Log.i("Runnable has run!", "a second must have passed");
            }

        };

        handler.post(run);

        */

    }
}


