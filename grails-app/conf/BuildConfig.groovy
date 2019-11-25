grails.work.dir = "target"
grails.project.target.level = 1.8
grails.project.source.level = 1.8

// inline plugins
// grails.plugin.location."hot-folder" = "./plugins/hot-folder"
// @insert_inline_plugins_after_this_line

grails.project.dependency.resolver = "maven"
grails.project.dependency.resolution = {
    inherits"global"
    log "error"
    checksums true

    dependencies {
    }

    plugins {
        build(':release:3.0.1')

        // regular plugins
        // runtime('com.jcatalog.grailsplugins:jcatalog-ui-tags:7.23.GA.16')
        // @insert_dependencies_plugins_after_this_line

    }
}