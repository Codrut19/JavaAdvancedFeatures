public class CarMaker {

    public void makeWolksvagen(){
        Car wolksvagen = new Wolksvagen();
        wolksvagen.build();

    }
    public void makeSeat(){
        Car seat = new Seat();
        seat.build();
    }
    public void makeAudi(){
        Car audi = new Audi();
        audi.build();
    }
}
