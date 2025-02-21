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
  When the user comes to the Back tab
  And the user clicks on the watchlist tab
  Then verify the user is able to see the stock name in Watchlist-1
  When verify the user places an order of "Abc" for NSE/BSE for the Buy side of "Invest" product type with price and quantity
  And the user selects the scrip name and clicks on the Buy button
  And the user selects the product type
  And the user selects the exchange
  And the user selects the order side
  And the user enters the quantity
  And the user enters the amount
  And the user clicks on the buy button
  #****************************************************NSE Daytread********************************************************
  When the user selects the scrip name and click on the Buy button
  And the user selects "DAY Tread" product type
  And the user enters the quantities
  #And the user enters the amount range
  And the user click on the buy button
 
  



 