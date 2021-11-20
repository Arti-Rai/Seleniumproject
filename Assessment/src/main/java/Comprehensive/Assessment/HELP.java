package Comprehensive.Assessment;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
public class HELP {



public static void main(String[] args) throws InterruptedException {
//System.setProperty("webdriver.edge.driver", "C:\\Users\\M1073042\\Downloads\\edgedriver_win64\\msedgedriver.exe");



System.setProperty("webdriver.edge.driver", "C:\\Users\\M1073058\\Downloads\\edgedriver_win64\\msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
driver.get("https://www.eazydiner.com/");
driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
try {
if(driver.findElement(By.id("webpush-onsite")).isDisplayed()) {
driver.switchTo().frame(driver.findElement(By.id("webpush-onsite")));
driver.findElement(By.id("allow")).click();
driver.switchTo().defaultContent();
}
}
catch (Exception e){

}

driver.findElement(By.id("Help")).click();
}



}