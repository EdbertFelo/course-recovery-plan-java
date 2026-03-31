# Course Recovery System (CRS)

Course Recovery System (CRS) is a Java-based GUI application designed for educational institutions to manage students who need to recover failed or incomplete courses. The system helps academic officers and course administrators monitor student progress, create recovery plans, evaluate eligibility for progression, and generate academic reports.

This project was developed using **Object-Oriented Programming (OOP)** concepts such as encapsulation, inheritance, abstraction, polymorphism, and modularity.

## Overview

The main purpose of CRS is to support students in improving their academic standing without unnecessarily delaying graduation. The system allows administrators to manage users, track failed components, create recovery plans, check eligibility for progression, and generate academic performance reports. It may also support automated email notifications for reminders and updates.

## Target Users

- Academic Officer
- Course Administrator

## Main Features

### 1. User Management
- Add, update, and deactivate user accounts
- Authentication and authorization
- Login and logout tracking
- Role-based access control
- Password reset and recovery

### 2. Course Recovery Plan
- List failed course components for a student
- Add, update, and remove recovery recommendations
- Create milestones and action plans
- Track recovery progress
- Record grading and evaluation progress

### 3. Eligibility Check and Enrolment
- Check whether students are eligible to progress to the next level of study
- Identify students with:
  - CGPA below 2.0
  - More than three failed courses
- Allow registration and enrolment after eligibility is confirmed

### 4. Academic Performance Reporting
- Generate student academic performance reports
- Organize reports by semester and year of study
- Export reports to PDF

### 5. Email Notifications
- Send alerts and reminders to users
- Notify users regarding:
  - User account management
  - Password recovery
  - Course recovery plans and milestones
  - Academic performance reports

## Technologies Used

- **Language:** Java
- **Programming Approach:** Object-Oriented Programming (OOP)
- **Interface:** GUI-driven application
- **Storage:** Text files or binary files
- **Third-Party APIs:**
  - Java Mail API
  - iText PDF

## Object-Oriented Concepts Applied

This system is designed to demonstrate practical use of OOP concepts, including:

- **Encapsulation** for secure data handling
- **Abstraction** for simplifying system design
- **Inheritance** for reusing common behaviors
- **Polymorphism** for flexible method implementation
- **Modularity** for organized class and package design

## Suggested Modules / Classes

Depending on your implementation, the project may include classes such as:

- `User`
- `Student`
- `AcademicOfficer`
- `CourseAdministrator`
- `Course`
- `RecoveryPlan`
- `Milestone`
- `EligibilityChecker`
- `AcademicReport`
- `EmailService`
- `AuthenticationManager`

## Business Rules

- Each course has a maximum of **three attempts** to pass
- The **second attempt** may involve resubmission or resit for failed components
- If the student fails both the first and second attempts, the **third attempt** requires referring to all assessment components
- Students may progress only if:
  - **CGPA is at least 2.0**
  - They have **not more than three failed courses**

## General Requirements

- The program must compile and run without errors
- Input validation should be included to avoid logical errors
- The system must demonstrate OOP concepts clearly
- Data access and manipulation should use **text or binary files only**

## Possible Project Structure

```bash
src/
├── model/
├── service/
├── ui/
├── util/
└── main/
