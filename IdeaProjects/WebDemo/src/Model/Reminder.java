package Model;

import java.util.Timer;
import java.util.TimerTask;

public class Reminder {
    Timer timer;

    public Reminder(int seconds){
        timer = new Timer();
        timer.schedule(new ReminderTask() ,seconds,5);
    }

    class ReminderTask extends TimerTask{
        @Override
        public void run() {
            System.out.println("Time,up");
        }
    }
}
