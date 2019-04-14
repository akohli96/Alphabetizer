package server.core;

import java.util.Comparator;

public class CustomCharacterComparator implements Comparator<Character> {

    @Override
    public int compare(Character o1, Character o2) {
        return Character.toLowerCase(o1)-Character.toLowerCase(o2);
    }
}
