package deqo.bhas.mysimplestack;

public class Item {

    private Object value;

    public Item(Object value){
        setValue(value);
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
}
