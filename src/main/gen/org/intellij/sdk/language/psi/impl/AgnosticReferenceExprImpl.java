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

public class AgnosticReferenceExprImpl extends AgnosticExprImpl implements AgnosticReferenceExpr {

  public AgnosticReferenceExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull AgnosticVisitor visitor) {
    visitor.visitReferenceExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AgnosticVisitor) accept((AgnosticVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AgnosticExpr getExpr() {
    return findChildByClass(AgnosticExpr.class);
  }

  @Override
  @NotNull
  public AgnosticIdentifier getIdentifier() {
    return findNotNullChildByClass(AgnosticIdentifier.class);
  }

}
