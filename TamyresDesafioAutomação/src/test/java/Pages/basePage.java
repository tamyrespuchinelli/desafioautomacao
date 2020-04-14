package Pages;


import org.openqa.selenium.WebDriver;

public class basePage {


    public basePage (WebDriver driver){
        this.driver = driver;
    }

    protected WebDriver driver;

    public basePage() {
    }

    public void openUrl (String url) throws InterruptedException {
        driver.get(url);
        Thread.sleep(2000);
        driver.manage().window().maximize();
    }

    public void Closebrowser(){
        driver.quit();
    }
}
