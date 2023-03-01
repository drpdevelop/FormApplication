package com.clase1.formapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    TextView one, two, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String lado1 = getIntent().getStringExtra("lado1");
        String lado2 = getIntent().getStringExtra("lado2");
        //String value = getIntent().getStringExtra("result");

        float l1 = Float.parseFloat(lado1);
        float l2 = Float.parseFloat(lado2);
        float resultado = l1*l2;

        result = findViewById(R.id.resultadoValuue);
        one = findViewById(R.id.lado1);
        two = findViewById(R.id.lado2);

        //22String value1 = String.valueOf(resultado);
        //String value2 = String.valueOf(resultado);
        String resultad = String.valueOf(resultado);
        one.setText(lado1);
        two.setText(lado2);
        result.setText(resultad);

    }


}