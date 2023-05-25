Feature: US1004 Steplerde parametre kullanilabilmeli

  Scenario:  Scenario: TC08 Amazon Nutella Testi
    Given Kullanici "amazonUrl" anasayfaya gider
    When "Nutella" için arama yapar
    Then Arama sonuclarinin "Nutella" icerdiğini test eder
    And 3 saniye bekler
    And Sayfayi kapatir


  Scenario: TC09 Amazon Java Testi
    Given Kullanici "amazonUrl" anasayfaya gider
    When "Java" için arama yapar
    Then Arama sonuclarinin "Java" icerdiğini test eder
    And Sayfayi kapatir


  Scenario: TC10 Amazon Samsung Testi
    Given Kullanici "amazonUrl" anasayfaya gider
    When "Samsung" için arama yapar
    Then Arama sonuclarinin "Samsung" icerdiğini test eder
    And Sayfayi kapatir