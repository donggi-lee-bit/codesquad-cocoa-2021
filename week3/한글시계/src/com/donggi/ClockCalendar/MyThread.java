package com.donggi.ClockCalendar;

public class MyThread extends Thread {

  public void run() {

    while (true) {
      MyClock.clock();
      try {
        Thread.sleep(4000);
      } catch (InterruptedException e) {

      }
    }
  }

}
