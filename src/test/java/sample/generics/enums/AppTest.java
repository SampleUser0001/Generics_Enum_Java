package sample.generics.enums;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;
import org.junit.Before;

import sample.generics.enums.SampleEnum;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void intTest() {
        assertThat(SampleEnum.Int.get(), is(instanceOf(Integer.class)));
    }

    @Test
    public void strTest() {
        assertThat(SampleEnum.Str.get(), is(instanceOf(String.class)));
    }
}
