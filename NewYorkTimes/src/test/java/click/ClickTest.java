package click;

import base.CommonAPI;
import org.testng.annotations.Test;

public class ClickTest extends CommonAPI {



    @Test
    public void test2(){
        findElementByxPathAndClick("//button[@class='css-mgtjo2 e1a6adlb0']",
                "//input[@placeholder='SEARCH']","Boeing 737 Max 8");
    }

}
