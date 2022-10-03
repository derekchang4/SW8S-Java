//Right big G
package org.aquapackrobotics.sw8s.states;

import java.util.concurrent.ScheduledThreadPoolExecutor;

import org.aquapackrobotics.sw8s.trainingsim.SimWindow;

public class State4 extends SimState {
    public State4(ScheduledThreadPoolExecutor pool, SimWindow window) {
        super(pool, window);
    }

    // TODO: implement
    public void onEnter() {
        System.out.print("[State4 Reached] --> ");
        System.out.print("("+window.getYPos()+", "+window.getYPos()+")"+" - ");
    }

    // TODO: implement
    public boolean onPeriodic() {
        //System.out.print(window.getYPos() );

        //Y gets greater as you go down
        //X gets greater as you go right
        double x = window.getXPos();
        double y = window.getYPos();
        int destx = 500;
        int desty = 400;

        window.setRobotSpeed(destx-x, desty-y, 0);

        if (window.getXPos() >= destx && window.getYPos() >= desty) {
            return true;
        }
        
        return false;
    }

    // TODO: implement
    public void onExit() {
        window.setRobotSpeed(0,0,0);
        System.out.print("("+window.getYPos()+", "+window.getYPos()+")"+" - ");
    }

    // TODO: implement
    public State nextState() {
        System.out.print("State4: nextState-> ");
        return new State5(pool, window);
    }
}
