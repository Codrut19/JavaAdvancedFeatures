import java.util.ArrayList;
import java.util.List;

public class Family {

    private List<Person> familyMembers = new ArrayList<Person>();


    private static Family instance = new Family();

  private Family(){

  }

    public static Family getInstance() {
        return instance;
    }

    public List<Person> getFamilyMembers() {
        return familyMembers;
    }
}
