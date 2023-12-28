package DesignPatterns.Prototype;

public class Client {
    public static void fillRegistry(StudentRegistry studentRegistry){
        Student aprBatch21Stud = new Student();
        aprBatch21Stud.setBatch("April 21");
        aprBatch21Stud.setAvgBatchPsp(80.3);

        studentRegistry.register("apr21", aprBatch21Stud);
    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student s1 = studentRegistry.get("apr21").clone(); //dosent voilets OCP and SCP
    }
}
