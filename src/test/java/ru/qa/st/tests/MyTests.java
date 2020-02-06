package ru.qa.st.tests;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

@Features("Имя сьюта")

public class MyTests extends TestBase{


    @Stories("Comparison of filter and search results")
    @Test

    public void someTest(){

        app.webPage().goToSomeWhere();


    }
}
