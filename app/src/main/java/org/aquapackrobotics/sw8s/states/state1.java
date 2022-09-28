package org.aquapackrobotics.sw8s.states;

import java.util.concurrent.ScheduledThreadPoolExecutor;

import org.aquapackrobotics.sw8s.trainingsim.SimWindow;


public class State1 extends SimState {
    public State1(ScheduledThreadPoolExecutor pool, SimWindow window) {
        super(pool, window);

        onEnter();
        onPeriodic();
        nextState();
        //onExit();
    }

    // TODO: implement
    // onEnter runs through once
    public void onEnter() {
        System.out.print("State1: onEnter-> ");
        window.setRobotSpeed(0, -2, 0);
    }

    // TODO: implement
    // onPeriodic
    int i=0;
    public boolean onPeriodic() {
        System.out.print("State1: onPeriodic-> ");
        System.out.print(window.getYPos());

        //if (window.getYPos > 100) {
        //    return false;
        //}
        if (i>10){
            return false;
        }
        i++;
        System.out.println(i);
        return true;
    }

    // TODO: implement
    public void onExit() {
        window.setRobotSpeed(0,0,0);
    }

    // TODO: implement
    public State nextState() {
        //State2 obj2 = new State2();
        //return obj2;
        System.out.print("State1: nextState-> ");
        return new State2(pool, window);
    }
}
