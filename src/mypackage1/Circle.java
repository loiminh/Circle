package mypackage1;

public class Circle {
    public static final double PI = 3.14;
    private double radius = 1 ;
    private String color = "red";

    public Circle(){

    }

    public Circle(double radius, String color){
        this.radius = radius ;
        this.color = color;

    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    protected double getArea(){
        return this.radius * this.radius * PI;
    }

    public void display(){
        System.out.println("hinh tron co ban kinh la" +radius + "co mau sac la" +color) ;
    }

}


