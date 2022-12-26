package org.intellij.sdk.language.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import org.intellij.sdk.language.AgnosticFileType
import org.intellij.sdk.language.AgnosticLanguage

class AgnosticFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, AgnosticLanguage.INSTANCE) {
    override fun getFileType(): FileType = AgnosticFileType.INSTANCE

    override fun toString(): String = "Agnostic File"
}