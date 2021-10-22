public class Weapon extends Item {
    private int damage;

    public Weapon(String type, String name, int damage){
        super(type, name);
        this.damage = damage;
    }

    public Weapon(){
        super();
    }
}
