package Test;

import org.testng.annotations.Test;

public class HomePageTest extends BaseClass{

    @Test
    public void CheckHomePage(){
        pageFactory.getHomePage().CheckHomePage();
    }



}
