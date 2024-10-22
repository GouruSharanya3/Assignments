//import java.util.*;
class shape{
     double Area(){
        return 0;
     }
    double Perimeter(){
        return 0;
    }
}
//square class
class square extends shape{
    double s; 
    public square(double s){
        this.s=s;
    }
    @Override
    double Area(){
        return s*s;
    }
    @Override
    public double Perimeter(){
        return 4*s;
    }
}
//rectangle class
class rectangle extends shape{
    double l;
    double w;
    public rectangle(double l, double w){
        this.l=l;
        this.w=w;
    }
    @Override
    double Area(){
        return l*w;
    }
    @Override
    double Perimeter(){
        return 2*(l+w);
    }
}

//triangle class
class triangle extends shape{
    double base,height,a,b,c;
    public triangle(double base,double height,double a,double b,double c){
        this.base=base;
        this.height=height;
        this.a=a;
        this.b=b;
        this.c=c;
    }
    @Override
    double Area(){
        return 0.5*base*height;
    }
    @Override
    double Perimeter(){
        return a+b+c;
    }
}
//circle class
class circle extends shape{
    double r;
    public circle(double r){
        this.r=r;
    }
    @Override
    double Area(){
        return Math.PI*r*r;
    }
    @Override 
    double Perimeter(){
        return 2*Math.PI*r;
    }
}

//parallelogram
class parallelogram extends shape{
    double base,height,a,b;
    public parallelogram(double base,double height,double a,double b){
        this.base=base;
        this.height=height;
        this.a=a;
        this.b=b;
    }
    @Override
    double Area(){
        return base*height;
    }
    @Override
    double Perimeter(){
        return 2*(a+b);
    }
}
//trapezoid
class trapezoid extends shape{
    double base,height,a,b,c,d;
    public trapezoid(double base,double height,double a,double b, double c, double d){
        this.base=base;
        this.height=height;
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }
    @Override
    double Area(){
        return 0.5*(a+b)*height;
    }
    @Override
    double Perimeter(){
        return a+b+c+d;
    }
}

//main class
public class Shapes{
    public static void main(String[] args){
        square Square = new square(4);
        System.out.println("Square Area: " + Square.Area());
        System.out.println("Square Perimeter: " + Square.Perimeter());

        rectangle Rectangle = new rectangle(5, 7);
        System.out.println("Rectangle Area: " + Rectangle.Area());
        System.out.println("Rectangle Perimeter: " + Rectangle.Perimeter());

        triangle Triangle = new triangle(2,2,3,9,6);
        System.out.println("Triangle Area: " + Triangle.Area());
        System.out.println("Traingle Perimeter: " + Triangle.Perimeter());

        circle Circle = new circle(5);
        System.out.println("Circle Area: " + Circle.Area());
        System.out.println("Circle Perimeter: " + Circle.Perimeter());
        
        parallelogram Paralellogram = new parallelogram(5,7,2,1);
        System.out.println("Paralellogram Area: " + Paralellogram.Area());
        System.out.println("Paralellogram Perimeter: " + Paralellogram.Perimeter());

        trapezoid Trapezoid = new trapezoid(2, 2, 1, 2, 3, 4);
        System.out.println("Trapezoid Area: " + Trapezoid.Area());
        System.out.println("Trapezoid Perimeter: " + Trapezoid.Perimeter());
    }
}

