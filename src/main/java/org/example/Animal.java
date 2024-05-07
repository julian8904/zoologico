package org.example;

public class Animal {
    String nombre;
    String genero;
    double peso;
    String pareja;

    public Animal(String nombre, String genero, double peso, String pareja) {
        this.nombre = nombre;
        this.genero = genero;
        this.peso = peso;
        this.pareja = pareja;
    }

    void encontrarPareja(Animal pareja){
        this.pareja = pareja.getNombre();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getPareja() {
        return pareja;
    }

    public void setPareja(String pareja) {
        this.pareja = pareja;
    }
}
