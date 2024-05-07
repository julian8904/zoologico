package org.example;

public class Familia {
    Animal papa;
    Animal mama;
    Animal hijo;

    public Familia(Animal papa, Animal mama) {
        this.papa = papa;
        this.mama = mama;
    }

    public void imprimirFamilia() {
        String nombreHijo = (hijo != null) ? hijo.getNombre() : "No hay hijo";
        System.out.println("El papá es: " + papa.getNombre() + ", la mamá es: " + mama.getNombre() + ", el hijo es: " + nombreHijo);
    }

    public void tenerHijo(String nombre){
        if (this.papa != null && this.mama != null) {
            Animal nuevoHijo = new Animal("cebrallo", "masculino",120, "sin pareja"); // Aquí deberías establecer el género del hijo
            this.hijo = nuevoHijo;
        } else {
            System.out.println("Aun no puedes tener hijos");
        }
    }
}
