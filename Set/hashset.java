/*
	Hashset does not allow duplicates
*/


HashSet name = new HashSet();

HashSet<Type> name = new HashSet<Type>();

HashSet name = new Hashset(int initialCapacity);

HashSet name = new Hashset(Collection); // can not iterate using : when initiated like so?

//Bottom line, just don't try to be fancy and stick the adding of hashset

name.add(value);//add to a hashset if it doesn't exist

name.contains(value);//check whether the hashset contains this value

name.clear();//clear all values of the array list

name.isEmpty(), Clone(), // very typical


public static HashSet set(int[] num){
	Set<Integer> ans = new HashSet<Integer>();

	for(int nums : num){
		ans.add(nums);
	}

	return ans;
}

public class Main {
    public static void main(String[] args) {
        int[] test = {1,2,3,4,5};
        Set<Integer> ans = set(test);
        for(int nums: ans){
            System.out.println(nums);
        }
    }
    
    public static Set set(int[] num){
        Set<Integer> ans = new HashSet<Integer>();

        for(int nums : num){
            ans.add(nums);
        }

        return ans;
    }
}

