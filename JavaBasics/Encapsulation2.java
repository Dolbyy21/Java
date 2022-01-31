package com.company;

// Constructor is called only once when object of the respective class created
class Encap{
    private int x;
    private int y;
    public Encap(){
        System.out.println("Constructor called");
        System.out.println(x+ " " +y);
    }
    void setX(int x){
        this.x = x;
    }
    void setY(int y){
        this.y = y;
    }
    int getX(){
        return this.x;
    }
    int getY(){
        return this.y;
    }
    void showEncap(){
        System.out.println(x + "  " + y);
    }
}

public class Encapsulation2 {
    public static void main(String[] args) {
        Encap e = new Encap();
        Encap c = new Encap();
        e.setX(1);
        e.setY(2);
        int xValue = e.getX();
        int yValue = e.getY();
        System.out.println(xValue + "  "+yValue);
    }
}
