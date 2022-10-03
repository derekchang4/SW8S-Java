//The first state. Go to the top of G
package org.aquapackrobotics.sw8s.states;

import java.util.concurrent.ScheduledThreadPoolExecutor;

import org.aquapackrobotics.sw8s.trainingsim.SimWindow;


public class State1 extends SimState {
    public State1(ScheduledThreadPoolExecutor pool, SimWindow window) {
        super(pool, window);

        
    }

    // TODO: implement
    // onEnter runs through once
    public void onEnter() {
        System.out.print("State1: onEnter-> ");
        window.setRobotSpeed(0, -2, 0);
    }

    // TODO: implement
    // onPeriodic is looped in Training Mission
    
    public boolean onPeriodic() {
        System.out.print("State1: onPeriodic-> ");
        System.out.print(window.getYPos());

        if (window.getYPos() > 550) {
            window.setRobotSpeed(0, -2, 0);
            return false;
        }
        
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
