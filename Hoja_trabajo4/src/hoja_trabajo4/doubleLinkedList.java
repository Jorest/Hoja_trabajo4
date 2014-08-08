


package hoja_trabajo4;
/*


public class Circular<E> extends abstractList<E> {
    protected Node<E> tail; 
    protected int count;
    
    public static final Circular circular = new Circular();


*/

public class doubleLinkedList<E> extends abstractList<E>{
protected int count;
protected doublelinkedNODE<E> head;
protected doublelinkedNODE<E> tail;

public doubleLinkedList()
// post: constructs an empty list
{
   head = null;
   tail = null;
   count = 0;
}


public void addFirst(E value)
// pre: value is not null
// post: adds element to head of list
{
   // construct a new element, making it head
   head = new doublelinkedNODE<E>(value, head, null);
   // fix tail, if necessary
   if (tail == null) tail = head;
   count++;
}


public void addLast(E value)
// pre: value is not null
// post: adds new value to tail of list
{
   // construct new element
   tail = new doublelinkedNODE<E>(value, null, tail);
   // fix up head
   if (head == null) head = tail;
   count++;
}


public E removeLast()
// pre: list is not empty
// post: removes value from tail of list
{
   doublelinkedNODE<E> temp = tail;
   tail = tail.previous();
   if (tail == null) {
       head = null;
   } else {
       tail.setNext(null);
   }
   count--;
   return temp.value();
}

   public int size(){
         return 1; 
     }










}