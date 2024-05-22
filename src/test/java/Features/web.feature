Feature: Final Project Web Testing

  @web
  Scenario: Test Home  PRODUCT STORE
    Given Open link PRODUCT STORE
    Then User will in home Product Store

  @web
  Scenario: Test Categories in Product Store
    Given Open link PRODUCT STORE
    #And Click Phones
    #Then Will show all type phone
    And Click Laptops
    Then Will show all type laptop
    #And Click Monitors
    #Then Will show all type monitor

  @web
  Scenario: Access Contact in product Store
    Given Open link PRODUCT STORE
    And Click nav contact
    And User fill Contact Email "kikamn@gmail.com"
    And User fill Contact Name "Kika"
    And User fill Message "Oki doki"
    And Click button Send message
    And Click oke in alert
    Then Will back home

  @web
  Scenario: Close Contact in product Store
    Given Open link PRODUCT STORE
    And Click nav contact
    And Click button X
    Then Will back home

  @web
  Scenario: User Login with Username and password valid
    Given Open link PRODUCT STORE
    And Click nav Log in
    And Fill Username "kikamn"
    And Fill password "Kika1234"
    And Click button Log in
    Then Log in will be successful

  @web
  Scenario: User log in with username and password invalid
    Given Open link PRODUCT STORE
    And Click nav Log in
    And Fill Username "rizkika"
    And Fill password "kikamn1234"
    And Click button Log in
    Then Will show alert

  @web
  Scenario: User log in with username and password empty
    Given Open link PRODUCT STORE
    And Click nav Log in
    And Fill Username " "
    And Fill password ""
    And Click button Log in
    Then Will show alert

  @web
    Scenario: User can close form log in
    Given Open link PRODUCT STORE
    And Click nav Log in
    And Click button Close in Log in
    Then Will back home

  @web
  Scenario: User sign up with username and password not register
    Given Open link PRODUCT STORE
    And Click nav Sign up
    And Fill Username Sign up "Ratnaw"
    And Fill password Sign up "Ratna1234"
    And Click button sign up
    #Then Will show alert sign up

  @web
  Scenario: User sign up with username and password registered\
    Given Open link PRODUCT STORE
    And Click nav Sign up
    And Fill Username Sign up "Kika"
    And Fill password Sign up "Kika1234"
    And Click button sign up
    #Then Will show alert sign up

  @web
  Scenario: User can close form sign up
    Given Open link PRODUCT STORE
    And Click nav Sign up
    And Click button close sign up
    Then Will back home

  @web
  Scenario: User can see detail from product
    Given Open link PRODUCT STORE
    And Click title product
    Then Will show detail product
    Then Image product
    Then Title product
    Then Price product
    Then Description product
    Then Click Button Add to Cart

  @web
  Scenario: User can access Cart
    Given Open link PRODUCT STORE
    And Click title product
    #And Click Button Add to Cart
    #And Click oke in alert to cart
    And Click Nav Cart
    Then Will show purchased products


