// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AgnosticForStatement extends PsiElement {

  @Nullable
  AgnosticBlock getBlock();

  @Nullable
  AgnosticExpressionStatement getExpressionStatement();

  @Nullable
  AgnosticForInDeclaration getForInDeclaration();

  @Nullable
  AgnosticForStatement getForStatement();

  @Nullable
  AgnosticForTupleDeclaration getForTupleDeclaration();

  @Nullable
  AgnosticIfStatement getIfStatement();

  @Nullable
  AgnosticReturnStatement getReturnStatement();

}
