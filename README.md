<a name="readme-top"></a>

<!-- PROJECT SHIELDS -->

<!--
[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]
-->

# ▫️▪️◽️◾️◼️◻️ Online Movie Ticket Booking Platform ◻️◼️◾️◽️▪️▫️

# $${\color{lightblue}Case \space Study \space Purpose \space Only}$$

## About this repository
Contains design diagrams and source code information on Case Study : Online Movie Booking

### Software Development Methodology followed for this
BDD : Behavioral Driven Development  
TDD : Test Driven Development  
Every development methodologies has their own advantages and can be used to together based on requirements.  
The development strategy steps
  1. Define Behaviors and Scenarios
  2. Write Acceptance Tests
  3. Implement Tests First
  4. Refactor Code
  5. Repeat the cycle
```diff
- due to time constraint and as it is on the purpose of case study, covering below on development methodology process
@@ 1. Defining Behaviors and Scenarios @@
```

### High level architecture of platform
![HLA](https://github.com/PrasadKagitha/Casestudy_PBS/assets/13848297/69e4d580-1a3a-47d2-843d-883bbf45ac82)

### ER Diagram
![ER_Diagram](https://github.com/PrasadKagitha/Casestudy_PBS/assets/13848297/d658919e-5f9e-4f2d-82b3-4ce27db80621)

### Built With

Frameworks and libraries used to develop this project

![Java](https://img.shields.io/badge/Java-007396?logo=java&logoColor=white)
![Spring Framework](https://img.shields.io/badge/Spring_Framework-6DB33F?logo=spring&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?logo=spring&logoColor=white)
![Angular](https://img.shields.io/badge/Angular-DD0031?logo=angular&logoColor=white)
![Redis](https://img.shields.io/badge/Redis-DC382D?logo=redis&logoColor=white)
![CDC](https://img.shields.io/badge/CDC-2b1d54)
![CircleCI](https://img.shields.io/badge/CircleCI-76dcde?logo=circleci&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?logo=mysql&logoColor=white)
![Apache Kafka](https://img.shields.io/badge/Apache_Kafka-231F20?logo=apache-kafka&logoColor=white)


### Key Scenarios
### Scenario-1 : Browse Movies
&nbsp;&nbsp;Given I am on Movie ticket booking platform  
&nbsp;&nbsp;When I select movie from the list  
&nbsp;&nbsp;And I select a date  
&nbsp;&nbsp;Then I should see list of theaters running the movie with showtime  

#### &nbsp;&nbsp;Scenario-1 : Design Diagram  
&nbsp;&nbsp;![LLD_Search](https://github.com/PrasadKagitha/Casestudy_PBS/assets/13848297/b83f005a-454c-4a5f-8155-84f0e31378ff)

#### &nbsp;&nbsp;Scenario-1 : Explaination  
&nbsp;&nbsp; An online booking system can have million number of users in real time across country and even hundreds of thousands in location wise,  
&nbsp;&nbsp;and theaters and show information of movies are common for every user based on the location and date.  
&nbsp;&nbsp;Hence, instead of querying the database for every time it is better to have a cache in place (it can be any like Materialized View, how we think on design).  
&nbsp;&nbsp;But, we should have some cache invalidation functionality as well to update the cache in real time.  

#### &nbsp;&nbsp;Scenario-1 : API  
&nbsp;&nbsp;http://localhost:8080/otbms/theater/search  
&nbsp;&nbsp;Payload  
&nbsp;&nbsp;{  
&nbsp;&nbsp;"movie_id": 122,  
&nbsp;&nbsp;"date" : "2023-01-21"  
&nbsp;&nbsp;}  
&nbsp;&nbsp;Response  
&nbsp;&nbsp;List of Theater and ShowTime Information  

### ==============================================  
### Scenario-2 : Ticket Booking : Seat Reservation  
&nbsp;&nbsp;Given I am on Movie ticket booking platform    
&nbsp;&nbsp;When I select a seat from available seats  
&nbsp;&nbsp;And I confirm the selection  
&nbsp;&nbsp;Then seat should be reserved for the user 

#### &nbsp;&nbsp;Scenario-2 : Design Diagram  
&nbsp;&nbsp;![LLD_BookingSeat](https://github.com/PrasadKagitha/Casestudy_PBS/assets/13848297/a42de105-c010-4c59-a379-36bae035370c)


#### &nbsp;&nbsp;Scenario-2 : Explaination  

#### &nbsp;&nbsp;Scenario-2 : API  

