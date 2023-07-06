package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Myaccpage {
	
	WebDriver d;
	
	By acc = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]");
	By reg = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a");
	
	By fname = By.xpath("//*[@id=\"input-firstname\"]");
	By lname = By.xpath("//*[@id=\"input-lastname\"]");
	By email = By.xpath("//*[@id=\"input-email\"]");
	By phone = By.xpath("//*[@id=\"input-telephone\"]");
	
	By pwd = By.xpath("//*[@id=\"input-password\"]");
	By cpwd = By.xpath("//*[@id=\"input-confirm\"]");
	
	By cbox = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
	By conti = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
	
	By conti1 = By.xpath("//*[@id=\"content\"]/div/div/a");
	
	public Myaccpage(WebDriver d) {
		
		this.d = d;
	}

	public void perform1() throws InterruptedException 
	{
		d.findElement(acc).click();
		Thread.sleep(5000);
		d.findElement(reg).click();
	}
	
	public void perform2(String first, String last, String eid, String phn) throws InterruptedException
	{
		Thread.sleep(5000);
		d.findElement(fname).sendKeys(first);
		d.findElement(lname).sendKeys(last);
		d.findElement(email).sendKeys(eid);
		d.findElement(phone).sendKeys(phn);
	}
	
	public void perform3(String password) throws InterruptedException
	{
		Thread.sleep(5000);
		d.findElement(pwd).sendKeys(password);
		d.findElement(cpwd).sendKeys(password);
	}
	
	public void perform4() throws InterruptedException
	{

		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		d.findElement(cbox).click();
		Thread.sleep(5000);
		d.findElement(conti).click();
	}
	
	public void perform5() throws InterruptedException
	{
		Thread.sleep(5000);
		d.findElement(conti1).click();
	}

}
