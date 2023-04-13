/**
 * @author anant
 * @created 13/04/2023 - 17:57
 * @project latihan
 */

public class mainkeg2 {
    public void queue(){
        keg21 q = new keg21(5);
        q.enqueue("satu");
        q.enqueue("dua");
        q.enqueue("tiga");
        q.enqueue("empat");

        System.out.println("remove : " + q.dequeue());
        System.out.println("element : " + q.peek());
        System.out.println("poll : " + q.dequeue());
        System.out.println("peek : " + q.peek());
    }

    public static void main(String[] args) {
        new keg21(). queue();
    }
}
