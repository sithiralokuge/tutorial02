package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class FirstActivity extends AppCompatActivity {

    Button btnOK;
    EditText no1,no2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btnOK = (Button) findViewById(R.id.f_btn1);
        no1 = (EditText) findViewById(R.id.f_te1);
        no2 = (EditText) findViewById(R.id.f_te2);

        //OK button
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1 = no1.getText().toString();
                String value2 = no2.getText().toString();

                //Intent
                Intent i = new Intent(getApplicationContext(),SecondActivity.class);

                //Passing Data
                i.putExtra("first",value1);
                i.putExtra("second",value2);

                //Tost Message
                Toast.makeText(getApplicationContext(),"Sending Message...",Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
    }
}
