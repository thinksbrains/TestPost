package com.thinksbrain.testpost.Utils;

import com.thinksbrain.testpost.Objects.Trabajos;
import com.thinksbrain.testpost.Objects.Usuarios;

/**
 * Created by Hakos on 09/10/2017.
 */

public class Variables {
    public static Usuarios[] users = new Usuarios[]{
            new Usuarios("Administrador","Administrador","ADM1111","admin@gmail.com","12345678"),
            new Usuarios("Marcos Dencil","Marck","ma15889","marcks@gmail.com","60545589"),
            new Usuarios("Daniel Soria","Dante","114578soria","soria@gmail.com","70854525")
    };
    public static Trabajos[] trabajos = new Trabajos[]{
            new Trabajos("Se requiere Contador",
                    "Se necesita un contador con 5 años de experiencia, que resida en la localidad y que" +
                            "sea de confianza",
                    15000,"60607070","indexcorp@gmail.com"),
            new Trabajos("Buscamos Programadores",
                    "Empresa Thinks Brains requiere universitarios q quieran ganar experiencia y trabajar" +
                            "se les dara preparacion",
                    20000,"45856525","thinksbrain@gmail.com"),
            new Trabajos("BUSCO EMPLEO INTERNA",
                    "Chica responsable y con mucha experiencia busca empleo de " +
                            "cuidado de personas mayores niños tareas del hogar disponible de inmediato",
                    1000,"70401015","lancil0245@gmail.com"),
            new Trabajos("SE BUSCA PROFESOR/A NATIVO/A INGLES",
                    "Se busca profesor/a nativo/a de ingles para dar clases a dos niños en mi " +
                            "domicilio de gojar, el horario sería de 16: 00 a 18: 00 de lunes a viernes, " +
                            "niño de 15 años en 4 eso y 16 años 1 bachiller. Se tendrá en cuenta si habla también francés. ",
                    3300,"10203004","dario_8484@gmail.com")
    };
}
