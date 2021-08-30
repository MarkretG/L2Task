package thirdRound;
public class Lift {
    private int liftNo;
    private int currentPosition;
    private  int capacity;

    @Override
    public String toString() {
        return ""+liftNo+'\t'+'\t'
                + currentPosition;
    }

    public int getLiftNo() {
        return liftNo;
    }

    public void setLiftNo(int liftNo) {
        this.liftNo = liftNo;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
