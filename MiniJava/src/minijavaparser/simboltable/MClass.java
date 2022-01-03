package minijavaparser.simboltable;

import java.util.LinkedList;

public class MClass {
	public String declName;
	public MClass superclass = null;
	
	public LinkedList<MFunc> metods = null;
	public LinkedList<MVar> fields = null;
	
	public void addField(MVar field) {fields.add(field);}
	public void addMethod(MFunc field) {metods.add(field);}
}
