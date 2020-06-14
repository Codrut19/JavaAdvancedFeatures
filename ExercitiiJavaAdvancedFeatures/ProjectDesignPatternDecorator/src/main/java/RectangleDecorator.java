public class RectangleDecorator extends ShapeDecorator{
    @Override
    public void draw() {
        shapeToDecorate.draw();
        System.out.println("Am border");
    }
    public RectangleDecorator(Shape shapeToDecorate){
        super(shapeToDecorate);
    }
}
