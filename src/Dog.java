public class Dog {
    private String breed;
    private String size;
    private String color;
    private int age;
    private boolean living = true;
    public Dog(String name, String breed, String size, String color, String standName, int age) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
    }
    public void Eat() {
        switch (size) {
            case "small" -> size = "medium";
            case "medium" -> size = "large";
            case "large" -> size = "clifford";
            case "clifford" -> {
                living = false;
                System.out.println("Dog has died of food overdose.");
            }
        }
    }
    public void Run() {
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
}
