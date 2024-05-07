package org.example;

public class Zoologico {
    public static void main(String[] args) {


        Animal animal1 = new Animal("Caballo", "F", 250, "cebra");
        Animal animal2 = new Animal("Cebra", "M", 200, "caballo");

        animal1.encontrarPareja(animal2);


        Familia familia = new Familia(animal2,animal1);


        familia.tenerHijo("Cebrallo");

        familia.imprimirFamilia();


    }
}