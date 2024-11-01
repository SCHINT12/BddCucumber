Feature: Halcyontek Speedline.AI
@test1
Scenario: Creating basic order
Given user able to launch browser and select Place of service
And I click on "Pink" color vehicle
#When user able add to card food items
#Then user able to see total bill amount
When I click the product "4 Express Tenders Combo" and navigate to "Sides"
Then validate prices for products "french_fries-lg,french_fries-sm,cole_slaw-lg,mash_pot_w/_gravy-sm"
And I navigate to "Sauce Extras"
Then validate prices for products "extra_bbq,extra_ranch"

#@test5
#Scenario Outline: Creating basic order for product 3 Piece Chicken Combo
#Given user able to launch browser and select Place of service
#And I click on "Pink" color vehicle
#When user able add to card food items
#Then user able to see total bill amount
#When I click the product "3 Piece Chicken Combo" and navigate to "Beverages"
#Then validate prices for products <product>
#Examples:
#|product|
#|unsweet_iced_tea-med,unsweet_iced_tea-lg|

























#Scenario: Creating order of Four Express Tenders Combo
#Given user able to launch browser and select Place of service
#When user ordering Four Express Tenders Combo with add ons
#Then bill payment
#
#Scenario: Price Comparison under Four Express Tenders Combo add ons 
#Given user able to launch browser and select Place of service
#When user able add to card food items
#Then user able to see total bill amount




