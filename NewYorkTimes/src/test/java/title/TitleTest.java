package title;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TitleTest extends CommonAPI {

    @Test
    public void test(){
        String title = driver.getTitle();
        Assert.assertEquals(title,"Breaking News, World News & Multimedia - The New York Times");
    }
}
