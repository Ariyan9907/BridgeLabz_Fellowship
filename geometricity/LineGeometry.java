package com.src.geometricity;

class GeomtricOp{
    void dispWelcome(){
        System.out.println("Welcome to line comparison computation");
    }

    double calcLength(int x1,int y1,int x2,int y2){
        return Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
    }

    void checkEqulatityofTwoLines(){
        Double l1=calcLength(1,2,4,6);
        Double l2=calcLength(2,3,5,7);

        if(l1.equals(l2)){
            System.out.println("Both are equal Lines");
        }
        else{
            System.out.println("Both are not equal lines");
        }
    }
}



public class LineGeometry {
    public static void main(String[] args) {
        GeomtricOp g = new GeomtricOp();
        g.checkEqulatityofTwoLines();

    }
}
