package com.company;

import java.util.ArrayList;
import java.util.List;

public class Socio {

    //ATRIBUTOS
    private String nombre;
    private String apellido;
    private Integer identificacion;
    private ArrayList<Ejemplar> listaSocio = new ArrayList<Ejemplar>();


    //Lista de libro que el socio lleva y maximo puede sacar 3 libros.
    //List<Integer> listaSocio;

    //METODO
    public Boolean tieneCupoDisponible(){
        if ( listaSocio.size()< )
    }


    public void tomarPrestadoUnEjemplar(Ejemplar unEjemplar){
    listaSocio.add(unEjemplar);
    }



}
