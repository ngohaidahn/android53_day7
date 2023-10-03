package com.example.android53_day7_btvn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private TextView tv1,textView;
    private EditText editTextNumber;
    Button btnTong;
    ProgressBar progressBar, progressBar2;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv1);
        editTextNumber = (EditText) findViewById(R.id.editTextNumber);
        btnTong = (Button) findViewById(R.id.btnTong);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        progressBar2= (ProgressBar) findViewById(R.id.progressBar2);

        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = editTextNumber.getText().toString().trim();
                progressBar.setVisibility(View.VISIBLE);
                progressBar2.setVisibility(View.VISIBLE);
                Timer timer = new Timer();
                TimerTask timerTask = new TimerTask() {
                    @Override
                    public void run() {
                        counter++;
                        progressBar.setProgress(counter);
                        progressBar2.setProgress(counter);
                        if (counter == 100) {
                            timer.cancel();

                            Intent intent = new Intent(MainActivity.this, Abc.class);
                            intent.putExtra("Key", number);
                            startActivity(intent);
                            CalculatorAsyncTask asyncTask = new CalculatorAsyncTask(progressBar,textView,progressBar2);

                        }
                    }
                };
                timer.schedule(timerTask, 100, 100);

//                String number = editTextNumber.getText().toString().trim();
//
//                Intent intent = new Intent(MainActivity.this, Abc.class);
//
//                intent.putExtra("Key", number);
//                startActivity(intent);
            }
        });
    }
}