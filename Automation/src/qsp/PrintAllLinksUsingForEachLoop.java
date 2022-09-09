package qsp;

import java.util.List;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinksUsingForEachLoop 
{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
	  System.out.println("Enter the url ");	
	  Scanner sc=new Scanner(System.in);
	  String url=sc.nextLine();
      WebDriver driver=new ChromeDriver();
	  driver.get(url); 
      List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
      int count=allLinks.size();
      System.out.println(count);
	  for(WebElement a : allLinks)
	  {
    	 String text =a.getText();
	     System.out.println(text);
	  }
	  driver.close();
	}

}
