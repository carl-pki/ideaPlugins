package com.github.carlpki.ideaplugins.services

import com.intellij.openapi.project.Project
import com.github.carlpki.ideaplugins.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
