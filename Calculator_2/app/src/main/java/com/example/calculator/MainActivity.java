package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterViewFlipper;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button Addition;
    Button Subtraction;
    Button Multiplication;
    Button Division;
    EditText Input_1;
    EditText Input_2;
    TextView Result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Addition = findViewById(R.id.Addition);
        Subtraction = findViewById(R.id.Subract);
        Multiplication = findViewById(R.id.Multiplication);
        Division = findViewById(R.id.Division);

        Input_1 = findViewById(R.id.operand_1);
        Input_2 = findViewById(R.id.operand_2);
        Result = findViewById(R.id.result);

        Addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double c1 = Double.parseDouble(Input_1.getText().toString());
                double c2 = Double.parseDouble(Input_2.getText().toString());

                double res = c1+c2;
                Result.setText(Double.toString(res));
            }
        });

        Subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double c1 = Double.parseDouble(Input_1.getText().toString());
                double c2 = Double.parseDouble(Input_2.getText().toString());

                double res = c1-c2;
                Result.setText(Double.toString(res));
            }
        });

        Multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double c1 = Double.parseDouble(Input_1.getText().toString());
                double c2 = Double.parseDouble(Input_2.getText().toString());

                double res = c1*c2;
                Result.setText(Double.toString(res));
            }
        });

        Division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double c1 = Double.parseDouble(Input_1.getText().toString());
                    double c2 = Double.parseDouble(Input_2.getText().toString());

                    double res = c1/c2;
                    Result.setText(Double.toString(res));
                }catch (ArithmeticException e){
                    Result.setText("ERR!");
                }

            }
        });


    }
}
