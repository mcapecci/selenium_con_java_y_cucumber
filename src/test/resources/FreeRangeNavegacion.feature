Feature: Navigarion bar
  To see the subpages
  Without loggin in
  I can click the navigation bar links

Scenario: I can access the subpages through the navigation bar
  Given I navigate to www.freerangertesters.com
  When I try to access the free sections throug the navigation bar
  Then I am redirected to the right page
