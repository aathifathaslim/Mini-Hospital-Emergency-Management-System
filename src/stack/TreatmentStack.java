package stack;

import model.TreatmentRecord;

public class TreatmentStack {

    private class StackNode {

        TreatmentRecord record;
        StackNode next;

        StackNode(TreatmentRecord record) {

            this.record = record;
            this.next = null;
        }
    }

    private StackNode top;

    public TreatmentStack() {
        top = null;
    }

    // PUSH
    public void push(TreatmentRecord record) {

        StackNode newNode =
                new StackNode(record);

        newNode.next = top;

        top = newNode;

        System.out.println(
                "Treatment record added successfully!"
        );
    }

    // POP
    public TreatmentRecord pop() {

        if (top == null) {

            System.out.println(
                    "Treatment history is empty!"
            );

            return null;
        }

        TreatmentRecord record =
                top.record;

        top = top.next;

        return record;
    }

    // DISPLAY
    public void display() {

        if (top == null) {

            System.out.println(
                    "Treatment history is empty!"
            );

            return;
        }

        System.out.println(
                "\n--- TREATMENT HISTORY ---"
        );

        StackNode current = top;

        while (current != null) {

            System.out.println(current.record);

            System.out.println(
                    "--------------------"
            );

            current = current.next;
        }
    }

    // CHECK EMPTY
    public boolean isEmpty() {
        return top == null;
    }
}