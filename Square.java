public class Square extends Rectangle{

public Square(){
super();
}
    public Square(double side){
     super(side,side);
    }

    public Square(double side, String color, boolean filled) {
        super(side,side, color, filled);
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
