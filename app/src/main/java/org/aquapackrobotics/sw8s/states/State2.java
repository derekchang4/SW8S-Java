package org.aquapackrobotics.sw8s.states;

import java.util.concurrent.ScheduledThreadPoolExecutor;

public class State2 extends State {
    public State2(ScheduledThreadPoolExecutor pool) {
        super(pool);
    }

    // TODO: implement
    public void onEnter() {
        
    }

    // TODO: implement
    public boolean onPeriodic() {
        return false;
    }

    // TODO: implement
    public void onExit() {
    }

    // TODO: implement
    public State nextState() {
        return State1.java;
    }
}
