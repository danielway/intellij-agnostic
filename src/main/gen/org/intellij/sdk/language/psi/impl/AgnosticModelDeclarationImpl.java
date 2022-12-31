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

public class AgnosticModelDeclarationImpl extends ASTWrapperPsiElement implements AgnosticModelDeclaration {

  public AgnosticModelDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AgnosticVisitor visitor) {
    visitor.visitModelDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AgnosticVisitor) accept((AgnosticVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<AgnosticFunctionDeclaration> getFunctionDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AgnosticFunctionDeclaration.class);
  }

  @Override
  @NotNull
  public AgnosticIdentifier getIdentifier() {
    return findNotNullChildByClass(AgnosticIdentifier.class);
  }

  @Override
  @NotNull
  public List<AgnosticOperatorOverloadDeclaration> getOperatorOverloadDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AgnosticOperatorOverloadDeclaration.class);
  }

  @Override
  @NotNull
  public List<AgnosticPropertyDeclaration> getPropertyDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AgnosticPropertyDeclaration.class);
  }

}
