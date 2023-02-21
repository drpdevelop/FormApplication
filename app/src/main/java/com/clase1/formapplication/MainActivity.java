package com.clase1.formapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {


    EditText lado_uno, lado_dos;
    TextView result;
    Button calculate;

    String Debug = "Actividad 1";
    LinearLayout mainLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(Debug, "Create");

        lado_uno = findViewById(R.id.lado_uno);
        lado_dos = findViewById(R.id.lado_dos);
        result = findViewById(R.id.result);
        calculate = findViewById(R.id.calcular);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Debug,"Entre A OnStart");

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float lado1 = Float.parseFloat(lado_uno.getText().toString());
                float lado2 = Float.parseFloat(lado_dos.getText().toString());
                float resultado = lado1*lado2;
                String resultad = String.valueOf(resultado);
                result.setText(resultad);

            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(Debug,"Entre A OnRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Debug,"Entre A OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Debug,"Entre A OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Debug,"Entre A OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Debug,"Entre A OnDestroy");
    }

    /*public void calcular(View view) {

        EditText lado_uno = findViewById(R.id.lado_uno);
        EditText lado_dos = findViewById(R.id.lado_dos);

        mainLayout = findViewById(R.id.mainLayout);

        Log.i(Debug, lado_uno.toString());

        if(lado_uno == null){
            Snackbar.make(mainLayout, "Todos los campos son obligatorios.", Snackbar.LENGTH_LONG)
                    .setAction("Close", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                        }
                    })
                    .setActionTextColor(getResources().getColor(R.color.purple_200))
                    .show();
        }
    }*/



}