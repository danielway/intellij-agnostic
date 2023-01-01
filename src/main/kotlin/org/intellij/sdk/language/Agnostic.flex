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

  "{"                { return LBRACE; }
  "}"                { return RBRACE; }
  "["                { return LBRACK; }
  "]"                { return RBRACK; }
  "("                { return LPAREN; }
  ")"                { return RPAREN; }
  ":"                { return COLON; }
  ";"                { return SEMICOLON; }
  ","                { return COMMA; }
  "="                { return EQ; }
  "!="               { return EXCLEQ; }
  "=="               { return EQEQ; }
  "#"                { return SHA; }
  "!"                { return EXCL; }
  "+="               { return PLUSEQ; }
  "+"                { return PLUS; }
  "-="               { return MINUSEQ; }
  "-"                { return MINUS; }
  "&&"               { return ANDAND; }
  "<"                { return LT; }
  "*="               { return MULEQ; }
  "*"                { return MUL; }
  "/="               { return DIVEQ; }
  "/"                { return DIV; }
  ">"                { return GT; }
  "."                { return DOT; }
  "@"                { return AT; }
  ">="               { return GTEQ; }
  "<="               { return LTEQ; }
  "||"               { return OROR; }

  {SPACE}            { return SPACE; }
  {COMMENT}          { return COMMENT; }
  {ID}               { return ID; }
  {NUMBER}           { return NUMBER; }
  {STRING}           { return STRING; }

}

[^] { return BAD_CHARACTER; }
