package com.example.swapcheck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText textField1 = findViewById(R.id.textField1);
        final EditText textField2 = findViewById(R.id.textField2);
        Button swapButton = findViewById(R.id.swapButton);
        Button compareButton = findViewById(R.id.compareButton);

        swapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = textField1.getText().toString();
                textField1.setText(textField2.getText().toString());
                textField2.setText(temp);
            }
        });

        compareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                if (textField1.getText().toString().equals(textField2.getText().toString())) {
                    intent.putExtra("result", "SAME");
                } else {
                    intent.putExtra("result", "NOT THE SAME");
                }
                startActivity(intent);
            }
        });
    }
}
