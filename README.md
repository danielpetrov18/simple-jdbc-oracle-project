A database project that is part of the Database Management Systems course at the university of Vienna. 
https://ufind.univie.ac.at/en/course.html?lv=051031&semester=2022W

Database Connectivity

This project utilizes JDBC (Java Database Connectivity) to establish a connection to an Oracle database. The appropriate Oracle JDBC driver is used to facilitate communication between the Java application and the database.

Usage

Once the server is running and the database is configured, users should run the create.sql script and then compile both source java files and run the InsertData executable. After that one can access the frontend. Note: [The database is not configured in this project. If you want to use it you need to either download oracle database locally or use a docker container.]

Content

1. Inside the /sources/Java folder one can find 2 classes - one is responsible for holding the datam the other one is opening, closing the connection to the database and fills the database using precompiled statements.
2. Inside the /sources/PHP folder one can find different php classes responsible for CRUD operations.
3. Finally, inside the /sql_scripts one can find all ddl scripts.
