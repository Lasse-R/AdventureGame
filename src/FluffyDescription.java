import java.util.Random;

public class FluffyDescription {


        Random random = new Random();
        private String[] color = {"blue", "green", "yellow", "purple", "red", "dark", "pink", "black"};
        private String[] areaType = {"in a cave", "in a dark pit", "trying to peer into a heavy fog", "in a grotto", "looking over a lake", "too close for comfort to a pool of lava", "in a muddy area", "on a stone chess board floor"};
        private String[] action = {"hanging from the ceiling", "raining down from above", "slowly, very slowly moving towards you", "growing on the walls", "floating mysteriously in the air", "swinging from outcroppings near the ceiling"};
        private String[] decoration = {"mushrooms", "fungus", "rocks", "skulls", "sticky webs", "icy spirals"};

        public void setColor(String[] color){
            this.color = color;
        }

        public void FluffyDescriptions(){    }

        public String toString(){
            return "You stand " + areaType[random.nextInt(areaType.length)] + ", where " + color[random.nextInt(color.length)] +
                    " " + decoration[random.nextInt(decoration.length)] + " are " + action[random.nextInt(action.length)] + ".";
        }
}


