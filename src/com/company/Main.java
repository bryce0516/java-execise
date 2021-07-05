package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int score = 800;
//        calculate(score);
//        SpeedConverter.printConversion();
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Carrera");
        String getPr = porsche.getModel();
        System.out.println(getPr);

        Account bobsAccount = new Account("12345", 0.00, "Bob Brown", "myemail@bob.com", "123-4567");
//
//        bobsAccount.withdrawal(100.0);
//        bobsAccount.deposit(50.0);
//        bobsAccount.withdrawal(100.0);
//        bobsAccount.deposit(51);
//        bobsAccount.withdrawal(100);
        vipCustomer person1 = new vipCustomer();
        System.out.println(person1.getName());
        vipCustomer person2 = new vipCustomer(0.00, "person2@email.com");
        System.out.println(person2.getName());
        vipCustomer person3 = new vipCustomer("tim",150.00,"tim@email.com");
        System.out.println(person3.getName());
    }

    public static void calculate (int score) {
        int finalScore = 800;
        System.out.println("this is finalscore" + (finalScore + score));
    }
}
