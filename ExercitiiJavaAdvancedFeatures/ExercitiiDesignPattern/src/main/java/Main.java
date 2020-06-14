public class Main {
    public static void main(String[] args) {
        //Inventar
        //Familia va avea 7 membrii
        //Vom avea o clasa family - aplicam singleton
        //Vom avea o clasa abstracta Person
        //Vom avea o clasa Mom - singleton
        //Vom avea o clasa Dad - singleton
        //Vom avea o clasa kid
        //Vom avea o clasa Son si una Daughter

        Family family = Family.getInstance();
        Mom mom = Mom.getInstance();
        Dad dad = Dad.getInstance();
        Kid son1 = new Son("Popescu","George","13");
        Kid son2 = new Son("Popescu", "Viorel", "15");
        Kid son3 = new Son("Popescu","Mihai","8");
        Kid daughter1 = new Daughter("Popescu","Gabriela","11");
        Kid daughter2 = new Daughter("Popescu","Mirela", "17");

        family.getFamilyMembers().add(mom);
        family.getFamilyMembers().add(dad);
        family.getFamilyMembers().add(son1);
        family.getFamilyMembers().add(son2);
        family.getFamilyMembers().add(son3);
        family.getFamilyMembers().add(daughter1);
        family.getFamilyMembers().add(daughter2);
        System.out.println("Aici afisam membrii familiei");
        for(Person person : family.getFamilyMembers() ){
            System.out.println(person.toString());
        }
    }
}
