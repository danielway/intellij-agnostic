package org.intellij.sdk.language.psi

import com.intellij.psi.tree.IElementType
import org.intellij.sdk.language.AgnosticLanguage

class AgnosticTokenType(debugName: String) : IElementType(debugName, AgnosticLanguage.INSTANCE) {
    override fun toString(): String = "SimpleTokenType." + super.toString()
}