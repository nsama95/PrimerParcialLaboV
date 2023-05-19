package com.example.primerparciallabov;

import java.io.Serializable;
import java.util.Objects;

public class UserModel implements Serializable {
    private String contrasenia;
    private String nombre;
    private TipoUser tipoUser;

    public UserModel() {
    }
    public UserModel(String nombre, String contrasenia, TipoUser tipoUser) {
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.tipoUser = tipoUser;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public TipoUser getTipoUser() {
        return tipoUser;
    }

    public void setTipoUsuario(String tipoUsuario) {
        if (TipoUser.Ususrio.toString().toLowerCase().equals(tipoUsuario.toLowerCase())){
            this.tipoUser = TipoUser.Ususrio;
        } else if(TipoUser.Administrador.toString().toLowerCase().equals(tipoUsuario.toLowerCase())){
            this.tipoUser = TipoUser.Administrador;
        }

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        UserModel that = (UserModel) obj;
        return nombre.equals(that.nombre) && contrasenia.equals(that.contrasenia) && tipoUser == that.tipoUser;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "nombre='" + nombre + '\'' +
                ", contrasenia='" + contrasenia + '\'' +
                ", tipoUsuario=" + tipoUser +
                '}';
    }
}
