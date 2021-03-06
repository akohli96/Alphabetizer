package server.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@RunWith(JUnit4.class)
public class AlphabetizerTest {

  private static final String VIRGINIA_TECH = "VirginiaTech";
  private static final String BLIND_MICE = "3 Blind Mice";
  private static final String SAME_LETTER_DIFFERENT_CASE = "BBbbaaAA";
  private static final String ONE_CHARACTER = "V";
  private static final String EMPTY_STRING = "";

  @Test
  public void alphabetizeShoulAlphabetizeAndBeCaseInsensitive() {
    assertThat(Alphabetizer.alphabetize(VIRGINIA_TECH), equalTo("aceghiiinrTV"));
  }

  @Test
  public void alphabetizeShouldNotAlterTheOrderOfSameCharacters() {
    assertThat(Alphabetizer.alphabetize(SAME_LETTER_DIFFERENT_CASE), equalTo("aaAABBbb"));
  }

  @Test
  public void alphabetizeShouldNotTakeIntoAccountNonAlphabeticCharacters() {
    assertThat(Alphabetizer.alphabetize(BLIND_MICE), equalTo("BcdeiilMn"));
  }

  @Test
  public void alphabetizeShouldBeAbleToHandleOneCharacterStringOrLess() {
    assertThat(Alphabetizer.alphabetize(ONE_CHARACTER), equalTo("V"));
    assertThat(Alphabetizer.alphabetize(EMPTY_STRING), equalTo(""));
  }
}
