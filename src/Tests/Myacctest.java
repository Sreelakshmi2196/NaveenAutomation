package Tests;

import org.testng.annotations.Test;

import Pages.Myaccpage;

public class Myacctest extends Base{
	
	@Test
	public void perform() throws InterruptedException
	{
		Myaccpage obj = new Myaccpage(d);
		obj.perform1();
		obj.perform2("sri", "lakshmi", "abcd1678@gmail.com", "1234567890");
		obj.perform3("Sree21*96");
		obj.perform4();
		obj.perform5();
	}

}
