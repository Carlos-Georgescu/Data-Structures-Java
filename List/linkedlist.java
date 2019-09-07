-----------------------------------------------------------
    				LinkedList
-----------------------------------------------------------

You can not really inititate a whole list, whether it's for

- Traversal
- Collection
- Usage 

You must visit nodes one by one

[java]{

	LinkedList<Type> list = new LinkedList<Type>();

	ListNode name = new ListNode(val);

	//using single linked list is quite simple sometimes

	list.add();

	list.addLast();

	list.addFirst();

	name.next(); //give you the address of the next node

	name.val;//accessing the value of the linked list
	
} [java]

!Cost of Operation!

can not be accesed in the middle/or such access is not fast

adding and remove at begining and end can both be done in constant time