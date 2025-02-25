@file:Suppress("UnstableApiUsage")

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()
        mavenLocal()
        jcenter()
        maven(url = "https://jitpack.io")
        maven(url = "https://oss.sonatype.org/content/repositories/snapshots")
    }
}


rootProject.name = "Thanox"

include(":app")
include(":shortcut_stub")
include(":sdk-demo")

include(":nitro:nitro_framework")
include(":nitro:nitro_plugin")
include(":nitro:nitro_gradle_plugin")
include(":nitro:nitro_android_stub")

include(":rhino:rhino_annotations")

include(":annotation_processors:xposed_hook_annotation")
include(":annotation_processors:xposed_hook_compiler")
include(":annotation_processors:permission-requester-annotation")
include(":annotation_processors:permission-requester-compiler")
//
//include(":plugins:plugin_push_message_delegate")
//include(":plugins:plugin_push_message_delegate_server")
//include(":plugins:plugin_su_enabler")
//include(":plugins:plugin_example")
//include(":plugins:plugin_auto_idle")
//include(":plugins:plugin_auto_idle_server")
//include(":plugins:plugin_toolbox")

// Modules.
include(":modules:module_ops")
include(":modules:module_ops2")
include(":modules:module_easteregg")
include(":modules:module_activity_trampoline")
include(":modules:module_profile")
include(":modules:module_component_manager")
include(":modules:module_notification_recorder")
include(":modules:module_locker")
include(":modules:module_common")
include(":modules:module_filepicker")
include(":modules:module_push_message_delegate")
include(":modules:module_noroot_support")

include(":third_party:dateformatter")
include(":third_party:recyclerview-fastscroll")
include(":third_party:search")
include(":third_party:apkbuilder")
include(":third_party:time-duration-picker")
include(":third_party:remix")
include(":third_party:compose-color-picker")
include(":third_party:reorderable")
include(":third_party:libxposed:interface")
include(":third_party:libxposed:service")
include(":third_party:libxposed:api")


include(":android_framework:base")
include(":android_framework:res")
include(":android_framework:patchx-lib")
include(":android_framework:hidden-api")
include(":android_framework:dex-maker")
include(":android_framework:patch-common")

include(":android_framework:patch-magisk:module")
include(":android_framework:patch-magisk:bridge")
include(":android_framework:patch-magisk:bridge-dex-app")
include(":android_framework:patch-magisk:patch-framework")

//
//include(":shortcut_stub")

val internalProjects = listOf(
    ":modules:module_donate",
    ":modules:module_feature_access",
    ":third_party:sec_net",
    ":android_framework:tests",
    ":android_framework:db",
    ":android_framework:services",
    ":android_framework:services-29",
    ":android_framework:services-30",
    ":android_framework:services-31",
    ":android_framework:patchx-entry",
    ":android_framework:patchx",
    ":android_framework:patchx-29",
    ":android_framework:patchx-30",
    ":android_framework:patchx-31",
)

internalProjects.forEach {
    println("internalProject: $it")
    include(it)

    val dir = file("internal/Thanox-Internal${it.replace(":", File.separator)}")
    project(it).projectDir = dir

}