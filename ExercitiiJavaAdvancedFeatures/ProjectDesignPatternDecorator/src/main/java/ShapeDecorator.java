public abstract class ShapeDecorator {
    protected Shape shapeToDecorate;

    public abstract void draw();

    public ShapeDecorator(Shape shapeToDecorate){
        this.shapeToDecorate=shapeToDecorate;
    }

}
