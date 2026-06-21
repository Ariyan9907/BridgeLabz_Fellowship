package com.src.geometricity;

class GeomtricOp{
    void dispWelcome(){
        System.out.println("Welcome to line comparison computation");
    }

    double calcLength(int x1,int y1,int x2,int y2){
        return Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
    }
}



public class LineGeometry {
    public static void main(String[] args) {
        GeomtricOp g = new GeomtricOp();
        System.out.println(g.calcLength(2,3,6,7));

    }
}
