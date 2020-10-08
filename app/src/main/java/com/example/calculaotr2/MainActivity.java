package com.example.calculaotr2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;
private Button ac,cal_percent,cal_mul,backspace,cal_div,cal_minus,cal_plus,equll,dot;

private TextView text;
private EditText edit;

    private int a;
    private int where=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.one);
        btn2=(Button)findViewById(R.id.two);
        btn3=(Button)findViewById(R.id.three);
        btn4=(Button)findViewById(R.id.four);
        btn5=(Button)findViewById(R.id.five);
        btn6=(Button)findViewById(R.id.six);
        btn7=(Button)findViewById(R.id.seven);
        btn8=(Button)findViewById(R.id.eight);
        btn9=(Button)findViewById(R.id.nine);
        btn0=(Button)findViewById(R.id.zero);
        ac=(Button)findViewById(R.id.ac);
        cal_percent=(Button)findViewById(R.id.cal_percent);
        cal_mul=(Button)findViewById(R.id.cal_mul);
        backspace=(Button)findViewById(R.id.backspace);
        cal_div=(Button)findViewById(R.id.cal_div);
        cal_minus=(Button)findViewById(R.id.cal_minus);
        cal_plus=(Button)findViewById(R.id.cal_plus);
        equll=(Button)findViewById(R.id.equll);
        dot=(Button)findViewById(R.id.dot);


        text = (TextView)findViewById(R.id.text);


        edit = (EditText)findViewById(R.id.e1);
        OnClickListener cl = new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == btn1) {
                    edit.setText(edit.getText().toString() + 1);
                } else if (v == btn2) {
                    edit.setText(edit.getText().toString() + 2);
                } else if (v == btn3) {
                    edit.setText(edit.getText().toString() + 3);
                } else if (v == btn4) {
                    edit.setText(edit.getText().toString() + 4);
                } else if (v == btn5) {
                    edit.setText(edit.getText().toString() + 5);
                } else if (v == btn6) {
                    edit.setText(edit.getText().toString() + 6);
                } else if (v == btn7) {
                    edit.setText(edit.getText().toString() + 7);
                } else if (v == btn8) {
                    edit.setText(edit.getText().toString() + 8);
                } else if (v == btn9) {
                    edit.setText(edit.getText().toString() + 9);
                } else if (v == btn0) {
                    edit.setText(edit.getText().toString() + 0);
                }
            }

        };
    }
}
