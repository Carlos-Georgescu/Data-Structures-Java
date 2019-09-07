-----------------------------------------------------------
    HashMap
-----------------------------------------------------------

HashMap is used for fast look up and fast removal

Load Factor: The percent of HashMap being filled up before it's capacity is increased

Parameters: Initial Capacity and load factor

Default Params: 16, 0.75F(as in 75 percent full)

[java]{
	HashMap<keyType, ValueType> name = new HashMap<keyType, ValueType>()

	name.put(key, value);

	name.containsKey(key);// return boolean

	name.get(key); 

	name.remove;

	name.clear;

	name.size;

	//How do one iterated through a hashmap

	HashMap<String, Integer> map = new HashMap<Character, Integer>();

	for(Map.Entry element: map.entrySet()){
		String key = (String)element.getKey();
		int val = (int)element.getValue();
	}
	
}[java]