package org.intellij.sdk.language

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import org.intellij.sdk.language.psi.AgnosticTypes

class AgnosticSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer = AgnosticLexerAdapter()

    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey> {
        if (tokenType == null) {
            return arrayOf();
        }

        when (tokenType) {
            AgnosticTypes.COMMENT ->
                return arrayOf(createTextAttributesKey("AGNOSTIC_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT))
            AgnosticTypes.MODULE_DECLARATION, AgnosticTypes.MODEL_DECLARATION ->
                return arrayOf(createTextAttributesKey("AGNOSTIC_DECLARATION", DefaultLanguageHighlighterColors.CLASS_NAME))
            TokenType.BAD_CHARACTER ->
                return arrayOf(createTextAttributesKey("AGNOSTIC_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER))
        }

        return arrayOf()
    }
}