package uz.gita.kmm_translator_philipp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform