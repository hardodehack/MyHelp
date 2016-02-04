# MyHelp - Ticket System using Spring with JPA Hibernate

This is a Ticket System implemented using Spring with JPA and Hibernate. 
Currently the database used is MySQL, but can be configured to use different databases.

Configuration: 

One should use the following commands to clone a copy  of the project: 
	git clone https://github.com/garygml/MyHelp-Ticket-System-using-Spring-with-JPA-Hibernate.git
and import as a maven project to an IDE. 

1. Edit jpaContext.xml for the username and password of your database;
2. Change "update" in
	<entry key="hibernate.hbm2ddl.auto" value="update" /> 
	to "create" on the first run. 
3. Deploy the app in Apache Tomcat. 


