package com.cbm.cbmcalculater;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Activity activity;
    EditText et_length,et_width,et_height,et_cbm,et_cft;
    TextView tv_cbm,tv_cft;
    Double length,width,height,mul,cbm,cft;
    Spinner spinner1;
    String unit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity = this;
        idMappings();
        Listener();

        spinner1.setOnItemSelectedListener(this);
    }


    private void Listener() {
        tv_cbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                length = Double.parseDouble(et_length.getText().toString());
                width = Double.parseDouble(et_width.getText().toString());
                height = Double.parseDouble(et_height.getText().toString());

                if(unit.equalsIgnoreCase("mm"))
                {
                    mul = (length*0.1)*(width*0.1)*(height*0.1)/5000;
                    String stringdouble= Double.toString(mul);
                    et_cbm.setText(stringdouble);
                }

                if(unit.equalsIgnoreCase("cm"))
                {
                    mul = (length)*(width)*(height)/5000;
                    String stringdouble= Double.toString(mul);
                    et_cbm.setText(stringdouble);
                }

                if(unit.equalsIgnoreCase("m"))
                {
                    mul = (length*100)*(width*100)*(height*100)/5000;
                    String stringdouble= Double.toString(mul);
                    et_cbm.setText(stringdouble);
                }

                if(unit.equalsIgnoreCase("inch"))
                {
                    mul = (length*2.54)*(width*2.54)*(height*2.54)/5000;
                    String stringdouble= Double.toString(mul);
                    et_cbm.setText(stringdouble);
                }

                if(unit.equalsIgnoreCase("foot"))
                {
                    mul = (length*30.48)*(width*30.58)*(height*30.58)/5000;
                    String stringdouble= Double.toString(mul);
                    et_cbm.setText(stringdouble);
                }

                if(unit.equalsIgnoreCase("yard"))
                {
                    mul = (length*91.44)*(width*91.44)*(height*91.44)/5000;
                    String stringdouble= Double.toString(mul);
                    et_cbm.setText(stringdouble);
                }

            }
        });

        tv_cft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cbm = Double.parseDouble(et_cbm.getText().toString());
                cft = (cbm)*353147;
                String stringdouble= Double.toString(cft);
                et_cft.setText(stringdouble);
            }
        });
    }

    private void idMappings() {
        et_length = (EditText)findViewById(R.id.et_length);
        et_width = (EditText)findViewById(R.id.et_width);
        et_height = (EditText)findViewById(R.id.et_height);
        et_cbm = (EditText)findViewById(R.id.et_cbm);
        et_cft = (EditText)findViewById(R.id.et_cft);
        tv_cbm = (TextView) findViewById(R.id.tv_cbm);
        tv_cft = (TextView) findViewById(R.id.tv_cft);
        spinner1 = (Spinner) findViewById(R.id.spinner1);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        unit = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
