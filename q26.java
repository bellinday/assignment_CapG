package assignments;
import java.util.*;
import java.util.stream.Collectors;
public class question26 {
	public List<String> match(List<String> memberNames){
		class sortingMembers implements Comparator<String>{
			
			public int compare(String a, String b) {
				String c = a.toUpperCase();
				String d=b.toUpperCase();
				
				return c.compareTo(d);
			}
			
		}
		Collections.sort(memberNames,new sortingMembers());
		
		return(memberNames);
	}
	public long countA(List<String> memberNames) {
		long count=0;
		for(String i : memberNames) {
			for(int j=0; j< i.length();j++) {
				if(i.charAt(j)=='A')
					count++;
			}
		}
		return(count);
	}
	public static void main(String[] args) {
		List<String> memberNames = new ArrayList<>(Arrays.asList("Amitabh", "Shekhar", "Aman", "Rahul", "Shahrukh", "Salman", "Yana", "Lokesh"));
		question26 q = new question26();
		long n = q.countA(memberNames);
		List<String> l = q.match(memberNames);
		List<String> l1 = l.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(n);
		System.out.println(l1);
		
		
	}
}

