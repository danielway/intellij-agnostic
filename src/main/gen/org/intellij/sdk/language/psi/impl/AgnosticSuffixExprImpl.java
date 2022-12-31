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

public class AgnosticSuffixExprImpl extends AgnosticExprImpl implements AgnosticSuffixExpr {

  public AgnosticSuffixExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull AgnosticVisitor visitor) {
    visitor.visitSuffixExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AgnosticVisitor) accept((AgnosticVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public AgnosticExpr getExpr() {
    return findNotNullChildByClass(AgnosticExpr.class);
  }

  @Override
  @NotNull
  public AgnosticSuffixOperator getSuffixOperator() {
    return findNotNullChildByClass(AgnosticSuffixOperator.class);
  }

}
