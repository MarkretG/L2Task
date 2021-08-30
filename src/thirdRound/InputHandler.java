package thirdRound;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public enum InputHandler {
    INSTANCE;
    private Scanner sc=new Scanner(System.in);
     public List<Lift> getLiftDetails()
     {
         List<Lift> list=new ArrayList<>();
         for(int i=1;i<=5;i++)
         {
             Lift lift=new Lift();
             lift.setLiftNo(i);
             lift.setCurrentPosition(0);
             lift.setCapacity(5);
             list.add(lift);
         }
         return list;
     }
     public int getChoice()
     {
         return sc.nextInt();
     }

     public int getCurrentFloor()
     {
         System.out.println("enter from floor");
         int current = sc.nextInt();
         while (current < 0 || current > 10) {
             System.out.println("please enter valid floor");
             current = sc.nextInt();
         }
         return current;
     }
    public int getNextFloor()
    {
        System.out.println("enter to floor");
        int next = sc.nextInt();
        while (next < 0 || next > 10) {
            System.out.println("please enter valid floor");
            next = sc.nextInt();
        }
        return next;
    }
    public int getLiftNumber()
    {
        System.out.println("enter lift number");
        int lift = sc.nextInt();
        return lift;
    }
}
