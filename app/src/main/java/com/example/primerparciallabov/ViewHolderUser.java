package com.example.primerparciallabov;

import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolderUser  extends RecyclerView.ViewHolder implements View.OnClickListener {
    TextView tvNombre;
    TextView tvTipo;
    TextView tvContrasenia;
    ImageButton btnEdit;
    int position;
    MainActivity mainAct;
    public void setPosition(int position) {
        this.position = position;
    }

    public ViewHolderUser (@NonNull View itemView, MainActivity mainActRecibida) {
        super(itemView);
        this.mainAct = mainActRecibida;
        tvNombre = itemView.findViewById(R.id.tvNombre);
        tvTipo = itemView.findViewById(R.id.tvTipo);
        tvContrasenia = itemView.findViewById(R.id.tvContrasenia);
        itemView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Log.d("Se hizo click","En la persona "+super.getAdapterPosition());
        position = super.getAdapterPosition();

    }
}
