package FaceBook;

import org.openqa.selenium.By;

public class FBUtility {
	
	By email = By.xpath("//input[contains(@id,'email')]");
	By pass =By.xpath("//input[contains(@id,'pass')]");
	By CreateAccount=By.xpath("//a[starts-with(@id,'u_0_0')]");
}
