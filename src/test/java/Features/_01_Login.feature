#Senaryo;
  #1- Siteyi aciniz.
  #2- username ve password u gönderin ve login butonuna tiklatin.
  #3- Login oldugunuzu dogrulayiniz.


  #- Sonra yukaridaki Senaryoyu  Gherkin dilinde yazdik.

@SmokeTest
  Feature: Login  Functionality
       Scenario: Login with valid username and password

         Given Navigate to basqar
         When Enter username and password and click login button
         Then User should login successfully
