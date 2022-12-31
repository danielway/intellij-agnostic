// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.sdk.language.psi.AgnosticTypes.*;
import org.intellij.sdk.language.psi.*;

public class AgnosticConditionalExprImpl extends AgnosticExprImpl implements AgnosticConditionalExpr {

  public AgnosticConditionalExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull AgnosticVisitor visitor) {
    visitor.visitConditionalExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AgnosticVisitor) accept((AgnosticVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AgnosticBooleanOperator getBooleanOperator() {
    return findChildByClass(AgnosticBooleanOperator.class);
  }

  @Override
  @Nullable
  public AgnosticConditionalOperator getConditionalOperator() {
    return findChildByClass(AgnosticConditionalOperator.class);
  }

  @Override
  @NotNull
  public List<AgnosticExpr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AgnosticExpr.class);
  }

}
