import myExceptions.MyException;
import myMathUtil.*;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestMath {


    //-----------------------------------------------------------------------------------------

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("This is before suite - TestMath");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("--------This is before class - TestMath");
    }

    @BeforeGroups
    public void beforeGroups(){
        System.out.println("========This is before groups - TestMath");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("------------This is before method - TestMath");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("----This is before test - TestMath");
    }

    //-----------------------------------------------------------------------------------------

    @AfterSuite
    public void afterSuite(){
        System.out.println("This is after suite - TestMath");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("--------This is after class - TestMath");
    }

    @AfterGroups
    public void afterGroups(){
        System.out.println("========This is after groups - TestMath");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("------------This is after method - TestMath");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("----This is after test - TestMath");
    }

    //-----------------------------------------------------------------------------------------


    static int aa = 8;
    static int bb = 13;

    @BeforeMethod(enabled = false)
    public void changeAB01(){
        aa *= 2;
        bb *= 2;
    }

    @AfterMethod(enabled = false)
    public void changeAB02(){
        aa -= 6;
        bb -= 11;
    }

    @Test(groups = {"group_1"})
    public void testBasic(){
        System.out.println("This test belongs to group 1");
        Assert.assertEquals(BasicMath.add(aa,bb), aa+bb);
        Assert.assertEquals(BasicMath.minus(aa,bb), aa-bb);
    }

    @Test
    public void testAdvanced01(){
        try {
            Assert.assertEquals(AdvancedMath.pow(2,5),32);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Parameters({"val_1", "val_2"})
    public void testAdvanced05(String val_1, String val_2){

        try {
            int a = Integer.valueOf(val_1);
            int b = Integer.valueOf(val_2);
            Assert.assertEquals(AdvancedMath.pow(a,b),Math.pow(a,b));
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    @Test(expectedExceptions = MyException.class)
    public void testAdvanced02() throws MyException{
            Assert.assertEquals(AdvancedMath.pow(2,-8),32);
    }

    @Test(timeOut = 1)
    public void testAdvanced03(){
        Assert.assertEquals(AdvancedMath.fib(40),102334155);
    }

    @Test(timeOut = 1, enabled = false) // intent to fail timeout restriction
    public void testAdvanced04(){
        Assert.assertEquals(AdvancedMath.fibTimeOut(40),102334155);
    }

    @Test(timeOut = 1) // intent to fail timeout restriction
    public void testAdvanced05(){
        try {
            Assert.assertEquals(AdvancedMath.pow(-1,100000000),1);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
