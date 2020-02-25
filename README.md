# spring-data-cassandra
Spring Data Cassandra in Spring Boot

###How to Install Cassandra
1. [Download](http://cassandra.apache.org/download/) & Install (Extract folder) Cassandra.
2. Set environment variable for Cassandra home/bin
3. [Download](https://www.python.org/downloads/windows/) & Install Python
4. Copy all the directories from installed Python to Cassandra home/bin
5. Start Cassandra Daemon from Cassandra home/bin using cassandra.bat
6. Start Cassandra's cqlsh using cqlsh.bat

###Basic Commands of Cassandra
1. CREATE KEYSPACE IF NOT EXISTS film_industry WITH REPLICATION = { 'class' : 'SimpleStrategy', 'replication_factor' : 3 };
2. use film_industry;
3. CREATE TABLE movie(id int PRIMARY KEY, name text, year int);

###Help Links
* [Install Cassandra in Windows 10](https://medium.com/@sushantgautam_930/simple-way-to-install-cassandra-in-windows-10-6497e93989e6)
* [Cassandra Tutorial](https://www.tutorialspoint.com/cassandra/index.htm)