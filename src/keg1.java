/**
 * @author anant
 * @created 13/04/2023 - 17:53
 * @project latihan
 */
/**
 * Project LATIHAN PRAK
 * author Ryuu
 */
public class keg1 {
    private String[] elements;
    private int top;

    public keg1(int capacity) {
        elements = new String[capacity];
        top = -1;
    }

    public void push(String item) {
        if (top == elements.length - 1) {
            System.out.println("Stack overflow!");
            return;
        }
        top++;
        elements[top] = item;
    }

    public String pop() {
        if (top == -1) {
            System.out.println("Stack underflow!");
            return null;
        }
        String item = elements[top];
        top--;
        return item;
    }

    public String peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return null;
        }
        return elements[top];
    }

    public int search(String item) {
        for (int i = top; i >= 0; i--) {
            if (elements[i].equals(item)) {
                return top - i + 1;
            }
        }
        return -1;
    }

    public int empty() {
        return top;
    }
}