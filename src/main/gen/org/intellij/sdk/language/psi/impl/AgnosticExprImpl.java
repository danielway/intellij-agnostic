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

public abstract class AgnosticExprImpl extends ASTWrapperPsiElement implements AgnosticExpr {

  public AgnosticExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AgnosticVisitor visitor) {
    visitor.visitExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AgnosticVisitor) accept((AgnosticVisitor)visitor);
    else super.accept(visitor);
  }

}
