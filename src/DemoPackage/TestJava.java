package DemoPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestJava {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hi I am good");
       // System.setProperty("webdriver.chrome.driver","C:\\Users\\Gunjesh\\Downloads\\softwares\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        Thread.sleep(5000);
        driver.quit();



    }

}
