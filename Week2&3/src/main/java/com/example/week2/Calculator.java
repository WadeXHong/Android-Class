package com.example.week2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

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
    ArrayList<Double> numbers = new ArrayList<>();
    ArrayList<String> operators = new ArrayList<>();
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
        expressionText = "";
        expressionTextView = (TextView)findViewById(R.id.Expression_TextView);
        answerTextView = (TextView)findViewById(R.id.Answer_TextView);
        setParameters();
        setOnClick();
        setOnTextView();
    }


    public void setOnTextView(){
        Log.d("tempExTV context",tempExpressionText);
        for (int i = 0;i<numbers.size();i++){
            Log.d("NBAL",numbers.get(i).toString());
        }
        for (int i = 0;i<operators.size();i++){
            Log.d("OPAL",operators.get(i));
        }
        expressionTextView.setText(expressionText);
        Log.e("-","-seperateline-------------------------");


    }
    public void setOnAnswerView(){
        answerTextView.setText(String.valueOf(answer));

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

    public void saveNbInAL(){
        numbers.add(Double.parseDouble(tempExpressionText));
        tempExpressionText = "";
    }

    public void saveOpInAL(){
        operators.add(tempExpressionText);
        tempExpressionText = "";
    }

    public void checkLastChr(){
        if (inputIsNumber && !inputIsOperater){
            if (isNumber && !isOperator){
                overrideLastOp = false;
                saveNbInAL = false;
            }else if (!isNumber && isOperator){
                overrideLastOp= false;
                saveNbInAL = false;
                saveOpInAL();
            }else {
                overrideLastOp = false;
                saveNbInAL = false;
            }
        }else if (!inputIsNumber && inputIsOperater){
            if (isNumber && !isOperator){
                overrideLastOp = false;
                saveNbInAL = true;
                saveNbInAL();
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
            expressionText = expressionText.substring(0,expressionText.length()-1);
        }
        overrideLastOp = false;
    }

    public void numbersPreprocess(){
        inputIsNumber = true;
        inputIsOperater = false;
        checkLastChr();
    }
    public void numbersPostprocess(){
        setOnTextView();
        isNumber = true;
        isOperator = false;
    }
    public void operatorsPreprocess(){
        inputIsNumber = false;
        inputIsOperater = true;
        checkLastChr();
        overrideLastOp();
    }
    public void operatorsPostprocess(){
        setOnTextView();
        isNumber = false;
        isOperator = true;
    }
    public void setOnClick(){
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbersPreprocess();
                tempExpressionText += "0";
                expressionText += "0";
                numbersPostprocess();

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbersPreprocess();
                tempExpressionText += "1";
                expressionText += "1";
                numbersPostprocess();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbersPreprocess();
                tempExpressionText += "2";
                expressionText += "2";
                numbersPostprocess();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbersPreprocess();
                tempExpressionText += "3";
                expressionText += "3";
                numbersPostprocess();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbersPreprocess();
                tempExpressionText += "4";
                expressionText += "4";
                numbersPostprocess();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbersPreprocess();
                tempExpressionText += "5";
                expressionText += "5";
                numbersPostprocess();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbersPreprocess();
                tempExpressionText += "6";
                expressionText += "6";
                numbersPostprocess();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbersPreprocess();
                tempExpressionText += "7";
                expressionText += "7";
                numbersPostprocess();
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbersPreprocess();
                tempExpressionText += "8";
                expressionText += "8";
                numbersPostprocess();
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbersPreprocess();
                tempExpressionText += "9";
                expressionText += "9";
                numbersPostprocess();
            }
        });
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!expressionText.isEmpty()) {
                    operatorsPreprocess();
                    tempExpressionText += "+";
                    expressionText += "+";
                    operatorsPostprocess();
                }

            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!expressionText.isEmpty()) {
                    operatorsPreprocess();
                    tempExpressionText += "-";
                    expressionText += "-";
                    operatorsPostprocess();
                }
            }
        });
        buttonTimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!expressionText.isEmpty()) {
                    operatorsPreprocess();
                    tempExpressionText += "×";
                    expressionText += "×";
                    operatorsPostprocess();
                }
            }
        });
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!expressionText.isEmpty()) {
                    operatorsPreprocess();
                    tempExpressionText += "÷";
                    expressionText += "÷";
                    operatorsPostprocess();
                }
            }
        });
        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!tempExpressionText.contains(".")) {
                    numbersPreprocess();
                    tempExpressionText += ".";
                    expressionText += ".";
                    numbersPostprocess();
                }
            }
        });
        buttonPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!tempExpressionText.contains("%")) {
                    numbersPreprocess();
                    tempExpressionText += "*0.01";
                    expressionText += "%";
                    numbersPostprocess();
                }
            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                setOnTextView();
                setOnAnswerView();
                isNumber = false;
                isOperator = false;
            }
        });
        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isNumber && !isOperator){
                    saveNbInAL();
                }else if (!isNumber && isOperator){
                    overrideLastOp = true;
                    overrideLastOp();
                }
                setOnTextView();
                calculate(numbers,operators);
                setOnAnswerView();
                clear();

            }
        });
    }

    public void clear() {
        tempExpressionText = "";
        expressionText = "";
        numbers.clear();
        operators.clear();
        answer = 0d;
    }

    public void calculate (ArrayList<Double> numbers,ArrayList<String> operators){

        ArrayList<Integer> timesPosition = timesPosition(operators);//找乘除號位置
        ArrayList<Integer> dividePosition = dividePosition(operators);
        ArrayList<Integer> minusPosition = minusPosition(operators);//找負號位置
        if (!minusPosition.isEmpty()){
            for(int i=0;i<minusPosition.size();i++){
                numbers.set(minusPosition.get(i)+1,-1*numbers.get(minusPosition.get(i)+1));//將負號乘入數字
                operators.set(minusPosition.get(i),"+");//改為加法
            }
        }
        if (!timesPosition.isEmpty()){
            for(int i=0;i<timesPosition.size();i++){
                numbers.set(timesPosition.get(i)+1,numbers.get(timesPosition.get(i))*numbers.get(timesPosition.get(i)+1));//後項改為計算結果
                numbers.set(timesPosition.get(i),0d);//乘除號處理前項改為0
                 operators.set(timesPosition.get(i),"+");//operators改為+
            }
        }
        if (!dividePosition.isEmpty()){
            for(int i=0;i<dividePosition.size();i++){
                numbers.set(dividePosition.get(i)+1,numbers.get(dividePosition.get(i))/numbers.get(dividePosition.get(i)+1));//後項改為計算結果
                numbers.set(dividePosition.get(i),0d);//乘除號處理前項改為0
                operators.set(dividePosition.get(i),"+");//operators改為+
            }
        }


        for (Double i:numbers){
            answer += i;
        }
    }

    public ArrayList<Integer> timesPosition(ArrayList operators){
        ArrayList<Integer> timesPosition = new ArrayList<>();
        for (Object i:operators){
            if (i.equals("×")){
                timesPosition.add(operators.indexOf(i));
            }
        }
        return timesPosition;
    }

    public ArrayList<Integer> dividePosition(ArrayList operators){
        ArrayList<Integer> dividePosition = new ArrayList<>();
        for (Object i:operators){
            if (i.equals("÷")){
                dividePosition.add(operators.indexOf(i));
            }
        }
        return dividePosition;
    }

    public ArrayList<Integer> minusPosition(ArrayList operators){
        ArrayList<Integer> minusPosition = new ArrayList<>();
        for (Object i:operators){
            if (i.equals("-")){
                minusPosition.add(operators.indexOf(i));
            }
        }
        return minusPosition;
    }


    //加減乘除要做的事
    //1.取運算符號的前一次輸入(answer)
    public void onClickPlus(){

    }
    public void onClick0(){

    }
}
