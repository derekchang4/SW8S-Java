package org.aquapackrobotics.sw8s.states;

import java.util.concurrent.ScheduledThreadPoolExecutor;

public class InitState extends state1 {
    public InitState(ScheduledThreadPoolExecutor pool) {
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
        //State2 obj2 = new State2();
        //return obj2;
        return null;
    }
}
