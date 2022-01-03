package minijavaparser.visitors;

import java.util.List;

import minijavaparser.ASTAdOp;
import minijavaparser.ASTAndCond;
import minijavaparser.ASTArExp;
import minijavaparser.ASTClassDecl;
import minijavaparser.ASTExpFinal;
import minijavaparser.ASTExpList;
import minijavaparser.ASTFactor;
import minijavaparser.ASTFactorRest;
import minijavaparser.ASTFormalList;
import minijavaparser.ASTFormalRest;
import minijavaparser.ASTLogFactor;
import minijavaparser.ASTMainClass;
import minijavaparser.ASTMainFuncDecl;
import minijavaparser.ASTMethodDecl;
import minijavaparser.ASTMulOp;
import minijavaparser.ASTOrCond;
import minijavaparser.ASTProgram;
import minijavaparser.ASTRelExp;
import minijavaparser.ASTStatement;
import minijavaparser.ASTTerm;
import minijavaparser.ASTVarDecl;
import minijavaparser.ASTVarType;
import minijavaparser.MiniJavaVisitor;
import minijavaparser.SimpleNode;
import minijavaparser.Token;

public class DumpVisitor implements MiniJavaVisitor {

	
	@Override
	public Object visit(SimpleNode node, Object data) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private Object dumpVisitExecute(SimpleNode node, Object data) {
		System.out.println(((String)data) + node + " : ");
		node.childrenAccept(this, ((String)data) + " ");
		return data;
	}
	
	@Override
	public Object visit(ASTProgram node, Object data) {
		if(data == null || !(data instanceof String))
			data = " ";
		return dumpVisitExecute(node,data);
	}

	@Override
	public Object visit(ASTMainClass node, Object data) {
		return dumpVisitExecute(node,data);
	}

	@Override
	public Object visit(ASTMainFuncDecl node, Object data) {
		return dumpVisitExecute(node,data);
	}

	@Override
	public Object visit(ASTClassDecl node, Object data) {
		return dumpVisitExecute(node,data);
	}

	@Override
	public Object visit(ASTVarDecl node, Object data) {
		return dumpVisitExecute(node,data);
	}

	@Override
	public Object visit(ASTMethodDecl node, Object data) {
		return dumpVisitExecute(node,data);
	}

	@Override
	public Object visit(ASTFormalList node, Object data) {
		return dumpVisitExecute(node,data);
	}

	@Override
	public Object visit(ASTFormalRest node, Object data) {
		return dumpVisitExecute(node,data);
	}

	@Override
	public Object visit(ASTVarType node, Object data) {
		return dumpVisitExecute(node,data);
	}

	@Override
	public Object visit(ASTStatement node, Object data) {
		return dumpVisitExecute(node,data);
	}

	@Override
	public Object visit(ASTOrCond node, Object data) {
		return dumpVisitExecute(node,data);
	}

	@Override
	public Object visit(ASTAndCond node, Object data) {
		return dumpVisitExecute(node,data);
	}

	@Override
	public Object visit(ASTLogFactor node, Object data) {
		return dumpVisitExecute(node,data);
	}

	@Override
	public Object visit(ASTRelExp node, Object data) {
		return dumpVisitExecute(node,data);
	}

	@Override
	public Object visit(ASTAdOp node, Object data) {
		return dumpVisitExecute(node,data);
	}

	@Override
	public Object visit(ASTArExp node, Object data) {
		return dumpVisitExecute(node,data);
	}

	@Override
	public Object visit(ASTTerm node, Object data) {
		return dumpVisitExecute(node,data);
	}

	@Override
	public Object visit(ASTMulOp node, Object data) {
		return dumpVisitExecute(node,data);
	}

	@Override
	public Object visit(ASTFactor node, Object data) {
		return dumpVisitExecute(node,data);
	}

	@Override
	public Object visit(ASTFactorRest node, Object data) {
		return dumpVisitExecute(node,data);
	}

	@Override
	public Object visit(ASTExpFinal node, Object data) {
		return dumpVisitExecute(node,data);
	}

	@Override
	public Object visit(ASTExpList node, Object data) {
		return dumpVisitExecute(node,data);
	}

}
