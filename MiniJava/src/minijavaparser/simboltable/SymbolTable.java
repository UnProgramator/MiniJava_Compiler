package minijavaparser.simboltable;

import java.util.LinkedList;

public class SymbolTable {
	public static LinkedList<MClass> classeTable;
	public static LinkedList<MType> TypeTable;
	
	public static void init() {
		classeTable = new LinkedList<MClass>();
		TypeTable = new LinkedList<MType>();
		
		//populate type table with primite types, later with the predefined classes.
		MType initType;

		// int
		initType = new MType();
		initType.typeName = "int";
		TypeTable.add(initType);
		/*
		 * int[] este trata separat prin variabila isArray din MVar, intrare in tabela
		 * de simoluri a variabilelor. Poate schimb initType = new MType();
		 * initType.typeName = "int[]"; TypeTable.add(initType);
		 */

		// boolean
		initType = new MType();
		initType.typeName = "boolean";
		TypeTable.add(initType);
		
		// populate class table with the predefined classes
		MClass initTemp;
		
		//add Object class
		initTemp = new MClass();
		initTemp.declName = "Object";
		classeTable.add(initTemp);
		
		//add Object class into type table
		initType = new MType();
		initType.typeName = initTemp.declName;
		initType.declType = initTemp;
		TypeTable.add(initType);
		
		//add String class type
		initTemp = new MClass();
		initTemp.declName = "String";
		initTemp.superclass = classeTable.get(0);
		classeTable.add(initTemp);
		
		//add String class into type table
		initType = new MType();
		initType.typeName = initTemp.declName;
		initType.declType = initTemp;
		TypeTable.add(initType);
	}
}
