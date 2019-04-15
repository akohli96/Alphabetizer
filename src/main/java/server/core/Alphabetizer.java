package server.core;

public class Alphabetizer {

  private static final CustomCharacterComparator CUSTOM_CHARACTER_COMPARATOR = new CustomCharacterComparator();

  private Alphabetizer() {}

  /*
     Input : String to alphabetize
     Output : Alphabetized string
     Converts to stream, strips out non alphabetic characters, sorts using custom comparator
     and uses string builder to build a string
   */
  public static String alphabetize(String input) {
    if (input.length() < 2) {
      return input;
    }

    return input
        .chars()
        .filter(Character::isAlphabetic)
        .mapToObj(character -> (char) character)
        .sorted(CUSTOM_CHARACTER_COMPARATOR)
        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
        .toString();
  }
}
