package musta.belmo.svg;

import com.github.javaparser.ast.*;
import com.github.javaparser.ast.body.*;
import com.github.javaparser.ast.comments.BlockComment;
import com.github.javaparser.ast.comments.JavadocComment;
import com.github.javaparser.ast.comments.LineComment;
import com.github.javaparser.ast.expr.*;
import com.github.javaparser.ast.modules.*;
import com.github.javaparser.ast.stmt.*;
import com.github.javaparser.ast.type.*;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import musta.belmo.svg.shapes.AbstractShape;

import java.util.List;

public class NodeToShapeVisitor extends VoidVisitorAdapter<List<AbstractShape>> {
    int methodLevel = 1;
    int classLevel = 0;


    @Override
    public void visit(AnnotationDeclaration n, List<AbstractShape> arg) {

    }

    @Override
    public void visit(AnnotationMemberDeclaration n, List<AbstractShape> arg) {

    }

    @Override
    public void visit(ArrayAccessExpr n, List<AbstractShape> arg) {

    }

    @Override
    public void visit(ArrayCreationExpr n, List<AbstractShape> arg) {

    }

    @Override
    public void visit(ArrayInitializerExpr n, List<AbstractShape> arg) {

    }

    @Override
    public void visit(AssertStmt n, List<AbstractShape> arg) {

    }

    @Override
    public void visit(AssignExpr n, List<AbstractShape> arg) {

    }

    @Override
    public void visit(BinaryExpr n, List<AbstractShape> arg) {

    }

    @Override
    public void visit(BlockComment n, List<AbstractShape> arg) {

    }

    @Override
    public void visit(BlockStmt n, List<AbstractShape> arg) {

    }

    @Override
    public void visit(BooleanLiteralExpr n, List<AbstractShape> arg) {

    }

    @Override
    public void visit(BreakStmt n, List<AbstractShape> arg) {

    }

    @Override
    public void visit(CastExpr n, List<AbstractShape> arg) {

    }

    @Override
    public void visit(CatchClause n, List<AbstractShape> arg) {

    }

    @Override
    public void visit(CharLiteralExpr n, List<AbstractShape> arg) {

    }

    @Override
    public void visit(ClassExpr n, List<AbstractShape> arg) {

    }

    @Override
    public void visit(ClassOrInterfaceDeclaration n, List<AbstractShape> arg) {
        List<AbstractShape> shape = Factory.generateClassShape(30, 50 + 20 * classLevel, 100, n.getNameAsString());
        arg.addAll(shape);
        classLevel++;
        super.visit(n, arg);
    }

    @Override
    public void visit(ClassOrInterfaceType n, List<AbstractShape> arg) {

    }

    @Override
    public void visit(CompilationUnit n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(ConditionalExpr n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(ConstructorDeclaration n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(ContinueStmt n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(DoStmt n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(DoubleLiteralExpr n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(EmptyStmt n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(EnclosedExpr n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(EnumConstantDeclaration n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(EnumDeclaration n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(ExplicitConstructorInvocationStmt n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(ExpressionStmt n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(FieldAccessExpr n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(FieldDeclaration n, List<AbstractShape> arg) {
        AbstractShape rectangle = Factory.createTextShape("n.getNameAsString()", 30, 50 + 80 * methodLevel, 100, 100);
        arg.add(rectangle);
        methodLevel++;
        super.visit(n, arg);
    }

    @Override
    public void visit(ForeachStmt n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(ForStmt n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(IfStmt n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(InitializerDeclaration n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(InstanceOfExpr n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(IntegerLiteralExpr n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(JavadocComment n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(LabeledStmt n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(LineComment n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(LongLiteralExpr n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(MarkerAnnotationExpr n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(MemberValuePair n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(MethodCallExpr n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(MethodDeclaration n, List<AbstractShape> arg) {
        AbstractShape rectangle = Factory.createTextShape(n.getNameAsString(), 30, 50 + 80 * methodLevel, 100, 100);
        arg.add(rectangle);
        methodLevel++;
        super.visit(n, arg);
    }

    @Override
    public void visit(NameExpr n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(NormalAnnotationExpr n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(NullLiteralExpr n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }


    @Override
    public void visit(PackageDeclaration n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(Parameter n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(PrimitiveType n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(Name n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(SimpleName n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(ArrayType n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(ArrayCreationLevel n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(IntersectionType n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(UnionType n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(ReturnStmt n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(SingleMemberAnnotationExpr n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(StringLiteralExpr n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(SuperExpr n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(SwitchEntryStmt n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(SwitchStmt n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(SynchronizedStmt n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(ThisExpr n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(ThrowStmt n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(TryStmt n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(LocalClassDeclarationStmt n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(TypeParameter n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(UnaryExpr n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(UnknownType n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(VariableDeclarationExpr n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(VariableDeclarator n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(VoidType n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(WhileStmt n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(WildcardType n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(LambdaExpr n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(MethodReferenceExpr n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(TypeExpr n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(NodeList n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(ImportDeclaration n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(ModuleDeclaration n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(ModuleRequiresStmt n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(ModuleExportsStmt n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(ModuleProvidesStmt n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(ModuleUsesStmt n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(ModuleOpensStmt n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(UnparsableStmt n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(ReceiverParameter n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }

    @Override
    public void visit(VarType n, List<AbstractShape> arg) {
        super.visit(n, arg);
    }
}
