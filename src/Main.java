import bst.PatientBST;
import linkedlist.VisitLinkedList;
import model.Patient;
import model.TreatmentRecord;
import model.Visit;
import queue.EmergencyQueue;
import stack.TreatmentStack;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static PatientBST patientBST =
            new PatientBST();

    static EmergencyQueue emergencyQueue =
            new EmergencyQueue();

    static TreatmentStack treatmentStack =
            new TreatmentStack();

    static VisitLinkedList visitHistory =
            new VisitLinkedList();


    public static void main(String[] args) {

        int choice;

        do {

            System.out.println(
                    "\n======================================"
            );

            System.out.println(
                    " MINI HOSPITAL EMERGENCY MANAGEMENT"
            );

            System.out.println(
                    "======================================"
            );

            System.out.println(
                    "1. Patient Records"
            );

            System.out.println(
                    "2. Emergency Patient Queue"
            );

            System.out.println(
                    "3. Treatment History"
            );

            System.out.println(
                    "4. Patient Visit History"
            );

            System.out.println(
                    "5. Exit"
            );

            System.out.print(
                    "Enter your choice: "
            );

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    patientMenu();
                    break;

                case 2:
                    emergencyMenu();
                    break;

                case 3:
                    treatmentMenu();
                    break;

                case 4:
                    visitMenu();
                    break;

                case 5:
                    System.out.println(
                            "Thank you!"
                    );
                    break;

                default:
                    System.out.println(
                            "Invalid choice!"
                    );
            }

        } while (choice != 5);
    }


    // =============================
    // PATIENT MENU
    // =============================

    public static void patientMenu() {

        int choice;

        do {

            System.out.println(
                    "\n--- PATIENT RECORDS ---"
            );

            System.out.println(
                    "1. Add Patient"
            );

            System.out.println(
                    "2. Search Patient"
            );

            System.out.println(
                    "3. Delete Patient"
            );

            System.out.println(
                    "4. Display All Patients"
            );

            System.out.println(
                    "5. Back"
            );

            System.out.print(
                    "Enter choice: "
            );

            choice = scanner.nextInt();

            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.print(
                            "Patient ID: "
                    );

                    int id = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print(
                            "Patient Name: "
                    );

                    String name =
                            scanner.nextLine();

                    System.out.print(
                            "Age: "
                    );

                    int age =
                            scanner.nextInt();

                    scanner.nextLine();

                    System.out.print(
                            "Contact Number: "
                    );

                    String contact =
                            scanner.nextLine();

                    System.out.print(
                            "Medical Condition: "
                    );

                    String condition =
                            scanner.nextLine();

                    Patient patient =
                            new Patient(
                                    id,
                                    name,
                                    age,
                                    contact,
                                    condition
                            );

                    patientBST.insert(patient);

                    System.out.println(
                            "Patient added successfully!"
                    );

                    break;


                case 2:

                    System.out.print(
                            "Enter Patient ID: "
                    );

                    int searchId =
                            scanner.nextInt();

                    Patient found =
                            patientBST.search(searchId);

                    if (found != null) {

                        System.out.println(
                                "\nPatient Found:"
                        );

                        System.out.println(found);

                    } else {

                        System.out.println(
                                "Patient not found!"
                        );
                    }

                    break;


                case 3:

                    System.out.print(
                            "Enter Patient ID: "
                    );

                    int deleteId =
                            scanner.nextInt();

                    patientBST.delete(deleteId);

                    System.out.println(
                            "Delete operation completed."
                    );

                    break;


                case 4:

                    patientBST.displayInOrder();

                    break;
            }

        } while (choice != 5);
    }


    // =============================
    // EMERGENCY QUEUE
    // =============================

    public static void emergencyMenu() {

        int choice;

        do {

            System.out.println(
                    "\n--- EMERGENCY QUEUE ---"
            );

            System.out.println(
                    "1. Add Patient to Queue"
            );

            System.out.println(
                    "2. Treat Next Patient"
            );

            System.out.println(
                    "3. Display Waiting Patients"
            );

            System.out.println(
                    "4. Back"
            );

            System.out.print(
                    "Enter choice: "
            );

            choice =
                    scanner.nextInt();

            switch (choice) {

                case 1:

                    System.out.print(
                            "Enter Patient ID: "
                    );

                    int patientId =
                            scanner.nextInt();

                    Patient patient =
                            patientBST.search(patientId);

                    if (patient != null) {

                        emergencyQueue.enqueue(patient);

                    } else {

                        System.out.println(
                                "Patient not found in records!"
                        );
                    }

                    break;


                case 2:

                    Patient nextPatient =
                            emergencyQueue.dequeue();

                    if (nextPatient != null) {

                        System.out.println(
                                "\nNow Treating:"
                        );

                        System.out.println(
                                nextPatient
                        );
                    }

                    break;


                case 3:

                    emergencyQueue.displayQueue();

                    break;
            }

        } while (choice != 4);
    }


    // =============================
    // TREATMENT STACK
    // =============================

    public static void treatmentMenu() {

        int choice;

        do {

            System.out.println(
                    "\n--- TREATMENT HISTORY ---"
            );

            System.out.println(
                    "1. Add Completed Treatment"
            );

            System.out.println(
                    "2. Remove Latest Treatment"
            );

            System.out.println(
                    "3. Display Treatment History"
            );

            System.out.println(
                    "4. Back"
            );

            System.out.print(
                    "Enter choice: "
            );

            choice =
                    scanner.nextInt();

            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.print(
                            "Patient ID: "
                    );

                    int id =
                            scanner.nextInt();

                    scanner.nextLine();

                    System.out.print(
                            "Patient Name: "
                    );

                    String name =
                            scanner.nextLine();

                    System.out.print(
                            "Treatment Details: "
                    );

                    String treatment =
                            scanner.nextLine();

                    TreatmentRecord record =
                            new TreatmentRecord(
                                    id,
                                    name,
                                    treatment
                            );

                    treatmentStack.push(record);

                    break;


                case 2:

                    TreatmentRecord removed =
                            treatmentStack.pop();

                    if (removed != null) {

                        System.out.println(
                                "\nRemoved Latest Treatment:"
                        );

                        System.out.println(
                                removed
                        );
                    }

                    break;


                case 3:

                    treatmentStack.display();

                    break;
            }

        } while (choice != 4);
    }


    // =============================
    // VISIT HISTORY
    // =============================

    public static void visitMenu() {

        int choice;

        do {

            System.out.println(
                    "\n--- PATIENT VISIT HISTORY ---"
            );

            System.out.println(
                    "1. Add Visit"
            );

            System.out.println(
                    "2. Remove Visit"
            );

            System.out.println(
                    "3. Search Visit"
            );

            System.out.println(
                    "4. Display Visit History"
            );

            System.out.println(
                    "5. Back"
            );

            System.out.print(
                    "Enter choice: "
            );

            choice =
                    scanner.nextInt();

            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.print(
                            "Visit ID: "
                    );

                    int visitId =
                            scanner.nextInt();

                    scanner.nextLine();

                    System.out.print(
                            "Visit Date: "
                    );

                    String date =
                            scanner.nextLine();

                    System.out.print(
                            "Doctor Name: "
                    );

                    String doctor =
                            scanner.nextLine();

                    System.out.print(
                            "Diagnosis: "
                    );

                    String diagnosis =
                            scanner.nextLine();

                    System.out.print(
                            "Treatment: "
                    );

                    String treatment =
                            scanner.nextLine();

                    Visit visit =
                            new Visit(
                                    visitId,
                                    date,
                                    doctor,
                                    diagnosis,
                                    treatment
                            );

                    visitHistory.addVisit(visit);

                    break;


                case 2:

                    System.out.print(
                            "Enter Visit ID: "
                    );

                    int removeId =
                            scanner.nextInt();

                    visitHistory.removeVisit(
                            removeId
                    );

                    break;


                case 3:

                    System.out.print(
                            "Enter Visit ID: "
                    );

                    int searchId =
                            scanner.nextInt();

                    Visit found =
                            visitHistory.searchVisit(
                                    searchId
                            );

                    if (found != null) {

                        System.out.println(
                                "\nVisit Found:"
                        );

                        System.out.println(
                                found
                        );

                    } else {

                        System.out.println(
                                "Visit not found!"
                        );
                    }

                    break;


                case 4:

                    visitHistory.displayVisits();

                    break;
            }

        } while (choice != 5);
    }
}