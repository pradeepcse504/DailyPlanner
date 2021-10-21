# DailyPlanner
This application is a daily planner created using java programming language

The application is design using design patterns with the objective to decouple every class as necessary as possible. There by having multiple objects 
responsible of individual resposibility has helped a lot in the understanding of creating complex software application with similar classes going into one package.

The application enables a user to enter events , tasks , appointments or errands. The fields required to fill are the name , description , start date , end date and the status of the event or simply some notes. You will be able to see the categories and view individual categories. View all categories , or add any of the activity supported so far by the system.

The application has more room for expansion considering adding more functionality is just to add more classes instead of altering the whole code base.
The application uses a singleton object to store the activites in the application so there are no more objects involved in the storage of user data;

Main Drive test file is located in factory package and name is DailyPlanner.java

To use the program to add an activity the builder pattern has been used to build the objects for the activity

Create activity requires a string
Create description requires a string
Create start date requires a date in the format yyyy-mm-dd hh:mm:ss failure the system will revert to current date
create end date requires a date in the format as above
create status notes or status requires a string such as not completed , not attended , unavailable any may work or like additional notes

Using the menu you can view any activity you have added to the system.
