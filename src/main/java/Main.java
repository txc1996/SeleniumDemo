
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) {
        //create FireFoxDriver
        System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        //if Nguyet xinh dep want to use Chrome instead of fire fox. Uncomment these lines bellow
        //System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/selenium/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        //close Fire fox
        //driver.close();

    }
}
