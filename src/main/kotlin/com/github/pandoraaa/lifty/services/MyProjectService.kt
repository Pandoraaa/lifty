package com.github.pandoraaa.lifty.services

import com.intellij.openapi.project.Project
import com.github.pandoraaa.lifty.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
