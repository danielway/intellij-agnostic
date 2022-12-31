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

public class AgnosticInvocationExprImpl extends AgnosticExprImpl implements AgnosticInvocationExpr {

  public AgnosticInvocationExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull AgnosticVisitor visitor) {
    visitor.visitInvocationExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AgnosticVisitor) accept((AgnosticVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public AgnosticArgList getArgList() {
    return findNotNullChildByClass(AgnosticArgList.class);
  }

  @Override
  @NotNull
  public AgnosticReferenceExpr getReferenceExpr() {
    return findNotNullChildByClass(AgnosticReferenceExpr.class);
  }

}
