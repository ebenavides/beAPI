# beAPI
Instructions:

Download the .jar:  beAPI-0.0.1-SNAPSHOT.jar
From Bash Terminal /CMD execute the jar with the following commands:
java -jar beAPI-0.0.1-SNAPSHOT.jar

From Postman Collection, you can mock HTTP Requests:https://www.getpostman.com/collections/48c56a42a8d3cbb687e3 
The URL for the API: http://localhost:8080/people

This will give return the entire collection.

To get a single person by ID, just type: http://localhost:8080/people/{id}

--------------------------------------------------------------------------

Note: When working from the IDE and in compiling and in debbuging state, the API runs OK.
When building the API and deploying it, it shows an error from the DB Dependency. The DB that's been used is Apache Derby (embedded). And the Server is Tomcat (in form of servlet). Everything is selfcontained in the API. 
It seems that there's a problem when loading the dependencies for Apache Derby and Hibernate, so it's probably that in the end the API won't run properly.

I'll be working to find a solution. Any other information required feel free to contacto me.

Best regards,

Esteban Benavides


