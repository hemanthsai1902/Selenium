package qapitol_QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task_1 {

	public static void main(String[] args) throws InterruptedException { 
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe"); 	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		driver.get("https://trello.com/login");
		driver.findElement(By.id("user")).sendKeys("hemanthsai1902@gmail.com");
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath("//input[@id='login']"));
		ele.click();
		driver.findElement(By.id("password")).sendKeys("hemanth@1997*");
		Thread.sleep(2000);
		WebElement temp = driver.findElement(By.xpath("//button[@id='login-submit']"));
		temp.click();
		
	    WebDriverWait wait=new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='board-tile mod-add']")));
		
		driver.findElement(By.xpath("//div[@class='board-tile mod-add']")).click();
		
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-label='Add board title']")));
    
	driver.findElement(By.xpath("//input[@aria-label='Add board title']")).sendKeys("goa trip");
	
	driver.findElement(By.xpath("//button[@class='_1q9gQWvu0bw9ph _3TTqkG5muwOzqZ _3Ik0JLsERwh6Ui']")).click();
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@placeholder='Enter a title for this card…']")));
	
	driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']")).sendKeys("shopping");
	
    driver.findElement(By.xpath("//*[@id=\"board\"]/div[1]/div/div[2]/div/div[2]/div[1]/input")).click();
    
    driver.findElement(By.xpath("//*[@id=\"board\"]/div[1]/div/div[2]/div/div[1]/div/textarea")).sendKeys("Booking Tickets");
    
    driver.findElement(By.xpath("//*[@id=\"board\"]/div[1]/div/div[2]/div/div[2]/div[1]/input")).click();
    
    driver.findElement(By.xpath("//*[@id=\"board\"]/div[1]/div/div[2]/div/div[1]/div/textarea")).sendKeys("Booking Hotel");
    Thread.sleep(2000);

    driver.findElement(By.xpath("//*[@id=\"board\"]/div[1]/div/div[1]/div[2]/a")).click();
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//a[@class='js-move-cards']")).click();
    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[starts-with(@class,'js-select-list highlight-icon ') and text()='Doing']")));
    Thread.sleep(2000);
    driver.findElement(By.xpath("//a[starts-with(@class,'js-select-list highlight-icon ') and text()='Doing']")).click();
    
    driver.findElement(By.xpath("//*[@id=\"board\"]/div[1]/div/div[1]/div[2]/a")).click();
    
    driver.findElement(By.xpath("//a[@class='js-move-cards']")).click();
    
    driver.findElement(By.xpath("//a[starts-with(@class,'js-select-list highlight-icon ') and text()='Doing']")).click(); 
    
    driver.findElement((By.xpath("//div[@class='list-header-extras']/following::a[starts-with(@class,'list-header-extras-menu dark-hover js-open-list-menu icon-sm icon-overflow-menu-horizontal')]"))).click();
    
    driver.findElement(By.xpath("//a[@class='js-move-cards']")).click();
    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='pop-over-list']/following::a[@class='js-move-cards']")));
    //driver.findElement(By.xpath("//ul[@class='pop-over-list']/following::a[@class='js-move-cards']")).click();
    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@name='6149bf19276e3b8853f31fcb']")));
    driver.findElement(By.xpath("//a[starts-with(@class,'js-select-list highlight-icon ') and text()='Done']")).click();
    
}}
