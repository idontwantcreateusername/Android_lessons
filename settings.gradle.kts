pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Android_lessons"
include(":app")
include(":p0031firstproject")
include(":p0041basicview")
include(":p0051layoutfiles")
include(":p0061")
include(":p0062_programm_liner")
include(":p0063_relative")
include(":p-4")
include(":p-4-1")
