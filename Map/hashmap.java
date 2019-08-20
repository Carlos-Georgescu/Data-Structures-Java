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
}