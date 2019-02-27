package trivia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

class testEdge {

	WebDriver driver ;
	
	@BeforeEach 
	public void init() {
		driver =new ChromeDriver();
	}

	@AfterEach
	public void closeB() {
		driver.close();
	}
	
	
	@Test
	public void Sanity() throws InterruptedException 
	{
		try {
			driver.get("https://svcollegetest.000webhostapp.com/");


			WebElement start =driver.findElement(By.id("startB"));
			start.click();

			WebElement question =driver.findElement(By.name("question"));
			question.click();
			question.sendKeys("where letter a?");
			driver.findElement(By.id("nextquest")).click();

			WebElement answer1=driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input"));

			answer1.click();
			answer1.sendKeys("a");

			WebElement answer2 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input"));
			answer2.click();
			answer2.sendKeys("b");

			WebElement answer3 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input"));
			answer3.click();
			answer3.sendKeys("c");


			JavascriptExecutor js = (JavascriptExecutor) driver;  
			js.executeScript("window.scrollBy(0,1000)");

			WebElement answer4 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input"));
			answer4.click();
			answer4.sendKeys("d");

			WebElement radiobuten =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input"));
			radiobuten.click();


			Thread.sleep(3000);
			driver.findElement(By.id("nextquest")).click();

			WebElement question2 =driver.findElement(By.name("question"));
			question2.click();
			question2.sendKeys("where letter b?");
			driver.findElement(By.id("nextquest")).click();



			answer1.click();
			answer1.sendKeys("b");


			answer2.click();
			answer2.sendKeys("a");

			answer3.click();
			answer3.sendKeys("c");


			js.executeScript("window.scrollBy(0,1000)");

			answer4.click();
			answer4.sendKeys("d");

			radiobuten.click();


			Thread.sleep(3000);

			driver.findElement(By.id("nextquest")).click();

			WebElement question3 =driver.findElement(By.name("question"));
			question3.click();
			question3.sendKeys("where letter c?");
			driver.findElement(By.id("nextquest")).click();

			answer1.click();
			answer1.sendKeys("c");


			answer2.click();
			answer2.sendKeys("a");

			answer3.click();
			answer3.sendKeys("b");


			js.executeScript("window.scrollBy(0,1000)");

			answer4.click();
			answer4.sendKeys("d");

			radiobuten.click();

			js.executeScript("window.scrollBy(0,1000)");

			driver.findElement(By.id("nextquest")).click();


			WebElement startGame =driver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[1]"));
			startGame.click();
			Thread.sleep(3000);



			WebElement radiobuttona1 =driver.findElement(By.xpath("//*[@id=\"2\"]/input[1]"));
			radiobuttona1.click();
			js.executeScript("window.scrollBy(0,1000)");
			WebElement btnnext=driver.findElement(By.id("btnnext"));
			btnnext.click();

			Thread.sleep(3000);

			WebElement radiobuttona2 =driver.findElement(By.xpath("//*[@id=\"1\"]/input[1]"));
			radiobuttona2.click();
			js.executeScript("window.scrollBy(0,1000)");
			btnnext.click();

			Thread.sleep(3000);

			WebElement radiobuttona3 =driver.findElement(By.xpath("//*[@id=\"0\"]/input[1]"));
			radiobuttona3.click();
			js.executeScript("window.scrollBy(0,1000)");
			btnnext.click();

			assertEquals(true, driver.getPageSource().contains("Sucsses"));

		}
		catch(Exception e) {
			System.out.println("error");
		}

				

	}
	

