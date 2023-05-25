package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonPage amazonPage = new AmazonPage();

    @Given("Kullanici amazon anasayfaya gider")
    public void kullanici_amazon_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @When("Nutella için arama yapar")
    public void nutella_için_arama_yapar() {
       amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
    }
    @Then("Arama sonuclarinin Nutella icerdiğini test eder")
    public void arama_sonuclarinin_nutella_icerdiğini_test_eder() {
       String actualAramaSonucu = amazonPage.aramaSonucuElementi.getText();
       String expectedIcerik ="Nutella";
        Assert.assertTrue(actualAramaSonucu.contains(expectedIcerik));
    }
    @Then("Sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();

    }

    @When("Java için arama yapar")
    public void java_için_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("Java"+ Keys.ENTER);

    }
    @Then("Arama sonuclarinin Java icerdiğini test eder")
    public void arama_sonuclarinin_java_icerdiğini_test_eder() {
        String actualAramaSonucu = amazonPage.aramaSonucuElementi.getText();
        String expectedIcerik ="Java";
        Assert.assertTrue(actualAramaSonucu.contains(expectedIcerik));

    }


    @Then("title'in Amazon icerdigini test eder")
    public void titleInAmazonIcerdiginiTestEder() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedIcerik ="Amazon";

        Assert.assertTrue(actualTitle.contains(expectedIcerik));
    }

    @Then("Arama sonuclarinin Samsung icerdiğini test eder")
    public void aramaSonuclarininSamsungIcerdiğiniTestEder() {
        String actualAramaSonucu = amazonPage.aramaSonucuElementi.getText();
        String expectedIcerik ="Samsung";
        Assert.assertTrue(actualAramaSonucu.contains(expectedIcerik));
    }

    @When("Samsung için arama yapar")
    public void samsungIçinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("Samsung"+ Keys.ENTER);
    }

    @Given("Kullanici {string} anasayfaya gider")
    public void kullaniciAnasayfayaGider(String istenenUrl) { //amazonUrl , wiseUrl ,facebookUrl

        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @When("{string} için arama yapar")
    public void içinAramaYapar(String aranacakKelime) {

        amazonPage.aramaKutusu.sendKeys(aranacakKelime+Keys.ENTER);
    }

    @Then("Arama sonuclarinin {string} icerdiğini test eder")
    public void aramaSonuclarininIcerdiğiniTestEder(String expectedIcerik) {

        String actualAramaSonucu = amazonPage.aramaSonucuElementi.getText();
        Assert.assertTrue(actualAramaSonucu.contains(expectedIcerik));
    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int beklenecekSaniye) throws InterruptedException {

        // cucumber sayi yazildiginda direk parametre olarak kabul eder

        try {
            Thread.sleep(beklenecekSaniye*1000);
        } catch (InterruptedException e) {

        }
    }
}
