Feature: Discovery Videos


Scenario: Adding videos to Favourite List
  Given I am on the Discovery Search page
  When I select a video and add it to the favourite list
  Then Go to the My Videos Page
  Then I should see correct video title and description

