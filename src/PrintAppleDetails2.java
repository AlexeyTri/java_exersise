public class PrintAppleDetails2 {
    public static void main(String[] args) {
        // Apple a1 = new Apple();
        /*System.out.println("Apple a1:");
        System.out.println(" mass:"+a1.mass);
        System.out.println(" diameter:"+a1.diameter);
        System.out.println(" position: ("+a1.x+ "," +a1.y+")");*/
        //a1.printDetails();
        // fill in some information on a1
        // a1.mass = 10.0f;
        // a1.x = 20;
        // a1.y = 30;
        // System.out.println("______________________________________");
        /*System.out.println("Update a1:");
        System.out.println(" mass:"+a1.mass);
        System.out.println(" diameter:"+a1.diameter);
        System.out.println(" position: ("+a1.x+ "," +a1.y+")");*/
        // a1.printDetails();
        String[] niceName = Apple.getAppleSize();
        System.out.println(niceName[Apple.LARGE]);
        Field f = new Field();
        f.setupApples();
        System.out.println("Apple a1");
        f.a1.printDetails();
        System.out.println("Apple a2:");
        f.a2.printDetails();
        f.detectCollisions();

        Apple typicalApple = new Apple();
        // Apple.MEDIUM = 5;
        typicalApple.setSize(Apple.MEDIUM);

        f.a1.moveTo(30, 40);
        System.out.println("---------------------------");
        f.a1.printMyDetails();

    }
}
