Feature: login functionality

  Scenario: manager login
    Given user on the login page
    When user logs in using "in_pos_manager2@info.com" and "jKtfgrs31"
    Then inbox page should be displayed
    And title should be "#Inbox - Odoo"