package com.thinksbrain.testpost.Objects;

/**
 * Created by Hakos on 09/10/2017.
 */

public class Usuarios {
    private String nombre_completo,nombre_usuario, password, email, telf;

    public Usuarios() {
    }

    public Usuarios(String nombre_completo, String nombre_usuario, String password, String email, String telf) {
        this.nombre_completo = nombre_completo;
        this.nombre_usuario = nombre_usuario;
        this.password = password;
        this.email = email;
        this.telf = telf;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public String getPassword() {
        return password;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public String getEmail() {
        return email;
    }

    public String getTelf() {
        return telf;
    }
}
