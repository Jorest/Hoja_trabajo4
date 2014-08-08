/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja_trabajo4;

/**
 *
 * @author Jorge
 */
public interface ListInterface<E> {
     
    
    
    
    
    public int size();
   // post: returns number of elements in list

   public boolean isEmpty();
   // post: returns true iff list has no elements


   public void addFirst(E value);
   // post: value is added to beginning of list

   public void addLast(E value);
   // post: value is added to end of list

 
   public E removeLast();
   // pre: list is not empty
   // post: removes last value from list

    
}
