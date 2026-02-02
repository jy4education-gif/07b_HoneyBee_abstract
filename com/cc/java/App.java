package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Queen queen = new Queen();
        Worker worker = new Worker();
        Drone drone = new Drone();   
        Bird bird = new Bird();

        pollObj(queen);
        pollObj(worker);
        pollObj(drone);
        pollObj(bird);

         //-- Das geht aufgrund von abstract class nicht!--//
        // HoneyBee bee = new HoneyBee(); // SuperKlasse!
        // pollObj(bee);
     
    }

   
    /* 3. Iteration Polymorphie */  

    private static void pollObj(HoneyBee obj){
        output(obj.doYourJob());
        output(obj.fly());
        output("-------------------");
    }

   
    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}


