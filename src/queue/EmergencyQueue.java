package queue;

import model.Patient;

public class EmergencyQueue {

    private class QueueNode {

        Patient patient;
        QueueNode next;

        QueueNode(Patient patient) {
            this.patient = patient;
            this.next = null;
        }
    }

    private QueueNode front;
    private QueueNode rear;

    public EmergencyQueue() {
        front = null;
        rear = null;
    }

    // ENQUEUE
    public void enqueue(Patient patient) {

        QueueNode newNode = new QueueNode(patient);

        if (rear == null) {

            front = newNode;
            rear = newNode;

        } else {

            rear.next = newNode;
            rear = newNode;
        }

        System.out.println("Patient added to emergency queue!");
    }

    // DEQUEUE
    public Patient dequeue() {

        if (front == null) {

            System.out.println("Emergency queue is empty!");
            return null;
        }

        Patient patient = front.patient;

        front = front.next;

        if (front == null) {
            rear = null;
        }

        return patient;
    }

    // DISPLAY
    public void displayQueue() {

        if (front == null) {

            System.out.println("Emergency queue is empty!");
            return;
        }

        System.out.println("\n--- EMERGENCY PATIENT QUEUE ---");

        QueueNode current = front;

        while (current != null) {

            System.out.println(
                    "Patient ID: "
                            + current.patient.getPatientId()
                            + " | Name: "
                            + current.patient.getName()
            );

            current = current.next;
        }
    }

    // CHECK EMPTY
    public boolean isEmpty() {
        return front == null;
    }
}
