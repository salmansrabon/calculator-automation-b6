import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalcScreen {
    @FindBy(id= Setup.PACKAGE_ID+ ":id/digit_7")
    AndroidElement btn7;
    @FindBy(id= Setup.PACKAGE_ID+ ":id/digit_8")
    AndroidElement btn8;
    @FindBy(id = Setup.PACKAGE_ID+ ":id/op_add")
    AndroidElement btnPlus;
    @FindBy(id = Setup.PACKAGE_ID+ ":id/op_sub")
    AndroidElement btnMinus;
    @FindBy(id= Setup.PACKAGE_ID+ ":id/eq")
    AndroidElement btnEqual;
    @FindBy(id = Setup.PACKAGE_ID+ ":id/result_final")
    AndroidElement resultFinal;
    @FindBy(id = Setup.PACKAGE_ID+ ":id/clr")
    AndroidElement btnClear;

    public CalcScreen(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    public String doSum() throws InterruptedException {
        Thread.sleep(2000);
        btn7.click();
        btnPlus.click();
        btn8.click();
        btnEqual.click();
        return resultFinal.getText();
    }
    public String doSub() throws InterruptedException {
        Thread.sleep(2000);
        btn8.click();
        btnMinus.click();
        btn7.click();
        btnEqual.click();
        return resultFinal.getText();
    }
}
