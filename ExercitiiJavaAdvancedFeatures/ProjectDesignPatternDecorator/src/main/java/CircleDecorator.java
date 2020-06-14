public class CircleDecorator extends ShapeDecorator{
    @Override
    public void draw() {
        shapeToDecorate.draw();
        System.out.println("Am border");

    }
    public CircleDecorator(Shape shapeToDecorate){
        super(shapeToDecorate);
    }
}
