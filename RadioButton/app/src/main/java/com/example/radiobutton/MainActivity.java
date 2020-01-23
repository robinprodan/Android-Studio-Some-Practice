package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   EditText e1;
   RadioButton r1,r2;
   Button convertBtn;
   TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText)findViewById(R.id.e1);
        r1=(RadioButton)findViewById(R.id.r1);
        r2=(RadioButton)findViewById(R.id.r2);

        convertBtn=(Button)findViewById(R.id.btn);
        result=(TextView)findViewById(R.id.tv);



    }
 public void convertMethod(View view)
 {
     String s = e1.getText().toString();
     double b = Double.parseDouble(s);
     if(r1.isChecked()){
         b = b*(1/84.4);
         String ans = Double.toString(b);
         ans =String.format("%.2f",b);
         result.setText(ans);

     }
     else if(r2.isChecked()){
         b = b*(1/64.4);
         String ans = Double.toString(b);
         ans =String.format("%.2f",b);
         result.setText(ans);
     }
     else
     {
         Toast.makeText(this, "at first select a currency", Toast.LENGTH_SHORT).show();
         result.setText("Select Currency");
     }
 }
}
