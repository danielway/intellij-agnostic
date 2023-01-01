// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.intellij.sdk.language.psi.AgnosticTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class AgnosticParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    boolean r;
    if (t == BLOCK) {
      r = block(b, l + 1);
    }
    else if (t == EXPR) {
      r = expr(b, l + 1, -1);
    }
    else {
      r = file(b, l + 1);
    }
    return r;
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(ARITHMETIC_EXPR, ARRAY_EXPR, ARRAY_INIT_EXPR, ASSIGN_EXPR,
      BOOL_AND_EXPR, BOOL_OR_EXPR, CONDITIONAL_EXPR, DECLARE_EXPR,
      EXPR, INDEX_EXPR, INVOCATION_EXPR, LITERAL_EXPR,
      PAREN_EXPR, PREFIX_EXPR, REFERENCE_EXPR, STRUCT_EXPR,
      SUFFIX_EXPR, TERNARY_EXPR),
  };

  /* ********************************************************** */
  // '(' [ !')' expr  (',' expr) * ] ')'
  public static boolean arg_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg_list")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ARG_LIST, null);
    r = consumeToken(b, LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, arg_list_1(b, l + 1));
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [ !')' expr  (',' expr) * ]
  private static boolean arg_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg_list_1")) return false;
    arg_list_1_0(b, l + 1);
    return true;
  }

  // !')' expr  (',' expr) *
  private static boolean arg_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg_list_1_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = arg_list_1_0_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, expr(b, l + 1, -1));
    r = p && arg_list_1_0_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // !')'
  private static boolean arg_list_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg_list_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' expr) *
  private static boolean arg_list_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg_list_1_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!arg_list_1_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "arg_list_1_0_2", c)) break;
    }
    return true;
  }

  // ',' expr
  private static boolean arg_list_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg_list_1_0_2_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, COMMA);
    p = r; // pin = 1
    r = r && expr(b, l + 1, -1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // '+' | '-' | '*' | '/'
  public static boolean arithmetic_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arithmetic_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARITHMETIC_OPERATOR, "<arithmetic operator>");
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    if (!r) r = consumeToken(b, MUL);
    if (!r) r = consumeToken(b, DIV);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '=' | '+=' | '-=' | '*=' | '\='
  public static boolean assignment_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT_OPERATOR, "<assignment operator>");
    r = consumeToken(b, EQ);
    if (!r) r = consumeToken(b, PLUSEQ);
    if (!r) r = consumeToken(b, MINUSEQ);
    if (!r) r = consumeToken(b, MULEQ);
    if (!r) r = consumeToken(b, "\\=");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '{' statements '}'
  public static boolean block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, BLOCK, null);
    r = consumeToken(b, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, statements(b, l + 1));
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // '||' | '&&'
  public static boolean boolean_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "boolean_operator")) return false;
    if (!nextTokenIs(b, "<boolean operator>", ANDAND, OROR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOLEAN_OPERATOR, "<boolean operator>");
    r = consumeToken(b, OROR);
    if (!r) r = consumeToken(b, ANDAND);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '<' | '>' | '<=' | '>=' | '==' | '!='
  public static boolean conditional_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITIONAL_OPERATOR, "<conditional operator>");
    r = consumeToken(b, LT);
    if (!r) r = consumeToken(b, GT);
    if (!r) r = consumeToken(b, LTEQ);
    if (!r) r = consumeToken(b, GTEQ);
    if (!r) r = consumeToken(b, EQEQ);
    if (!r) r = consumeToken(b, EXCLEQ);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'const' assign_expr ';'
  public static boolean constant_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTANT_DECLARATION, "<constant declaration>");
    r = consumeToken(b, "const");
    r = r && expr(b, l + 1, 0);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // !(')' | ';')
  static boolean expr_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !expr_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ')' | ';'
  private static boolean expr_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_recover_0")) return false;
    boolean r;
    r = consumeToken(b, RPAREN);
    if (!r) r = consumeToken(b, SEMICOLON);
    return r;
  }

  /* ********************************************************** */
  // expr
  public static boolean expr_with_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_with_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_WITH_RECOVER, "<expr with recover>");
    r = expr(b, l + 1, -1);
    exit_section_(b, l, m, r, false, AgnosticParser::expr_recover);
    return r;
  }

  /* ********************************************************** */
  // expr_with_recover ';'
  public static boolean expression_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_statement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_STATEMENT, "<expression statement>");
    r = expr_with_recover(b, l + 1);
    p = r; // pin = 1
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // top_level_declaration *
  static boolean file(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file")) return false;
    while (true) {
      int c = current_position_(b);
      if (!top_level_declaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "file", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // declare_expr 'in' simple_reference_expr
  public static boolean for_in_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_in_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FOR_IN_DECLARATION, "<for in declaration>");
    r = declare_expr(b, l + 1);
    r = r && consumeToken(b, "in");
    r = r && simple_reference_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'for' '(' (for_in_declaration | for_tuple_declaration) ')' statement
  public static boolean for_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FOR_STATEMENT, "<for statement>");
    r = consumeToken(b, "for");
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, LPAREN));
    r = p && report_error_(b, for_statement_2(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, RPAREN)) && r;
    r = p && statement(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // for_in_declaration | for_tuple_declaration
  private static boolean for_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_2")) return false;
    boolean r;
    r = for_in_declaration(b, l + 1);
    if (!r) r = for_tuple_declaration(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // assign_expr ';' conditional_group ';' expr
  public static boolean for_tuple_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_tuple_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FOR_TUPLE_DECLARATION, "<for tuple declaration>");
    r = expr(b, l + 1, 0);
    r = r && consumeToken(b, SEMICOLON);
    r = r && expr(b, l + 1, 3);
    r = r && consumeToken(b, SEMICOLON);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // function_name params_declaration (':' return_type)? '{' statements '}'
  public static boolean function_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_DECLARATION, null);
    r = function_name(b, l + 1);
    r = r && params_declaration(b, l + 1);
    p = r; // pin = 2
    r = r && report_error_(b, function_declaration_2(b, l + 1));
    r = p && report_error_(b, consumeToken(b, LBRACE)) && r;
    r = p && report_error_(b, statements(b, l + 1)) && r;
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (':' return_type)?
  private static boolean function_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration_2")) return false;
    function_declaration_2_0(b, l + 1);
    return true;
  }

  // ':' return_type
  private static boolean function_declaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && return_type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier
  public static boolean function_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_name")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    exit_section_(b, m, FUNCTION_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // id
  public static boolean identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    exit_section_(b, m, IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // 'if' '(' expr_with_recover ')' statement ('else' statement)?
  public static boolean if_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IF_STATEMENT, "<if statement>");
    r = consumeToken(b, "if");
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, LPAREN));
    r = p && report_error_(b, expr_with_recover(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, RPAREN)) && r;
    r = p && report_error_(b, statement(b, l + 1)) && r;
    r = p && if_statement_5(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ('else' statement)?
  private static boolean if_statement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_5")) return false;
    if_statement_5_0(b, l + 1);
    return true;
  }

  // 'else' statement
  private static boolean if_statement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "else");
    r = r && statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'model' identifier '{' (property_declaration | function_declaration | operator_overload_declaration) * '}'
  public static boolean model_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "model_declaration")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, MODEL_DECLARATION, "<model declaration>");
    r = consumeToken(b, "model");
    r = r && identifier(b, l + 1);
    p = r; // pin = 2
    r = r && report_error_(b, consumeToken(b, LBRACE));
    r = p && report_error_(b, model_declaration_3(b, l + 1)) && r;
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (property_declaration | function_declaration | operator_overload_declaration) *
  private static boolean model_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "model_declaration_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!model_declaration_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "model_declaration_3", c)) break;
    }
    return true;
  }

  // property_declaration | function_declaration | operator_overload_declaration
  private static boolean model_declaration_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "model_declaration_3_0")) return false;
    boolean r;
    r = property_declaration(b, l + 1);
    if (!r) r = function_declaration(b, l + 1);
    if (!r) r = operator_overload_declaration(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'module' identifier ';'?
  public static boolean module_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODULE_DECLARATION, "<module declaration>");
    r = consumeToken(b, "module");
    r = r && identifier(b, l + 1);
    r = r && module_declaration_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ';'?
  private static boolean module_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_declaration_2")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // ('@==' | '@hash') params_declaration (':' return_type)? '{' statements '}'
  public static boolean operator_overload_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator_overload_declaration")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, OPERATOR_OVERLOAD_DECLARATION, "<operator overload declaration>");
    r = operator_overload_declaration_0(b, l + 1);
    r = r && params_declaration(b, l + 1);
    p = r; // pin = 2
    r = r && report_error_(b, operator_overload_declaration_2(b, l + 1));
    r = p && report_error_(b, consumeToken(b, LBRACE)) && r;
    r = p && report_error_(b, statements(b, l + 1)) && r;
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // '@==' | '@hash'
  private static boolean operator_overload_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator_overload_declaration_0")) return false;
    boolean r;
    r = consumeToken(b, "@==");
    if (!r) r = consumeToken(b, "@hash");
    return r;
  }

  // (':' return_type)?
  private static boolean operator_overload_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator_overload_declaration_2")) return false;
    operator_overload_declaration_2_0(b, l + 1);
    return true;
  }

  // ':' return_type
  private static boolean operator_overload_declaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator_overload_declaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && return_type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier (':' type)?
  public static boolean param_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_declaration")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && param_declaration_1(b, l + 1);
    exit_section_(b, m, PARAM_DECLARATION, r);
    return r;
  }

  // (':' type)?
  private static boolean param_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_declaration_1")) return false;
    param_declaration_1_0(b, l + 1);
    return true;
  }

  // ':' type
  private static boolean param_declaration_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_declaration_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' ')' | '(' param_declaration (',' param_declaration)* ')'
  public static boolean params_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "params_declaration")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, LPAREN, RPAREN);
    if (!r) r = params_declaration_1(b, l + 1);
    exit_section_(b, m, PARAMS_DECLARATION, r);
    return r;
  }

  // '(' param_declaration (',' param_declaration)* ')'
  private static boolean params_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "params_declaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && param_declaration(b, l + 1);
    r = r && params_declaration_1_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' param_declaration)*
  private static boolean params_declaration_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "params_declaration_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!params_declaration_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "params_declaration_1_2", c)) break;
    }
    return true;
  }

  // ',' param_declaration
  private static boolean params_declaration_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "params_declaration_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && param_declaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '!' | '++' | '--' | '-'
  public static boolean prefix_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefix_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PREFIX_OPERATOR, "<prefix operator>");
    r = consumeToken(b, EXCL);
    if (!r) r = consumeToken(b, "++");
    if (!r) r = consumeToken(b, "--");
    if (!r) r = consumeToken(b, MINUS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier ':' expr ','?
  public static boolean property_assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_assignment")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && expr(b, l + 1, -1);
    r = r && property_assignment_3(b, l + 1);
    exit_section_(b, m, PROPERTY_ASSIGNMENT, r);
    return r;
  }

  // ','?
  private static boolean property_assignment_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_assignment_3")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // identifier ':' type ';'
  public static boolean property_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_declaration")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, PROPERTY_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // 'return' expr? ';'
  public static boolean return_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_statement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RETURN_STATEMENT, "<return statement>");
    r = consumeToken(b, "return");
    p = r; // pin = 1
    r = r && report_error_(b, return_statement_1(b, l + 1));
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // expr?
  private static boolean return_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_statement_1")) return false;
    expr(b, l + 1, -1);
    return true;
  }

  /* ********************************************************** */
  // type
  public static boolean return_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_type")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    exit_section_(b, m, RETURN_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // block
  //   | for_statement
  //   | if_statement
  //   | return_statement
  //   | expression_statement
  static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    r = block(b, l + 1);
    if (!r) r = for_statement(b, l + 1);
    if (!r) r = if_statement(b, l + 1);
    if (!r) r = return_statement(b, l + 1);
    if (!r) r = expression_statement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // statement *
  static boolean statements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statements")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "statements", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // '++' | '--'
  public static boolean suffix_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "suffix_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUFFIX_OPERATOR, "<suffix operator>");
    r = consumeToken(b, "++");
    if (!r) r = consumeToken(b, "--");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // constant_declaration
  //   | module_declaration
  //   | function_declaration
  //   | model_declaration
  static boolean top_level_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "top_level_declaration")) return false;
    boolean r;
    r = constant_declaration(b, l + 1);
    if (!r) r = module_declaration(b, l + 1);
    if (!r) r = function_declaration(b, l + 1);
    if (!r) r = model_declaration(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // identifier ('<' type '>')?
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && type_1(b, l + 1);
    exit_section_(b, m, TYPE, r);
    return r;
  }

  // ('<' type '>')?
  private static boolean type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_1")) return false;
    type_1_0(b, l + 1);
    return true;
  }

  // '<' type '>'
  private static boolean type_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression root: expr
  // Operator priority table:
  // 0: ATOM(declare_expr)
  // 1: BINARY(assign_expr)
  // 2: ATOM(array_init_expr)
  // 3: BINARY(bool_or_expr) BINARY(bool_and_expr)
  // 4: BINARY(ternary_expr) BINARY(conditional_expr)
  // 5: BINARY(index_expr)
  // 6: PREFIX(prefix_expr)
  // 7: POSTFIX(suffix_expr)
  // 8: BINARY(arithmetic_expr)
  // 9: POSTFIX(invocation_expr)
  // 10: POSTFIX(qualified_reference_expr)
  // 11: ATOM(struct_expr) ATOM(simple_reference_expr) ATOM(literal_expr) ATOM(array_expr)
  //    PREFIX(paren_expr)
  public static boolean expr(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expr")) return false;
    addVariant(b, "<expr>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<expr>");
    r = declare_expr(b, l + 1);
    if (!r) r = array_init_expr(b, l + 1);
    if (!r) r = prefix_expr(b, l + 1);
    if (!r) r = struct_expr(b, l + 1);
    if (!r) r = simple_reference_expr(b, l + 1);
    if (!r) r = literal_expr(b, l + 1);
    if (!r) r = array_expr(b, l + 1);
    if (!r) r = paren_expr(b, l + 1);
    p = r;
    r = r && expr_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean expr_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expr_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 1 && assignment_operator(b, l + 1)) {
        r = expr(b, l, 0);
        exit_section_(b, l, m, ASSIGN_EXPR, r, true, null);
      }
      else if (g < 3 && consumeTokenSmart(b, OROR)) {
        r = expr(b, l, 3);
        exit_section_(b, l, m, BOOL_OR_EXPR, r, true, null);
      }
      else if (g < 3 && consumeTokenSmart(b, ANDAND)) {
        r = expr(b, l, 3);
        exit_section_(b, l, m, BOOL_AND_EXPR, r, true, null);
      }
      else if (g < 4 && consumeTokenSmart(b, "?")) {
        r = report_error_(b, expr(b, l, 4));
        r = ternary_expr_1(b, l + 1) && r;
        exit_section_(b, l, m, TERNARY_EXPR, r, true, null);
      }
      else if (g < 4 && conditional_expr_0(b, l + 1)) {
        r = expr(b, l, 4);
        exit_section_(b, l, m, CONDITIONAL_EXPR, r, true, null);
      }
      else if (g < 5 && leftMarkerIs(b, REFERENCE_EXPR) && consumeTokenSmart(b, LBRACK)) {
        r = report_error_(b, expr(b, l, 5));
        r = consumeToken(b, RBRACK) && r;
        exit_section_(b, l, m, INDEX_EXPR, r, true, null);
      }
      else if (g < 7 && suffix_operator(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, SUFFIX_EXPR, r, true, null);
      }
      else if (g < 8 && arithmetic_operator(b, l + 1)) {
        r = expr(b, l, 8);
        exit_section_(b, l, m, ARITHMETIC_EXPR, r, true, null);
      }
      else if (g < 9 && leftMarkerIs(b, REFERENCE_EXPR) && arg_list(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, INVOCATION_EXPR, r, true, null);
      }
      else if (g < 10 && qualified_reference_expr_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, REFERENCE_EXPR, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // 'var' identifier
  public static boolean declare_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declare_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECLARE_EXPR, "<declare expr>");
    r = consumeTokenSmart(b, "var");
    r = r && identifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'make' '(' type ')'
  public static boolean array_init_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_init_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARRAY_INIT_EXPR, "<array init expr>");
    r = consumeTokenSmart(b, "make");
    r = r && consumeToken(b, LPAREN);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ':' expr
  private static boolean ternary_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ternary_expr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // boolean_operator | conditional_operator
  private static boolean conditional_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_expr_0")) return false;
    boolean r;
    r = boolean_operator(b, l + 1);
    if (!r) r = conditional_operator(b, l + 1);
    return r;
  }

  public static boolean prefix_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefix_expr")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = prefix_operator(b, l + 1);
    p = r;
    r = p && expr(b, l, 6);
    exit_section_(b, l, m, PREFIX_EXPR, r, p, null);
    return r || p;
  }

  // '.' identifier
  private static boolean qualified_reference_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualified_reference_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, DOT);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type '{' property_assignment * '}'
  public static boolean struct_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_expr")) return false;
    if (!nextTokenIsSmart(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && struct_expr_2(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, STRUCT_EXPR, r);
    return r;
  }

  // property_assignment *
  private static boolean struct_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_expr_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!property_assignment(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "struct_expr_2", c)) break;
    }
    return true;
  }

  // identifier
  public static boolean simple_reference_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_reference_expr")) return false;
    if (!nextTokenIsSmart(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    exit_section_(b, m, REFERENCE_EXPR, r);
    return r;
  }

  // number | string
  public static boolean literal_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_expr")) return false;
    if (!nextTokenIsSmart(b, NUMBER, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_EXPR, "<literal expr>");
    r = consumeTokenSmart(b, NUMBER);
    if (!r) r = consumeTokenSmart(b, STRING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '[' expr? (',' expr)* ']'
  public static boolean array_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_expr")) return false;
    if (!nextTokenIsSmart(b, LBRACK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LBRACK);
    r = r && array_expr_1(b, l + 1);
    r = r && array_expr_2(b, l + 1);
    r = r && consumeToken(b, RBRACK);
    exit_section_(b, m, ARRAY_EXPR, r);
    return r;
  }

  // expr?
  private static boolean array_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_expr_1")) return false;
    expr(b, l + 1, -1);
    return true;
  }

  // (',' expr)*
  private static boolean array_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_expr_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!array_expr_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "array_expr_2", c)) break;
    }
    return true;
  }

  // ',' expr
  private static boolean array_expr_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_expr_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, COMMA);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean paren_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_expr")) return false;
    if (!nextTokenIsSmart(b, LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, LPAREN);
    p = r;
    r = p && expr(b, l, -1);
    r = p && report_error_(b, consumeToken(b, RPAREN)) && r;
    exit_section_(b, l, m, PAREN_EXPR, r, p, null);
    return r || p;
  }

}
