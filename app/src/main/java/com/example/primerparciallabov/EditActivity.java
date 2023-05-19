package com.example.primerparciallabov;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class EditActivity extends AppCompatActivity {
    EditText input_nombre;
    EditText input_apellido;
    Button button_guardar;
    boolean esEdicion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        Intent intencion = getIntent();
        this.esEdicion = intencion.getExtras().getBoolean("esEdicion");

        //Traer los inputs y elementos
        this.input_nombre = super.findViewById(R.id.input_nombre);
        this.input_apellido = super.findViewById(R.id.input_password);
        this.button_guardar = super.findViewById(R.id.button_guardar);

}}
