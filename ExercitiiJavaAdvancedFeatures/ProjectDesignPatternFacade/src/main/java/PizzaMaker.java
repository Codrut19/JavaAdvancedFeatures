public class PizzaMaker {



    public void makePizzaQuatroStagioni (){
        Pizza pizzaQuatroStagioni = new PizzaQuatroStagioni();
        pizzaQuatroStagioni.cook();
    }
    public void makePizzaQuatroFormaggio (){
        Pizza pizzaQuatroFormaggio = new PizzaQuatroFormaggio();
        pizzaQuatroFormaggio.cook();
    }
    public void makePizzaCasei (){
        Pizza pizzaCasei = new PizzaCasei();
        pizzaCasei.cook();

    }
    public void makePizzaVegetariana(){
        Pizza pizzaVegetariana = new PizzaVegetariana();
        pizzaVegetariana.cook();
    }
}
