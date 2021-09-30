public class Player {
    private String[] backpack = new String[2];              // maks 3 ting i den(?), mad/eat, gems/bribeMonster, skal bruge en item class
    private String weapon;                          // weapon class med damage, name, equip, skal bruge enemy class
    private int hitPoints;                      // afhængig af level feks +10-20 hp per level
    private String armor;                      // armor class med absorb, name, equip
    private int level;                              // stiger level efter hvert kill måske, kun 9 rum så nok ikke smart med mere komplekst system
}
