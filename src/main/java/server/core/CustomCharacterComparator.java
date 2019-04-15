package server.core;

import java.util.Comparator;

public class CustomCharacterComparator implements Comparator<Character> {

  /*
   Input : Two characters to compare
   Output : Difference in int between lower case values
   Lowercases both characters before comparing them. This way case does not matter.
 */
  @Override
  public int compare(Character o1, Character o2) {
    return Character.toLowerCase(o1) - Character.toLowerCase(o2);
  }
}
