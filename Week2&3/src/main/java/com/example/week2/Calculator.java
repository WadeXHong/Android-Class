package com.example.week2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
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
    String temp = "";
    ArrayList numbers;
    ArrayList operators;

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
//        Log.i("show temp",temp);
    }
    public void setOnAnswerView(){
//        String temp = "";
//        for (Object i:numbers){
//            temp += i;
//        }
        answerTextView.setText(String.valueOf(answer));
        Log.d("length",String.valueOf(operators.size()));

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
                temp += "0";
                setOnTextView();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionText += "1";
                temp += "1";
                setOnTextView();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionText += "2";
                temp += "2";
                setOnTextView();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionText += "3";
                temp += "3";
                setOnTextView();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionText += "4";
                temp += "4";
                setOnTextView();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionText += "5";
                temp += "5";
                setOnTextView();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionText += "6";
                temp += "6";
                setOnTextView();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionText += "7";
                temp += "7";
                setOnTextView();
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionText += "8";
                temp += "8";
                setOnTextView();
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionText += "9";
                temp += "9";
                setOnTextView();
            }
        });
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionText += "+";
//                symbol.add(temp);
//                temp = "";
                setOnTextView();
//                Log.d("arraylenght",String.valueOf(symbol.size()));
//                for (int i=0;i<symbol.size();i++){
//                    Log.d("context", symbol.get(i).toString());
//                }
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
                answer = 0d;
                setOnTextView();
            }
        });
        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                splitString();
                setOnAnswerView();
            }
        });
    }
    public double[] stringToDouble(List splitToNumb){
        double[] numbDouble = new double[splitToNumb.size()];
        for(int i=0;i<numbDouble.length;i++) {
            numbDouble[i] = (Double.parseDouble(splitToNumb.get(i).toString()));
            Log.d("context of numbDouble[]",String.valueOf(numbDouble[i]));
        }
        return numbDouble;
    }


    public void splitString(){
        ArrayList splitToNumb = new ArrayList();
        splitToNumb.addAll(Arrays.asList(expressionText.split("\\+|-|×|÷",0)));
        //operOnlyText = Arrays.asList(expressionText.split());

        String operOnlyText = expressionText;
        for(int i=0;i<splitToNumb.size();i++){
            operOnlyText = operOnlyText.replace(splitToNumb.get(i).toString(),"*");
        }
        ArrayList splitToOper = new ArrayList();
        splitToOper.addAll(Arrays.asList(operOnlyText.split("\\*|%"))); //split出來會有null 找不到原因
        splitToOper.remove(""); //可能會有特殊情況
        numbers = splitToNumb;
        operators = splitToOper;




        //找乘除負號相連位置
        ArrayList<Integer> emptyPosition = new ArrayList<Integer>();
        for(int i=0;i<numbers.size();i++){
            if (numbers.get(i).equals("")){
                emptyPosition.add(i);
                //Log.d("emptyPosition",emptyPosition.get(i).toString());
            }
        }
        //去除""及-
        if (!emptyPosition.isEmpty()) {

            for(int i=emptyPosition.size()-1;i>=0;i--){
                String number = numbers.get(emptyPosition.get(i)+1).toString();
                numbers.set(emptyPosition.get(i)+1,"-"+number); //""後數字*-1
                numbers.remove(emptyPosition.get(i)+0);//""去掉
                operators.remove(emptyPosition.get(i)+0);//去掉-號
            }
        }

        //先乘除 找位置
        ArrayList<Integer> firstCalculate = new ArrayList<Integer>();
        for(int i=0;i<operators.size();i++){
            if (operators.get(i).equals("×") || operators.get(i).equals("÷")){
                firstCalculate.add(i);
                //Log.d("postion of ÷×", firstCalculate.get(i).toString());
            }
        }
        //這邊要先轉Double了
        //將numbers<String>轉為double<Double>
        double[] doubleNumb = stringToDouble(numbers);
        //+a*b=c改成+0+c
        for(int i=0;i<firstCalculate.size();i++){
            double number1 = doubleNumb[(firstCalculate.get(i))];
            double number2 = doubleNumb[firstCalculate.get(i)+1];
            double product = number1*number2;
            doubleNumb[firstCalculate.get(i)] = 0;
            doubleNumb[firstCalculate.get(i)+1] = product;
        }
        for (double i:doubleNumb){
            answer += i;
        }


    }
    public void timesDivive(){

    }





    //加減乘除要做的事
    //1.取運算符號的前一次輸入(answer)
    public void onClickPlus(){

    }
    public void onClick0(){

    }
}
