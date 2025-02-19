Feature: MStock Login functionality

   Scenario: To Validate the Mstock Login with valid credentials
  Given the user is on the login page
  When the user enters username and password
  And the user clicks on the login button
  Then the user should be Redirect on OTP page
  And  the user is able to see the 2FA Security page.
  When the User Entering the OTP in Input field
  Then the Risk Discloures page Should be open and able to click on continue button
  Then User Should be redirect on Landing page
  
  
  When the User check the "Total Assets" on home page
  And To verify User is able to see the amount of  Equity
  And To verify User is able to see the amount of  Mutual Fund
  And To verify User is able to see the amount of  Cash
  Then To verify the "Key indices" 
  And To verify Global indices
  And To varify the FII/DII data fetch yesterday data
  When The user click on month and Validate the data
  And The User click on Year and featch the data
  Then verify the refer and Earn
  When To verify User is able to see the "Market Movers"  in which is able to see the "Gainers" And "Losers" below to Market Movers
  When To verify User is able to see the "View All " besides "Most traded on Mstock" CTA and it is clickable
  Then The CTA page Should be Open
  
  #************************************************* portfolio***************************************************
  When To verify User is able to see  and click on the "Portfolio "Tab beside to "Home " Tab 
  Then To verify User is able to see the amount of  Total Assets
  And To verify User is able to see the amount of  Overall Profit/Loss
  And To verify User is able to see the amount of  "Days Profit/Loss"
  When To verify User is able to see the "MF " CTA below to  "Equity" and it should be clickable 
  Then To verify User is able to see the "Add Fund " CTA  beside to Available cash and is clickable
  When To verify User is able to see the Text  "BSE F & O LIVE " and is clickable 
 
 #************************************************* OMS ***************************************************
  When User come on Back tab
  And The User click on the watchlist tab
  Then The watchlist page is open
  And To verify User is able to see the Stock name in the Watchlist-1
  When To verify User is place order of "Abc " for Nse/ Bse for Buy Side of "Invest" Product Type  with Price and Quantity 
  And the user is Select Scrip Name and click on Buy button
  And User is select the product type
  And User is Select the Exchange
  And The User is Select the Order side
  And the user enter the quantity
  And the user Enter the Amount 
  And the click on the buy tab
 
  



 