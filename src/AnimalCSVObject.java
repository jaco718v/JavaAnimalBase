import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class AnimalCSVObject {

  public void loadDatabase(ArrayList<Animal> animals) throws FileNotFoundException {
    Scanner fileScanner = new Scanner(new File("animal.csv"));
    while(fileScanner.hasNextLine()){
      String line = fileScanner.nextLine();
      Scanner sc = new Scanner(line).useDelimiter(";").useLocale(Locale.ENGLISH);
      String name = sc.next();
      String desc = sc.next();
      String type = sc.next();
      int age = sc.nextInt();
      double weight = sc.nextDouble();
      animals.add(new Animal(name,desc,type,age,weight));
    }
  }

  public void saveDatabase(ArrayList<Animal> animals) throws FileNotFoundException {
    PrintStream out = new PrintStream(new File("animal.csv"));
    for(Animal animal: animals){
      animal.printAnimal(out,animal);
    }
  }
}
