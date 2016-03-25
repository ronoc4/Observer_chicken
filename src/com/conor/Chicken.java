package com.conor;

import java.util.Observable;

/**
 * Created by conor on 3/24/16.
 */
public class Chicken extends Observable {

    String name;
    boolean laidEgg = false;

    Chicken(String name) {
        this.name = name;
    }

    public void layEgg() {
        this.laidEgg =true;
        //Marks this Observable object as having been changed; the hasChanged method will now return true.
        this.setChanged();
        //If this object has changed, as indicated by the hasChanged method,
        // then notify all of its observers
        // and then call the clearChanged
        // method to indicate that this object has no longer changed.
        this.notifyObservers();

        //Resetting back to initial value
        this.laidEgg = false;
    }

    @Override
    public String toString() {
        return this.name;
    }

    //Calls back to Observer if this is true
    public boolean laidEgg() {
        return laidEgg;
    }
}
