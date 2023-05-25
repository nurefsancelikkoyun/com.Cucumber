Feature: US1003 BackGround kullanarak tekrarlardan kurtulur

  Scenario:  Scenario: TC05 Amazon Nutella Testi
    Given Kullanici amazon anasayfaya gider
    When Nutella için arama yapar
    Then Arama sonuclarinin Nutella icerdiğini test eder
    And Sayfayi kapatir

  Scenario: TC06 Amazon Java Testi
    Given Kullanici amazon anasayfaya gider
    When Java için arama yapar
    Then Arama sonuclarinin Java icerdiğini test eder
    And Sayfayi kapatir

  Scenario: TC07 Amazon Samsung Testi
    Given Kullanici amazon anasayfaya gider
    When Samsung için arama yapar
    Then Arama sonuclarinin Samsung icerdiğini test eder
    And Sayfayi kapatir