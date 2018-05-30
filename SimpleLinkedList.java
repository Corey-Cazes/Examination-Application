//**********A template  for a simple linked list ********

class linkTemplate {
  public static void main(String[] args) {     //the main method
    
    
    SimpleLinkedList<String> myList = new SimpleLinkedList<String>();   //you can use your list similar to an ArrayList
    
    myList.add("Bob");
    System.out.println(myList.size());
    myList.add("Bob2");
    System.out.println(myList.size());
    System.out.println(myList.indexOf("Bob2"));
    System.out.println(myList.get(0));
    myList.clear();
    System.out.println(myList.size());
    myList.add("Bob");
    myList.add("Bob2");
    myList.add("Bob3");
    myList.add("Bob4");
    myList.add("Bob5");
    System.out.println(myList.get(3));
    System.out.println(myList.size());
    myList.remove(2);
    System.out.println(myList.size());
    System.out.println(myList.indexOf("Bob4"));
    System.out.println(myList.get(0));
    System.out.println(myList.get(1));
    System.out.println(myList.get(2));
  }
}

class SimpleLinkedList<E> { 
  private Node<E> head;
  
  
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
    return;
    
  }
  
  
  
  public E get(int index) { 
    Node<E> tempNode = head;
    int pos= 0;
    E gotItem = null;
    if (head==null) {
      return null;
    }
    while((tempNode.getNext()!=null)&&(gotItem == null)) { 
      tempNode = tempNode.getNext();
      if (pos == index){
        gotItem = tempNode.getItem();
      }
      else{
        tempNode = tempNode.getNext();
        pos++;
      }
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