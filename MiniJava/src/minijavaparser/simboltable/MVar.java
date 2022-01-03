package minijavaparser.simboltable;

public class MVar {
	public String declName;
	public MType declType;
	public boolean isArray=false;
	public int size = -1; // voi tine separat size doar pentru claritate. Pentru o mica optimizare o optiune ar fi: -1 se considera nu array, 0 array neinitializat si >0 array initializat
}
