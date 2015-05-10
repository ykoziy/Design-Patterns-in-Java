/*
 * Null object pattern, has an object that acts as a default value
 */
import java.util.Scanner;

public class NullObjectDriver {
    public static void main(String[] args) {
        System.out.print("What animal to create (type 'dog' or 'cat')? - ");
        Scanner sc = new Scanner(System.in);
        String animal = sc.nextLine();
        Animal a;
        
        if(animal.equalsIgnoreCase("cat")) {
            a = new Cat();
            a.makeSound();   
        } else if(animal.equalsIgnoreCase("dog")) {
            a = new Dog();
            a.makeSound();
        } else {
            a = new NullAnimal();
            a.makeSound();
        }
    }
}
