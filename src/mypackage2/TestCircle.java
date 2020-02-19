package mypackage2;

import mypackage1.Circle;

public class TestCircle extends Circle{
    public static void main(String[] args) {
        TestCircle circle = new TestCircle();
        circle.display();
        System.out.println("dien tich cua hinh tron la" +circle.getArea());
    }
}
