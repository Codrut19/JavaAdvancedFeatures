public class TriangleDecorator extends ShapeDecorator{
    @Override
    public void draw() {
        shapeToDecorate.draw();
        System.out.println("Am border");

    }
    public TriangleDecorator(Shape shapeToDecorate){
        super(shapeToDecorate);
    }
}
