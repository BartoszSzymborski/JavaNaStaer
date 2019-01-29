package Kolejki;

import java.util.LinkedList;
import java.util.Queue;

public class ClientService {
    public static void main(String[] args) {
        Queue<Client>clientQueue = new LinkedList<>();

        clientQueue.offer(new Client("grażynka"));
        clientQueue.offer(new Client("kokoszko"));
        clientQueue.offer(new Client("tyryry"));
        clientQueue.offer(new Client("dumbo"));

        System.out.println("Metoda peek() (1): " + clientQueue.peek());
        System.out.println("Metoda peek() (2): " + clientQueue.peek());

        System.out.println("Metoda poll() (1): " + clientQueue.poll());
        System.out.println("Metoda poll() (2): " + clientQueue.poll() + "\n");

        System.out.println("Stan kolejki " + clientQueue);
        System.out.println("Peek " + clientQueue.peek());
        System.out.println("Stan kolejki " + clientQueue);
        System.out.println("Poll " + clientQueue.poll());
        System.out.println("Stan klolejki " + clientQueue);

    }
}
