package com.example.primerparciallabov;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<ViewHolderUser> {

    private List<UserModel> usuarios;
    private MainActivity mainAct;

    public UserAdapter(List<UserModel> usuarios, MainActivity mainActRecibida) {
        this.usuarios = usuarios;
        this.mainAct = mainActRecibida;

    }



    @NonNull
    @Override
    public ViewHolderUser onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        ViewHolderUser holder = new ViewHolderUser(view, this.mainAct);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderUser holder, int position) {
        UserModel usuario = this.usuarios.get(position);
        holder.tvNombre.setText(usuario.getNombre());
        holder.tvTipo.setText(usuario.getTipoUser().toString());
        holder.tvContrasenia.setText(usuario.getContrasenia());
        holder.setPosition(position);
    }

    @Override
    public int getItemCount() {
        return usuarios.size();
    }

}
