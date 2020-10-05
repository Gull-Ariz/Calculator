package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText input, output;
    private double value1 ;
    private double value2;
    private boolean add = false;
    private boolean sub = false;
    private boolean mul = false;
    private boolean div = false;
    private boolean val1 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getValues();
    }

    private void getValues()
    {
        input = (EditText) findViewById(R.id.input);
        output = (EditText) findViewById(R.id.output);
    }

    public void showSeven(View view) {
        input.setText(input.getText() + "7");
    }

    public void showEight(View view) {
        input.setText(input.getText() + "8");
    }

    public void showNine(View view) {
        input.setText(input.getText() + "9");
    }

    public void showFour(View view) {
        input.setText(input.getText() + "4");
    }

    public void showFive(View view) {
        input.setText(input.getText() + "5");
    }

    public void showSix(View view) {
        input.setText(input.getText() + "6");
    }

    public void showOne(View view) {
        input.setText(input.getText() + "1");
    }

    public void showTwo(View view) {
        input.setText(input.getText() + "2");
    }

    public void showThree(View view) {
        input.setText(input.getText() + "3");
    }

    public void showZero(View view) {
        input.setText(input.getText() + "0");
    }

    public void showPoint(View view) {
        input.setText(input.getText() + ".");
    }

    public void clearAll(View view) {
        input.setText("");
        output.setText("");
    }

    public void clearOne(View view) {
        String process = input.getText().toString();
        process = process.substring(0,(process.length()-1));
        input.setText(process);
    }

    public void showResult(View view) {

        value2 = Double.parseDouble(input.getText() + "");
        if (add == true) {
            output.setText((value1 + value2) + "");
            add = false;
        }
        if (sub == true) {
            output.setText((value1 - value2) + "");
            sub = false;
        }
        if (mul == true) {
            output.setText((value1 * value2) + "");
            mul = false;
        }
        if (div == true) {
            output.setText((value1 / value2) + "");
            div = false;
        }
    }



    public void doDivision(View view) {

        if(input == null )
        {
            input.setText("");
        }
        else
        {
            value1 = Double.parseDouble(input.getText()+"");
            div = true;
            input.setText(null);
        }

    }

    public void doMultiplication(View view) {
        if(input == null)
        {
            input.setText("");
        }
        else
        {
            value1 = Double.parseDouble(input.getText()+"");
            mul = true;
            input.setText(null);
        }
    }

    public void doSubtraction(View view) {
        if(input == null )
        {
            input.setText("");
        }
        else
        {
            value1 = Double.parseDouble(input.getText()+"");
            sub = true;
            input.setText(null);
        }
    }

    public void doAddition(View view) {
        if(input == null )
        {
            input.setText("");
        }
        else
        {
            value1 = Double.parseDouble(input.getText()+"");
            add = true;
            input.setText(null);
        }
    }
}