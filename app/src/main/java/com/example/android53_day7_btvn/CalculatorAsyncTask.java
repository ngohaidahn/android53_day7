package com.example.android53_day7_btvn;

import android.os.AsyncTask;
import android.widget.ProgressBar;
import android.widget.TextView;

public class CalculatorAsyncTask extends AsyncTask<String, Integer, Long> {
    TextView tv1, tv4;
    int n;
    int sum=0;
    private ProgressBar progressBar;
    private ProgressBar progressBar2;

    private TextView textView;

    public CalculatorAsyncTask(ProgressBar progressBar, TextView textView, ProgressBar progressBar2) {
        this.progressBar = progressBar;
        this.textView = textView;
        this.progressBar2 = progressBar2;
    }

    public CalculatorAsyncTask() {
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        progressBar.setMax(100);
        textView.setText("Bắt đầu: ");
    }

    @Override
    protected Long doInBackground(String... strings) {
        tv4.setText(sum);
        return null;


    }
    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        int progress = values[0];
        progressBar.setProgress(progress);
        textView.setText("Đang tính toán... " + progress + "%");
    }

    @Override
    protected void onPostExecute(Long aLong) {
        super.onPostExecute(aLong);

    }


}
