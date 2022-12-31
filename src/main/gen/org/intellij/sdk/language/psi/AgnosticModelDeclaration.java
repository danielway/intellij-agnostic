// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AgnosticModelDeclaration extends PsiElement {

  @NotNull
  List<AgnosticFunctionDeclaration> getFunctionDeclarationList();

  @NotNull
  AgnosticIdentifier getIdentifier();

  @NotNull
  List<AgnosticOperatorOverloadDeclaration> getOperatorOverloadDeclarationList();

  @NotNull
  List<AgnosticPropertyDeclaration> getPropertyDeclarationList();

}
