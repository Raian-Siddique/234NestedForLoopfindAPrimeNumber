package com.example.a234nestedforloopfindaprimenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


//    ============Hooking java with xml=============
    EditText ed1,ed2;
    Button button;
    TextView tvDisplay;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //=============find with id======================
//        ed1=findViewById(R.id.ed1);
        ed2=findViewById(R.id.ed2);
        button=findViewById(R.id.button);
        tvDisplay=findViewById(R.id.tvDisplay);

//        ================== Intriducing For loop=========


//        String ivText = ed1.getText().toString();
//        int inputValue = Integer.parseInt(ivText);




        button.setOnClickListener(new View.OnClickListener() {    // Making a Button Functional
            @Override
            public void onClick(View v) {


//
                int number = Integer.parseInt(ed2.getText().toString());

//
//                tvDisplay.setText("");
                //===============For loop start===================

                for (int x=2; x<number; x++){

                    if (number % x == 0){
                        tvDisplay.setText(number+" is not a prime number.");
                        break;

                    }else{
                        tvDisplay.setText(number +" is a prime number.");

                    }
                }

            }
        });
                // ======================for loop ends=======





    }
}