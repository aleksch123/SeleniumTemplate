package ru.qa.st.appmanager;

import com.sun.webkit.WebPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.qa.st.pageobject.TestWebPage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    WebDriver wd;
    private final Properties properties;
    private  String browser;

    private TestWebPage webPage;

    public ApplicationManager (String browser){
        this.browser = browser;
        properties = new Properties();
    }

    public void  init() throws IOException {

    wd =  new ChromeDriver();
    properties.load(new FileReader(new File("src/test/resources/test.properties")));
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get(properties.getProperty("web.baseUrl"));
    wd.manage().window().maximize();
    webPage = new TestWebPage(wd);
    }

    public void stop(){
        wd.quit();
    }

    public TestWebPage webPage(){
        return webPage;
    }
}


