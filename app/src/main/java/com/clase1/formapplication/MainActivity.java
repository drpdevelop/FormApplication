package com.clase1.formapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {


    String debug = "Actividad 1";
    LinearLayout mainLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(debug, "Create");
    }

    public void presionaBoton(View view) {

        EditText nombre = findViewById(R.id.nombre);
        EditText apellido = findViewById(R.id.apellido);
        EditText edad = findViewById(R.id.edad);
        mainLayout = findViewById(R.id.mainLayout);

        if (!nombre.toString().isEmpty() || !apellido.toString().isEmpty() || !edad.toString().isEmpty()){
            Snackbar.make(mainLayout, "Todos los campos son obligatorios.", Snackbar.LENGTH_LONG)
                    .setAction("Close", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                        }
                    })
                    .setActionTextColor(getResources().getColor(R.color.purple_200))
                    .show();



        }
    }
}