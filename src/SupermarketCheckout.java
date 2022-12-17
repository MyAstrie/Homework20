import java.util.Queue;
import java.util.Random;

public class SupermarketCheckout {

    private Queue<String> queue1;
    private Queue<String> queue2;

    private void randQueue(Queue<String> queue1, Queue<String> queue2) {
        String[] names = {"Ivan", "Igor", "Natasha", "Josh", "Vika", "Roma", "Kolya"};
        Random rand = new Random();

        int randSize = rand.nextInt(11);

        for (int i = 0; i < randSize; i++) {
            int randQueue = rand.nextInt(1000);
            int randName = rand.nextInt(names.length);

            if (randQueue % 2 == 0) {
                queue1.add(names[randName]);
            } else {
                queue2.add(names[randName]);
            }
        }
    }

    public SupermarketCheckout() {
        queue1 = new SizeLimitedQueue<>(5);
        queue2 = new SizeLimitedQueue<>(5);

        randQueue(queue1, queue2);
    }

    public void addPerson(String person) {
        int q1Size = queue1.size();
        int q2Size = queue2.size();

        if (q1Size == 5 && q2Size == 5) {
            System.out.println("Позвать Галю!");
        } else if (q1Size < q2Size) {
            queue1.add(person);
        } else {
            queue2.add(person);
        }
    }

    public void removePerson() {
        int queueDel = new Random().nextInt(1000);

        if(queueDel % 2 == 0) {
            if (queue1.size() != 0) {
                queue1.remove();
            } else if (queue2.size() != 0) {
                queue2.remove();
            } else {
                System.out.println("Очереди путсые");
            }
        } else {
            if (queue2.size() != 0) {
                queue2.remove();
            } else if (queue1.size() != 0) {
                queue1.remove();
            } else {
                System.out.println("Очереди путсые");
            }
        }
    }

    public void printQues(){
        System.out.println("------------------");
        System.out.println("Первая очердь : " + queue1);
        System.out.println("Вторая очредь " + queue2);
        System.out.println("------------------");
    }
}