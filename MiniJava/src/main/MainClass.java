package main;

import java.io.*;
import mainframe.MainFrame;
import minijavaparser.*;
import minijavaparser.visitors.*;

public class MainClass 
{
	public static void main(String args[]) 
	{
	    try 
	    {
	      	MiniJava p = new MiniJava(new FileInputStream(new File("./samples/test01.java")));
	    	ASTProgram root = p.Program();
	    	//root.dump("+");

			MainFrame frame=new MainFrame(root);
			frame.setVisible(true);	
	    	
	    	MiniJavaVisitor vis = new DumpVisitor();
	    	
	    	root.jjtAccept(vis, null);
			
			System.out.println("Thank you.");
	    } 
	    catch(Exception e)
	    {									      
			System.err.println("Oops.");
			System.err.println(e.getMessage());
			e.printStackTrace();
	    }
	}
}
