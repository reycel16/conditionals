package com.example.conditionalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity1 extends AppCompatActivity {
    private TextView textView;
    private EditText inputText;
    private Button showBtn;

    private Button backButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);


        showBtn = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        inputText = findViewById(R.id.editTextText);
        showBtn.setOnClickListener(view -> textView.setText("Hi " + inputText.getText()));

        backButton = findViewById(R.id.button4);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity1.this, mainMenu.class);
                startActivity(intent3);
            }
        });


    }
}