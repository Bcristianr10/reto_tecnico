#Autor: Billi Ruiz

@stories
Feature:Automation technical challenge
  automation challenge registering a user in Utest
  @scenario1
  Scenario:Register a user
    Given Brandon wants to join the tester community
    When fill in the fields of each section on the UTest page
      |strFirstName|strLastName|strEmail              |strLanguage|strCity    |strPostalCode|strCountry|strComputerOperatingSystem|strVersion|strComputerLanguage|strMobilDevice|strDeviceModel|strDeviceOperatingSystem|strPassword      |
      |Brandon        |Perez   |bperez10@retotecnico.com|Spanish    |Arraijan   |07003        |panama    |windows                   |10 64-bit |spanish            |xiaomi        |mi 9          |android 11              |ChoucairReto2021*|

    Then successful registration
      |strConfirmWelcome|
      |Welcome to the world's largest community of freelance software testers!|