	@Test
	public void TryAgen() throws InterruptedException 
	{
		try {
			driver.get("https://svcollegetest.000webhostapp.com/");


			WebElement start =driver.findElement(By.id("startB"));
			start.click();

			WebElement question =driver.findElement(By.name("question"));
			question.click();
			question.sendKeys("where letter a?");
			driver.findElement(By.id("nextquest")).click();

			WebElement answer1=driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input"));

			answer1.click();
			answer1.sendKeys("a");

			WebElement answer2 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input"));
			answer2.click();
			answer2.sendKeys("b");

			WebElement answer3 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input"));
			answer3.click();
			answer3.sendKeys("c");


			JavascriptExecutor js = (JavascriptExecutor) driver;  
			js.executeScript("window.scrollBy(0,1000)");

			WebElement answer4 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input"));
			answer4.click();
			answer4.sendKeys("d");

			WebElement radiobuten =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input"));
			radiobuten.click();


			Thread.sleep(3000);
			driver.findElement(By.id("nextquest")).click();

			WebElement question2 =driver.findElement(By.name("question"));
			question2.click();
			question2.sendKeys("where letter b?");
			driver.findElement(By.id("nextquest")).click();



			answer1.click();
			answer1.sendKeys("b");


			answer2.click();
			answer2.sendKeys("a");

			answer3.click();
			answer3.sendKeys("c");


			js.executeScript("window.scrollBy(0,1000)");

			answer4.click();
			answer4.sendKeys("d");

			radiobuten.click();


			Thread.sleep(3000);

			driver.findElement(By.id("nextquest")).click();

			WebElement question3 =driver.findElement(By.name("question"));
			question3.click();
			question3.sendKeys("where letter c?");
			driver.findElement(By.id("nextquest")).click();

			answer1.click();
			answer1.sendKeys("c");


			answer2.click();
			answer2.sendKeys("a");

			answer3.click();
			answer3.sendKeys("b");


			js.executeScript("window.scrollBy(0,1000)");

			answer4.click();
			answer4.sendKeys("d");

			radiobuten.click();

			js.executeScript("window.scrollBy(0,1000)");

			driver.findElement(By.id("nextquest")).click();


			WebElement startGame =driver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[1]"));
			startGame.click();
			Thread.sleep(3000);



			WebElement radiobuttona1 =driver.findElement(By.xpath("//*[@id=\"2\"]/input[1]"));
			radiobuttona1.click();
			js.executeScript("window.scrollBy(0,1000)");
			WebElement btnnext=driver.findElement(By.id("btnnext"));
			btnnext.click();

			Thread.sleep(3000);

			WebElement radiobuttona2 =driver.findElement(By.xpath("//*[@id=\"1\"]/input[1]"));
			radiobuttona2.click();
			js.executeScript("window.scrollBy(0,1000)");
			btnnext.click();

			Thread.sleep(3000);

			WebElement radiobuttona3 =driver.findElement(By.xpath("//*[@id=\"0\"]/input[1]"));
			radiobuttona3.click();
			js.executeScript("window.scrollBy(0,1000)");
			btnnext.click();
			
			driver.findElement(By.xpath("//*[@id=\"markpage\"]/center/button[1]"));
			

			assertEquals(true, driver.getPageSource().contains("a"));

		}
		catch(Exception e) {
			System.out.println("error");
		}

	
	}
	
