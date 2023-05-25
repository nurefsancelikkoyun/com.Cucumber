Feature: 1001_Cucumber Amazon Search Test

  Scenario: TC01 Amazon Nutella Testi
   Given Kullanici amazon anasayfaya gider
   When Nutella için arama yapar
   Then Arama sonuclarinin Nutella icerdiğini test eder
   And Sayfayi kapatir

  Scenario: TC02 Amazon Java Testi
    Given Kullanici amazon anasayfaya gider
    When Java için arama yapar
    Then Arama sonuclarinin Java icerdiğini test eder
    And Sayfayi kapatir

  Scenario: TC03 Amazon Samsung Testi
    Given Kullanici amazon anasayfaya gider
    When Samsung için arama yapar
    Then Arama sonuclarinin Samsung icerdiğini test eder
    And Sayfayi kapatir