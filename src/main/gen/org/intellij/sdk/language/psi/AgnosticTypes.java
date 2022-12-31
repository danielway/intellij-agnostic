// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.intellij.sdk.language.psi.impl.*;

public interface AgnosticTypes {

  IElementType ARG_LIST = new AgnosticElementType("ARG_LIST");
  IElementType ARITHMETIC_EXPR = new AgnosticElementType("ARITHMETIC_EXPR");
  IElementType ARITHMETIC_OPERATOR = new AgnosticElementType("ARITHMETIC_OPERATOR");
  IElementType ARRAY_EXPR = new AgnosticElementType("ARRAY_EXPR");
  IElementType ARRAY_INIT_EXPR = new AgnosticElementType("ARRAY_INIT_EXPR");
  IElementType ASSIGNMENT_OPERATOR = new AgnosticElementType("ASSIGNMENT_OPERATOR");
  IElementType ASSIGN_EXPR = new AgnosticElementType("ASSIGN_EXPR");
  IElementType BLOCK = new AgnosticElementType("BLOCK");
  IElementType BOOLEAN_OPERATOR = new AgnosticElementType("BOOLEAN_OPERATOR");
  IElementType BOOL_AND_EXPR = new AgnosticElementType("BOOL_AND_EXPR");
  IElementType BOOL_OR_EXPR = new AgnosticElementType("BOOL_OR_EXPR");
  IElementType CONDITIONAL_EXPR = new AgnosticElementType("CONDITIONAL_EXPR");
  IElementType CONDITIONAL_OPERATOR = new AgnosticElementType("CONDITIONAL_OPERATOR");
  IElementType CONSTANT_DECLARATION = new AgnosticElementType("CONSTANT_DECLARATION");
  IElementType DECLARE_EXPR = new AgnosticElementType("DECLARE_EXPR");
  IElementType EXPR = new AgnosticElementType("EXPR");
  IElementType EXPRESSION_STATEMENT = new AgnosticElementType("EXPRESSION_STATEMENT");
  IElementType EXPR_WITH_RECOVER = new AgnosticElementType("EXPR_WITH_RECOVER");
  IElementType FOR_IN_DECLARATION = new AgnosticElementType("FOR_IN_DECLARATION");
  IElementType FOR_STATEMENT = new AgnosticElementType("FOR_STATEMENT");
  IElementType FOR_TUPLE_DECLARATION = new AgnosticElementType("FOR_TUPLE_DECLARATION");
  IElementType FUNCTION_DECLARATION = new AgnosticElementType("FUNCTION_DECLARATION");
  IElementType FUNCTION_NAME = new AgnosticElementType("FUNCTION_NAME");
  IElementType IDENTIFIER = new AgnosticElementType("IDENTIFIER");
  IElementType IF_STATEMENT = new AgnosticElementType("IF_STATEMENT");
  IElementType INDEX_EXPR = new AgnosticElementType("INDEX_EXPR");
  IElementType INVOCATION_EXPR = new AgnosticElementType("INVOCATION_EXPR");
  IElementType LITERAL_EXPR = new AgnosticElementType("LITERAL_EXPR");
  IElementType MODEL_DECLARATION = new AgnosticElementType("MODEL_DECLARATION");
  IElementType MODULE_DECLARATION = new AgnosticElementType("MODULE_DECLARATION");
  IElementType OPERATOR_OVERLOAD_DECLARATION = new AgnosticElementType("OPERATOR_OVERLOAD_DECLARATION");
  IElementType PARAMS_DECLARATION = new AgnosticElementType("PARAMS_DECLARATION");
  IElementType PARAM_DECLARATION = new AgnosticElementType("PARAM_DECLARATION");
  IElementType PAREN_EXPR = new AgnosticElementType("PAREN_EXPR");
  IElementType PREFIX_EXPR = new AgnosticElementType("PREFIX_EXPR");
  IElementType PREFIX_OPERATOR = new AgnosticElementType("PREFIX_OPERATOR");
  IElementType PROPERTY_ASSIGNMENT = new AgnosticElementType("PROPERTY_ASSIGNMENT");
  IElementType PROPERTY_DECLARATION = new AgnosticElementType("PROPERTY_DECLARATION");
  IElementType REFERENCE_EXPR = new AgnosticElementType("REFERENCE_EXPR");
  IElementType RETURN_STATEMENT = new AgnosticElementType("RETURN_STATEMENT");
  IElementType RETURN_TYPE = new AgnosticElementType("RETURN_TYPE");
  IElementType STRUCT_EXPR = new AgnosticElementType("STRUCT_EXPR");
  IElementType SUFFIX_EXPR = new AgnosticElementType("SUFFIX_EXPR");
  IElementType SUFFIX_OPERATOR = new AgnosticElementType("SUFFIX_OPERATOR");
  IElementType TERNARY_EXPR = new AgnosticElementType("TERNARY_EXPR");
  IElementType TYPE = new AgnosticElementType("TYPE");

