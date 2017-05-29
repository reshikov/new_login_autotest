package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main (String[] args) {
        hello("friend");
        hello("user");
        hello("Igor");

        Square s = new Square(5); // !
        s.l=5;
        System.out.println("text " + s.l + " = " + s.area());


        Rectangle r = new Rectangle(4,6); // !
        r.a = 4;
        r.b = 6;
        System.out.println("text 2 " + r.a + " and " + r.b + " = " + r.area ());

    }

    public static void hello (String somebody) {
        System.out.println("Hello " + somebody + "!");
    }

    }
