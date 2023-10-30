package com.example.intentmsg;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button button;
    String acceptInput;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button2);
        editText = findViewById(R.id.editTextText);

        button.setOnClickListener(view -> {
            acceptInput = editText.getText().toString();
            Intent toNewActivity = new Intent(MainActivity.this,SecondActivity.class);
            toNewActivity.putExtra("mymessage",acceptInput);
            startActivity(toNewActivity);
        });
    }
}