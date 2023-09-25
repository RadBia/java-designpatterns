package org.myapp.creational.singleton;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        // Press Shift+F9 to start debugging your code. We have set one breakpoint
        // for you, but you can always add more by pressing Ctrl+F8.

        // Get the Singleton instance
        Singleton singleton = Singleton.getInstance();

        // Call a method on the Singleton instance
        singleton.doSomething();

        // Pobierz instancję Animal (np. "Cat")
        Animal cat = Animal.getUniqueAnimal("Dog");

        // Wywołaj metody na instancji Animal
        System.out.println(cat.getName()); // Wyświetli "Cat"
        cat.makeSound(); // Wyświetli "Cat is making a sound."

        // Pobierz inną instancję Animal (np. "Dog")
        Animal dog = Animal.getUniqueAnimal("Cat");

        // Obie zmienne `cat` i `dog` wskazują na tę samą instancję
        System.out.println(dog.getName()); // Wyświetli "Cat", ponieważ to ta sama instancja
        dog.makeSound(); // Wyświetli "Cat is making a sound."

        }
    }