class Rectangle{
    int length;
    int breadth;
    Rectangle(){
        length = 0;
        breadth = 0;
    }
    Rectangle(int side) {
        length = side;
        breadth = side;
    }
    Rectangle(int len, int brd) {
        length = len;
        breadth = brd;
    }
    int calculateArea() {
        return length*breadth;
    }

}
public class Constructor{
    public static void main(String[] args){
        Rectangle obj1 = new Rectangle();
        Rectangle obj2 = new Rectangle(5);
        Rectangle obj3 = new Rectangle(5,5);

        System.out.println("No parameters :"+obj1.calculateArea());
        System.out.println("1 Parameter :"+obj2.calculateArea());
        System.out.println("2 Parameters :"+obj3.calculateArea());
    }
}