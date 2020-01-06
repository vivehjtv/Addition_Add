package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        Intent intent=getIntent();
        String message = intent.getStringExtra("EXREA_MESSAGE");
        TextView textView= findViewById(R.id.display_message);
        textView.setText(message);
    }
}
