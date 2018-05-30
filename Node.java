class Node<E> { 
  private E item;
  public Node<E> next;

public Node(E item) {
  this.item=item;
  this.next=null;
}

public Node(E item, Node<E> next) {
  this.item=item;
  this.next=next;
}

public Node<E> getNext(){
  return this.next;
}

public void setNext(Node<E> next){
  this.next = next;
}

public E getItem(){
  return this.item;
}

}