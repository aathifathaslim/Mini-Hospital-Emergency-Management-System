# Mini Hospital Emergency Management System 
 
## CIT300 - Data Structures and Algorithms 
 
### Individual Mid Assignment 
 
--- 
 
## Project Description 
 
The Mini Hospital Emergency Management System is a Java-based console application developed to manage basic hospital emergency operations using different data structures. 
 
The system manages: 
 
- Patient records 
- Emergency patient waiting queue 
- Completed treatment history 
- Patient visit history 
 
This project demonstrates the practical implementation of different data structures in Java. 
 
--- 
 
## Data Structures Used 
 
### 1. Binary Search Tree (BST) - Patient Records 
 
A Binary Search Tree is used to store and manage patient records using the Patient ID as the key. 
 
Each patient record contains: 
 
- Patient ID 
- Patient Name 
- Age 
- Contact Number 
- Medical Condition 
 
#### Operations 
 
- Insert a new patient 
- Search for a patient by Patient ID 
- Delete a patient by Patient ID 
- Display all patients in ascending order of Patient ID 
 
The in-order traversal of the Binary Search Tree displays patient records in ascending order of Patient ID. 
 
--- 
 
### 2. Queue - Emergency Patient Queue 
 
A Queue is used to manage patients waiting for emergency treatment. 
 
The queue follows the **FIFO (First In, First Out)** principle. 
 
#### Operations 
 
- Add a patient to the queue (Enqueue) 
- Remove the next patient from the queue (Dequeue) 
- Display waiting patients 
- Handle an empty queue 
 
The first patient added to the emergency queue is the first patient to be treated. 
 
--- 
 
### 3. Stack - Treatment History 
 
A Stack is used to store completed treatment records. 
 
The stack follows the **LIFO (Last In, First Out)** principle. 
 
#### Operations 
 
- Add a completed treatment record (Push) 
- Remove the most recent treatment record (Pop) 
- Display treatment history 
- Handle an empty stack 
 
The most recently completed treatment is accessed first. 
 
--- 
 
### 4. Singly Linked List - Patient Visit History 
 
A Singly Linked List is used to maintain the visit history of patients. 
 
Each visit record contains: 
 
- Visit ID 
- Visit Date 
- Doctor 
- Diagnosis 
- Treatment 
 
#### Operations 
 
- Add a visit record 
- Remove a visit record 
- Search for a visit 
- Display visit history 
 
--- 
 
## Project Structure 
 
```text 
MiniHospitalSystem/ 
│ 
├── src/ 
│   ├── Main.java 
│   │ 
│   ├── bst/ 
│   │   ├── PatientBST.java 
│   │   └── PatientNode.java 
│   │ 
│   ├── linkedlist/ 
│   │   └── VisitLinkedList.java 
│   │ 
│   ├── model/ 
│   │   ├── Patient.java 
│   │   ├── TreatmentRecord.java 
│   │   └── Visit.java 
│   │ 
│   ├── queue/ 
│   │   └── EmergencyQueue.java 
│   │ 
│   └── stack/ 
│       └── TreatmentStack.java 
│ 
├── README.md 
└── .gitignore
```
---

## System Features                                                                                                                                                                                                                                                         
 
The system provides the following main features: 
 
- Add, search, delete, and display patient records 
- Manage emergency patients using a FIFO queue 
- Store and manage treatment records using a LIFO stack 
- Maintain patient visit history using a singly linked list 
- Handle empty data structures appropriately 
 
--- 
 
## How to Run 
 
1. Open the project in Eclipse. 
2. Make sure all Java source files are inside the `src` folder. 
3. Run `Main.java`. 
4. Select the required option from the main menu. 
5. Perform the required operations for each data structure. 
 
--- 
 
## Testing and Evidence 
 
The system was tested by running the application in Eclipse. 
 
Testing was carried out for: 
 
- Patient record operations using the Binary Search Tree 
- Emergency patient operations using the Queue 
- Treatment history operations using the Stack 
- Patient visit history operations using the Singly Linked List 
- Empty data structure handling 
 
Screenshots of the executed operations were taken as evidence of testing. 
 
--- 
 
## Technologies Used 
 
- Java 
- Eclipse IDE 
- Git 
- GitHub 
 
--- 
 
## Author 
 
Name: Aathifa Thaslim   
Student ID: 23Da2-0916 
 
--- 
 
## Assignment 
 
Module: CIT300 - Data Structures and Algorithms   
Assessment: Individual Mid Assignment