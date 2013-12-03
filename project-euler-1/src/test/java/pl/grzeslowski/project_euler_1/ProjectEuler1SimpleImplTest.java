package pl.grzeslowski.project_euler_1;

import java.util.Arrays;
import java.util.Collection;

import org.fest.assertions.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class ProjectEuler1SimpleImplTest {

    private final int in;
    private final long out;

    public ProjectEuler1SimpleImplTest(final int in, final long out) {
        this.in = in;
        this.out = out;
    }

    @Parameters
    public static Collection<Object[]> data() {
        final Object[][] data = new Object[][] { { 1, 0 },
                { 2, 0 }, { 3, 0 }, { 4, 3 },
                { 10, 23 } };
        return Arrays.asList(data);
    }

    @Test
    public void test_normal_parameters() {

        // given
        final ProjectEuler1SimpleImpl euler = new ProjectEuler1SimpleImpl();

        // when
        final long findSum = euler.findSum(in);

        // then
        Assertions.assertThat(findSum).isEqualTo(out);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_maxValue_equals_0() {
        // given
        final ProjectEuler1SimpleImpl euler = new ProjectEuler1SimpleImpl();

        // when
        euler.findSum(0);

        // then
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_maxValue_equals_minus_1() {
        // given
        final ProjectEuler1SimpleImpl euler = new ProjectEuler1SimpleImpl();

        // when
        euler.findSum(-1);

        // then
    }
}
