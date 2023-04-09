import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestRunner extends Setup {
    @Test(priority = 1, description = "Sum of 2 number")
    public void doSum() throws InterruptedException {
        CalcScreen calcScreen=new CalcScreen(driver);
        String sum= calcScreen.doSum();
        System.out.println(sum);
        Assert.assertEquals(sum,"15");
    }
    @Test(priority = 2, description = "Sub of 2 number")
    public void doSub() throws InterruptedException {
        CalcScreen calcScreen=new CalcScreen(driver);
        String sum= calcScreen.doSub();
        System.out.println(sum);
        Assert.assertEquals(sum,"1");
    }
    @AfterMethod
    public void clearScreen(){
        CalcScreen calcScreen=new CalcScreen(driver);
        calcScreen.btnClear.click();
    }
}
