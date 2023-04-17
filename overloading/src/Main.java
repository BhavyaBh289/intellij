import java.util.Scanner;
class Shape{
    void setArea(){
        System.out.println("Area is  - unknown");
    }

}
class Triangle extends Shape{
    void getarea(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base:");
        int base = sc.nextInt();
        System.out.print("Enter height:");
        int height = sc.nextInt();
        setArea(base,height);
    }
    void setArea(int base,int height){
        double area = 0.5 * base * height;
        System.out.println("Area of triangle is :- "+area);
    }
}

class Circle extends Shape{
    void getarea(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius:");
        int rd = sc.nextInt();
        setArea(rd);

    }
    void setArea(int radius){
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle is  :- "+area);
    }
}

class Square extends Shape{
    void getarea(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of square:");
        int side = sc.nextInt();
        setArea(side);
    }
    void setArea(int side){
        double area = side * side;
        System.out.println("Area of square is :- "+area);
    }
}

class tester {
    public static void main(String[] args ){
        int status=1;
        while(status !=4)
        {
            System.out.println("Enter \n1 To Find Area of Square\n2 To Find Area of Circle\n3 To Find Area of Triangle:\n4 to exit");
            Scanner scanint = new Scanner(System.in);
            status = scanint.nextInt();
            switch(status)
            {
                case 1:
                {
                    System.out.println(" Square ");
                    Square s = new Square();
                    s.getarea();
                    break;
                }
                case 2:{
                    System.out.println(" Circle ");
                    Circle c = new Circle();
                    c.getarea();
                    break;
                }
                case 3:{
                    System.out.println("Triangle");
                    Triangle t = new Triangle();
                    t.getarea();
                    break;
                }
                case 4:{
                    System.out.println("Exiting");
                    break;
                }
            }
        }
    }
}