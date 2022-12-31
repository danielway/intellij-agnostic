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

public class AgnosticStructExprImpl extends AgnosticExprImpl implements AgnosticStructExpr {

  public AgnosticStructExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull AgnosticVisitor visitor) {
    visitor.visitStructExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AgnosticVisitor) accept((AgnosticVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<AgnosticPropertyAssignment> getPropertyAssignmentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AgnosticPropertyAssignment.class);
  }

  @Override
  @NotNull
  public AgnosticType getType() {
    return findNotNullChildByClass(AgnosticType.class);
  }

}
