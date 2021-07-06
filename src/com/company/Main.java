package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    // int score = 800;
    // calculate(score);
    // SpeedConverter.printConversion();
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Carrera");
        String getPr = porsche.getModel();
        System.out.println(getPr);

        Account bobsAccount = new Account("12345", 0.00, "Bob Brown", "myemail@bob.com", "123-4567");
//
// bobsAccount.withdrawal(100.0);
// bobsAccount.deposit(50.0);
// bobsAccount.withdrawal(100.0);
// bobsAccount.deposit(51);
// bobsAccount.withdrawal(100);
        vipCustomer person1 = new vipCustomer();
        System.out.println(person1.getName());
        vipCustomer person2 = new vipCustomer(0.00, "person2@email.com");
        System.out.println(person2.getName());
        vipCustomer person3 = new vipCustomer("tim",150.00,"tim@email.com");
        System.out.println(person3.getName());


        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Yokie", 8 , 20, 2, 4, 1, 20, "long silky");
        dog.eat();
//        dog.walk();
        dog.run();
        Test rex = new Test("rex");
        Test fluffy = new Test("fluffy");
        rex.printName();
        fluffy.printName();

        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.accelrate(30);
        outlander.accelrate(20);
        outlander.accelrate(-42);
        Dimentions dimentions = new Dimentions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimentions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();

        Wall wall1 = new Wall("west");
        Wall wall2 = new Wall("east");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12,55);

        Bed bed = new Bed("Modern", 4,3,2,1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedRoom = new Bedroom("Tims", wall1,wall2,wall3,wall4,ceiling,bed,lamp);
        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();
    }

    public static void calculate (int score) {
        int finalScore = 800;
        System.out.println("this is finalscore" + (finalScore + score));
    }
}
