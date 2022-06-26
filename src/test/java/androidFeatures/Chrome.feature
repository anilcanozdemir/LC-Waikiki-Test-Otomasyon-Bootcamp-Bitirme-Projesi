@LCWaikiki @Android
Feature: LCWAIKIKI TEST OTOMASYON
  Uçtan uca ödeme ekranına kadar Selenium’da java dili ile chrome browser kullanarak
  test otomasyon ödevi yapılacak.

  @SignUp @Successful
  Scenario Outline: Successful SignUp
    Given Customer is on HomePage
    When Customer Sign-Up with E-mail "<Email>" and Password "<Password>" and Phone "<Phone>"
    Then should see "Hesabım" on NavigationBar
    And should see HomePage

    Examples:
      | Email                        | Password  | Phone     |
      | anilcanozdemir1020@gmail.com | Anilcan1. | 395096917 |

  @Login @Successful
  Scenario Outline: Successful Login
    Given Customer is on HomePage
    When Customer login with E-mail "<Email>" and Password "<Password>"
    Then should see "Hesabım" on NavigationBar
    And should see HomePage

    Examples:
      | Email                        | Password  |
      | anilcanozdemir1020@gmail.com | Anilcan1. |

  @Main @WithOutAuth
  Scenario Outline:Customer search,select,add to cart and proceeds to Checkout
    Given Customer is on HomePage
    When  Select Category as "<MainCategory>" -- "<Category>" -- "<Sub-Category>"
    Then should see SearchPage
    And Filter Color to be "<Value>"
    And Click Product "<ProductName>"
    Then should see ProductPage
    And Choose Size Option "<size>"
    And Add to Cart
    And Click "Sepetim" on NavigationBar
    Then should see CartPage
    Then should see product named "<Sub-Category>" whose countity 1 and size "<size>"
    When Proceed to CheckOutPage
    Then should see CheckOutPage

    Examples:
      | MainCategory | Category | Sub-Category | Value | ProductName                                                         | size |
      | KADIN        | GİYİM    | Bluz         | Siyah | LCW CASUAL Bisiklet Yaka Parlak Görünümlü Uzun Kollu Tül Kadın Bluz | M    |

  @Main @WithOutSingUp
  Scenario Outline:Main Scenario WithOutSingUp
    Given Customer is on HomePage
    When Customer login with E-mail "<Email>" and Password "<Password>"
    When  Select Category as "<MainCategory>" -- "<Category>" -- "<Sub-Category>"
    And Filter Color to be "<Value>"
    And Click Product "<ProductName>"
    And Choose Size Option "<size>"
    And Add to Cart
    And Click "Sepetim" on NavigationBar
    Then should see product named "<Sub-Category>" whose countity 1 and size "<size>"
    When Proceed to CheckOutPage
    Then should see CheckOutPage

    Examples:
      | MainCategory | Category | Sub-Category | Value | ProductName                                                         | size | Email                        | Password  |
      | KADIN        | GİYİM    | Bluz         | Siyah | LCW CASUAL Bisiklet Yaka Parlak Görünümlü Uzun Kollu Tül Kadın Bluz | M    | anilcanozdemir1020@gmail.com | Anilcan1. |

  @Main
  Scenario Outline:Main Scenario
    Given Customer is on HomePage
    When Customer Sign-Up with E-mail "<Email>" and Password "<Password>" and Phone "<Phone>"
    When Customer login with E-mail "<Email>" and Password "<Password>"
    When  Select Category as "<MainCategory>" -- "<Category>" -- "<Sub-Category>"
    And Filter Color to be "<Value>"
    And Click Product "<ProductName>"
    And Choose Size Option "<size>"
    And Add to Cart
    And Click "Sepetim" on NavigationBar
    Then should see product named "<Sub-Category>" whose countity 1 and size "<size>"
    When Proceed to CheckOutPage
    Then should see CheckOutPage

    Examples:
      | MainCategory | Category | Sub-Category | Value | ProductName                                                         | size | Email                        | Password  | Phone     |
      | KADIN        | GİYİM    | Bluz         | Siyah | LCW CASUAL Bisiklet Yaka Parlak Görünümlü Uzun Kollu Tül Kadın Bluz | M    | anilcanozdemir1020@gmail.com | Anilcan1. | 395096917 |