package item_10.transitivity;

public class ColorPoint{
    private final Point point;
    private final String color;

    public ColorPoint(int x, int y, String color){
        point = new Point(x, y);
        this.color = color;
    }

    public Point asPoint(){
        return point;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ColorPoint)){
            return false;
        }
        ColorPoint cp = (ColorPoint) o;
        return cp.point.equals(point) && cp.color.equals(color);
    }



//    @Override
    //잘못된 예시
//    public boolean equals(Object o) {
//        if (!(o instanceof Point)){
//            return false;
//        }
//        //o가 일반 Point 이면 색상은 무시하고 그냥 비교
//        if (!(o instanceof ColorPoint)){
//            return o.equals(this);
//        }
//        //o가 ColorPoint 이면 색상까지 비교
//        return super.equals(o) && ((ColorPoint) o).color == color;
//    }

    public static void main(String[] args) {
        ColorPoint p1 = new ColorPoint(1,2, "red");
        Point p2 = new Point(1, 2);
        ColorPoint p3 = new ColorPoint(1, 2, "blue");

        System.out.println(p1.equals(p2)); //true
        System.out.println(p2.equals(p3)); //true
        System.out.println(p3.equals(p1)); //false
    }
}
