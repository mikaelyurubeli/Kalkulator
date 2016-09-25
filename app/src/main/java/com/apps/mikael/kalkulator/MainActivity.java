package com.apps.mikael.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText display;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    Button kurs, tmbh, bags, kals, modl, pointpoint, back, cc, pars1, pars2, sqrt, sams, pows;
    Integer y;
    Integer z;
    double w;
    Integer q;
    double s;
    String x="",xx;
    float xxx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = (EditText) findViewById(R.id.editText);
        b1 = (Button) findViewById(R.id.btn1);
        b2 = (Button) findViewById(R.id.btn2);
        b3 = (Button) findViewById(R.id.btn3);
        b4 = (Button) findViewById(R.id.btn4);
        b5 = (Button) findViewById(R.id.btn5);
        b6 = (Button) findViewById(R.id.btn6);
        b7 = (Button) findViewById(R.id.btn7);
        b8 = (Button) findViewById(R.id.btn8);
        b9 = (Button) findViewById(R.id.btn9);
        b0 = (Button) findViewById(R.id.btn0);
        kurs = (Button) findViewById(R.id.btnMin);
        tmbh = (Button) findViewById(R.id.btnAdd);
        bags = (Button) findViewById(R.id.btnDiv);
        kals = (Button) findViewById(R.id.btnMult);
        modl = (Button) findViewById(R.id.btnPercent);
        pointpoint = (Button) findViewById(R.id.btnPoint);
        back = (Button) findViewById(R.id.btnBack);
        cc = (Button) findViewById(R.id.btnCC);
        pars1 = (Button) findViewById(R.id.btnPara1);
        pars2 = (Button) findViewById(R.id.btnPara2);
        sqrt = (Button) findViewById(R.id.btnSqrt);
        sams = (Button) findViewById(R.id.btnEqual);
        pows = (Button) findViewById(R.id.btnPow);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = display.getText().toString();
                x = x + "1";
                display.setText(x);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = display.getText().toString();
                x = x + "2";
                display.setText(x);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = display.getText().toString();
                x = x + "3";
                display.setText(x);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = display.getText().toString();
                x = x + "4";
                display.setText(x);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = display.getText().toString();
                x = x + "5";
                display.setText(x);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = display.getText().toString();
                x = x + "6";
                display.setText(x);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = display.getText().toString();
                x = x + "7";
                display.setText(x);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = display.getText().toString();
                x = x + "8";
                display.setText(x);
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = display.getText().toString();
                x = x + "9";
                display.setText(x);
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = display.getText().toString();
                x = x + "0";
                display.setText(x);
            }
        });

        cc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                display.setText("");
            }
        });

        tmbh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xx = x;
                q = 1;
                x = "";
                display.setText("");
            }
        });

        kurs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xx = x;
                q = 2;
                x = "";
                display.setText("");
            }
        });

        bags.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xx = x;
                q = 3;
                x = "";
                display.setText("");
            }
        });

        kals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xx = x;
                q = 4;
                x = "";
                display.setText("");
            }
        });

        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xx = x;
                s = Integer.parseInt(x);
                s = Math.sqrt(s);
                display.setText("" + s);
            }
        });

        pows.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xx = x;
                q = 5;
                x = "";
                display.setText("");
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = display.getText().toString();
                text = text.length() > 1 ? text.substring(0, text.length() - 1) : "";
                display.setText(text);
            }
        });

        modl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xx = x;
                q = 6;
                x = "";
                display.setText("");
            }
        });

 /*       pars1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = display.getText().toString();
                display.setText(x + "(");
            }
        });

        pars2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = display.getText().toString();
                display.setText(x + ")");
            }
        });

        pointpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = display.getText().toString();
                display.setText(x + ".");
                xxx = Float.parseFloat(x);
            }
        });
*/

        sams.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (q == 1) {
                    y = Integer.parseInt(xx);
                    z = Integer.parseInt(x);
                    w = y + z;
                    display.setText("" + w);
                } else if (q == 3) {
                    y = Integer.parseInt(xx);
                    z = Integer.parseInt(x);
                    w = y / z;
                    display.setText("" + w);
                } else if (q == 2) {
                    y = Integer.parseInt(xx);
                    z = Integer.parseInt(x);
                    w = y - z;
                    display.setText("" + w);
                } else if (q == 4) {
                    y = Integer.parseInt(xx);
                    z = Integer.parseInt(x);
                    w = y * z;
                    display.setText("" + w);
                } else if (q == 5){
                    y = Integer.parseInt(xx);
                    z = Integer.parseInt(x);
                    w = Math.pow(y, z);
                    display.setText("" + w);
                } else if (q == 6){
                    y = Integer.parseInt(xx);
                    w = y / 100.0;
                    display.setText("" + w);
                }

            }
        });
    }
}
