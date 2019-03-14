package search;

import base.CommonAPI;
import org.testng.annotations.Test;

public class SearchTest extends CommonAPI {

        @Test
    public void searchElementTest(){
     findElementByXpath("//button[contains(text(),'Log In')]");

    }
}
