package com.conor;
/*
 * http://docs.oracle.com/javase/7/docs/api/java/util/Observer.html
 * http://docs.oracle.com/javase/7/docs/api/java/util/Observable.html
 */

public class TestObserver {

    public static void main(String[] args) {

        //Create new Observer
        EggAlert eggMonitor = new EggAlert();

        EggCounter eggCounter = new EggCounter();

        //New Observable
        Chicken a = new Chicken("Mavis");

        //Adds an observer to the set of observers for this object,
        //provided that it is not the same as some observer already in the set.
        a.addObserver(eggMonitor);
        a.addObserver(eggCounter);


        Chicken b = new Chicken("Betty");
        b.addObserver(eggMonitor);
        b.addObserver(eggCounter);

        Chicken c = new Chicken("Sam");
        c.addObserver(eggMonitor);
        c.addObserver(eggCounter);


        Chicken d = new Chicken("Carlos");
        d.addObserver(eggMonitor);
        d.addObserver(eggCounter);

        a.layEgg();
        b.layEgg();
        a.layEgg();
        d.layEgg();
        d.layEgg();
        d.layEgg();
        c.layEgg();


        eggCounter.printEggs();
    }
}
