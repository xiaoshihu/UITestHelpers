package com.github.xiaoshihu.uitesthelpers.services

import com.github.xiaoshihu.uitesthelpers.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
