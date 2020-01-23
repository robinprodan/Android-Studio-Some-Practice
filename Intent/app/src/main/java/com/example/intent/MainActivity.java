package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button next;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        next=(Button)findViewById(R.id.goBtn);
        editText=findViewById(R.id.editText);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = editText.getText().toString();
                Intent i = new Intent(MainActivity.this, secondActivity.class);
                i.putExtra("EXTRA_MESSAGE",message);
                startActivity(i);
            }
        });
    }
}


