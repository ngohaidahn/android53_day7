package com.example.android53_day7_btvn;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Abc extends AppCompatActivity {
    TextView tv1, tv4;
    int n;
    int sum=0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        tv1 = (TextView) findViewById(R.id.tv1);
//        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);


        int number1 = Integer.parseInt(getIntent().getStringExtra("Key"));
        for (int i = 0; i <=number1; i++) {
                sum +=i;
        }
        tv4.setText("Tổng các số tự nhiên từ 1 đến " +number1 + "là: " + sum);
    }
}
