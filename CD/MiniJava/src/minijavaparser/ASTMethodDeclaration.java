/* Generated By:JJTree: Do not edit this line. ASTMethodDeclaration.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=progen.Entity,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package minijavaparser;

public class ASTMethodDeclaration extends progen.ProgenNode {
	public boolean isStatic = false;
	
	public ASTMethodDeclaration(int id) {
		super(id);
	}

	public ASTMethodDeclaration(MiniJava p, int id) {
		super(p, id);
	}

	/** Accept the visitor. **/
	public Object jjtAccept(MiniJavaVisitor visitor, Object data) {
		return visitor.visit(this, data);
	}
}
/*
 * JavaCC - OriginalChecksum=1e8747249da76a65788a4ca8f9771470 (do not edit this
 * line)
 */
