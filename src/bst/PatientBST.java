package bst;

import model.Patient;

public class PatientBST {

    private PatientNode root;

    public PatientBST() {
        root = null;
    }

    // INSERT
    public void insert(Patient patient) {
        root = insertRecursive(root, patient);
    }

    private PatientNode insertRecursive(PatientNode root, Patient patient) {

        if (root == null) {
            return new PatientNode(patient);
        }

        if (patient.getPatientId() < root.patient.getPatientId()) {
            root.left = insertRecursive(root.left, patient);

        } else if (patient.getPatientId() > root.patient.getPatientId()) {
            root.right = insertRecursive(root.right, patient);

        } else {
            System.out.println("Patient ID already exists!");
        }

        return root;
    }

    // SEARCH
    public Patient search(int patientId) {

        PatientNode result = searchRecursive(root, patientId);

        if (result == null) {
            return null;
        }

        return result.patient;
    }

    private PatientNode searchRecursive(PatientNode root, int patientId) {

        if (root == null || root.patient.getPatientId() == patientId) {
            return root;
        }

        if (patientId < root.patient.getPatientId()) {
            return searchRecursive(root.left, patientId);
        }

        return searchRecursive(root.right, patientId);
    }

    // DELETE
    public void delete(int patientId) {
        root = deleteRecursive(root, patientId);
    }

    private PatientNode deleteRecursive(PatientNode root, int patientId) {

        if (root == null) {
            System.out.println("Patient not found!");
            return null;
        }

        if (patientId < root.patient.getPatientId()) {

            root.left = deleteRecursive(root.left, patientId);

        } else if (patientId > root.patient.getPatientId()) {

            root.right = deleteRecursive(root.right, patientId);

        } else {

            // Case 1: No child
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: One right child
            if (root.left == null) {
                return root.right;
            }

            // Case 3: One left child
            if (root.right == null) {
                return root.left;
            }

            // Case 4: Two children
            PatientNode smallest = findMin(root.right);

            root.patient = smallest.patient;

            root.right = deleteRecursive(
                    root.right,
                    smallest.patient.getPatientId()
            );
        }

        return root;
    }

    private PatientNode findMin(PatientNode root) {

        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    // IN-ORDER TRAVERSAL
    public void displayInOrder() {

        if (root == null) {
            System.out.println("No patients available!");
            return;
        }

        System.out.println("\n--- PATIENTS IN ASCENDING ORDER ---");

        inOrderRecursive(root);
    }

    private void inOrderRecursive(PatientNode root) {

        if (root != null) {

            inOrderRecursive(root.left);

            System.out.println(root.patient);
            System.out.println("--------------------");

            inOrderRecursive(root.right);
        }
    }
}