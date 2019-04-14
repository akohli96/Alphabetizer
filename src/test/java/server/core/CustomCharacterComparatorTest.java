package server.core;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CustomCharacterComparatorTest {

    private CustomCharacterComparator comparator;

    private static final Character charALowecase = 'a';
    private static final Character charAUppercase = 'A';
    private static final Character charZLowecase = 'z';
    private static final Character charZUppercase = 'Z';

    @Before
    public void setUp() {
        comparator = new CustomCharacterComparator();
    }

    @Test
    public void sameCharactersShouldBeEqualForSameCase() {
        assertThat(comparator.compare(charALowecase,charALowecase),equalTo(0));
        assertThat(comparator.compare(charAUppercase,charAUppercase),equalTo(0));
    }

    @Test
    public void sameCharactersShouldBeEqualForDifferentCase() {
        assertThat(comparator.compare(charALowecase,charAUppercase),equalTo(0));
    }

    @Test
    public void smallCharactersShouldBeLessThanLargeCharactersSameCase(){
        assertThat(comparator.compare(charALowecase,charZLowecase),lessThan(0));
        assertThat(comparator.compare(charAUppercase,charZUppercase),lessThan(0));
    }

    @Test
    public void smallCharactersShouldBeLessThanLargeCharactersDifferentCase(){
        assertThat(comparator.compare(charALowecase,charZUppercase),lessThan(0));
    }

}