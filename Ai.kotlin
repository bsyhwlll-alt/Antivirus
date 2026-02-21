// Очистка кэша приложения
fun clearAppCache(context: Context) {
    try {
        val cacheDir = context.cacheDir
        if (cacheDir.isDirectory) {
            cacheDir.deleteRecursively()
        }
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

// Мониторинг использования памяти
fun getMemoryInfo(): String {
    val runtime = Runtime.getRuntime()
    val usedMem = runtime.totalMemory() - runtime.freeMemory()
    val maxMem = runtime.maxMemory()
    return "Used: ${usedMem / 1024 / 1024}MB, Max: ${maxMem / 1024 / 1024}MB"
}
