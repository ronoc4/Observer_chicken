package com.conor;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by conor on 3/24/16.
 *
 * A class can implement the Observer interface when it wants to be informed of changes in observable objects
 */
public class EggAlert implements Observer {

    //This class is the Observer
    //This method is called whenever the observed object changed
    public void update(Observable chicken, Object arg) {
        //Calls laidEgg() from Chicken class, if true print out statment
        if (((Chicken)chicken).laidEgg()) {
            System.out.println(chicken + " has laid an egg");
        }
    }
}
