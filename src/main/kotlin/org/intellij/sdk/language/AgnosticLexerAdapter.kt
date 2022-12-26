package org.intellij.sdk.language

import com.intellij.lexer.FlexAdapter

class AgnosticLexerAdapter : FlexAdapter(AgnosticLexer(null)) {
}