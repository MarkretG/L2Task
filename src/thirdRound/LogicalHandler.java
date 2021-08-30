package thirdRound;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
public enum LogicalHandler {
    INSTANCE;

    public Map<Integer, Integer> getInitialPositionOfLift(List<Lift> list) throws LogicalException {
      if(list==null ||list.isEmpty())
      {
          throw new LogicalException("list is empty or list is null",102);
      }
      return InMemoryStorage.INSTANCE.getInitialLiftStatus(list);
    }


    public Map<Integer,Integer> AssignLiftToTheUser(int current,int next) throws LogicalException {
        if((current<0||current>10)||(next<0||next>10))
        {
            throw  new LogicalException("floor is invalid",103);
        }
        assignLift(current,next);
        assignsLift(current,next);
        return InMemoryStorage.INSTANCE.getUpdatedLiftMap();
    }

    public void changeLiftToUnWorkingStage(int lift)
    {
        InMemoryStorage.INSTANCE.UpdateLiftMap(lift,-1);
    }

    public void changeLiftToWorkingStage(int lift)
    {
        InMemoryStorage.INSTANCE.UpdateLiftMap(lift,0);
    }

    public Map<Integer,Integer> getAllLiftStatus()
    {
        return InMemoryStorage.INSTANCE.getUpdatedLiftMap();
    }

    private void assignLift(int current,int next) {
        if (next <= 5) {
            List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 5));
            Map<Integer, Integer> map = InMemoryStorage.INSTANCE.getUpdatedLiftMap();
            for (int i = 0; i < list.size(); i++) {
                int value = map.get(list.get(i));
                if (value != -1 && value <= current) {
                    InMemoryStorage.INSTANCE.UpdateLiftMap(list.get(i), next);
                    System.out.println("Lift" + list.get(i) + "is assigned");
                    break;
                }
            }
        }
    }

    private void assignsLift(int current,int next)
    {
        if(next>=6&&next<=10)
        {
            List<Integer> list=new ArrayList<>(Arrays.asList(3,4));
            Map<Integer,Integer> map=InMemoryStorage.INSTANCE.getUpdatedLiftMap();
            for (int i=0;i<list.size();i++) {
                int value = map.get(list.get(i));
                if (value!=-1&&value <= current) {
                    InMemoryStorage.INSTANCE.UpdateLiftMap(list.get(i), next);
                    System.out.println("Lift" + list.get(i) + "is assigned");
                    break;
                }
            }
        }
    }



}
