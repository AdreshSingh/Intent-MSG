package com.example.intentmsg;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    TextView textView;
    String dataFromMainScreen = "";
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        dataFromMainScreen = getIntent().getStringExtra("mymessage");


        textView.setText(getString(R.string.textview,dataFromMainScreen));
        button.setOnClickListener(view -> {
            Intent goBack = new Intent(SecondActivity.this, MainActivity.class);
            startActivity(goBack);
        });
    }
}