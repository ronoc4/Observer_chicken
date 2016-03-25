package com.conor;

import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by conor on 3/24/16.
 *
 */
public class EggCounter implements Observer{

    HashMap<Chicken, Integer> eggs = new HashMap<>();

    @Override
    public void update(Observable chicken, Object arg) {

        if(eggs.containsKey(chicken)) {
            int egg = eggs.get(chicken);
            egg++;
            eggs.put((Chicken)chicken,egg);
        }

        else {
            eggs.put((Chicken)chicken, 1);
        }
    }

    public void printEggs() {
        for(Object keys: eggs.keySet()) {
            System.out.println(eggs.get(keys));
        }
    }
}
