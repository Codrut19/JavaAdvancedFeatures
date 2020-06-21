import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        //Inventar: Avem nevoie de 3 fisiere
        //          Avem nevoie de urmatoarele clase : clasa abstracta Produs - contine nume, pret si cantitate
        // clasa VendingMachine - folosim singleton
        //                                          // clasa ProductFactory - folosim FactoryMethod
        // clasele Bauturi, Cafea, Snack mostenesc clasa Produs
        //                                          // clasele Cola, Fanta si Apa -mostenesc Bauturi
        //                                             clasele Cappucino, Americano, Espresoo - mostenesc Cafea
        // clasele Croissant, Chips si ChocolateBar - mostenesc Snack
        // exceptiile: AmountNotAcceptedException -daca numarul introdus este 0
        //                                                         NotEnoughMoneyException - daca nu are destui bani pentru prod selectate
        //                                                         NotEnoughQuantityException - daca nu exista cantitatea dorita

        try {
            String pathDrinks = "C:\\Users\\codru\\RepositoryCursJavaGalati\\FisierDrinks.txt";
            String pathCoffees = "C:\\Users\\codru\\RepositoryCursJavaGalati\\FisierCoffees.txt";
            String pathSnacks = "C:\\Users\\codru\\RepositoryCursJavaGalati\\FisierSnacks.txt";

            FileReader fileReaderDrinks = new FileReader(pathDrinks);
            FileReader fileReaderCoffees = new FileReader(pathCoffees);
            FileReader fileReaderSnacks = new FileReader(pathSnacks);

            BufferedReader bufferedReaderDrinks = new BufferedReader(fileReaderDrinks);
            BufferedReader bufferedReaderCoffees = new BufferedReader(fileReaderCoffees);
            BufferedReader bufferedReaderSnacks = new BufferedReader(fileReaderSnacks);

            String text = bufferedReaderDrinks.readLine();
            VendingMachine vendingMachine = VendingMachine.getInstance();
            while (text != null && !text.isEmpty()) {
                String[] arrayCunvinte = text.split(";");
                if (arrayCunvinte[0].equals("Cola")) {
                    Cola cola = new Cola(arrayCunvinte[0], Integer.valueOf(arrayCunvinte[1]), Integer.valueOf(arrayCunvinte[2]));
                    vendingMachine.setColaProduct(cola);
                }
                if (arrayCunvinte[0].equals("Fanta")) {
                    Fanta fanta = new Fanta(arrayCunvinte[0], Integer.valueOf(arrayCunvinte[1]), Integer.valueOf(arrayCunvinte[2]));
                    vendingMachine.setFantaProduct(fanta);
                }
                if (arrayCunvinte[0].equals("Water")) {
                    Water water = new Water(arrayCunvinte[0], Integer.valueOf(arrayCunvinte[1]), Integer.valueOf(arrayCunvinte[2]));
                    vendingMachine.setWaterProduct(water);
                }


                text = bufferedReaderDrinks.readLine();


            }
            String text2 = bufferedReaderCoffees.readLine();
            while (text2 != null && !text2.isEmpty()) {
                String[] arrayCuvinte = text2.split(";");
                if (arrayCuvinte[0].equals("Cappucino")) {
                    Cappucino cappucino = new Cappucino(arrayCuvinte[0], Integer.valueOf(arrayCuvinte[1]), Integer.valueOf(arrayCuvinte[2]));
                    vendingMachine.setCappucinoProduct(cappucino);
                }
                if (arrayCuvinte[0].equals("Americano")) {
                    Americano americano = new Americano(arrayCuvinte[0], Integer.valueOf(arrayCuvinte[1]), Integer.valueOf(arrayCuvinte[2]));
                    vendingMachine.setAmericanoProduct(americano);
                }
                if (arrayCuvinte[0].equals("Espresso")) {
                    Espresso espresso = new Espresso(arrayCuvinte[0], Integer.valueOf(arrayCuvinte[1]), Integer.valueOf(arrayCuvinte[2]));
                    vendingMachine.setEspressoProduct(espresso);
                }
                text2 = bufferedReaderCoffees.readLine();

            }
            String text3 = bufferedReaderSnacks.readLine();
            while(text3 != null && !text3.isEmpty()){
                String[] arrayCuvinte = text3.split(";");
                if(arrayCuvinte[0].equals("Croissant")){
                    Croissant croissant = new Croissant(arrayCuvinte[0],Integer.valueOf(arrayCuvinte[1]),Integer.valueOf(arrayCuvinte[2]));
                    vendingMachine.setCroissantProduct(croissant);
                }
                if(arrayCuvinte[0].equals("Chips")){
                    Chips chips = new Chips(arrayCuvinte[0],Integer.valueOf(arrayCuvinte[1]),Integer.valueOf(arrayCuvinte[2]));
                    vendingMachine.setChipsProduct(chips);
                }
                if(arrayCuvinte[0].equals("ChocolateBar")){
                    ChocolateBar chocolateBar = new ChocolateBar(arrayCuvinte[0],Integer.valueOf(arrayCuvinte[1]),Integer.valueOf(arrayCuvinte[2]));
                    vendingMachine.setChocolateBarProduct(chocolateBar);
                }
                text3 = bufferedReaderSnacks.readLine();
            }
            System.out.println("Afisam cantitatea de cola " + vendingMachine.getColaProduct().getProductQuantity());
            System.out.println("Afisam cantitatea de fanta " + vendingMachine.getFantaProduct().getProductQuantity());
            System.out.println("Afisam cantitatea de apa " + vendingMachine.getWaterProduct().getProductQuantity());
            System.out.println("Afisam cantitatea de cappucino " + vendingMachine.getCappucinoProduct().getProductQuantity());
            System.out.println("Afisam cantitatea de americano " + vendingMachine.getAmericanoProduct().getProductQuantity());
            System.out.println("Afisam cantitatea de espresso " + vendingMachine.getEspressoProduct().getProductQuantity());
            System.out.println("Afisam cantitatea de croissant " + vendingMachine.getCroissantProduct().getProductQuantity());
            System.out.println("Afisam cantitatea de chips " + vendingMachine.getChipsProduct().getProductQuantity());
            System.out.println("Afisam cantitatea de chocolate bar " + vendingMachine.getChocolateBarProduct().getProductQuantity());


        /*} catch (AmountNotAcceptedException e) {
            System.out.println("Suma introdusa este 0 " + e.getMessage());
        } catch (NotEnoughMoneyException e) {
            System.out.println("Va rugam introduceti mai multi bani " + e.getMessage());
        } catch (NotEnoughQuantityException e) {
            System.out.println("Produsul/Produsele pe care doriti sa le cumparati s-au terminat " + e.getMessage());*/
        } catch (FileNotFoundException e) {
            System.out.println("Nu s a gasit fisierul " + e.getMessage());
        } catch (IOException e) {
            System.out.println("A aparut o exceptie " + e.getMessage());
        }
    }
}