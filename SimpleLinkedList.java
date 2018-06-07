//**********A template  for a simple linked list ********

class SimpleLinkedList<E> {
  private Node<E> head;
  private int size = 0;


  public void add(E item) {
    Node<E> tempNode = head;

    if (head==null) {
      head = new Node<E>(item, null);
      return;
    }

    while(tempNode.getNext()!=null) {
      tempNode = tempNode.getNext();
    }

    tempNode.setNext(new Node<E>(item, null));
    this.size++;
    return;

  }

  public int getSize() {
   return this.size;
  }

  public void print(){
      Node<E> tempNode = head;

    if (head==null) {
      return;
    }

    while (tempNode.getNext() != null){
    System.out.println (tempNode.getItem());
    tempNode = tempNode.getNext();
    }
    System.out.println(tempNode.getItem());

  }



  public E get(int index) {
    Node<E> tempNode = head;
    int pos= 0;
    E gotItem = null;
    if (head==null) {
      return null;
    }
    while((tempNode.getNext()!=null)&&(gotItem == null)) {
      //tempNode = tempNode.getNext();
      if (pos == index){
        gotItem = tempNode.getItem();
      }
      else{
        tempNode = tempNode.getNext();
        pos++;
      }
    }

    if (pos == this.size){
      gotItem = tempNode.getItem();
    }
    return gotItem;
  }

  public int indexOf(E item) {
    Node<E> tempNode = head;
    int index = 0;
    E currentItem = null;
    if (head == null){
      return 0;
    }
    while (tempNode.getNext() != null){
      currentItem = tempNode.getItem();
      if (currentItem == item){
        index=index;
      }
      else{
        tempNode = tempNode.getNext();
        index++;
      }
    }
    return index;
  }

  public Node<E> getLast(){
   Node<E> tempNode = head;
     if (head == null){
         return head;
       }

     while (tempNode.next!= null) {
      tempNode = tempNode.getNext();
     }
     return tempNode;
  }

  public E remove(int index) {
    if (head != null){
      Node<E> tempNode = head;
      Node<E> prevNode = null;
      int count =0;
      while (tempNode.getNext() != null){
        prevNode = tempNode;
        tempNode = tempNode.getNext();
        count++;
        if (count > index){
          prevNode.next = tempNode.getNext();
        }
      }
    }
    this.size--;
    return null;
  }



  public void clear() {
    head = null;
    return;
  }

  public int size() {
    Node<E> tempNode = head;
    int count= 1;
    if (head==null) {
      return 0;
    }
    while(tempNode.getNext()!=null) {
      tempNode = tempNode.getNext();
      count++;
    }
    return count;
  }

}
