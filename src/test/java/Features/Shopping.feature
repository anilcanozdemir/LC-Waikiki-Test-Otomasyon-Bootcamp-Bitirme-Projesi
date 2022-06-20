@LCWaikiki
Feature: LCWAIKIKI TEST OTOMASYON
  Uçtan uca ödeme ekranına kadar Selenium’da java dili ile chrome browser kullanarak
  test otomasyon ödevi yapılacak.

  Scenario Outline:Selenium Denemesi
    Given Customer is on HomePage
    When Customer login with E-mail "<Email>" and Password "<Password>"
    When  Select Category as "<MainCategory>" -- "<Category>" -- "<Sub-Category>"
    And Filter "<Filter>" to be "<Value>"
    And Click Product "<ProductName>"
    And Choose Size Option "<size>"
    And Add to Cart
    And Click "Sepetim" NavigationBar
    Then should see product named "<Sub-Category>"
    And should see product countity 1
    And should see product size "<size>"
    When Proceed to CheckOutPage
    Then should see CheckOutPage

    Examples:
      | MainCategory | Category | Sub-Category | Filter | Value | ProductName                                                         | size | Email                        | Password
      | KADIN        | GİYİM    | Bluz         | Renk   | Siyah | LCW CASUAL Bisiklet Yaka Parlak Görünümlü Uzun Kollu Tül Kadın Bluz | M    | anilcanozdemir1020@gmail.com | Anilcan1 |