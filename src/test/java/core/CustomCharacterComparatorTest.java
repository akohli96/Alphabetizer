package core;

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
    public void setUp() throws Exception {
        comparator = new CustomCharacterComparator();
    }

    @Test
    public void compareShouldReturnEqualRegardlessOfCase() {
        assertThat(comparator.compare(charALowecase,charAUppercase),equalTo(0));
        assertThat(comparator.compare(charALowecase,charALowecase),equalTo(0));
        assertThat(comparator.compare(charAUppercase,charAUppercase),equalTo(0));
    }


}