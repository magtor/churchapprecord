package com.church.churchapp.databasechurch;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "miembros")
public class members {

    @DatabaseField(generatedId = true)
     private int id;
    @DatabaseField
     String nombre ;
    @DatabaseField
     String apellidos;
    @DatabaseField
     String numerote;
    @DatabaseField
     int operadora ;//se refiere si es movistar o claro o cootel
    @DatabaseField
     int diasemana;//sera un valor numerico que indica 1 = lunes,2 = martes   ....
    @DatabaseField
     String nombreseguidor;//persona que le da seguimiento
    @DatabaseField
      int tipomiembro; //Este campo es  1  = miembro,2 = reconciliar 3 = bautizado
    public members(){

    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellidos(){
        return apellidos;
    }

    public String getNumerote() {
        return numerote;
    }

    public int getOperadora() {
        return operadora;
    }

    public int getDiasemana() {
        return diasemana;
    }
    public String getNombreseguidor(){
        return nombreseguidor;
    }
    public int getTipomiembro(){
        return tipomiembro;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public void setDiasemana(int diasemana) {
        this.diasemana = diasemana;
    }

    public void setNumerote(String numerote) {
        this.numerote = numerote;
    }
    public void setOperadora(int operadora){
        this.operadora = operadora;
    }
    public void setNombreseguidor(String nombreseguidor){
        this.nombreseguidor = nombreseguidor;
    }
    public void setTipomiembro(int tipomiembro){
        this.tipomiembro = tipomiembro;
    }
}
