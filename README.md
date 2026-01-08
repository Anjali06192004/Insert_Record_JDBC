# Task 3: Insert Student Record using JDBC

## 📌 Project Description
This project demonstrates how to insert student records into a MySQL database using Java JDBC.
The program takes user input and inserts records using PreparedStatement with parameterized queries.

This task is part of JDBC CRUD operations practice.

---

## 🎯 Objective
- Connect Java application with MySQL database
- Take student details from user
- Insert records into database using PreparedStatement
- Allow user to insert multiple records

---

## 🛠 Technologies Used
- Java (JDK 21)
- JDBC (MySQL Connector/J)
- MySQL Database
- IntelliJ IDEA

---

## 📂 Database Details
- Table Name: students  

### Table Structure:
| Id | Name | Age |
|----|------|-----|
---

## ▶ How to Run the Project

1. Open project in IntelliJ IDEA
2. Add MySQL JDBC Driver (Connector/J) to project library
3. Make sure MySQL service is running
4. Create database and table in MySQL
5. Update database URL, username, and password in Java code
6. Run the main Java file
7. Enter student details when prompted

---

## 🧾 Sample Input

Enter ID: 1  
Enter Name: Anjali  
Enter Age: 22  
Do you want to insert more records? (yes/no): yes  

Enter ID: 2  
Enter Name: Dharti  
Enter Age: 21  
Do you want to insert more records? (yes/no): no  

---

## ✅ Sample Output

Connection Successful!  
1 Record Inserted!  
1 Record Inserted!  
Program Ended.

---

## 📘 Learning Outcome
After completing this task, I learned:
- How to use PreparedStatement with parameters
- How to insert data using executeUpdate()
- How to take dynamic user input
- How to perform Create operation in CRUD using JDBC

---

## 👩‍💻 Author
Anjali Tak 
Junior Java Developer Intern (Learner)
