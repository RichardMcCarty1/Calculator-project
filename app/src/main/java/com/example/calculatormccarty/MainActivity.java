package com.example.calculatormccarty;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String curOperation = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button0 = findViewById(R.id.zero);
        Button button1 = findViewById(R.id.one);
        Button button2 = findViewById(R.id.two);
        Button button3 = findViewById(R.id.three);
        Button button4 = findViewById(R.id.four);
        Button button5 = findViewById(R.id.five);
        Button button6 = findViewById(R.id.six);
        Button button7 = findViewById(R.id.seven);
        Button button8 = findViewById(R.id.eight);
        Button button9 = findViewById(R.id.nine);
        Button buttonClear = findViewById(R.id.clearLast);
        Button buttonCE = findViewById(R.id.clearAll);
        Button buttonFlip = findViewById(R.id.plusminus);
        Button buttonDiv = findViewById(R.id.div);
        Button buttonMinus = findViewById(R.id.minus);
        Button buttonPlus = findViewById(R.id.plus);
        Button buttonTimes = findViewById(R.id.times);
        Button buttonEqual = findViewById(R.id.equal);
        Button buttonDeci = findViewById(R.id.decimal);
        TextView display = findViewById(R.id.displayText);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(curOperation != null ) {
                    curOperation = "0";
                    display.setText(display.getText() + curOperation);
                }
                else {
                    curOperation = "0";
                    display.setText(curOperation);

                }
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(curOperation != null ) {
                    curOperation = "1";
                    display.setText(display.getText() + curOperation);
                }
                else {
                    curOperation = "1";
                    display.setText(curOperation);

                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(curOperation != null ) {
                    curOperation = "2";
                    display.setText(display.getText() + curOperation);
                }
                else {
                    curOperation = "2";
                    display.setText(curOperation);

                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(curOperation != null ) {
                    curOperation = "3";
                    display.setText(display.getText() + curOperation);
                }
                else {
                    curOperation = "3";
                    display.setText(curOperation);

                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(curOperation != null ) {
                    curOperation = "4";
                    display.setText(display.getText() + curOperation);
                }
                else {
                    curOperation = "4";
                    display.setText(curOperation);

                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(curOperation != null ) {
                    curOperation = "5";
                    display.setText(display.getText() + curOperation);
                }
                else {
                    curOperation = "5";
                    display.setText(curOperation);

                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(curOperation != null ) {
                    curOperation = "6";
                    display.setText(display.getText() + curOperation);
                }
                else {
                    curOperation = "6";
                    display.setText(curOperation);

                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(curOperation != null ) {
                    curOperation = "7";
                    display.setText(display.getText() + curOperation);
                }
                else {
                    curOperation = "7";
                    display.setText(curOperation);

                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(curOperation != null ) {
                    curOperation = "8";
                    display.setText(display.getText() + curOperation);
                }
                else {
                    curOperation = "8";
                    display.setText(curOperation);

                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(curOperation != null ) {
                    curOperation = "9";
                    display.setText(display.getText() + curOperation);
                }
                else {
                    curOperation = "9";
                    display.setText(curOperation);

                }
            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(curOperation != null) {
                    StringBuilder strb = new StringBuilder(display.getText());
                    strb.replace(strb.lastIndexOf(curOperation), curOperation.length() + strb.lastIndexOf(curOperation), "");
                    if(strb.length() == 0) {
                        curOperation = null;
                    }
                    display.setText(strb.toString());
                }
            }
        });
        buttonCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("");
                curOperation = null;
            }
        });
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + getString(R.string.plus));
            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + getString(R.string.minus));
            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + getString(R.string.div));
            }
        });
        buttonTimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + getString(R.string.times));
            }
        });
        buttonFlip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(String.valueOf(Float.valueOf(display.getText().toString()) * -1));
            }
        });
        buttonDeci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + getString(R.string.decimal));
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display.getText().toString().contains("+")) {
                    String[] parts = display.getText().toString().split("\\+");
                    display.setText(String.valueOf(Float.parseFloat(parts[0]) + Float.parseFloat(parts[1])));
                }
                else if(display.getText().toString().contains("-")) {
                    String[] parts = display.getText().toString().split("-");
                    display.setText(String.valueOf(Float.parseFloat(parts[0]) - Float.parseFloat(parts[1])));
                }
                else if(display.getText().toString().contains("*")) {
                    String[] parts = display.getText().toString().split("\\*");
                    display.setText(String.valueOf(Float.parseFloat(parts[0]) * Float.parseFloat(parts[1])));
                }
                else if(display.getText().toString().contains("/")) {
                    String[] parts = display.getText().toString().split("/");
                    display.setText(String.valueOf(Float.parseFloat(parts[0]) / Float.parseFloat(parts[1])));
                }
            }
        });


    }
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        TextView display = findViewById(R.id.displayText);
        outState.putString("output", display.getText().toString());
        outState.putString("curOperation", curOperation);
        super.onSaveInstanceState(outState);
    }
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        TextView display = findViewById(R.id.displayText);
        curOperation = savedInstanceState.getString(curOperation);
        display.setText(savedInstanceState.getString("output"));
    }
}