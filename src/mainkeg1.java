/**
 * @author anant
 * @created 13/04/2023 - 17:54
 * @project latihan
 */

public class mainkeg1 {
    public static void main(String[] args) {
        keg1 s = new keg1(5);


        s.push("satu");
        s.push("dua");
        s.push("tiga");

        System.out.println("Next : " + s.peek());
        s.push("empat");
        System.out.println(s.pop());
        s.push("lima");

        int count = s.search("satu");

        while (count != -1 && count > 1) {
            s.pop();
            count--;
        }
        System.out.println(s.pop());
        System.out.println(s.empty());
    }
}
