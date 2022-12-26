package org.intellij.sdk.language

import com.intellij.lang.Language

class AgnosticLanguage : Language("Agnostic") {
    companion object {
        val INSTANCE = AgnosticLanguage()
    }
}