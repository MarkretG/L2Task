package thirdRound;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public enum InMemoryStorage {
    INSTANCE;

    private Map<Integer,Integer> liftMap=new HashMap<>();

     public Map<Integer, Integer> getInitialLiftStatus(List<Lift> lift)
     {
        for(Lift list:lift)
        {
            liftMap.put(list.getLiftNo(),list.getCurrentPosition());
        }
        return liftMap;
     }

     public void UpdateLiftMap(int lift,int floor)
     {
        liftMap.put(lift,floor);
     }

     public Map<Integer,Integer> getUpdatedLiftMap()
     {
        return liftMap;
     }

}
