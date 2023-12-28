package DesignPatterns.Prototype;

public class IntelligentStudent extends Student{
    private int iq;
    public IntelligentStudent() {

    }

    public IntelligentStudent(IntelligentStudent s) {
        super(s);
        this.iq = s.iq;
    }

    @Override
    public IntelligentStudent clone() {
//        IntelligentStudent intelligentStudent = new IntelligentStudent();
//        intelligentStudent.iq = this.iq;
//        intelligentStudent.setAge(this.getAge()); //issue no 3 resolved before removing getters

        //Copy constructor
        return new IntelligentStudent(this);
    }
}
