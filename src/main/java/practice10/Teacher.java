package practice10;

import java.util.LinkedList;

public class Teacher extends Person{
    private LinkedList<Klass> linkedList = new LinkedList<Klass>();
    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> linkedList) {
        super(id, name, age);
        this.linkedList = linkedList;
    }

    @Override
    public String introduce() {
        StringBuilder response = new StringBuilder();
        response.append(super.introduce() + " I am a Teacher.");
        if(this.linkedList.size() > 0){
            response.append(" I teach Class");
            linkedList.forEach(c -> {
                response.append(" " + c.getNumber());
                response.append(",");
            });
            response.deleteCharAt(response.length()-1);
            response.append(".");
        }
        else {
            response.append(" I teach No Class.");
        }
        return response.toString();
    }

    public String introduceWith(Student student){
        if(linkedList.contains(student.getKlass())){
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        }
        return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
    }

    public LinkedList<Klass> getClasses() {
        return linkedList;
    }

    public boolean isTeaching(Student student){
        if(linkedList.contains(student.getKlass())){
            return true;
        }
        return false;
    }
}
