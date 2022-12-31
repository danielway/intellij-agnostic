// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AgnosticIfStatement extends PsiElement {

  @NotNull
  List<AgnosticBlock> getBlockList();

  @Nullable
  AgnosticExprWithRecover getExprWithRecover();

  @NotNull
  List<AgnosticExpressionStatement> getExpressionStatementList();

  @NotNull
  List<AgnosticForStatement> getForStatementList();

  @NotNull
  List<AgnosticIfStatement> getIfStatementList();

  @NotNull
  List<AgnosticReturnStatement> getReturnStatementList();

}
