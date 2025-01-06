package item_1.merit_3;

 abstract class Shape {
    public abstract double area();

    public static Shape createShape(String type, double... params) {
        switch (type.toLowerCase()) {
            case "circle":
                return new Circle(params[0]); // 반지름
            case "rectangle":
                return new Rectangle(params[0], params[1]); // 가로, 세로
            case "triangle":
                return new Triangle(params[0], params[1]); // 밑변, 높이
            default:
                throw new IllegalArgumentException("예시에 없는 도형입니다.: " + type);
        }
    }
}
