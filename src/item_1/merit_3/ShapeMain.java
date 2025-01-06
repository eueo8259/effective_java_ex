package item_1.merit_3;

public class ShapeMain {
    public static void main(String[] args) {
        Shape circle = Shape.createShape("circle", 5); // 반지름 5
        Shape rectangle = Shape.createShape("rectangle", 4, 6); // 가로 4, 세로 6
        Shape triangle = Shape.createShape("triangle", 3, 7); // 밑변 3, 높이 7

        System.out.println("넓이: " + circle.area());
        //넓이: 78.53981633974483
        System.out.println("넓이: " + rectangle.area());
        //넓이: 24.0
        System.out.println("넓이: " + triangle.area());
        //넓이: 10.5
    }
}
