public class Trainee extends Person{
    private boolean knowPrograming;

    public Trainee(String name,String surname,int age,boolean knowPrograming){
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.knowPrograming=knowPrograming;
    }

    public boolean isKnowPrograming() {
        return knowPrograming;
    }
    public String toString(){
        return this.name + " " + this.surname + " " + this.age + " " + this.knowPrograming;
    }
    public int getAge(){
        return age;
    }
}
