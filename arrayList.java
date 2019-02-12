/*
	Java Syntax Cheat Sheet #One
	ArrayList
	at it's core, ararylist is 
*/

ArrayList name = new ArrayList();

ArrayList<Type> name = new ArrayList<Type>();//initialization and restrict the type of content

Character, String, Map, Character, Integer, Boolean//available types

name.add(value);//add a value to an ArrayList

ArrayList<Type> name = new ArrayList<Type>( //initialization with as list
            Arrays.asList(value, 
                          value, 
                          value));// you can also replace value with an array, however, when you modify that original array, the array list change also

List<Integer> arr = new ArrayList<>(); //initialization with add
        arr.add(1); 
        arr.add(2); 
        arr.add(3); 
        arr.add(4); 
        arr.add(5);

// List is an interface, while arraylist is a specfic implementation of, linked list is just like 

List<Integer> newList = new ArrayList<Integer>(arr); //initialization with another ArrayList

//CREATE RELATED FUNCTIONS

name.add(int index, Object element);//insert at specific value and bump something one down;

name.addAll(Collection collection);// append all values of the Collection to the arraylist end 

name.addAll(int index, Collection collection);//^ self explanatory

name.clear();//clear this arrayList

name.clone();//return a clone object

//SEARCH RELATED

name.get(index);//get value at index, 

name.contains(Objecct element);//beware, O(n) complexity

name.indexOf(Object element);//return the first occurence, most likely also O(n)

name.lastIndexOf(^);//return the last element

//UPDATE RELATED FUNCTIONS

name.remove(int index);//delete at element

name.set(int index, Object element);//same as put for hashmap

/*

There are still some functions not included here, refer to JDK for 
indepth discussion of all available functions

*/

name.toString();//inherited method, conver the arraylist to a single string

