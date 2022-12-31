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

public class AgnosticOperatorOverloadDeclarationImpl extends ASTWrapperPsiElement implements AgnosticOperatorOverloadDeclaration {

  public AgnosticOperatorOverloadDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AgnosticVisitor visitor) {
    visitor.visitOperatorOverloadDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AgnosticVisitor) accept((AgnosticVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<AgnosticBlock> getBlockList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AgnosticBlock.class);
  }

  @Override
  @NotNull
  public List<AgnosticExpressionStatement> getExpressionStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AgnosticExpressionStatement.class);
  }

  @Override
  @NotNull
  public List<AgnosticForStatement> getForStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AgnosticForStatement.class);
  }

  @Override
  @NotNull
  public List<AgnosticIfStatement> getIfStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AgnosticIfStatement.class);
  }

  @Override
  @NotNull
  public AgnosticParamsDeclaration getParamsDeclaration() {
    return findNotNullChildByClass(AgnosticParamsDeclaration.class);
  }

  @Override
  @NotNull
  public List<AgnosticReturnStatement> getReturnStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AgnosticReturnStatement.class);
  }

  @Override
  @Nullable
  public AgnosticReturnType getReturnType() {
    return findChildByClass(AgnosticReturnType.class);
  }

}
