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
    String tempExpressionText;
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
    Double answer = 0d;
    ArrayList numbers;
    ArrayList operators;
    boolean isNumber = false;
    boolean isOperator = false;
    boolean inputIsNumber;
    boolean inputIsOperater;
    boolean isBlank = true;
    boolean overrideLastOp;
    boolean saveNbInAL;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        tempExpressionText = "";
        expressionTextView = (TextView)findViewById(R.id.Expression_TextView);
        answerTextView = (TextView)findViewById(R.id.Answer_TextView);
        setParameters();
        setOnClick();
        setOnTextView();
    }


    public void setOnTextView(){
        Log.d("tempExTV context",tempExpressionText);
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

    public void checkLastChr(){
        if (inputIsNumber && !inputIsOperater){
            if (isNumber && !isOperator){
                overrideLastOp = false;
                saveNbInAL = false;
            }else if (!isNumber && isOperator){
                overrideLastOp= false;
                saveNbInAL = false;
            }else {
                overrideLastOp = false;
                saveNbInAL = false;
            }
        }else if (!inputIsNumber && inputIsOperater){
            if (isNumber && !isOperator){
                overrideLastOp = false;
                saveNbInAL = true;
            }else if (!isNumber && isOperator){
                overrideLastOp = true;
                saveNbInAL = false;
            }else {
                overrideLastOp = false;
                saveNbInAL = false;
            }
        }else{
            overrideLastOp = false;
            saveNbInAL = false;
        }
    }

    public void overrideLastOp(){
        if (overrideLastOp){
            tempExpressionText = tempExpressionText.substring(0,tempExpressionText.length()-1);
        }
    }

    public void setOnClick(){
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputIsNumber = true;
                inputIsOperater = false;
                tempExpressionText += "0";
                setOnTextView();
                isNumber = true;
                isOperator = false;

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputIsNumber = true;
                inputIsOperater = false;
                tempExpressionText += "1";
                setOnTextView();
                isNumber = true;
                isOperator = false;
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputIsNumber = true;
                inputIsOperater = false;
                tempExpressionText += "2";
                setOnTextView();
                isNumber = true;
                isOperator = false;
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputIsNumber = true;
                inputIsOperater = false;
                tempExpressionText += "3";
                setOnTextView();
                isNumber = true;
                isOperator = false;
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputIsNumber = true;
                inputIsOperater = false;
                tempExpressionText += "4";
                setOnTextView();
                isNumber = true;
                isOperator = false;
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputIsNumber = true;
                inputIsOperater = false;
                tempExpressionText += "5";
                setOnTextView();
                isNumber = true;
                isOperator = false;
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputIsNumber = true;
                inputIsOperater = false;
                tempExpressionText += "6";
                setOnTextView();
                isNumber = true;
                isOperator = false;
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputIsNumber = true;
                inputIsOperater = false;
                tempExpressionText += "7";
                setOnTextView();
                isNumber = true;
                isOperator = false;
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputIsNumber = true;
                inputIsOperater = false;
                tempExpressionText += "8";
                setOnTextView();
                isNumber = true;
                isOperator = false;
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputIsNumber = true;
                inputIsOperater = false;
                tempExpressionText += "9";
                setOnTextView();
                isNumber = true;
                isOperator = false;
            }
        });
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputIsNumber = false;
                inputIsOperater = true;
                checkLastChr();
                overrideLastOp();
                tempExpressionText += "+";
                setOnTextView();
                isNumber = false;
                isOperator = true;

            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputIsNumber = false;
                inputIsOperater = true;
                checkLastChr();
                overrideLastOp();
                tempExpressionText += "-";
                setOnTextView();
                isNumber = false;
                isOperator = true;
            }
        });
        buttonTimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputIsNumber = false;
                inputIsOperater = true;
                checkLastChr();
                overrideLastOp();
                tempExpressionText += "×";
                setOnTextView();
                isNumber = false;
                isOperator = true;
            }
        });
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputIsNumber = false;
                inputIsOperater = true;
                checkLastChr();
                overrideLastOp();
                tempExpressionText += "÷";
                setOnTextView();
                isNumber = false;
                isOperator = true;
            }
        });
        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputIsNumber = false;
                inputIsOperater = true;
                tempExpressionText += ".";
                setOnTextView();
            }
        });
        buttonPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tempExpressionText += "%";
                setOnTextView();
            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tempExpressionText = "";
                setOnTextView();
                isNumber = false;
                isOperator = false;
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
