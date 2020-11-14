package sliit.maruthy;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class loadingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        Thread welcomeThread = new Thread() {

            @Override
            public void run() {
                try {
                    super.run();
                    sleep(10000);  //Delay of 10 seconds
                } catch (Exception ignored) {

                } finally {

                    Intent i = new Intent(loadingActivity.this,
                            Login.class);
                    startActivity(i);
                    finish();
                }
            }
        };
        welcomeThread.start();
    }
}