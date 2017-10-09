package com.thinksbrain.testpost.Objects;

/**
 * Created by Hakos on 09/10/2017.
 */

public class Trabajos {
    private String titulo, desc, telf_contacto, email;
    float salario;

    public Trabajos() {
    }

    public Trabajos(String titulo, String desc, float salario, String telf_contacto, String email) {
        this.titulo = titulo;
        this.desc = desc;
        this.salario = salario;
        this.telf_contacto = telf_contacto;
        this.email = email;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDesc() {
        return desc;
    }

    public float getSalario() {
        return salario;
    }

    public String getTelf_contacto() {
        return telf_contacto;
    }

    public String getEmail() {
        return email;
    }
}
