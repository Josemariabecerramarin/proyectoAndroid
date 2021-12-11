package com.company.room;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Elemento {
    @PrimaryKey(autoGenerate = true)
    int id;

    String nombre;
    String descripcion;
    float valoracion;
    int imagen;
    String tipo;

    public Elemento(String nombre, String descripcion, int imagen, String tipo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.tipo = tipo;
    }
}
