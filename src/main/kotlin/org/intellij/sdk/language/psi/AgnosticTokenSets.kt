package org.intellij.sdk.language.psi

import com.intellij.psi.tree.TokenSet

interface AgnosticTokenSets {
    companion object {
        val IDENTIFIERS = TokenSet.create(AgnosticTypes.KEY)
        val COMMENTS = TokenSet.create(AgnosticTypes.COMMENT)
    }
}