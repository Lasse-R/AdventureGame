import java.util.ArrayList;
public abstract class Item {
    private String name;
    private String type;

    public Item(){}

    public Item(String name, String type){
        this.name = name;
        this.type = type;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setType(String type){
        this.type = type;
    }

    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }

}
