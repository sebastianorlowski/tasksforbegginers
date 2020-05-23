package May;

// Stwórz stos, metody: free, pop, push, display, clean
public class Stack {
    private final int stackSize = 10;
    private int [] tab = new int[stackSize];
    private int free;

    public Stack() {

    }

    public boolean isEmpty() {
        return free == 0;
    }

    public int getSize() {
        return free;
    }

    //Dodawanie
    public void push(int n) throws ArrayIndexOutOfBoundsException {
        if(free >= stackSize) {
            throw new ArrayIndexOutOfBoundsException("Stack is too big");
        }
        else {
            tab[free] = n;
            free++;
        }
    }

    // Ściąganie
    public int pop() throws IndexOutOfBoundsException{
        if(free <= 0) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        else {
            int temp = tab[free - 1];
            free--;
            return temp;
        }
    }

    // Zawartość
    public void display() throws IndexOutOfBoundsException {
        if(free == 0) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        else {
            int temp = free - 1;
            do {
                System.out.println(tab[temp]);
                temp--;
            }
            while (temp > -1);
        }
    }

    public void clear() {
        for(int i=0;i<free;i++) {
            tab[i] = 0;
        }
        free = 0;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(6);
        stack.push(9);
        stack.push(11);
        stack.display();
        stack.pop();
        stack.display();
    }
}
