package minijavaparser.simboltable;

import java.util.LinkedList;

public class MFunc {
	public String declName;
	public MType declRetType;
	
	public LinkedList<MVar> parameters = null;
	public LinkedList<MVar> localVars = null;
	public MClass parent;
	
	
	public boolean addParam(MVar newParam) { if(parameters == null) parameters = new LinkedList<MVar>(); return parameters.add(newParam);}
}
