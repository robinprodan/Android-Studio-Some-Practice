package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bAdd, bSub, bMul, bDiv, bEql, bCl;
    TextView tvDispaly;
    Double firstNum, secondNum, result;
    String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0 = (Button)findViewById(R.id.btn0);
        b1 = (Button)findViewById(R.id.btn1);
        b2 = (Button)findViewById(R.id.btn2);
        b3 = (Button)findViewById(R.id.btn3);
        b4 = (Button)findViewById(R.id.btn4);
        b5 = (Button)findViewById(R.id.btn5);
        b6 = (Button)findViewById(R.id.btn6);
        b7 = (Button)findViewById(R.id.btn7);
        b8 = (Button)findViewById(R.id.btn8);
        b9 = (Button)findViewById(R.id.btn9);

        bAdd = (Button)findViewById(R.id.btnPlus);
        bSub = (Button)findViewById(R.id.btnMinus);
        bMul = (Button)findViewById(R.id.btnMlt);
        bDiv = (Button)findViewById(R.id.btnDvd);
        bEql = (Button)findViewById(R.id.btnEql);

        bCl = (Button)findViewById(R.id.btnCncl);
        tvDispaly = (TextView)findViewById(R.id.display);
    }
    public void methodOne(View view) {
        String input = tvDispaly.getText()+"1";
        tvDispaly.setText(input);
    }
    public void methodTwo(View view) {
        String input = tvDispaly.getText()+"2";
        tvDispaly.setText(input);
    }
    public void methodThree(View view) {
        String input = tvDispaly.getText()+"3";
        tvDispaly.setText(input);
    }
    public void methodAdd(View view) {
        firstNum = Double.parseDouble(tvDispaly.getText().toString());
        tvDispaly.setText("");
        operation = "+";
    }


    public void methodFour(View view) {
        String input = tvDispaly.getText()+"4";
        tvDispaly.setText(input);
    }
    public void methodFive(View view) {
        String input = tvDispaly.getText()+"5";
        tvDispaly.setText(input);
    }
    public void methodSix(View view) {
        String input = tvDispaly.getText()+"6";
        tvDispaly.setText(input);
    }
    public void methodSub(View view) {
        firstNum = Double.parseDouble(tvDispaly.getText().toString());
        tvDispaly.setText("");
        operation = "-";
    }


    public void methodSeven(View view) {
        String input = tvDispaly.getText()+"7";
        tvDispaly.setText(input);
    }
    public void methodEight(View view) {
        String input = tvDispaly.getText()+"8";
        tvDispaly.setText(input);
    }
    public void methodNine(View view) {
        String input = tvDispaly.getText()+"9";
        tvDispaly.setText(input);
    }
    public void methodMul(View view) {
        firstNum = Double.parseDouble(tvDispaly.getText().toString());
        tvDispaly.setText("");
        operation = "*";
    }


    public void methodZero(View view) {
        String input = tvDispaly.getText()+"0";
        tvDispaly.setText(input);
    }
    public void methodCncl(View view) {
        tvDispaly.setText("");
    }
    public void methodDvd(View view) {
        firstNum = Double.parseDouble(tvDispaly.getText().toString());
        tvDispaly.setText("");
        operation = "/";
    }

    public void methodEql(View view) {
        String answer;
        secondNum = Double.parseDouble(tvDispaly.getText().toString());
        switch (operation) {
            case  "+" :
                result = firstNum+secondNum;
                answer = String.format("%.2f", result);
                tvDispaly.setText(answer);
                break;

            case  "-" :
                result = firstNum-secondNum;
                answer = String.format("%.2f", result);
                tvDispaly.setText(answer);
                break;

            case  "*" :
                result = firstNum*secondNum;
                answer = String.format("%.2f", result);
                tvDispaly.setText(answer);
                break;

            case  "/" :
                result = firstNum/secondNum;
                answer = String.format("%.2f", result);
                tvDispaly.setText(answer);
                break;
        }
    }
}