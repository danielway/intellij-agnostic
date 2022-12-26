package org.intellij.sdk.language.psi

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import org.intellij.sdk.language.AgnosticLanguage
import org.intellij.sdk.language.AgnosticLexerAdapter
import org.intellij.sdk.language.parser.AgnosticParser

class AgnosticParserDefinition : ParserDefinition {
    companion object {
        val FILE = IFileElementType(AgnosticLanguage.INSTANCE)
    }

    override fun createLexer(project: Project?): Lexer = AgnosticLexerAdapter()

    override fun createParser(project: Project?): PsiParser = AgnosticParser()

    override fun getFileNodeType(): IFileElementType = FILE

    override fun getCommentTokens(): TokenSet = AgnosticTokenSets.COMMENTS

    override fun getStringLiteralElements(): TokenSet = TokenSet.EMPTY

    override fun createElement(node: ASTNode?): PsiElement = AgnosticTypes.Factory.createElement(node)

    override fun createFile(viewProvider: FileViewProvider): PsiFile = AgnosticFile(viewProvider)
}