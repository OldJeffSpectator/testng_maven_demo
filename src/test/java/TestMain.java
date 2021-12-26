import org.testng.Assert;
import org.testng.annotations.*;

public class TestMain extends TestString{


    @Test
    public void testMain(){
        System.out.println("This is testMain");
        Integer a = Integer.getInteger("12345");
        Assert.assertEquals(Main.returnInput(a),a);
    }



}
