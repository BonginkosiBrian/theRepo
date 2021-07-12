package com.github.bonginkosibrian.therepo.services

import com.github.bonginkosibrian.therepo.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