  IElementType COMMENT = new AgnosticTokenType("comment");
  IElementType ID = new AgnosticTokenType("id");
  IElementType NUMBER = new AgnosticTokenType("number");
  IElementType STRING = new AgnosticTokenType("string");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARG_LIST) {
        return new AgnosticArgListImpl(node);
      }
      else if (type == ARITHMETIC_EXPR) {
        return new AgnosticArithmeticExprImpl(node);
      }
      else if (type == ARITHMETIC_OPERATOR) {
        return new AgnosticArithmeticOperatorImpl(node);
      }
      else if (type == ARRAY_EXPR) {
        return new AgnosticArrayExprImpl(node);
      }
      else if (type == ARRAY_INIT_EXPR) {
        return new AgnosticArrayInitExprImpl(node);
      }
      else if (type == ASSIGNMENT_OPERATOR) {
        return new AgnosticAssignmentOperatorImpl(node);
      }
      else if (type == ASSIGN_EXPR) {
        return new AgnosticAssignExprImpl(node);
      }
      else if (type == BLOCK) {
        return new AgnosticBlockImpl(node);
      }
      else if (type == BOOLEAN_OPERATOR) {
        return new AgnosticBooleanOperatorImpl(node);
      }
      else if (type == BOOL_AND_EXPR) {
        return new AgnosticBoolAndExprImpl(node);
      }
      else if (type == BOOL_OR_EXPR) {
        return new AgnosticBoolOrExprImpl(node);
      }
      else if (type == CONDITIONAL_EXPR) {
        return new AgnosticConditionalExprImpl(node);
      }
      else if (type == CONDITIONAL_OPERATOR) {
        return new AgnosticConditionalOperatorImpl(node);
      }
      else if (type == CONSTANT_DECLARATION) {
        return new AgnosticConstantDeclarationImpl(node);
      }
      else if (type == DECLARE_EXPR) {
        return new AgnosticDeclareExprImpl(node);
      }
      else if (type == EXPRESSION_STATEMENT) {
        return new AgnosticExpressionStatementImpl(node);
      }
      else if (type == EXPR_WITH_RECOVER) {
        return new AgnosticExprWithRecoverImpl(node);
      }
      else if (type == FOR_IN_DECLARATION) {
        return new AgnosticForInDeclarationImpl(node);
      }
      else if (type == FOR_STATEMENT) {
        return new AgnosticForStatementImpl(node);
      }
      else if (type == FOR_TUPLE_DECLARATION) {
        return new AgnosticForTupleDeclarationImpl(node);
      }
      else if (type == FUNCTION_DECLARATION) {
        return new AgnosticFunctionDeclarationImpl(node);
      }
      else if (type == FUNCTION_NAME) {
        return new AgnosticFunctionNameImpl(node);
      }
      else if (type == IDENTIFIER) {
        return new AgnosticIdentifierImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new AgnosticIfStatementImpl(node);
      }
      else if (type == INDEX_EXPR) {
        return new AgnosticIndexExprImpl(node);
      }
      else if (type == INVOCATION_EXPR) {
        return new AgnosticInvocationExprImpl(node);
      }
      else if (type == LITERAL_EXPR) {
        return new AgnosticLiteralExprImpl(node);
      }
      else if (type == MODEL_DECLARATION) {
        return new AgnosticModelDeclarationImpl(node);
      }
      else if (type == MODULE_DECLARATION) {
        return new AgnosticModuleDeclarationImpl(node);
      }
      else if (type == OPERATOR_OVERLOAD_DECLARATION) {
        return new AgnosticOperatorOverloadDeclarationImpl(node);
      }
      else if (type == PARAMS_DECLARATION) {
        return new AgnosticParamsDeclarationImpl(node);
      }
      else if (type == PARAM_DECLARATION) {
        return new AgnosticParamDeclarationImpl(node);
      }
      else if (type == PAREN_EXPR) {
        return new AgnosticParenExprImpl(node);
      }
      else if (type == PREFIX_EXPR) {
        return new AgnosticPrefixExprImpl(node);
      }
      else if (type == PREFIX_OPERATOR) {
        return new AgnosticPrefixOperatorImpl(node);
      }
      else if (type == PROPERTY_ASSIGNMENT) {
        return new AgnosticPropertyAssignmentImpl(node);
      }
      else if (type == PROPERTY_DECLARATION) {
        return new AgnosticPropertyDeclarationImpl(node);
      }
      else if (type == REFERENCE_EXPR) {
        return new AgnosticReferenceExprImpl(node);
      }
      else if (type == RETURN_STATEMENT) {
        return new AgnosticReturnStatementImpl(node);
      }
      else if (type == RETURN_TYPE) {
        return new AgnosticReturnTypeImpl(node);
      }
      else if (type == STRUCT_EXPR) {
        return new AgnosticStructExprImpl(node);
      }
      else if (type == SUFFIX_EXPR) {
        return new AgnosticSuffixExprImpl(node);
      }
      else if (type == SUFFIX_OPERATOR) {
        return new AgnosticSuffixOperatorImpl(node);
      }
      else if (type == TERNARY_EXPR) {
        return new AgnosticTernaryExprImpl(node);
      }
      else if (type == TYPE) {
        return new AgnosticTypeImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
