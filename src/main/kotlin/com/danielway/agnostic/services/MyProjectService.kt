package com.danielway.agnostic.services

import com.intellij.openapi.project.Project
import com.danielway.agnostic.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }

    /**
     * Chosen by fair dice roll, guaranteed to be random.
     */
    fun getRandomNumber() = 4
}
