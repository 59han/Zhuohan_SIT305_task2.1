package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private TextView outputMonitor;
    private TextView outputUnit;
    private TextView inputMonitor;
    private Spinner unit;
    private String str0;
    private ImageButton butt1, butt2, butt3;
    double input = 0;
    double result1 = 0,result2 = 0, result3 = 0;
    int operation = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        outputMonitor = (TextView)findViewById(R.id.ouputMonitor);
        butt1 = (ImageButton) findViewById(R.id.buttonMeter);
        butt2 = (ImageButton)findViewById(R.id.buttonTem) ;
        butt3 = (ImageButton)findViewById(R.id.buttonKg);
        inputMonitor = (TextView)findViewById(R.id.inputText) ;
        outputUnit = (TextView)findViewById(R.id.outputUnit) ;
        unit = (Spinner)findViewById(R.id.unit) ;
        butt1.setOnClickListener(new MyonClickListener());
        butt2.setOnClickListener(new MyonClickListener());
        butt3.setOnClickListener(new MyonClickListener());



    }


    class MyonClickListener implements View.OnClickListener{
        public  void onClick(View v) {
            switch (v.getId()){
                case R.id.buttonMeter:
                     str0 = inputMonitor.getText().toString();
                    operation = unit.getSelectedItem().hashCode();
                    if(operation == 103787401) {
                        result1 = Double.valueOf(str0) * 100;
                        result2 = Double.valueOf(str0) * 3.2808398950131;
                        result3 = Double.valueOf(str0) * 39.3700787402;
                        DecimalFormat df = new DecimalFormat(("#.00"));
                        String r1 = df.format(result1);
                        String r2 = df.format(result2);
                        String r3 = df.format(result3);
                        outputMonitor.setText(r1 + "\n" + r2 + "\n" + r3);
                        outputUnit.setText("Centimeter " + "\n" + "Foot" + "\n" + "Inch" );
                    }
                    else{
                        outputMonitor.setText("");
                        outputUnit.setText("");
                        Toast.makeText(getApplicationContext(), "Please select the correct conversion icon.", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case R.id.buttonTem:
                     str0 = inputMonitor.getText().toString();
                     operation = 0;
                    operation = unit.getSelectedItem().hashCode();
                    if(operation == 663366334) {
                        result1 = Double.valueOf(str0) * 1.8 + 32;
                        result2 = Double.valueOf(str0) + 273.15;
                        DecimalFormat df = new DecimalFormat(("#.00"));
                        String r1 = df.format(result1);
                        String r2 = df.format(result2);
                        outputMonitor.setText(r1 + "\n" + r2);
                        outputUnit.setText("Fahrenhelt " + "\n" + "Kelvin" );
                    }
                    else{
                        outputMonitor.setText("");
                        outputUnit.setText("");
                        Toast.makeText(getApplicationContext(), "Please select the correct conversion icon.", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case R.id.buttonKg:
                    str0 = inputMonitor.getText().toString();
                    operation = 0;
                    operation = unit.getSelectedItem().hashCode();
                    if(operation == -1470006725) {
                        result1 = Double.valueOf(str0) * 1000;
                        result2 = Double.valueOf(str0) * 35.27396194958;
                        result3 = Double.valueOf(str0) * 2.2046226218488;
                        DecimalFormat df = new DecimalFormat(("#.00"));
                        String r1 = df.format(result1);
                        String r2 = df.format(result2);
                        String r3 = df.format(result3);
                        outputMonitor.setText(r1 + "\n" + r2 + "\n" + r3);
                        outputUnit.setText("Gram " + "\n" + "Ounce(Oz)" + "\n" + "Pound(Ib)");
                    }
                    else{
                        outputMonitor.setText("");
                        outputUnit.setText("");
                        Toast.makeText(getApplicationContext(), "Please select the correct conversion icon.", Toast.LENGTH_SHORT).show();
                    }
                    break;
            }



            }

        }

    }
