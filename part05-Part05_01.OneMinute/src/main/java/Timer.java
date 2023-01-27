/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jinki
 */
public class Timer {

    private ClockHand hours;
    private ClockHand minutes;
    private ClockHand seconds;
    private ClockHand hundrethSeconds;

    public Timer(){
        this.hours = new ClockHand(24);
        this.minutes = new ClockHand(60);
        this.seconds = new ClockHand(60);
        this.hundrethSeconds = new ClockHand(100);
    }
    
    public void advance() {
        this.hundrethSeconds.advance();

        if (this.hundrethSeconds.value() == 0) {
            this.seconds.advance();

            if (this.seconds.value() == 0) {
                this.minutes.advance();
            }
        }
    }

    @Override
    public String toString() {
       return seconds + ":" + hundrethSeconds;
    }

}
