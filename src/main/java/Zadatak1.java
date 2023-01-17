import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {

  /*
  Napraviti maven projekat i dodati selenium dependency.
U Mainu preko selenijuma otici na https://demoqa.com/text-box.

Zadatak je da popunite sva polja (Full Name, email, Current Address, Permanent Address) i da kliknete submit.

Uporediti da li u rezultatu (ispod submit), full name i email su isti kao uneseni pre submita, da nije doslo do izmene.
 Upisati odgovarajucu poruku ako su isti ili ako se razlikuju podaci.

Zadatak okaciti na github.

   */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\driver chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");

        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("Katarina Milojevic");

        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("milojevic.katarinanina@gmail.com");

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Ulica 34, 21000 Novi Sad");

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("Druga ulica 27, 11000 Beograd");

        WebElement button = driver.findElement(By.id("submit"));
        button.click();


        String expectedResult1 = String.valueOf(fullName);

        //WebElement fullNameNakonSubmita = driver.findElement(By.id("name"));
        String actualResult1 = String.valueOf(By.id("name"));

        if (expectedResult1.equals(actualResult1)) {
            System.out.println("Isto je");
        } else {
            System.out.println("Nije isto");
        }

        String expectedResult2 = String.valueOf(email);
        //WebElement emailNakonSubmita = driver.findElement(By.id("email"));
        String actualResult2 = String.valueOf(By.id("email"));

        if (expectedResult2.equals(actualResult2)) {
            System.out.println("Isto je");
        } else {
            System.out.println("Nije isto");
        }

        String expectedResult3 = String.valueOf(currentAddress);
        //WebElement currentAddressNakonSubmita = driver.findElement(By.id("currentAddress"));
        String actualResult3 = String.valueOf(By.id("currentAddress"));

        if (expectedResult3.equals(actualResult3)) {
            System.out.println("Isto je");
        } else {
            System.out.println("Nije isto");
        }

        String expectedResult4 = String.valueOf(permanentAddress);
        //WebElement permanentAddressNakonSubmita = driver.findElement(By.id("permanentAddress"));
        String actualResult4 = String.valueOf(By.id("permanentAddress"));

        if (expectedResult4.equals(actualResult4)) {
            System.out.println("Isto je");
        } else {
            System.out.println("Nije isto");
        }

        driver.close();






    }
}
