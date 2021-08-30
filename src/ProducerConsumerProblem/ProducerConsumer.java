package ProducerConsumerProblem;
import java.util.LinkedList;

public class ProducerConsumer {
    LinkedList<Integer> list=new LinkedList<>();
    int capacity=10;
    public void produce() throws InterruptedException {
        int val=0;
        while (true)
        {
            synchronized (this)
            {
                while (list.size()==capacity)
                {
                    wait();
                }
                System.out.println("producer produced"+val);

                list.add(val++);

                notifyAll();
                Thread.sleep(1000);

            }
        }
    }

    public void consume() throws InterruptedException {
        while (true)
        {
            synchronized (this)
            {
                while (list.size()==0)
                {
                    wait();
                }
                int val=list.removeFirst();
                System.out.println("producer produced"+val);

                notifyAll();
                Thread.sleep(1000);
            }
        }
    }
}
