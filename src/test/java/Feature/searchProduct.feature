Feature: search and place the order for product
@OffersPage
Scenario Outline: Search Experience for product search in both home and Offers page

Given User is on GreenCart Landing page
When user searched with Shortname <Name> and extracted actual name of product
Then user searched for <Name> shortname in offers page to check if product exist with same name
And  validate product name in offers page matches with Landing Page
 
Examples: 
|Name|
|Tom|
|Beet|