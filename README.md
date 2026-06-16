# TenForce Automation Exercise

## Overview

This project contains an automated UI test for the TenForce website using Selenium WebDriver, Java, Maven, and TestNG.

The test automates the following scenario:

1. Open https://www.tenforce.com/
2. Navigate to the Careers page
3. Open the "Life at TenForce" section
4. Open the "Life of Two Interns" article
5. Scroll through the article
6. Navigate back to the Job Openings section
7. Verify that the text **"Feel free to send your CV to job"** is displayed

---

## Framework Choice

The framework is built using:

* **Java** – language for test automation
* **Selenium WebDriver** – Browser automation tool
* **TestNG** – test execution, assertions, and reporting
* **Maven** – dependency management and build automation

This combination provides a scalable, maintainable, and industry-standard automation framework suitable for UI testing.

---

## Architecture

The project follows the **Page Object Model (POM)** design pattern.

Page-specific locators and actions are separated from test logic, improving maintainability and reusability. Each page is represented by a dedicated Page Object class, while the test class focuses only on the business scenario and validations.

The framework uses robust locators and meaningful assertions to ensure reliable test execution and easier maintenance when the application UI changes.

---

## Project Structure

```text
src/main/java
├── PageObjects
│   ├── Careers.java
│   ├── LifeOfInterns.java
│   └── PageHelper.java

src/test/java
└── QATest/Interview
    └── TenForceTest.java

pom.xml
README.md
```

---

## Prerequisites

Before running the tests, ensure the following are installed:

* Java JDK 
* Maven
* Google Chrome browser

Verify installation:

```bash
java -version
mvn -version

Way to Run:
From IDE--> Right Click on POM.xml & run as TestNG Test

From CLI--> Navigate to Project PAth & run this below command
mvn -Dtest=dam test
```

---

## Running the Tests

Clone the repository:

```bash
git clone <repository-url>
```

Navigate to the project:

```bash
cd Interview
```

Execute all tests:

```bash
mvn clean test
```

Execute the specific test class:

```bash
mvn -Dtest=TenForceTest test
```

---

## Assertions Performed

The automated test validates:

* Successful navigation to the Careers page
* Successful navigation to the "Life at TenForce" section
* Successful opening of the "Life of Two Interns" article
* Successful scrolling through the article
* Presence of the text:

```text
Feel free to send your CV to job
```

on the Job Openings page

---

## Author

Venkata Srikavya Neelapala
