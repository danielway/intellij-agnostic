package org.intellij.sdk.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static org.intellij.sdk.language.psi.AgnosticTypes.*;

%%

%{
  public AgnosticLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class AgnosticLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

SPACE=[ \t\n\x0B\f\r]+
COMMENT="//".*
ID=[:letter:][a-zA-Z_0-9]*
NUMBER=[0-9]+(\.[0-9]*)?
STRING=('([^'\\]|\\.)*'|\"([^\"\\]|\\.)*\")

%%
<YYINITIAL> {
  {WHITE_SPACE}      { return WHITE_SPACE; }


  {SPACE}            { return SPACE; }
  {COMMENT}          { return COMMENT; }
  {ID}               { return ID; }
  {NUMBER}           { return NUMBER; }
  {STRING}           { return STRING; }

}

[^] { return BAD_CHARACTER; }
