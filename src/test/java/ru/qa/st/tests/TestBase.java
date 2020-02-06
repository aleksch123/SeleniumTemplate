package ru.qa.st.tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import ru.qa.st.appmanager.ApplicationManager;

import java.io.IOException;

public class TestBase {

    public static final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);

    @BeforeSuite
    public void setUp() throws IOException {
        app.init();
    }

    @AfterTest

    public void tearDown(){
        app.stop();
    }
}
