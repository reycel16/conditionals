package com.example.conditionalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private TextView result1;
    private TextView result2;
    private TextView result3;
    private TextView result4;
    private Button equal;
    private Button backButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        num1 = findViewById(R.id.etNum1);
        num2 = findViewById(R.id.etNum2);
        result1 = findViewById(R.id.textView1);
        result2 = findViewById(R.id.textView2);
        result3 = findViewById(R.id.textView3);
        result4 = findViewById(R.id.textView4);
        equal = findViewById(R.id.button);

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int sum = number1 + number2;
                int difference = number1 - number2;
                int product = number1 * number2;
                float quotient = (float) number1 / (float) number2;

                result1.setText(String.valueOf(sum));
                result2.setText(String.valueOf(difference));
                result3.setText(String.valueOf(product));
                result4.setText(String.valueOf(quotient));

            }
        });
        backButton = findViewById(R.id.backbuttton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity2.this, mainMenu.class);
                startActivity(intent3);
            }
        });
    }
}