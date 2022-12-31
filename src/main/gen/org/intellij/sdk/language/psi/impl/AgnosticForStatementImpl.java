// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.sdk.language.psi.AgnosticTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.intellij.sdk.language.psi.*;

public class AgnosticForStatementImpl extends ASTWrapperPsiElement implements AgnosticForStatement {

  public AgnosticForStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AgnosticVisitor visitor) {
    visitor.visitForStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AgnosticVisitor) accept((AgnosticVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AgnosticBlock getBlock() {
    return findChildByClass(AgnosticBlock.class);
  }

  @Override
  @Nullable
  public AgnosticExpressionStatement getExpressionStatement() {
    return findChildByClass(AgnosticExpressionStatement.class);
  }

  @Override
  @Nullable
  public AgnosticForInDeclaration getForInDeclaration() {
    return findChildByClass(AgnosticForInDeclaration.class);
  }

  @Override
  @Nullable
  public AgnosticForStatement getForStatement() {
    return findChildByClass(AgnosticForStatement.class);
  }

  @Override
  @Nullable
  public AgnosticForTupleDeclaration getForTupleDeclaration() {
    return findChildByClass(AgnosticForTupleDeclaration.class);
  }

  @Override
  @Nullable
  public AgnosticIfStatement getIfStatement() {
    return findChildByClass(AgnosticIfStatement.class);
  }

  @Override
  @Nullable
  public AgnosticReturnStatement getReturnStatement() {
    return findChildByClass(AgnosticReturnStatement.class);
  }

}
