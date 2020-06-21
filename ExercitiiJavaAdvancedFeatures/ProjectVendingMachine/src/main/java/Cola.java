public class Cola extends Drink{

    public Cola(String productName,int productPrice,int productQuantity){
        this.productName=productName;
        this.productPrice=productPrice;
        this.productQuantity=productQuantity;
    }
    public Cola(){

    }

    @Override
    public String toString() {
        return this.productName + " " + this.productPrice + " " + this.productQuantity;
    }
}
