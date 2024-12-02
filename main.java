package Java ;
import static  Java.Printer.print; 





class Shape {
    double area(){
      return 0 ; 
    }
    void draw(){}
}


class Rectangle extends Shape {
    private double width;
    private double height;

    Rectangle(){}

    Rectangle(double w , double h){
        this.width = w;
        this.height =h ;
    }

    double area(){
        return width * height;
    }

    void draw(){}
}


class Triangle extends Shape {
    private double base;
    private double height;

    Triangle(){}

    Triangle(double b , double h){
        this.base = b;
        this.height =h ;
    }

    double area(){
        return base * height * 0.5;
    }

    void draw(){}
}

class Circle extends Shape {
    private double radius;

    Circle(){}

    Circle(double r){
        this.radius = r;
    }

    double area(){
        return this.radius * this.radius * Math.PI;
    }

    void draw(){}
}


class HelloWorld {
    public static void main(String[] args) {
        Shape O[]=new Shape[10];
        O[0] = new Rectangle(2.0,3.04);
        O[1] = new Triangle(2.0,3.04);
        O[2] = new Circle(2.0);

        for(int i=0;i<3;i++){
            print(O[i].area());
        }

        
    }
}


