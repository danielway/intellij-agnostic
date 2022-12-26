// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.intellij.sdk.language.psi.impl.*;

public interface AgnosticTypes {

  IElementType PROPERTY = new AgnosticElementType("PROPERTY");

  IElementType COMMENT = new AgnosticTokenType("COMMENT");
  IElementType CRLF = new AgnosticTokenType("CRLF");
  IElementType KEY = new AgnosticTokenType("KEY");
  IElementType SEPARATOR = new AgnosticTokenType("SEPARATOR");
  IElementType VALUE = new AgnosticTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new AgnosticPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
