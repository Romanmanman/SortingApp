import org.example.Main;
import org.junit.Test;

public class BoundTest {
    @Test(expected = IllegalArgumentException.class)
    public void zeroArguments(){
        Main.result(new String[0]);
    }
    @Test(expected = IllegalArgumentException.class)
    public void moreThanTenArguments(){
        Main.result(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"});
    }
}
