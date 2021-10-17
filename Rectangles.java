public class Rectangles {
    int rectangleSideA;
    int rectangleSideB;

    public Rectangles(int sideA, int sideB) {
        rectangleSideA = sideA;
        rectangleSideB = sideB;
    }

    public void calcPeriArea() {
        int rectangleArea = rectangleSideA * rectangleSideB;
        int rectanglePerimeter = 2 * (rectangleSideA + rectangleSideB);
        System.out.println("Dimensions: " + rectangleSideA + "x" + rectangleSideB + "\n" + "Area: " + rectangleArea
                + "\n" + "Perimeter: " + rectanglePerimeter);


    }

    public static void main(String[] args){
        Rectangles rectangle1 = new Rectangles(3,4);
        Rectangles rectangle2= new Rectangles(2,7);
        rectangle1.calcPeriArea();
        rectangle2.calcPeriArea();

    }

}
