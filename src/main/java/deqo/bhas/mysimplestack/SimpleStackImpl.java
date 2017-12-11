package deqo.bhas.mysimplestack;

import java.util.Stack;

/*exigence 3*/
public class SimpleStackImpl implements SimpleStack {

    Stack wrappedStack = new Stack<Object>();
    public int getSize() {
        return wrappedStack.size();
    }

    public boolean isEmpty() {
        return wrappedStack.isEmpty();
    }

    public void push(Item item) {

        wrappedStack.push(item);
    }

    public Item peek() {
        return (Item)wrappedStack.peek();
    }

    public Item pop() {
        return (Item)wrappedStack.pop();
    }
}
