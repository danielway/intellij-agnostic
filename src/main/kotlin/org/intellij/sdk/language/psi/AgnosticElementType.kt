package org.intellij.sdk.language.psi

import com.intellij.psi.tree.IElementType
import org.intellij.sdk.language.AgnosticLanguage

class AgnosticElementType(debugName: String) : IElementType(debugName, AgnosticLanguage.INSTANCE) {
}