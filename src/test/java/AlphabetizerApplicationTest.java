import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.junit.MatcherAssert.assertThat;

public class AlphabetizerApplicationTest {

    @Test
    public void testAppHasAGreeting() {
        AlphabetizerApplication classUnderTest = new AlphabetizerApplication();
        assertThat(classUnderTest,is(notNullValue()));
    }
}
