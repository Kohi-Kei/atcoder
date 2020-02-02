package LinkedList;

class LinkedList <T> extends Container{
    /** ここがルート*/
    Node<T> root;

    public void appendToTail(T data){
        if(isEmpty()){
            this.root = new Node<>(data);
            return ;
        }
        Node<T> node = this.root;
        while(node.next != null){
            node = node.next;
        }
        node.next = new Node<>(data);
    }

    public void append(T data){
        Node<T> node = new Node<>(data);
        node.next = this.root;
        this.root = node;
        increment();
    }
    
    //n(O)
    public boolean remove(T data){
        if(isEmpty()){
            return false;
        }
        if(this.root.data.equals(data)){
            this.root = this.root.next;
            decrement();
            return true;
        }
        Node<T> node = this.root;
        while(!node.next.isNull()){
            if(node.next.data.equals(data)){
                break;
            }
        }
        //ループしても見つからなかったとき
        if(node.isNull()){
            return false;
        }
        //もし次の次がnullでも node.nextがnullに成るだけ
        node.next = node.next.next;
        decrement();
        return true;
    }
}