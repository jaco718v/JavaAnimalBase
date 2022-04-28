import java.io.PrintStream;

public class Animal {
    private String name;
    private String desc;
    private String type;
    private int age;
    private double weight;

    public Animal(String name, String desc, String type, int age, double weight) {
        this.name = name;
        this.desc = desc;
        this.type = type;
        this.age = age;
        this.weight = weight;
    }

    public void printAnimal(PrintStream out, Animal animal){
        out.print(animal.name);
        out.print(";");
        out.print(animal.desc);
        out.print(";");
        out.print(animal.type);
        out.print(";");
        out.print(animal.age);
        out.print(";");
        out.print(animal.weight);
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " the " + desc + " " + type + ", age " + age + ", weight " + weight +"kg";
    }



}
