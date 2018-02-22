package com.example.week2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Calculator extends AppCompatActivity {
    //View announce
    String expressionText;
    TextView expressionTextView;
    TextView answerTextView;
    ImageButton button0;
    ImageButton button1;
    ImageButton button2;
    ImageButton button3;
    ImageButton button4;
    ImageButton button5;
    ImageButton button6;
    ImageButton button7;
    ImageButton button8;
    ImageButton button9;
    ImageButton buttonPlus;
    ImageButton buttonMinus;
    ImageButton buttonTimes;
    ImageButton buttonDivide;
    ImageButton buttonEquals;
    ImageButton buttonPoint;
    ImageButton buttonChangeSign;
    ImageButton buttonPercent;
    ImageButton buttonClear;
    //
    Double answer = 0d;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        expressionText = "";
        expressionTextView = (TextView)findViewById(R.id.Expression_TextView);
        answerTextView = (TextView)findViewById(R.id.Answer_TextView);
        setParameters();
        setOnClick();
        setOnTextView();
    }


    public void setOnTextView(){
        expressionTextView.setText(expressionText);
        answerTextView.setText(String.valueOf(answer));

    }
    public void setOnAnswerView(){


    }

    public void setParameters(){
        button0 = (ImageButton)findViewById(R.id.button0);
        button1 = (ImageButton)findViewById(R.id.button1);
        button2 = (ImageButton)findViewById(R.id.button2);
        button3 = (ImageButton)findViewById(R.id.button3);
        button4 = (ImageButton)findViewById(R.id.button4);
        button5 = (ImageButton)findViewById(R.id.button5);
        button6 = (ImageButton)findViewById(R.id.button6);
        button7 = (ImageButton)findViewById(R.id.button7);
        button8 = (ImageButton)findViewById(R.id.button8);
        button9 = (ImageButton)findViewById(R.id.button9);
        buttonPlus = (ImageButton)findViewById(R.id.buttonPlus);
        buttonMinus = (ImageButton)findViewById(R.id.buttonMinus);
        buttonTimes = (ImageButton)findViewById(R.id.buttonTimes);
        buttonDivide = (ImageButton)findViewById(R.id.buttonDivide);
        buttonChangeSign = (ImageButton)findViewById(R.id.buttonChangeSign);
        buttonEquals = (ImageButton)findViewById(R.id.buttonEquals);
        buttonPoint = (ImageButton)findViewById(R.id.buttonPoint);
        buttonPercent = (ImageButton)findViewById(R.id.buttonPercent);
        buttonClear = (ImageButton)findViewById(R.id.buttonReset);
    }


    public void setOnClick(){
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionText += "0";
                setOnTextView();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionText += "1";
                setOnTextView();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionText += "2";
                setOnTextView();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionText += "3";
                setOnTextView();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionText += "4";
                setOnTextView();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionText += "5";
                setOnTextView();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionText += "6";
                setOnTextView();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionText += "7";
                setOnTextView();
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionText += "8";
                setOnTextView();
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionText += "9";
                setOnTextView();
            }
        });
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionText += "+";
                setOnTextView();

            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionText += "-";
                setOnTextView();
            }
        });
        buttonTimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionText += "×";
                setOnTextView();
            }
        });
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionText += "÷";
                setOnTextView();
            }
        });
        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionText += ".";
                setOnTextView();
            }
        });
        buttonPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionText += "%";
                setOnTextView();
            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionText = "";
                setOnTextView();
            }
        });
        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setOnAnswerView();
            }
        });
    }






    //加減乘除要做的事
    //1.取運算符號的前一次輸入(answer)
    public void onClickPlus(){

    }
    public void onClick0(){

    }
}
