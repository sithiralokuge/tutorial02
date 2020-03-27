package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView displayanswer;
    EditText no1,no2;
    Button add,sub,mul,div;

    @SuppressLint("SetText")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        double a =0;
        double b = 0;

        Intent i = getIntent();
        if(i != null) {
            String value1 = i.getStringExtra("first");
            String value2 = i.getStringExtra("second");

            if (!"".equals(value1) && !"".equals(value2)) {
                a = Double.parseDouble(value1);
                b = Double.parseDouble(value2);
            }package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

            public class SecondActivity extends AppCompatActivity {

                TextView displayanswer;
                EditText no1,no2;
                Button add,sub,mul,div;

                @SuppressLint("SetText")
                @Override
                protected void onCreate(Bundle savedInstanceState) {
                    super.onCreate(savedInstanceState);
                    setContentView(R.layout.activity_second);


                    double a =0;
                    double b = 0;

                    Intent i = getIntent();
                    if(i != null) {
                        String value1 = i.getStringExtra("first");
                        String value2 = i.getStringExtra("second");

                        if (!"".equals(value1) && !"".equals(value2)) {
                            a = Double.parseDouble(value1);
                            b = Double.parseDouble(value2);


                        }
                        no1 = (EditText) findViewById(R.id.s_et1);
                        no2 = (EditText) findViewById(R.id.s_et2);
                        add = (Button) findViewById(R.id.s_btn1);
                        sub = (Button) findViewById(R.id.s_btn2);
                        mul = (Button) findViewById(R.id.s_btn3);
                        div = (Button) findViewById(R.id.s_btn4);
                        displayanswer = (TextView) findViewById(R.id.s_tv3);

                        no1.setText(Double.toString(a));
                        no2.setText(Double.toString(b));

                        addition(a,b);
                        subtraction(a,b);
                        mltipication(a,b);
                        division(a,b);

                    }

                    public void addition(final double A, final double B) {
                        add.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String answer = Double.toString(A + B);
                                displayanswer.setText(answer);
                            }
                        });
                    }

                    public void subtraction (final double A, final double B) {
                        sub.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String answer = Double.toString(A - B);
                                displayanswer.setText(answer);
                            }
                        });
                    }

                    public void mltipication(final double A, final double B) {
                        mul.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String answer = Double.toString(A * B);
                                displayanswer.setText(answer);
                            }
                        });
                    }

                    public void division(final double A, final double B){
                        div.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String answer = Double.toString(A/B);
                                displayanswer.setText(answer);
                            }
                        });

                    }
                }


