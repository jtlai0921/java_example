package homework;

public class Stack01<T> {
    public int size;
    public int top;
    public T value;
    public T[] stackPtr;
    public Stack01(int s) {
        size = s > 0 ? s : 5;
        top = -1;
        stackPtr = (T[]) new Object[size];
    }
    public boolean push(T pushValue) {
        if (!isFull()) {
            stackPtr[++top] = pushValue;
            value = pushValue;
            return true;
        }
        return false;
    }
    public boolean pop() {
        if (!isEmpty()) {
            value = stackPtr[top--];
            return true;
        }
        return false;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == size - 1;
    }
    public void showstack() {
        for (int i = size - 1; i >= 0; i--) {
            System.out.print("|    ");
            if (i <= top) {
                System.out.print(stackPtr[i] + " ");
            } else {
                System.out.print("空");
            }
            System.out.println("    |");
        }
    }
}
