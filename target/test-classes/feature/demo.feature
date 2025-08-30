Feature: This feature is to validate test scenario

Background: launch the url
  Given I launch "Amazon" Application


  @Test1
  Scenario: To login amazon page
    Given I launch "Amazon" Application
    And I  enter the "user" and "pwd"

  @Test2
  Scenario Outline: to transfer the sendkey data
#    Given I launch "Amazon" Application
    When I see the home page with title "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"
    And I  enter the "user" and "pwd"
    When I pass the "<Value>"
    Given I Close The Browser
    Examples:
      | Value   |
      | Samsung |

  @Test3
   Scenario Outline: to transfer the sendkeys data
     Given I launch "Amazon" Application
     Then I send value using action class
     When I see the home page with title "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"
     And I  enter the "user" and "pwd"
     When I pass the "<Value>"
     Given I Close The Browser
     Examples:
       | Value   |
       | Iphone  |
       | Samsung |

  @Test4
  Scenario: Total Number of Link on the HomePage
#    Given I launch "Amazon" Application
    Then I findOut the number of link in a page

  @Test5
  Scenario: assert Equal Method and assert true method
    Given I launch "Amazon" Application
    And I verify the Text using assert equal using String operation
    Then I verify Best Seller Text
    Then I verify the "Fresh" text on homePage
    And I verify the "Fresh" text is present in amazon UI verify Not Equal Operator

  @Test6
  Scenario: Zoom In Zoom out the WebPage
    Given I launch "Amazon" Application
    Then I zoom in the WebPage using javaScript
    Then I zoom Out the WebPage using javaScript

  @Test7
  Scenario: get window handles method
    Given I launch "Demo" Application
    And I click on Follow Twitter Button
    Then I move the new windows and click on sign in button

  @Test8
  Scenario: Action class method
    Given I launch "Amazon" Application
    And I double click on MXPlayer Button
    Then I click on mouse hover on prime button
    And I click on Fresh right click button
    Then I send the command using action class in Search Amazon Page
    And I scroll down the page

  @Test9
  Scenario: Scroll up & down method All JavaScript Function
    Given I launch "Amazon" Application
    Then I refresh the browser using javaScript
    And I scroll down the bottom page
    And I scroll up the bottom page
    Then I click on air conditioner button using javascript
    And I pass the value using javaScript Executor
    Then I clear text Using javaScript Executor

  @Test10
  Scenario: To check the Title,Url,getPage Resources,close & Quit Method
    Given I launch "Amazon" Application
    And I check the Title
    Given I Close The Browser

  @Test11
  Scenario: To change the Position of Browser
    Given I launch "Amazon" Application
    And I change the Position of browser

  @Test12
  Scenario: To change the size of Browser
    Given I launch "Amazon" Application
    And I change the Size of browser

  @Test13
  Scenario: To open the new tab
    Given I launch "Amazon" Application
    And i open the new Tab using different Method

  @Test12
  Scenario: To open the new Window
    Given I launch "Amazon" Application
    And i open the new Window using different Method

  @Test14
  Scenario: switch Method
    Given I launch "Amazon" Application
    And I click on All Button
    And I click on "Best Seller" under "Trending" Button
    And I click on All Button
    And I click on "new Releases" under "Trending" Button

  @Test15
  Scenario: switch Methods
    Given I launch "Amazon" Application
    And I click on "sell" Button under the Black frame
    And I click on "mobile" Button under the Black frame

  @Test16
  Scenario: generic Xpath
    Given I launch "Amazon" Application
    And I click on "Sell" Button
    And I click on "Mobiles" Button

  @Test17
  Scenario: Select All the checkbox
    Given I launch "Amazon" Application
    And I click on "Mobiles" Button
    Then I select all the checkbox at a time

  @Test18
  Scenario: isEnabled,isDisplayed,isSelected total number of link on page
    Given I launch "Amazon" Application
    And I verify fresh element is displayed on homepage
    Then I verify that the and order link is enabled or not

  @Test19
  Scenario: Screenshot Method and Sikuli mouseOver
    Given I launch "Amazon" Application
    And I click on "Sell" Button
    Then I take a screenshot on homepage
    Then I mouseHover on "Fresh" Method

  @Test20
  Scenario: DropDown Method using select class & using data table
    Given I launch "Amazon" Application
    And I click on "Sell" Button
    And I select "Appliances" from the Dropdown option dropdown
    And I select the "Books" form the amazon UI

  @Test21
  Scenario: Highlight the element
    Given I launch "Amazon" Application
    And I click on Electronic button to verify is highlighted

  @Test22
  Scenario: Assertion Methods(Soft and Hard) regex expression and switch method
    Given I launch "Amazon" Application
    Then I verify the "Pune" using SubString function
#    And I verify "Amazon.in" using regex function





