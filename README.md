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

A Binary Search Tree is used to store patient records using the Patient ID as the key.

Operations implemented:

- Insert a new patient
- Search for a patient
- Delete a patient
- In-order traversal

Patient information includes:

- Patient ID
- Patient Name
- Age
- Contact Number
- Medical Condition

### 2. Queue - Emergency Patient Queue

A Queue is used to manage patients arriving at the emergency unit.

The Queue follows the FIFO (First-In, First-Out) principle.

Operations implemented:

- Enqueue
- Dequeue
- Display waiting patients
- Empty queue handling

### 3. Stack - Treatment History

A Stack is used to store completed treatment records.

The Stack follows the LIFO (Last-In, First-Out) principle.

Operations implemented:

- Push
- Pop
- Display treatment records
- Empty stack handling

### 4. Singly Linked List - Patient Visit History

A Singly Linked List is used to manage previous patient visits.

Operations implemented:

- Add a visit
- Remove a visit
- Search for a visit
- Display visit history

Each visit contains:

- Visit ID
- Visit Date
- Doctor Name
- Diagnosis
- Treatment

---

## Project Structure

```text
MiniHospitalSystem
│
├── README.md
│
└── src
    ├── Main.java
    │
    ├── bst
    │   ├── PatientBST.java
    │   └── PatientNode.java
    │
    ├── linkedlist
    │   └── VisitLinkedList.java
    │
    ├── model
    │   ├── Patient.java
    │   ├── TreatmentRecord.java
    │   └── Visit.java
    │
    ├── queue
    │   └── EmergencyQueue.java
    │
    └── stack
        └── TreatmentStack.java