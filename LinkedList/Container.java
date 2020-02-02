package LinkedList;

abstract class Container {
    private int size = 0;

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }
    public void increment(){
        this.size++;
    }
    public void decrement(){
        this.size--;
    }
}