# scoreboard
Anders - scoreboard UI with backend.

Backend Framework -  Spring Boot , Spring Data JPA with in memory H2 DB.
Front End - Bootstrap , Datatables  with Thymleaf templates .

Functionality

1. Display - List of Player Names and Points
2. Button to create a new record for Player and Points
3. Validations added while adding new record  
  - Both fields are required
  - Player Name Min length is 2 and max length is 100
  - Points field is numeric and accepts only positive integers from 0 to 100
  - Proper errors will be thrown if the conditions are not met
4. The list will be truncated on application restart as it uses H2 , in memory database