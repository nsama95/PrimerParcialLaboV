package com.example.primerparciallabov;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<UserModel> usuarios = new ArrayList<UserModel>();
   private UserAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // usuarios.add(new UserModel("Natalia", "natalia", TipoUser.Administrador));


        usuarios.add(new UserModel("Natalia", "natalia", TipoUser.Administrador));
        usuarios.add(new UserModel("Ana", "ana", TipoUser.Administrador));
        usuarios.add(new UserModel("Analia", "analia", TipoUser.Administrador));
        usuarios.add(new UserModel("Susana", "susana", TipoUser.Administrador));
        usuarios.add(new UserModel("Jazmin", "jazmin", TipoUser.Administrador));
        usuarios.add(new UserModel("Maria", "maria", TipoUser.Administrador));
        usuarios.add(new UserModel("Paula", "paula", TipoUser.Administrador));
        usuarios.add(new UserModel("Jazmin", "jazmin", TipoUser.Ususrio));
        usuarios.add(new UserModel("Rocio", "rocio", TipoUser.Ususrio));
        usuarios.add(new UserModel("Santiago", "santiago", TipoUser.Ususrio));

        this.adapter = new UserAdapter(usuarios, this);
        RecyclerView recyclerView = super.findViewById(R.id.usuarioRv);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
    }



}