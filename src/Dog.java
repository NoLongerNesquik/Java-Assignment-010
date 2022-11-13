import java.util.Random;
import java.util.Scanner;

public class Dog {
    private String breed;
    private String size;
    private String color;
    private int age;
    private String name;
    private boolean living = true;
    Scanner in = new Scanner(System.in);
    Random rand = new Random();
    public Dog(String name, String breed, String size, String color, int age) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
        this.name = name;
    }
    public void eat() {
        if (living == true) {
            switch (size) {
                case "small" -> size = "medium";
                case "medium" -> size = "large";
                case "large" -> {
                    if (color.equals("red")) {
                        size = "clifford";
                    }
                    else {
                        living = false;
                        System.out.println("Dog has died of food overdose.");
                    }
                }
                case "clifford" -> {
                    living = false;
                    System.out.println("Dog has died of food overdose.");
                }
            }
        }
        else {
            System.out.println("Your dog is dead.");
        }
    }
    public void run() {
        if (living == true) {
            switch (size) {
                case "clifford" -> size = "large";
                case "large" -> size = "medium";
                case "medium" -> size = "small";
                case "small" -> {
                    living = false;
                    System.out.println("Dog has died of running overdose.");
                }
            }
        }
        else{
            System.out.println("Your dog is dead.");
        }
    }
    public void name(){
        System.out.println("Choose a name for this dog");
        this.name = in.nextLine();
    }
    public void sleep() {
        if (living == true) {
            addAge();
            if (age >= 10){
                living = false;
                System.out.println("Your dog is now sleeping forever.");
            }
            else System.out.println("You feel your dog has grown a bit.");
        }
        else {
            System.out.println("Your dog is already sleeping.");
        }
    }
    public void addAge(){
        age += 1;
    }

    public String getBreed() {
        return breed;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public Dog breed(Dog partner){
        String newName = (rand.nextBoolean() ?name:partner.getName()) + " Jr.";
        String newBreed = breed.substring(0,(int)(Math.ceil(breed.length()/2.0))) + partner.getBreed().substring(partner.getBreed().length()/2);
        String newSize = rand.nextBoolean() ?size:partner.getSize();
        String newColor = rand.nextBoolean() ?color:partner.getColor();
        return new Dog(newName, newBreed, newSize, newColor, 0);
    }
    public static void main(String[] args) {
        Dog dog1Object = new Dog("Dog", "Bulldog", "large", "light gray", 5);
        Dog dog2Object = new Dog("Molly","beagle","large","orange",6);
        Dog dog3Object = new Dog("Dogathan","German Shepherd", "large","white & orange", 6);
    }
}
