# Selenium Test Automation Framework

A Java-based Selenium WebDriver automation framework using TestNG, Maven, and Page Object Model (POM).

## Project Overview

This project demonstrates a basic web UI automation framework for testing a User Management application.

The framework is designed with reusable components for browser initialization, page objects, test setup, and test execution.

## Technologies Used

- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- Git & GitHub

## Framework Structure

```text
UserManagement_DemoApp
│
├── src
│   ├── main
│   │   └── java
│   │       └── com.usermanagement
│   │           ├── browserfactory
│   │           │   └── BrowserManager.java
│   │           │
│   │           └── pageobjects
│   │               └── LoginPage.java
│   │
│   └── test
│       └── java
│           └── com.usermanagement
│               ├── base
│               │   └── BaseTest.java
│               │
│               └── testcases
│                   └── LoginTest.java
│
├── pom.xml
└── testng.xml
