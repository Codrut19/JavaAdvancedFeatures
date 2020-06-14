import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Aici afisam meniul");
        System.out.println("1 Pizza QuatroStagioni");
        System.out.println("2 Pizza QuatroFormaggio");
        System.out.println("3 Pizza Casei");
        System.out.println("4 Pizza Vegetariana");
        PizzaMaker pizzaMaker = new PizzaMaker();
        Scanner scanner = new Scanner(System.in);
        int optiune = scanner.nextInt();
        if(optiune == 1 ){
            pizzaMaker.makePizzaQuatroStagioni();
        }
        if(optiune == 2 ){
            pizzaMaker.makePizzaQuatroFormaggio();
        }
        if(optiune == 3 ){
            pizzaMaker.makePizzaCasei();
        }
        if(optiune == 4 ){
            pizzaMaker.makePizzaVegetariana();
        }
    }
}