	@Test
	public void EnterBack() throws InterruptedException 
	{
		try {
			driver.get("https://svcollegetest.000webhostapp.com/");


			WebElement start =driver.findElement(By.id("startB"));
			start.click();

			WebElement question =driver.findElement(By.name("question"));
			question.click();
			question.sendKeys("where letter a?");
			driver.findElement(By.id("nextquest")).click();

			WebElement answer1=driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input"));

			answer1.click();
			answer1.sendKeys("a");

			WebElement answer2 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input"));
			answer2.click();
			answer2.sendKeys("b");

			WebElement answer3 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input"));
			answer3.click();
			answer3.sendKeys("c");


			JavascriptExecutor js = (JavascriptExecutor) driver;  
			js.executeScript("window.scrollBy(0,1000)");

			WebElement answer4 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input"));
			answer4.click();
			answer4.sendKeys("d");

			WebElement radiobuten =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input"));
			radiobuten.click();


			Thread.sleep(3000);
			driver.findElement(By.id("nextquest")).click();

			WebElement question2 =driver.findElement(By.name("question"));
			question2.click();
			question2.sendKeys("where letter b?");
			driver.findElement(By.id("backquest")).click();


			assertEquals(true, driver.getPageSource().contains("1"));

		}
		catch(Exception e) {
			System.out.println("error");
		}

	
	}
	@Test
	public void EnterBack2() throws InterruptedException 
	{
		try {
			driver.get("https://svcollegetest.000webhostapp.com/");


			WebElement start =driver.findElement(By.id("startB"));
			start.click();

			WebElement question =driver.findElement(By.name("question"));
			question.click();
			question.sendKeys("where letter a?");
			driver.findElement(By.id("nextquest")).click();

			WebElement answer1=driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input"));

			answer1.click();
			answer1.sendKeys("a");

			WebElement answer2 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input"));
			answer2.click();
			answer2.sendKeys("b");

			WebElement answer3 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input"));
			answer3.click();
			answer3.sendKeys("c");


			JavascriptExecutor js = (JavascriptExecutor) driver;  
			js.executeScript("window.scrollBy(0,1000)");

			WebElement answer4 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input"));
			answer4.click();
			answer4.sendKeys("d");

			WebElement radiobuten =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input"));
			radiobuten.click();


			Thread.sleep(3000);
			driver.findElement(By.id("nextquest")).click();

			WebElement question2 =driver.findElement(By.name("question"));
			question2.click();
			question2.sendKeys("where letter b?");
			driver.findElement(By.id("nextquest")).click();



			answer1.click();
			answer1.sendKeys("b");


			answer2.click();
			answer2.sendKeys("a");

			answer3.click();
			answer3.sendKeys("c");


			js.executeScript("window.scrollBy(0,1000)");

			answer4.click();
			answer4.sendKeys("d");

			radiobuten.click();


			Thread.sleep(3000);

			driver.findElement(By.id("nextquest")).click();

			WebElement question3 =driver.findElement(By.name("question"));
			question3.click();
			question3.sendKeys("where letter c?");
			driver.findElement(By.id("nextquest")).click();

			answer1.click();
			answer1.sendKeys("c");


			answer2.click();
			answer2.sendKeys("a");

			answer3.click();
			answer3.sendKeys("b");


			js.executeScript("window.scrollBy(0,1000)");

			answer4.click();
			answer4.sendKeys("d");

			radiobuten.click();

			js.executeScript("window.scrollBy(0,1000)");

			driver.findElement(By.id("nextquest")).click();


			WebElement startGame =driver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[1]"));
			startGame.click();
			Thread.sleep(3000);



			WebElement radiobuttona1 =driver.findElement(By.xpath("//*[@id=\"2\"]/input[1]"));
			radiobuttona1.click();
			js.executeScript("window.scrollBy(0,1000)");
			driver.findElement(By.id("btnback")).click();
			

			Thread.sleep(3000);
			
			assertEquals(true, driver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[1]")));

		}
		catch(Exception e) {
			System.out.println("error");
		}
	}

		@Test
		public void EnterBack3() throws InterruptedException 
		{
			try {
				driver.get("https://svcollegetest.000webhostapp.com/");


				WebElement start =driver.findElement(By.id("startB"));
				start.click();

				WebElement question =driver.findElement(By.name("question"));
				question.click();
				question.sendKeys("where letter a?");
				driver.findElement(By.id("nextquest")).click();

				WebElement answer1=driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input"));

				answer1.click();
				answer1.sendKeys("a");

				WebElement answer2 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input"));
				answer2.click();
				answer2.sendKeys("b");

				WebElement answer3 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input"));
				answer3.click();
				answer3.sendKeys("c");


				JavascriptExecutor js = (JavascriptExecutor) driver;  
				js.executeScript("window.scrollBy(0,1000)");

				WebElement answer4 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input"));
				answer4.click();
				answer4.sendKeys("d");

				WebElement radiobuten =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input"));
				radiobuten.click();


				Thread.sleep(3000);
				driver.findElement(By.id("nextquest")).click();

				WebElement question2 =driver.findElement(By.name("question"));
				question2.click();
				question2.sendKeys("where letter b?");
				driver.findElement(By.id("nextquest")).click();



				answer1.click();
				answer1.sendKeys("b");


				answer2.click();
				answer2.sendKeys("a");

				answer3.click();
				answer3.sendKeys("c");


				js.executeScript("window.scrollBy(0,1000)");

				answer4.click();
				answer4.sendKeys("d");

				radiobuten.click();


				Thread.sleep(3000);

				driver.findElement(By.id("nextquest")).click();

				WebElement question3 =driver.findElement(By.name("question"));
				question3.click();
				question3.sendKeys("where letter c?");
				driver.findElement(By.id("nextquest")).click();

				answer1.click();
				answer1.sendKeys("c");


				answer2.click();
				answer2.sendKeys("a");

				answer3.click();
				answer3.sendKeys("b");


				js.executeScript("window.scrollBy(0,1000)");

				answer4.click();
				answer4.sendKeys("d");

				radiobuten.click();

				js.executeScript("window.scrollBy(0,1000)");

				driver.findElement(By.id("nextquest")).click();


				WebElement startGame =driver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[1]"));
				startGame.click();
				Thread.sleep(3000);



				WebElement radiobuttona1 =driver.findElement(By.xpath("//*[@id=\"2\"]/input[1]"));
				radiobuttona1.click();
				js.executeScript("window.scrollBy(0,1000)");
				WebElement btnnext=driver.findElement(By.id("btnnext"));
				btnnext.click();

				Thread.sleep(3000);

				WebElement radiobuttona2 =driver.findElement(By.xpath("//*[@id=\"1\"]/input[1]"));
				radiobuttona2.click();
				js.executeScript("window.scrollBy(0,1000)");
				driver.findElement(By.id("btnback")).click();

				Thread.sleep(3000);

				assertEquals(true, driver.getPageSource().contains("where letter c?"));

			}
			catch(Exception e) {
				System.out.println("error");
			}
		

	}
		
		@Test
		public void MaxLater() throws InterruptedException 
		{
			try {
				driver.get("https://svcollegetest.000webhostapp.com/");


				WebElement start =driver.findElement(By.id("startB"));
				start.click();

				WebElement question =driver.findElement(By.name("question"));
				question.click();
				question.sendKeys("zxcvbnmasdfghjkqwertyuiopl,mkoi qwertyuioasdfghwerty");
				driver.findElement(By.id("nextquest")).click();
	
				assertEquals(true, driver.getPageSource().contains("1"));

			}
			catch(Exception e) {
				System.out.println("error");
			}
		}
			

		@Test
		public void AvgLater() throws InterruptedException 
		{
			try {
				driver.get("https://svcollegetest.000webhostapp.com/");


				WebElement start =driver.findElement(By.id("startB"));
				start.click();

				WebElement question =driver.findElement(By.name("question"));
				question.click();
				question.sendKeys("qwertyuioasdfgh qwertyuioasdfgh");
				driver.findElement(By.id("nextquest")).click();
	
				assertEquals(true, driver.getPageSource().contains("1"));

			}
			catch(Exception e) {
				System.out.println("error");
			}
		}
		
		@Test
		public void MAxAnswerLater() throws InterruptedException 
		{
			try {
				driver.get("https://svcollegetest.000webhostapp.com/");


				WebElement start =driver.findElement(By.id("startB"));
				start.click();

				WebElement question =driver.findElement(By.name("question"));
				question.click();
				question.sendKeys("where letter a?");
				driver.findElement(By.id("nextquest")).click();

				WebElement answer1=driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input"));

				answer1.click();
				answer1.sendKeys("zxcvbnmasdfghjkqwertyuiopl,mkoi");

				WebElement answer2 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input"));
				answer2.click();
				answer2.sendKeys("b");

				WebElement answer3 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input"));
				answer3.click();
				answer3.sendKeys("c");


				JavascriptExecutor js = (JavascriptExecutor) driver;  
				js.executeScript("window.scrollBy(0,1000)");

				WebElement answer4 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input"));
				answer4.click();
				answer4.sendKeys("d");

				WebElement radiobuten =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input"));
				radiobuten.click();


				Thread.sleep(3000);
				driver.findElement(By.id("nextquest")).click();
				

				assertEquals(true, driver.getPageSource().contains("question number: 2"));

			}
			catch(Exception e) {
				System.out.println("error");
			}
		}
		
		@Test
		public void MAxAnswerLater2() throws InterruptedException 
		{
			try {
				driver.get("https://svcollegetest.000webhostapp.com/");


				WebElement start =driver.findElement(By.id("startB"));
				start.click();

				WebElement question =driver.findElement(By.name("question"));
				question.click();
				question.sendKeys("where letter a?");
				driver.findElement(By.id("nextquest")).click();

				WebElement answer1=driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input"));

				answer1.click();
				answer1.sendKeys("zxcvbnmasdfghjkqwertyuiopl,mkoi");

				WebElement answer2 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input"));
				answer2.click();
				answer2.sendKeys("qwertyuioasdfgh");

				WebElement answer3 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input"));
				answer3.click();
				answer3.sendKeys("c");


				JavascriptExecutor js = (JavascriptExecutor) driver;  
				js.executeScript("window.scrollBy(0,1000)");

				WebElement answer4 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input"));
				answer4.click();
				answer4.sendKeys("d");

				WebElement radiobuten =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input"));
				radiobuten.click();


				Thread.sleep(3000);
				driver.findElement(By.id("nextquest")).click();
				

				assertEquals(true, driver.getPageSource().contains("question number: 2"));

			}
			catch(Exception e) {
				System.out.println("error");
			}
		}
		

		@Test
		public void MAxAnswerLater3() throws InterruptedException 
		{
			try {
				driver.get("https://svcollegetest.000webhostapp.com/");


				WebElement start =driver.findElement(By.id("startB"));
				start.click();

				WebElement question =driver.findElement(By.name("question"));
				question.click();
				question.sendKeys("where letter a?");
				driver.findElement(By.id("nextquest")).click();

				WebElement answer1=driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input"));

				answer1.click();
				answer1.sendKeys("zxcvbnmasdfghjkqwertyuiopl,mkoi");

				WebElement answer2 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input"));
				answer2.click();
				answer2.sendKeys("qwertyuioasdfgh");

				WebElement answer3 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input"));
				answer3.click();
				answer3.sendKeys("zxcvbnmas");


				JavascriptExecutor js = (JavascriptExecutor) driver;  
				js.executeScript("window.scrollBy(0,1000)");

				WebElement answer4 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input"));
				answer4.click();
				answer4.sendKeys("d");

				WebElement radiobuten =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input"));
				radiobuten.click();


				Thread.sleep(3000);
				driver.findElement(By.id("nextquest")).click();
				

				assertEquals(true, driver.getPageSource().contains("question number: 2"));

			}
			catch(Exception e) {
				System.out.println("error");
			}
		}
		
		@Test
		public void MAxAnswerLater4() throws InterruptedException 
		{
			try {
				driver.get("https://svcollegetest.000webhostapp.com/");


				WebElement start =driver.findElement(By.id("startB"));
				start.click();

				WebElement question =driver.findElement(By.name("question"));
				question.click();
				question.sendKeys("where letter a?");
				driver.findElement(By.id("nextquest")).click();

				WebElement answer1=driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input"));

				answer1.click();
				answer1.sendKeys("zxcvbnmasdfghjkqwertyuiopl,mkoi");

				WebElement answer2 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input"));
				answer2.click();
				answer2.sendKeys("qwertyuioasdfgh");

				WebElement answer3 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input"));
				answer3.click();
				answer3.sendKeys("zxcvbnmas");


				JavascriptExecutor js = (JavascriptExecutor) driver;  
				js.executeScript("window.scrollBy(0,1000)");

				WebElement answer4 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input"));
				answer4.click();
				answer4.sendKeys("qwertyu");

				WebElement radiobuten =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input"));
				radiobuten.click();


				Thread.sleep(3000);
				driver.findElement(By.id("nextquest")).click();
				

				assertEquals(true, driver.getPageSource().contains("question number: 2"));

			}
			catch(Exception e) {
				System.out.println("error");
			}
		}
		
		@Test
		public void FiftyOneletters() throws InterruptedException 
		{
			try {
				driver.get("https://svcollegetest.000webhostapp.com/");


				WebElement start =driver.findElement(By.id("startB"));
				start.click();

				WebElement question =driver.findElement(By.name("question"));
				question.click();
				question.sendKeys("zxcvbnmasdfghjkqwertyuiopl,mkoi qwertyuioasdfghwertyw");
				driver.findElement(By.id("nextquest")).click();

				assertEquals(true, driver.getPageSource().contains("question number: 1"));


			}
			catch(Exception e) {
				System.out.println("error");
			}
		}

		@Test
		public void Fiftyeightletters() throws InterruptedException 
		{
			try {
				driver.get("https://svcollegetest.000webhostapp.com/");


				WebElement start =driver.findElement(By.id("startB"));
				start.click();

				WebElement question =driver.findElement(By.name("question"));
				question.click();
				question.sendKeys("zxcvbnmasdfghjkqwertyuiopl,mkoi qwertyuioasdfghwertywcdfggrg");
				driver.findElement(By.id("nextquest")).click();

				assertEquals(true, driver.getPageSource().contains("question number: 1"));

			}
			catch(Exception e) {
				System.out.println("error");
			}
		}
		
		@Test
		public void hebrowletters() throws InterruptedException 
		{
			try {
				driver.get("https://svcollegetest.000webhostapp.com/");


				WebElement start =driver.findElement(By.id("startB"));
				start.click();

				WebElement question =driver.findElement(By.name("question"));
				question.click();
				question.sendKeys("איפה האות א");
				driver.findElement(By.id("nextquest")).click();

				Thread.sleep(3000);
				assertEquals(true, driver.getPageSource().contains("question number: 1"));
			}
			catch(Exception e) {
				System.out.println("error");
			}
		}
		
		@Test
		public void answerHebrow() throws InterruptedException 
		{
			try {
				driver.get("https://svcollegetest.000webhostapp.com/");


				WebElement start =driver.findElement(By.id("startB"));
				start.click();

				WebElement question =driver.findElement(By.name("question"));
				question.click();
				question.sendKeys("where letter a?");
				driver.findElement(By.id("nextquest")).click();

				WebElement answer1=driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input"));

				answer1.click();
				answer1.sendKeys("a");

				WebElement answer2 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input"));
				answer2.click();
				answer2.sendKeys("ב");

				WebElement answer3 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input"));
				answer3.click();
				answer3.sendKeys("c");


				JavascriptExecutor js = (JavascriptExecutor) driver;  
				js.executeScript("window.scrollBy(0,1000)");

				WebElement answer4 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input"));
				answer4.click();
				answer4.sendKeys("d");

				WebElement radiobuten =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input"));
				radiobuten.click();


				Thread.sleep(3000);
				driver.findElement(By.id("nextquest")).click();

				assertEquals(false, driver.findElement(By.id("nextquest")));

			}
			catch(Exception e) {
				System.out.println("error");
			}

					

		}
		 
		@Test
		public void radioButtenIsDelted() throws InterruptedException 
		{
			try {
				driver.get("https://svcollegetest.000webhostapp.com/");


				WebElement start =driver.findElement(By.id("startB"));
				start.click();

				WebElement question =driver.findElement(By.name("question"));
				question.click();
				question.sendKeys("where letter a?");
				driver.findElement(By.id("nextquest")).click();

				WebElement answer1=driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input"));

				answer1.click();
				answer1.sendKeys("a");

				WebElement answer2 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input"));
				answer2.click();
				answer2.sendKeys("b");

				WebElement answer3 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input"));
				answer3.click();
				answer3.sendKeys("c");


				JavascriptExecutor js = (JavascriptExecutor) driver;  
				js.executeScript("window.scrollBy(0,1000)");

				WebElement answer4 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input"));
				answer4.click();
				answer4.sendKeys("d");


				Thread.sleep(3000);
				driver.findElement(By.id("nextquest")).click();

				Thread.sleep(3000);
				assertEquals(true, driver.getPageSource().contains("question number: 1"));

			}
			catch(Exception e) {
				System.out.println("error");
			}

					

		}
		
		@Test
		public void empryLater() throws InterruptedException 
		{
			try {
				driver.get("https://svcollegetest.000webhostapp.com/");


				WebElement start =driver.findElement(By.id("startB"));
				start.click();

				driver.findElement(By.id("nextquest")).click();
		
				Thread.sleep(3000);
				assertEquals(true, driver.getPageSource().contains("question number: 1"));

			}
			catch(Exception e) {
				System.out.println("error");
			}
		}
		
		@Test
		public void changeRadioBaten() throws InterruptedException 
		{
			try {
				driver.get("https://svcollegetest.000webhostapp.com/");


				WebElement start =driver.findElement(By.id("startB"));
				start.click();

				WebElement question =driver.findElement(By.name("question"));
				question.click();
				question.sendKeys("where letter a?");
				driver.findElement(By.id("nextquest")).click();

				WebElement answer1=driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input"));

				answer1.click();
				answer1.sendKeys("a");

				WebElement answer2 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input"));
				answer2.click();
				answer2.sendKeys("b");

				WebElement answer3 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input"));
				answer3.click();
				answer3.sendKeys("c");


				JavascriptExecutor js = (JavascriptExecutor) driver;  
				js.executeScript("window.scrollBy(0,1000)");

				WebElement answer4 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input"));
				answer4.click();
				answer4.sendKeys("d");

				WebElement radiobuten =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input"));
				radiobuten.click();
				

				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[1]/input")).click();
				
				Thread.sleep(3000);
				driver.findElement(By.id("nextquest")).click();
				
				assertEquals(true, driver.getPageSource().contains("question number: 2"));
			}
			catch(Exception e) {
				System.out.println("error");
			}
			
		}
		

			@Test
			public void answerEmptyRadioButen() throws InterruptedException 
			{
				try {
					driver.get("https://svcollegetest.000webhostapp.com/");


					WebElement start =driver.findElement(By.id("startB"));
					start.click();

					WebElement question =driver.findElement(By.name("question"));
					question.click();
					question.sendKeys("where letter a?");
					driver.findElement(By.id("nextquest")).click();

					WebElement answer1=driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input"));

					answer1.click();
					answer1.sendKeys("a");

					WebElement answer2 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input"));
					answer2.click();
					answer2.sendKeys("b");

					WebElement answer3 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input"));
					answer3.click();
					answer3.sendKeys("c");


					JavascriptExecutor js = (JavascriptExecutor) driver;  
					js.executeScript("window.scrollBy(0,1000)");

					WebElement answer4 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input"));
					answer4.click();
					answer4.sendKeys("d");

					WebElement radiobuten =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input"));
					radiobuten.click();


					Thread.sleep(3000);
					driver.findElement(By.id("nextquest")).click();

					WebElement question2 =driver.findElement(By.name("question"));
					question2.click();
					question2.sendKeys("where letter b?");
					driver.findElement(By.id("nextquest")).click();



					answer1.click();
					answer1.sendKeys("b");


					answer2.click();
					answer2.sendKeys("a");

					answer3.click();
					answer3.sendKeys("c");


					js.executeScript("window.scrollBy(0,1000)");

					answer4.click();
					answer4.sendKeys("d");

					radiobuten.click();


					Thread.sleep(3000);

					driver.findElement(By.id("nextquest")).click();

					WebElement question3 =driver.findElement(By.name("question"));
					question3.click();
					question3.sendKeys("where letter c?");
					driver.findElement(By.id("nextquest")).click();

					answer1.click();
					answer1.sendKeys("c");


					answer2.click();
					answer2.sendKeys("a");

					answer3.click();
					answer3.sendKeys("b");


					js.executeScript("window.scrollBy(0,1000)");

					answer4.click();
					answer4.sendKeys("d");

					radiobuten.click();

					js.executeScript("window.scrollBy(0,1000)");

					driver.findElement(By.id("nextquest")).click();


					WebElement startGame =driver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[1]"));
					startGame.click();
					Thread.sleep(3000);


					js.executeScript("window.scrollBy(0,1000)");
					WebElement btnnext=driver.findElement(By.id("btnnext"));
					btnnext.click();

					Thread.sleep(3000);


					assertEquals(true, driver.getPageSource().contains("where the later c?"));
					

				}
				catch(Exception e) {
					System.out.println("error");
				}

		
	
		}
			
			@Test
			public void FiftyQuestionMark() throws InterruptedException 
			{
				try {
					driver.get("https://svcollegetest.000webhostapp.com/");


					WebElement start =driver.findElement(By.id("startB"));
					start.click();

					WebElement question =driver.findElement(By.name("question"));
					question.click();
					question.sendKeys("zxcvbnmasdfghjkqwertyuiopl,mkoi qwertyioasdfghwertyw?");
					driver.findElement(By.id("nextquest")).click();

					assertEquals(true, driver.getPageSource().contains("question number: 1"));

				}
				catch(Exception e) {
					System.out.println("error");
				}
			}
			
			@Test
			public void nubersInQustions() throws InterruptedException 
			{
				try {
					driver.get("https://svcollegetest.000webhostapp.com/");


					WebElement start =driver.findElement(By.id("startB"));
					start.click();

					WebElement question =driver.findElement(By.name("question"));
					question.click();
					question.sendKeys("where letter a?");
					driver.findElement(By.id("nextquest")).click();

					WebElement answer1=driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input"));

					answer1.click();
					answer1.sendKeys("a");

					WebElement answer2 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input"));
					answer2.click();
					answer2.sendKeys("b");

					WebElement answer3 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input"));
					answer3.click();
					answer3.sendKeys("c");


					JavascriptExecutor js = (JavascriptExecutor) driver;  
					js.executeScript("window.scrollBy(0,1000)");

					WebElement answer4 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input"));
					answer4.click();
					answer4.sendKeys("d");

					WebElement radiobuten =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input"));
					radiobuten.click();


					Thread.sleep(3000);
					driver.findElement(By.id("nextquest")).click();

					WebElement question2 =driver.findElement(By.name("question"));
					question2.click();
					question2.sendKeys("34hbv77");
					driver.findElement(By.id("nextquest")).click();
					
					assertEquals(true, driver.getPageSource().contains("question number: 2"));
					
				}
				catch(Exception e) {
					System.out.println("error");
				}

						

			}
			
			@Test
			public void marksInQustions() throws InterruptedException 
			{
				try {
					driver.get("https://svcollegetest.000webhostapp.com/");


					WebElement start =driver.findElement(By.id("startB"));
					start.click();

					WebElement question =driver.findElement(By.name("question"));
					question.click();
					question.sendKeys("where letter a?");
					driver.findElement(By.id("nextquest")).click();

					WebElement answer1=driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input"));

					answer1.click();
					answer1.sendKeys("a");

					WebElement answer2 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input"));
					answer2.click();
					answer2.sendKeys("b");

					WebElement answer3 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input"));
					answer3.click();
					answer3.sendKeys("c");


					JavascriptExecutor js = (JavascriptExecutor) driver;  
					js.executeScript("window.scrollBy(0,1000)");

					WebElement answer4 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input"));
					answer4.click();
					answer4.sendKeys("d");

					WebElement radiobuten =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input"));
					radiobuten.click();


					Thread.sleep(3000);
					driver.findElement(By.id("nextquest")).click();

					WebElement question2 =driver.findElement(By.name("question"));
					question2.click();
					question2.sendKeys(".'/");
					driver.findElement(By.id("nextquest")).click();
					
					assertEquals(true, driver.getPageSource().contains("question number: 2"));
					
				}
				catch(Exception e) {
					System.out.println("error");
				}

						

			}
			
			@Test
			public void addSymbolsInAnswer() throws InterruptedException 
			{
				try {
					driver.get("https://svcollegetest.000webhostapp.com/");


					WebElement start =driver.findElement(By.id("startB"));
					start.click();

					WebElement question =driver.findElement(By.name("question"));
					question.click();
					question.sendKeys("where letter a?");
					driver.findElement(By.id("nextquest")).click();

					WebElement answer1=driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input"));

					answer1.click();
					answer1.sendKeys("a");

					WebElement answer2 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input"));
					answer2.click();
					answer2.sendKeys("b");

					WebElement answer3 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input"));
					answer3.click();
					answer3.sendKeys("c");


					JavascriptExecutor js = (JavascriptExecutor) driver;  
					js.executeScript("window.scrollBy(0,1000)");

					WebElement answer4 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input"));
					answer4.click();
					answer4.sendKeys("d");

					WebElement radiobuten =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input"));
					radiobuten.click();


					Thread.sleep(3000);
					driver.findElement(By.id("nextquest")).click();

					WebElement question2 =driver.findElement(By.name("question"));
					question2.click();
					question2.sendKeys("where letter b?");
					driver.findElement(By.id("nextquest")).click();



					answer1.click();
					answer1.sendKeys(".'/");


					answer2.click();
					answer2.sendKeys("a");

					answer3.click();
					answer3.sendKeys("c");


					js.executeScript("window.scrollBy(0,1000)");

					answer4.click();
					answer4.sendKeys("d");

					radiobuten.click();


					Thread.sleep(3000);

					driver.findElement(By.id("nextquest")).click();
			
					assertEquals(false, driver.findElement(By.id("nextquest")));

				}
				catch(Exception e) {
					System.out.println("error");
				}
			}
			
			@Test
			public void facebook() throws InterruptedException 
			{
				try {
					driver.get("https://svcollegetest.000webhostapp.com/");


					WebElement start =driver.findElement(By.id("startB"));
					start.click();

					WebElement question =driver.findElement(By.name("question"));
					question.click();
					question.sendKeys("where letter a?");
					driver.findElement(By.id("nextquest")).click();

					WebElement answer1=driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input"));

					answer1.click();
					answer1.sendKeys("a");

					WebElement answer2 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input"));
					answer2.click();
					answer2.sendKeys("b");

					WebElement answer3 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input"));
					answer3.click();
					answer3.sendKeys("c");


					JavascriptExecutor js = (JavascriptExecutor) driver;  
					js.executeScript("window.scrollBy(0,1000)");

					WebElement answer4 =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input"));
					answer4.click();
					answer4.sendKeys("d");

					WebElement radiobuten =driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input"));
					radiobuten.click();


					Thread.sleep(3000);
					driver.findElement(By.id("nextquest")).click();

					WebElement question2 =driver.findElement(By.name("question"));
					question2.click();
					question2.sendKeys("where letter b?");
					driver.findElement(By.id("nextquest")).click();



					answer1.click();
					answer1.sendKeys("b");


					answer2.click();
					answer2.sendKeys("a");

					answer3.click();
					answer3.sendKeys("c");


					js.executeScript("window.scrollBy(0,1000)");

					answer4.click();
					answer4.sendKeys("d");

					radiobuten.click();


					Thread.sleep(3000);

					driver.findElement(By.id("nextquest")).click();

					WebElement question3 =driver.findElement(By.name("question"));
					question3.click();
					question3.sendKeys("where letter c?");
					driver.findElement(By.id("nextquest")).click();

					answer1.click();
					answer1.sendKeys("c");


					answer2.click();
					answer2.sendKeys("a");

					answer3.click();
					answer3.sendKeys("b");


					js.executeScript("window.scrollBy(0,1000)");

					answer4.click();
					answer4.sendKeys("d");

					radiobuten.click();

					js.executeScript("window.scrollBy(0,1000)");

					driver.findElement(By.id("nextquest")).click();


					WebElement startGame =driver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[1]"));
					startGame.click();
					Thread.sleep(3000);



					WebElement radiobuttona1 =driver.findElement(By.xpath("//*[@id=\"2\"]/input[1]"));
					radiobuttona1.click();
					js.executeScript("window.scrollBy(0,1000)");
					WebElement btnnext=driver.findElement(By.id("btnnext"));
					btnnext.click();

					Thread.sleep(3000);

					WebElement radiobuttona2 =driver.findElement(By.xpath("//*[@id=\"1\"]/input[1]"));
					radiobuttona2.click();
					js.executeScript("window.scrollBy(0,1000)");
					btnnext.click();

					Thread.sleep(3000);

					WebElement radiobuttona3 =driver.findElement(By.xpath("//*[@id=\"0\"]/input[1]"));
					radiobuttona3.click();
					js.executeScript("window.scrollBy(0,1000)");
					btnnext.click();
					
					driver.findElement(By.xpath("//*[@id=\"fackBook2\"]/img"));


					assertEquals(true, driver.findElement(By.xpath("//*[@id=\"u_0_f\"]/a")));

				}
				catch(Exception e) {
					System.out.println("error");
				}

						

			}
}


