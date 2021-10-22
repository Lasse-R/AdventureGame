import java.util.ArrayList;
public class Player {
    ArrayList<Item> inventory = new ArrayList<>();

    public String toString(){
        return "item " + inventory;
    }
}
