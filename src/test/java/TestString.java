import myStringUtil.*;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestString {

    //-----------------------------------------------------------------------------------------

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("This is before suite - TestString");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("--------This is before class - TestString");
    }

    @BeforeGroups
    public void beforeGroups(){
        System.out.println("========This is before groups - TestString");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("------------This is before method - TestString");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("----This is before test - TestString");
    }

    //-----------------------------------------------------------------------------------------

    @AfterSuite
    public void afterSuite(){
        System.out.println("This is after suite - TestString");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("--------This is after class - TestString");
    }

    @AfterGroups
    public void afterGroups(){
        System.out.println("========This is after groups - TestString");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("------------This is after method - TestString");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("----This is after test - TestString");
    }

    //-----------------------------------------------------------------------------------------

    @Test(priority = 2, groups = {"group_1"})
    public void test01(){
        System.out.println("Execute test01 - group_1");
        Assert.assertEquals(AdvancedString.rtAdvancedString(),"AdvancedString");
    }

    @Test(priority = 1)
    public void test02(){
        System.out.println("Execute test02");
        Assert.assertEquals(BasicString.rtBasicString(),"BasicString");
    }

}
