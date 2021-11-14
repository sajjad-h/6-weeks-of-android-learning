package com.example.addnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText number1;
    EditText number2;
    TextView result;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.addButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = (EditText) findViewById(R.id.firstNumberId);
                number2 = (EditText) findViewById(R.id.secondNumberId);
                result = (TextView) findViewById(R.id.textViewAnswer);

                if (number1.getText().toString().length() == 0) {
                    Toast.makeText(MainActivity.this, "Please input first number", Toast.LENGTH_SHORT).show();
                } else if (number2.getText().toString().length() == 0) {
                    Toast.makeText(MainActivity.this, "Please input second number", Toast.LENGTH_SHORT).show();
                } else {
                    double num1 = Double.parseDouble(number1.getText().toString());
                    double num2 = Double.parseDouble(number2.getText().toString());
                    double res = num1 + num2;
                    result.setText(Double.toString(res));
                    Toast.makeText(MainActivity.this, "Result: " + res, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}