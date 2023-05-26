package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@regression or @smoke",

        dryRun = false


)


public class Runner {

    /*
    Cucumber'da Runner Class'i istediğimiz testleri çalıştırmak
    ve her calıştırılan test için rapor hazırlamak amacıyla kullanılır

    Runner Class'i boş bir class'dir

    Belirtilen bu işleri
    class içersindeki kodlar değil
    class deklarasyonunda kullanacağımız Notasyonlar halleder

    @RunWith notasyonu framework'umuze JUnit yüklelememizin sebebidir
             ve Runner Class'inin Cucumber ile calışmasını sağlar

     @CucumberOptions ise framework'umuzde gerekli ayarlari yapar

     features : feature dosyalarımızın bulunduğu konumu gösterir
                dikkat edilirse tek tek feature dosyalarını  içeren klasorun yolunu yazıyoruz

      glue: feature dosyaları ile bağlı olan
      Java methodlarının yerini gösterir
      Burada da tek tek classları değil
      tum classları içeren package'in adresini yazarız
      bçyleceilgili step hangi class altında olursa olsun
      cucumber bulup calıştırır


      tags: calıştırılacak feaature veya sceneriolari işaretlemek için kullanılır
      Cucumber Runner Class'i calıştırıldığında
      tum feature dosylarını gözden geçirir ve runner classinda belirtilen taga
      sahip tüm feature ve scenriolari calıştırır

      Eğer birden fazla tagi kontrol ederek calıştırmasını istersek
      "@regression or @smoke" veya "@regression and @smoke" gibi yazabiliriz

      dryRun : Bir feature dosyaisini ilk defa yazdığımızda
               steplerden bazıları daha önce var olduğundan BEYAZ
               bazıları ise ilk defa kullanacağımız için SARİ olur

               Bu feature dosyasını direk cakıştırmek istersek
               bastan başlayarak beyaz olan adımları calıştırır
               ilk sari adıma geldiğinde exeption fırlatip
               calıştırmayı denediği ilk sarı satır
               ve geriye kalan sarı satırların
               eksik steplerini bize yazdırır

               Amacımız feature dosyasını calıştırmak değil
               sadece eksik steplere ait kodları oluşturmak ise
               Runner classinda dryRun = true yapip
               Runner Classini calıştırabiliriz

               dryRun =true dediğimizde
               Cucumber testleri calıştırmaz sadece eksik adım var mı diye kontol eder
               eksik adım yoksa test PASSED yazar


     */



}
