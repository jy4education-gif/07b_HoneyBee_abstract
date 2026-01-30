package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Queen queen = new Queen();
        Worker worker = new Worker();
        Drone drone = new Drone();   

        /* 1. Iteration  */

        // output(queen.doYourJob());
        // output(queen.fly());
        // output("-------------------");

        // output(worker.doYourJob());
        // output(worker.fly());
        // output("-------------------");

        // output(drone.doYourJob());
        // output(drone.fly());
        // output("-------------------");	

        pollObj(queen);
        pollObj(worker);
        pollObj(drone);

         //-- Das sollte eigentlich nicht gehen!--//
        HoneyBee bee = new HoneyBee(); // SuperKlasse!
        pollObj(bee);


        
        
    }

     /* 2. Iteration überladene Methoden*/  

    // private static void pollObj(Queen obj){
    //     output(obj.doYourJob());
    //     output(obj.fly());
    //     output("-------------------");
    // }

    //     private static void pollObj(Worker obj){
    //     output(obj.doYourJob());
    //     output(obj.fly());
    //     output("-------------------");
    // }

    //     private static void pollObj(Drone obj){
    //     output(obj.doYourJob());
    //     output(obj.fly());
    //     output("-------------------");
    // }

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

