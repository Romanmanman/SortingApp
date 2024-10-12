import org.example.Main;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestSorting {
    private Main main = new Main();
    private String [] a;
    private String expected;
    public TestSorting (String [] a, String expected){
        this.a = a;
        this.expected = expected;
    }
    @Parameterized.Parameters
    public static Collection<Object[]> dataTest(){
        return Arrays.asList(new Object[][]{
                {new String[]{"3", "2", "1"}, "[1, 2, 3]"},
                {new String[]{"1", "0", "-1"}, "[-1, 0, 1]"}
        });
    }
    @Test
    public void testParam (){
        assertEquals(expected, Main.result(a));
    }
}
