public class VendingMachine {

    private Cola colaProduct;
    private Fanta fantaProduct;
    private Water waterProduct;
    private Cappucino cappucinoProduct;
    private Americano americanoProduct;
    private Espresso espressoProduct;
    private Croissant croissantProduct;
    private Chips chipsProduct;
    private ChocolateBar chocolateBarProduct;



    private static VendingMachine instance = new VendingMachine();


    private VendingMachine(){

    }

    public static VendingMachine getInstance() {
        return instance;
    }

    public Cola getColaProduct() {
        return colaProduct;
    }

    public Fanta getFantaProduct() {
        return fantaProduct;
    }
    public Water getWaterProduct(){
        return waterProduct;
    }

    public Cappucino getCappucinoProduct() {
        return cappucinoProduct;
    }

    public Americano getAmericanoProduct() {
        return americanoProduct;
    }

    public Espresso getEspressoProduct() {
        return espressoProduct;
    }

    public Croissant getCroissantProduct() {
        return croissantProduct;
    }

    public Chips getChipsProduct() {
        return chipsProduct;
    }

    public ChocolateBar getChocolateBarProduct() {
        return chocolateBarProduct;
    }

    public void setColaProduct(Cola colaProduct) {
        this.colaProduct = colaProduct;
    }

    public void setFantaProduct(Fanta fantaProduct) {
        this.fantaProduct = fantaProduct;
    }

    public void setWaterProduct(Water waterProduct) {
        this.waterProduct = waterProduct;
    }

    public void setCappucinoProduct(Cappucino cappucinoProduct) {
        this.cappucinoProduct = cappucinoProduct;
    }

    public void setAmericanoProduct(Americano americanoProduct) {
        this.americanoProduct = americanoProduct;
    }

    public void setEspressoProduct(Espresso espressoProduct) {
        this.espressoProduct = espressoProduct;
    }

    public void setCroissantProduct(Croissant croissantProduct) {
        this.croissantProduct = croissantProduct;
    }

    public void setChipsProduct(Chips chipsProduct) {
        this.chipsProduct = chipsProduct;
    }

    public void setChocolateBarProduct(ChocolateBar chocolateBarProduct) {
        this.chocolateBarProduct = chocolateBarProduct;
    }

    public static void setInstance(VendingMachine instance) {
        VendingMachine.instance = instance;
    }
}
