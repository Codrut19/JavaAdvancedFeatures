import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Facem un meniu cu 6 optiuni

        System.out.println("Meniul");
        System.out.println("Tasta 1 este triunghi");
        System.out.println("Tasta 2 este cerc");
        System.out.println("Tasta 3 este dreptunghi");
        System.out.println("Tasta 4 este triunghi cu border");
        System.out.println("Tasta 5 este cerc cu border");
        System.out.println("Tasta 6 este dreptunghi cu border");
        Scanner scanner = new Scanner(System.in);
        int optiune = scanner.nextInt();
        if(optiune == 1){
            Shape triunghi = new Triangle();
            triunghi.draw();
        }
        if(optiune == 2){
            Shape cerc = new Circle();
            cerc.draw();
        }
        if(optiune == 3){
            Shape dreptunghi = new Rectangle();
            dreptunghi.draw();
        }
        if(optiune == 4){
            Shape triunghi2 = new Triangle();
            ShapeDecorator triunghiCuBorder = new TriangleDecorator(triunghi2);
            triunghiCuBorder.draw();
        }
        if(optiune == 5){
            Shape cerc2 = new Circle();
            ShapeDecorator cercCuBorder = new CircleDecorator(cerc2);
            cercCuBorder.draw();
        }
        if(optiune == 6 ){
            Shape dreptunghi2 = new Rectangle();
            ShapeDecorator dreptunghiCuBorder = new RectangleDecorator(dreptunghi2);
            dreptunghiCuBorder.draw();
        }

    }
}
