package linkedlist;

import model.Visit;

public class VisitLinkedList {

    private class VisitNode {

        Visit visit;
        VisitNode next;

        VisitNode(Visit visit) {

            this.visit = visit;
            this.next = null;
        }
    }

    private VisitNode head;

    public VisitLinkedList() {
        head = null;
    }

    // ADD VISIT
    public void addVisit(Visit visit) {

        VisitNode newNode =
                new VisitNode(visit);

        if (head == null) {

            head = newNode;

        } else {

            VisitNode current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        System.out.println(
                "Visit added successfully!"
        );
    }

    // REMOVE VISIT
    public void removeVisit(int visitId) {

        if (head == null) {

            System.out.println(
                    "Visit history is empty!"
            );

            return;
        }

        if (head.visit.getVisitId() == visitId) {

            head = head.next;

            System.out.println(
                    "Visit removed successfully!"
            );

            return;
        }

        VisitNode current = head;

        while (
                current.next != null &&
                current.next.visit.getVisitId() != visitId
        ) {

            current = current.next;
        }

        if (current.next == null) {

            System.out.println(
                    "Visit not found!"
            );

        } else {

            current.next = current.next.next;

            System.out.println(
                    "Visit removed successfully!"
            );
        }
    }

    // SEARCH VISIT
    public Visit searchVisit(int visitId) {

        VisitNode current = head;

        while (current != null) {

            if (
                    current.visit.getVisitId()
                            == visitId
            ) {

                return current.visit;
            }

            current = current.next;
        }

        return null;
    }

    // DISPLAY VISITS
    public void displayVisits() {

        if (head == null) {

            System.out.println(
                    "No visit history available!"
            );

            return;
        }

        System.out.println(
                "\n--- PATIENT VISIT HISTORY ---"
        );

        VisitNode current = head;

        while (current != null) {

            System.out.println(current.visit);

            System.out.println(
                    "--------------------"
            );

            current = current.next;
        }
    }
}
