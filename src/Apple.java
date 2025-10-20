import java.util.*;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/*public class Apple {

    float mass;
    private float diameter = 1.0f;
    //int x = 10;
    //int y = 20;
    int x, y;
    static float gravAccel = 9.8f;
    static float EARTH_ACCEL = 9.8f;
    public static final int SMALL = 0, MEDIUM = 1, LARGE = 2;

    public static String[] getAppleSize(){
        return new String[]{"SMALL", "MEDIUM", "LARGE"};
    }

    public void setSize(int size){
        if(size < SMALL){
            size = SMALL;
        }
        if(size > LARGE){
            size = LARGE;
        }

    }

    public void moveTo(int x, int y){
        System.out.println("Moving to "+x+","+y);
        this.x = x;
        if(y > diameter){
          this.y = y;
        } else {
            this.y = (int)diameter;
        }
    }


    float getWeight(){
        return mass * gravAccel;
    }

    public void setDiameter(float newDiameter){
        diameter = newDiameter;
    }
    public float getDiameter(){
        return diameter;
    }
    public void printDetails(){
        /*System.out.println("Apple a1:");
        System.out.println(" mass:"+ mass);
        System.out.println(" diameter:"+ getDiameter());
        System.out.println(" position: ("+x+ "," +y+")");*/

        /*String niceNames[] = getAppleSize();
        if (diameter > 5.0f){
            System.out.println(niceNames[SMALL]);
        }else if(diameter < 10.0f) {
            System.out.println(niceNames[MEDIUM]);
        }else{
            System.out.println(niceNames[LARGE]);
        }
        System.out.println("position: (" +x+","+y+")");
    }

    public boolean isTouching(Apple other){
        double xdiff = x - other.x;
        double ydiff = y - other.y;
        double distance = Math.sqrt(xdiff*xdiff + ydiff*ydiff);
        if(distance < getDiameter() / 2 + other.getDiameter() /2) {
            return true;
        } else {
            return false;
        }
    }

    public void powerTouching(Apple other){
        double powerTouching = mass * EARTH_ACCEL - other.mass * EARTH_ACCEL;
        System.out.println("powerTouching: " + powerTouching);
    }

    void printMyDetails(){
        System.out.println(this);
    }
}

class Bird{
    int xPos, yPos;

    public double fly(int x, int y){
        double distance = Math.sqrt(x*x + y*y);
        //flap(distance);
        xPos = x;
        yPos = y;
        return distance;
    }
}

*/
/*
class Car{
    String model;
    int doors;
    static final int DEFAULT_CIRCLE = 4;


    Car(String model, int doors, int circle){
        this.model = model;
        this.doors = doors;
    }
    /*Car(String m){
        this(m, DEFAULT_CIRCLE);
    }
    Car(String m){
        this(m, 4, DEFAULT_CIRCLE);
    }
}
*/

/* public abstract class Animal{
    private double weight;

    public abstract void makeSound(int duration);

    public void setWeight(double w){
        this.weight = w;
    }

    public double getWeight(){
        return weight;
    }

}

class Mammal extends Animal{
    int heartRate;

    @Override
    public void makeSound(int duration) {
        for(int i = 0; i < duration; i++){
            System.out.println("meow");
        }
    }

    void breath(){

    }
}

public class Cat extends Mammal{
    boolean longHair;

    public void makeSound(int duration){
        for(int i = 0; i < duration; i++){
            System.out.println("meow");
        }
    }
}


class IntegerCalculator{
    int sum;
}

class DecimalCalculator extends IntegerCalculator{
    float sum;
}

// DecimalCalculator dc = new DecimalCalculator();
// IntegerCalculator ic = dc;

// int s = ic.sum;
*/
interface Driveable{
    boolean startEngine();
    void stopEngine();
    float acceleration();
    boolean turn();
}

class Automobile implements Driveable{
    Automobile a = new Automobile();
    void main() {
    }

    public boolean startEngine(){
        //if (notTooCold)
        //    engineRunning = true;
        return true;
    }

    public void stopEngine(){
       // engineRunning = false;
    }

    public float acceleration(){
        //..
        return 0;
    }

    public boolean turn(){
        return true;
    }

}




