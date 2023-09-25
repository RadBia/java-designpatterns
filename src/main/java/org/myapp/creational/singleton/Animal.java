package org.myapp.creational.singleton;

public class Animal {
    // Zmienna przechowująca jedyną instancję klasy Animal
    private static Animal uniqueAnimal;

    private String name;

    // Prywatny konstruktor, który zapobiega tworzeniu instancji z zewnątrz
    private Animal(String name) {
        this.name = name;
    }

    // Metoda publiczna dostarczająca dostęp do jedynego egzemplarza
    public static Animal getUniqueAnimal(String name) {
        // Opóźnione tworzenie instancji: tworzymy instancję, jeśli jeszcze nie istnieje
        if (uniqueAnimal == null) {
            uniqueAnimal = new Animal(name);
        }
        return uniqueAnimal;
    }

    // Dodaj inne metody i właściwości klasy Animal tutaj

    // Przykładowa metoda
    public void makeSound() {
        System.out.println(name + " is making a sound.");
    }

    public String getName() {
        return name;
    }
}
