# SEM_1_Project_2

✈️ Darshit Tours & Travels Management System (Java Project)
📌 Project Overview

The Darshit Tours & Travels Management System is a console-based Java application developed as a Semester-1 academic project.

This project simulates a basic travel booking platform where users can create an account, log in, select travel routes, choose transportation modes such as Bus, Train, or Flight, and book hotel accommodations.

The system calculates travel costs, hotel expenses, extra services, and generates a complete bill with GST, giving users a realistic tour booking experience through a simple command-line interface.

🎯 Project Type

Console Based Application

Java Core Programming Project

Semester-1 Academic Project

Travel & Tourism Management System

🛠 Technologies Used

Programming Language: Java

Interface: Command Line / Console

Libraries Used: java.util.Scanner

Platform: Any Java-supported system

🧠 Concepts Used in the Project

This project demonstrates several important Core Java programming concepts, including:

Object-Oriented Programming (OOP)

Classes and Methods

Conditional Statements (if / switch)

Loops (do-while)

Arrays and Strings

User Input Handling using Scanner

Data Validation

Menu Driven Programming

Basic Billing System

Date Validation Logic

These concepts help beginners understand how to design structured Java applications.

⚙️ System Features
1️⃣ User Registration

Users must register before booking a tour.

During registration the system collects:

Full Name

Mobile Number

Date of Birth

The system automatically generates a unique User ID using the user’s name and birth year.

Users must also create a password that includes:

Uppercase letters

Lowercase letters

Numbers

This ensures basic password security validation.

🔐 User Login

After registration, users log in using:

User ID

Password

If credentials are correct, the system allows the user to continue with the booking process.

📅 Travel Date Selection

Users select the year, month, and date for travel.

The system validates:

Correct number of days in each month

Proper date format

This ensures that invalid travel dates cannot be selected.

🌍 Travel Route Selection

Users can select travel routes between major cities such as:

Ahmedabad

Bangalore

Chennai

Delhi

The system calculates travel price based on departure and arrival locations.

🚍 Transport Selection

Users can choose their preferred transportation mode:

Bus

Train

Flight

They can also choose travel class such as:

Business Class

First Class

Economy Class

Ticket prices are calculated based on route and vehicle type.

🏨 Hotel Booking

After booking travel, users can optionally book a hotel.

Available options:

⭐ 5-Star Hotel

⭐ 4-Star Hotel

⭐ 3-Star Hotel

Hotel pricing depends on:

Number of passengers

Number of stay days

Hotel star category

Room allocation is automatically calculated based on passengers.

🍽 Extra Services

Users can add optional hotel services such as:

Food Ordering

Laundry Service

Bar Access

Spa & Saloon

These services are added to the final hotel bill.

💰 Billing System

The system calculates:

Travel ticket cost

Hotel stay cost

Extra service charges

GST (18%)

Finally, it generates a complete tour invoice including all details.

🧾 Final Tour Summary

At the end of the booking process, the system prints a complete tour summary, including:

Passenger Details

Name

Date of Birth

Mobile Number

Travel Details

Travel Date

Departure Location

Arrival Location

Transport Type

Travel Class

Number of Passengers

Hotel Details

City

Hotel Star Rating

Number of Stay Days

Hotel Charges

Payment Summary

Travel Bill

Hotel Bill

GST (18%)

Final Total Amount

Users can then choose a payment method such as:

Google Pay

UPI ID

Debit Card

Net Banking

🔄 How the System Works

The application follows a menu-driven workflow:

1️⃣ User registers an account
2️⃣ User logs into the system
3️⃣ User selects travel date
4️⃣ User chooses departure and arrival city
5️⃣ User selects vehicle type (Bus/Train/Flight)
6️⃣ User optionally books a hotel
7️⃣ User adds extra hotel services
8️⃣ System calculates total bill and GST
9️⃣ Final invoice is generated

📂 Project Structure

Main components of the project include:

Main Class → Controls program execution

register() → Handles user registration

login() → Authenticates user login

date() → Handles travel date selection

location() → Handles route and transport selection

hotel() → Manages hotel booking

book() → Confirms hotel booking

print() → Generates final tour invoice

The system is designed using multiple methods to keep the code organized and modular.

🎓 Learning Outcomes

Through this project, I learned:

Designing menu-driven Java applications

Implementing user authentication logic

Handling input validation

Creating dynamic billing systems

Structuring Java programs using multiple functions

Simulating real-world systems using programming

🚀 Possible Future Improvements

This project can be expanded with:

Graphical User Interface (GUI)

Online payment integration

Database support (MySQL)

Real-time travel APIs

Online hotel booking integration

Admin panel for managing travel routes

👨‍💻 Author

Semester-1 Java Project
Darshit Tours & Travels Management System
