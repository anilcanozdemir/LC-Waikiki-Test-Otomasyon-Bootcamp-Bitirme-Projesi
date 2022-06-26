@LCWaikiki @Android
Feature: LCWAIKIKI TEST OTOMASYON
  Uçtan uca ödeme ekranına kadar Selenium’da java dili ile Appium Driver kullanarak
  test otomasyon ödevi yapılacak.

  @Login @Successful
  Scenario Outline: Successful Login
    Given Customer is on AppHomePage
    When Customer login with E-mail "<Email>" and Password "<Password>" to App
    Then should see AppHomePage
    Examples:
      | Email                        | Password  |
      | anilcanozdemir1020@gmail.com | Anilcan1. |

  @Main @WithOutAuth
  Scenario Outline:Customer search,select,add to cart and proceeds to Checkout
    Given Customer is on AppHomePage
    When  Select Category as "<MainCategory>" -- "<Category>" -- "<Sub-Category>" from CategoriesPage
    Then should see AppSearchPage
    And Filter Color to be "<Value>" from AppSearchPage
    And Click Product "<Brand>""<ProductName>" from AppSearchPage
    Then should see AppProductPage
    And Choose Size Option "<size>" from AppProductPage
    And Add to Cart from AppProductPage
    And Click "Sepete Git" on SlideDownMenu from AppProductPage
    Then should see AppCartPage
    Then should see product named "<ProductName>" whose countity 1 and size "<size>" and "<Value>" Colored from AppCartPage
    When Proceed to AppCheckOutPage
    Then should see AppCheckOutPage

    Examples:
      | MainCategory | Category | Sub-Category | Value | ProductName                                              | size | Brand      |
      | Kadın        | Giyim    | Bluz         | Siyah | Bisiklet Yaka Parlak Görünümlü Uzun Kollu Tül Kadın Bluz | M    | LCW CASUAL |

  @Main @WithOutSingUp
  Scenario Outline:Main Scenario WithOutSingUp
    Given Customer is on AppHomePage
    When Customer login with E-mail "<Email>" and Password "<Password>" to App
    Then should see AppHomePage
    When  Select Category as "<MainCategory>" -- "<Category>" -- "<Sub-Category>" from CategoriesPage
    And Filter Color to be "<Value>" from AppSearchPage
    And Click Product "<Brand>""<ProductName>" from AppSearchPage
    And Choose Size Option "<size>" from AppProductPage
    And Add to Cart from AppProductPage
    And Click "Sepete Git" on SlideDownMenu from AppProductPage
    Then should see product named "<ProductName>" whose countity 1 and size "<size>" and "<Value>" Colored from AppCartPage
    When Proceed to AppCheckOutPage
    Then should see AppCheckOutPage

    Examples:
      | MainCategory | Category | Sub-Category | Value | ProductName                                              | size | Email                        | Password  | Brand      |
      | Kadın        | Giyim    | Bluz         | Siyah | Bisiklet Yaka Parlak Görünümlü Uzun Kollu Tül Kadın Bluz | M    | anilcanozdemir1020@gmail.com | Anilcan1. | LCW CASUAL |

  @Main
  Scenario Outline:Main Scenario
    Given Customer is on AppHomePage
    When Customer Sign-Up with E-mail "<Email>" and Password "<Password>" and Phone "<Phone>" to App
    When Customer login with E-mail "<Email>" and Password "<Password>" to App
    When  Select Category as "<MainCategory>" -- "<Category>" -- "<Sub-Category>" from CategoriesPage
    And Filter Color to be "<Value>" from AppSearchPage
    And Click Product "<Brand>""<ProductName>" from AppSearchPage
    And Choose Size Option "<size>" from AppProductPage
    And Add to Cart from AppProductPage
    And Click "Sepete Git" on SlideDownMenu from AppProductPage
    Then should see product named "<ProductName>" whose countity 1 and size "<size>" and "<Value>" Colored from AppCartPage
    When Proceed to AppCheckOutPage
    Then should see AppCheckOutPage

    Examples:
      | MainCategory | Category | Sub-Category | Value | ProductName                                              | size | Email                        | Password  | Phone      |
      | Kadın        | Giyim    | Bluz         | Siyah | Bisiklet Yaka Parlak Görünümlü Uzun Kollu Tül Kadın Bluz | M    | anilcanozdemir1020@gmail.com | Anilcan1. | 5395096917 |