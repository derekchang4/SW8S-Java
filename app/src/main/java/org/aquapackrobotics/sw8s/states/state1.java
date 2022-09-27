package org.aquapackrobotics.sw8s.states;

import java.util.concurrent.ScheduledThreadPoolExecutor;

import org.aquapackrobotics.sw8s.trainingsim.SimWindow;

public class State1 extends SimState {
    public State1(ScheduledThreadPoolExecutor pool, SimWindow window) {
        super(pool, window);

        onEnter();
        nextState();
    }

    // TODO: implement
    public void onEnter() {
        window.setRobotSpeed(5, 5, 5);
    }

    // TODO: implement
    public boolean onPeriodic() {
        return false;
    }

    // TODO: implement
    public void onExit() {
        window.setRobotSpeed(0,0,0);
    }

    // TODO: implement
    public State nextState() {
        //State2 obj2 = new State2();
        //return obj2;
        return new State2(pool, window);
    }
}
