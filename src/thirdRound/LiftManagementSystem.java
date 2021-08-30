package thirdRound;
import java.util.List;
import java.util.Map;
public class LiftManagementSystem {
    public static void main(String[] args) throws LogicalException {
        while (true)
        {
            System.out.println("1.initial lift position");
            System.out.println("2.Assign Lift To the user");
            System.out.println("3.Maintenance");
            System.out.println("4.All lift status");
            System.out.println("5.exit");
            int ch= InputHandler.INSTANCE.getChoice();
            switch (ch)
            {
                case 1: {
                    List<Lift> list = InputHandler.INSTANCE.getLiftDetails();
                    Map<Integer, Integer> map = LogicalHandler.INSTANCE.getInitialPositionOfLift(list);
                    printLiftStatus(map);
                    }
                    break;
                case 2: {
                    int current = InputHandler.INSTANCE.getCurrentFloor();
                    int next = InputHandler.INSTANCE.getNextFloor();
                    Map<Integer,Integer> map= LogicalHandler.INSTANCE.AssignLiftToTheUser(current, next);
                    printLiftStatus(map);
                    }
                    break;
                case 3:
                    boolean end=true;
                    while (end)
                    {
                        System.out.println("1.change lift to non working stage");
                        System.out.println("2.change lift to working stage");
                        System.out.println("3.exit");
                        int choice= InputHandler.INSTANCE.getChoice();
                        switch (choice)
                        {
                            case 1: {
                                 int lift=InputHandler.INSTANCE.getLiftNumber();
                                 LogicalHandler.INSTANCE.changeLiftToUnWorkingStage(lift);
                                 System.out.println("Lift" +lift+ "not working");
                               }
                                break;
                           case 2:
                             int lift= InputHandler.INSTANCE.getLiftNumber();
                             LogicalHandler.INSTANCE.changeLiftToWorkingStage(lift);
                             System.out.println("Lift"+lift+"working well");
                             break;
                            case 3:
                                end=false;
                                break;
                         }
                    }
                    break;
                case 4: {
                    Map<Integer, Integer> map = LogicalHandler.INSTANCE.getAllLiftStatus();
                    printLiftStatus(map);
                }
                case 5:
                    System.exit(0);

            }
        }
    }
    public static void printLiftStatus(Map<Integer,Integer> map)
    {
        System.out.println("Lift"+"\t\t\t"+"Floor");
        for (Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            System.out.println(entry.getKey()+"\t\t"+entry.getValue());
        }
    }
}
