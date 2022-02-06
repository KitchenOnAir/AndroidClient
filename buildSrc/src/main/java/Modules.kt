interface ProjectModule {

    val path: String
}

enum class Application(override val path: String): ProjectModule {
    App(":app")
}

enum class Features(override val path: String): ProjectModule {

}

enum class Core(override val path: String): ProjectModule {
    Base(":Core:Base"),
    Data(":Core:Data"),
    Network(":Core:Network")
}

enum class Additional(override val path: String): ProjectModule {
    Security(":Security"),
    UIKit(":UIKit"),
}