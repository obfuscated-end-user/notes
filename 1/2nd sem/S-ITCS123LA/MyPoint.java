package com.mycompany.testmypoint;

public class MyPoint {
    
    // Two instance variables x (int) and y (int).
    private int x, y;
    
    // constructors
    // A default constructor that construct a point at (0, 0).
    public MyPoint() {
        x = y = 0;
    }
    // A constructor that constructs a point with the given x and y 
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    // Getter and setter for the instance variables x and y.
    // getters
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    // setters
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    
    // methods
    // A method setXY() to set both x and y.
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // A printCoordinates() method that returns a string description of the
    // instance in the format "(x, y)".
    public String printCoordinates() {
        return "(" + Integer.toString(this.x) + ", " + Integer.toString(this.y) + ")";
    }
    // A method called distance(int x, int y) that returns the distance from
    // this point to another point at the given (x, y) 
    public double distance(int x, int y) {
        return Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
    }
}