package collection_framework.sets;

import java.util.EnumSet;

public class Enum_Set {

    enum Color {
        RED,YELLOW,GREEN
    }

    public static void main(String[] args) {

        EnumSet<Color> enumSet = EnumSet.allOf(Color.class);
    }
}
