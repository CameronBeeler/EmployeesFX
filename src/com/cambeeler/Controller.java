package com.cambeeler;

public class Controller {
    static int startAction=0;

    public void startAction()
    {
        if(startAction==0)
        {
            System.out.println("You pushed the button...");
        } else if (startAction < 10)
        {
            System.out.println("Stop it already!");
        } else if ( startAction == 10){
            System.out.println("Whatever");
        }
        startAction++;
    }
}
