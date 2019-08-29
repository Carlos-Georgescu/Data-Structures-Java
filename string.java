/*

	Strings are immutable in Java

	when you are appending strings

	watch out for the cost of operations

	String is backed by a char array

*/

[java]{

	String name = "Value";

	name.toLowerCase();

	name.toUpperCase();//very self explanatory

	name.substring(beginning , end-non inclusive)

	name.charAt(index);

	name.replace(String toBeErased, String rePlacement);

}[java]

// You can just add/append to the string same way you add/append to literals

//Using String builder because string is immutable

-----------------------------------------------------------
                 String Builder Usage
-----------------------------------------------------------

- Not the best for concurrency problems
- No gurantee of synchronization - not safe for multi-threading 

[java]{

	StringBuilder name = new StringBuilder(int capcity);
	StringBuilder name = new StringBuilder(String str);

	name.append();//append given argument to the end of the invoked object

	name.insert(Integer index, String toBeInserted);
	//insert behind given position
	name.replace(Integer index, String rePlacement);

	name.reverse();//revese the given string

	name.delete();//deletes from the specific end/beginning index
}


//the cost of operation for trimming a string
//what the fuck is regex and how do you split string?