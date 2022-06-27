# LC-Waikiki-Test-Otomasyon-Bootcamp-Bitirme-Projesi
Uçtan uca ödeme ekranına kadar Selenium’da java dili ile chrome browser kullanarak
test otomasyon ödevi yapılacak.Ödeme ekranı doldurulmayacak.
Aşağıdaki senaryoyu web ve mobil olmak üzere 2 çeşit oluşturabilirlerse çok iyi olur.
En az Web’de yapmak zorunlu.
SENARYO:

● Bir yeni müşteri kaydı oluşturulacak.(TELEFON ONAYI YÜZÜNDEN YAPILAMADI)

● Login olduktan sonra

● Kategoriler ---Kadın---Giyim---bluz bölümüne girip

● Filtreleme bölümünden renk seçeneği siyah seçilecek.

● Sonuçlar listele yapılıp ,gelen ürün sonuçlarından biri seçilip ,üstüne tıklanacak.

● Beden medium seçilecek ,sepete ekle butonuna tıklanacak.

● Sepetim’e gidilecek ,ürünün adı ,adeti ,bedeni kontrol edilecek.

● Ödeme yap butonuna tıklayıp,ödeme ekranına gidildiği ,doğru ekrana yönlendiklerini
kontrol edecekler.

## Used Technologies
●SELENIUM 

●WEBDRIVER MANAGER 

●TESTNG 

●CUCUMBER 

●GRASSHOPPER 

●APPIUM 



## Installation
When you open the project as a maven project the required Maven Dependencies will be installed.
For the first step, it will be enough to have [Chrome](https://www.google.com/chrome/) installed.
Setting up [Appium](https://appium.io) and an Android Virtual Device for the Second phase of the project
(For example, you can install it with Virtual Device Manager that comes with [Android Studio](https://developer.android.com/studio) )
Don't forget to install the necessary [apk](https://apkcombo.com/tr/lc-waikiki/com.lcwaikiki.android/download/phone-3.3.30-apk) on Virtual Device.
## Usage
After opening it as a Maven Project, It is recommended to run from .xml files which are located under the src/test/resources/testSuites/ path.
However, it has been observed that runs can be made from .feature files with minor changes in the util/DriverFactory.java and util/Hooks.java sections.

U can also change runner classes and their tag from src/main/java/testRunners.



### SIGN IN TEST CASES

Örneğin Yeni bir müşteri adayı ,alışveriş sitemize login olmak istiyor.
a) Üyelik formunu başarılı bir şekilde doldurup,üyelik kaydının oluşturulması senaryosu
oluşturulacak.
b) Üyelik formunu başarısız bir şekilde doldurup (zorunlu alanların boş bırakılması yada
text alanına geçersiz giriş yapılması v.b) üyelik kaydının oluşturulması senaryosu
oluşturulacak.

CAN BE FOUND AT LC WAIKIKI TEST CASES.xlsx