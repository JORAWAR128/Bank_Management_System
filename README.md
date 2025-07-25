# Bank_Management_System
A basic Bank Management System made using Java for practice. This console-based mini project includes features like creating an account, login via account number, deposit/withdrawal, viewing balance, and account details . 

# 💳 Bank Management System (Java) - Mini Project

This is a basic **Bank Management System** developed using Java as a **mini project** for practice. It is a **console-based** application that simulates common banking operations like creating a new account, logging in, checking balance, credit/debit transactions, and viewing account details.

> 📌 Note: This project uses **only basic Java** — no constructors, inheritance, or advanced OOP features. It is designed to help beginners understand the fundamentals of classes, methods, input handling, and program logic.

---

## 📌 Features

- 🧑 Create new bank accounts
- 🔐 Account number auto-generation (based on holder name and random number)
- 📥 Deposit money
- 📤 Withdraw money with balance check
- 💰 View current balance
- 📋 Display account details (name, email, contact, IFSC, balance)
- 🔎 Log in using account number
- 🗺️ Branch-wise IFSC code generation (based on user-selected area)
- ❌ Handles incorrect input gracefully

---

## 🧱 Technologies and Concepts Used

- Java (Core)
- `Scanner` class for input
- `Random` class for account and IFSC number generation
- Arrays (`BankAcc[]`) to store up to 10 bank accounts
- Static variables for shared data (`bankacc[]`, `index`)
- String handling and conditional logic (`if`, `switch`, etc.)
- Console-based UI (text menu system)

---

## 🗂️ Project Structure

BankManagementSystem/
├── Main.java # Contains main() and menu interaction
├── BankAcc.java # Class representing each account and all account operations
└── README.md # Project documentation

🧠 Learning Outcomes
Practice writing classes and methods

Learn how to store multiple objects using arrays

Understand how to use static variables for shared data

Gain experience handling user input and basic error checking

Understand basic financial logic (credit, debit, balance handling)

