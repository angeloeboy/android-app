package com.example.swapcheck;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;


import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView resultView = findViewById(R.id.resultView);
        String result = getIntent().getStringExtra("result");
        resultView.setText(result);
    }
}
