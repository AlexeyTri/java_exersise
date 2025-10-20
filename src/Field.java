public class Field {

    Apple a1 = new Apple();
    Apple a2 = new Apple();

    public void setupApples(){
        a1.mass = 5.0f;
        // a1.diameter = 10.0f;
        a1.x = 20;
        a1.y = 40;
        a2.mass = 10.0f;
        // a2.diameter = 20.0f;
        a2.x = 10;
        a2.y = 30;

        a1.setDiameter(10.0f);
        a2.setDiameter(10.0f);

    }

    public void detectCollisions(){
        if (a1.isTouching(a2)) {
            System.out.println("Collision detected");
            a1.powerTouching(a2);
        } else {
            System.out.println("Apples are not touching");
        }
    }
}
