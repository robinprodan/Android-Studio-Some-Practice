package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {
    TextView b;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        b=(TextView) findViewById(R.id.bb);
        textView=(TextView)findViewById(R.id.display);

    {
                Intent intent = getIntent();

                String message = intent.getStringExtra("EXTRA_MESSAGE");

                textView.setText(message);
            }
        };

    }


