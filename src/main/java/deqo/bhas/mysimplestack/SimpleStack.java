package deqo.bhas.mysimplestack;

public interface SimpleStack {

    int getSize();
    boolean isEmpty();
    void push(Item item);
    Item peek();
    Item pop();
}
