package practice08;

public class Student extends Person{
    private Klass klass;
    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if(this.klass.getLeader() != null && this.getId() == this.klass.getLeader().getId()){
            return super.introduce() + " I am a Student. I am Leader of Class " + this.klass.getNumber() + ".";
        }
        return super.introduce() + " I am a Student. I am at Class " + this.klass.getNumber() + ".";
    }
}