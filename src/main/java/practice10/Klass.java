package practice10;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> studentList = new ArrayList<>();
    public Klass(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName(){
        return "Class " + this.number;
    }

    public void assignLeader(Student student){
        if(studentList.contains(student)){ this.leader = student;}
        else{
            System.setOut(System.out.append("It is not one of us.\n"));
        }
    }

    public Student getLeader(){
        return this.leader;
    }

    public void appendMember(Student student){
        studentList.add(student);
    }
}
