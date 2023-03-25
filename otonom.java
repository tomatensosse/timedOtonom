// import

import edu.wpi.first.wpilibj.Timer;

// declare 

private Timer timer;
timer = new Timer();

// autonomous init

timer.reset();
timer.start();

// autonomous periodic

double timeElapsed = timer.get();

    // first
    while (timeElapsed < 1.5) {
      // extender aç 
    }
    // next 1.5 secs
    while (timeElapsed >= 1.5 && timeElapsed < 3) {
      // extender durdur
      // intake çalıştır
    }
    while (timeElapsed >= 3 && timeElapsed < 6)
    {
      // intake durdur
      // geri git
    }