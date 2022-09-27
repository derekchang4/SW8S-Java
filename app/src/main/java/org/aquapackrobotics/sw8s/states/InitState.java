//Note to self
//to build gradle do: .\gradlew.bat build
//to run grade do: .\gradlew.bat run


package org.aquapackrobotics.sw8s.states;

import java.util.concurrent.ScheduledThreadPoolExecutor;

public class InitState extends State {
    public InitState(ScheduledThreadPoolExecutor pool) {
        super(pool);
    }

    // TODO: implement
    public void onEnter() {
        System.out.print("Init onEnter");
        //window.setRobotSpeed(5, 5, 5);
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
        //State1 obj1 = new State1();
        //return obj1;
        return null;
    }
}
