import java.io.FileNotFoundException;
import java.util.ArrayList;

public class FileHandler {
  private AnimalCSVObject animalCSV = new AnimalCSVObject();

  public void loadDatabase(ArrayList<Animal> animals) throws FileNotFoundException {
    animalCSV.loadDatabase(animals);
  }

  public void saveDatabase(ArrayList<Animal> animals) throws FileNotFoundException {
    animalCSV.saveDatabase(animals);
  }
}
