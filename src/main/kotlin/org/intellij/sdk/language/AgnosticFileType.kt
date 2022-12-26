package org.intellij.sdk.language

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class AgnosticFileType : LanguageFileType(AgnosticLanguage.INSTANCE) {
    companion object {
        val INSTANCE = AgnosticFileType()
    }

    override fun getName(): String = "Agnostic File"

    override fun getDescription(): String = "Agnostic language file"

    override fun getDefaultExtension(): String = "agn"

    override fun getIcon(): Icon = AgnosticIcons.FILE
}