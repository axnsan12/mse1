/* Generated By:JJTree: Do not edit this line. ASTAssignmentStatement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=progen.Entity,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package minijavaparser;

public
class ASTAssignmentStatement extends progen.ProgenNode {
  public ASTAssignmentStatement(int id) {
    super(id);
  }

  public ASTAssignmentStatement(MiniJava p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(MiniJavaVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=fffe68644e03cc2ca15ff97e811552d7 (do not edit this line) */