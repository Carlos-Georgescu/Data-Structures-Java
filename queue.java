/*

Queue is different from stack
Queue is abstract and has to be implemented using a linked list here

Queue is a first in first out data structure, meaning that the elements first added must be first processed

Which resembles an actual queue in real life



*/

Queue<Type> name = new LinkedList<>();

name.add(); //add to the head of the queue 

name.remove();//remove the head, but less preferralent

name.element();//can be out of bound?

name.peek();//can not be out of bound, return false when queue is empty 

name.poll();//return the element at the head of the list and remove

name.offer();//return false if out of bound - more preferrable then .add






