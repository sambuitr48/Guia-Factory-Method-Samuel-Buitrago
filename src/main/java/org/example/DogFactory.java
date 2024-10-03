package org.example;

/**
 * Fábrica concreta que crea una instancia de perro.
 */
public class DogFactory extends PetFactory {
    @Override
    public Pet createPet() {
        return new Dog(); // Retorna una instancia de Dog
    }
}