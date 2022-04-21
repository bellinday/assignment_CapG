package assignments;

import java.util.*;

class Program {
	public String name;
	public  boolean value;
	public ArrayList<String> tags;
	public Program(String name, boolean value, ArrayList<String> tags){
		this.name=name;
		this.value=value;
		this.tags=tags;
	}
}
class Menu{
	public Program prog;
	public Menu(Program p) {
		prog=p;
	}
	public String addProgram() {
		String sname;
		if(prog.value==false) {
			prog.value=true;
		return("Boolean changed");}
		else {
		sname=prog.name;
		String stringname="";
		String[] names=sname.split(" ");
		for(String i : names) {
			i=i.substring(0, 1).toUpperCase()+i.substring(1).toLowerCase()+" ";
			stringname=stringname+i;
		}
		//System.out.println(stringname);
		return("Program ready");
		}	
			
	}
	public String runQuery(String query) {
		int tag=0;
		String[] str = query.split(",");
		for(int i=0;i<str.length;i++) {
			
				if(!(prog.tags.contains(str[i])))
					tag=tag+1;
			
		}
		if(tag==0)
			return"No changes";
		else
			return tag+" tags added";
		
	}
}
class question29{
	public static void main(String[] args) {
	Program p = new Program("recontile program", true, new ArrayList<String>(Arrays.asList("C","D")));
	Menu m = new Menu(p);
	String string = m.addProgram();
	String st = m.runQuery("A,B");
	System.out.println(string);
	System.out.println(st);
	}
}

