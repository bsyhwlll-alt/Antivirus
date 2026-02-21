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

// Проверка установленных приложений
fun checkInstalledApps(context: Context): List<String> {
    val pm = context.packageManager
    val apps = pm.getInstalledApplications(PackageManager.GET_META_DATA)
    val suspiciousApps = mutableListOf<String>()
    
    for (app in apps) {
        // Базовая проверка на подозрительные разрешения
        if (checkSuspiciousPermissions(app.packageName, pm)) {
            suspiciousApps.add(app.packageName)
        }
    }
    return suspiciousApps
}

private fun checkSuspiciousPermissions(packageName: String, pm: PackageManager): Boolean {
    val dangerousPermissions = listOf(
        "android.permission.READ_SMS",
        "android.permission.ACCESS_FINE_LOCATION",
        "android.permission.CAMERA"
    )
    // Логика проверки разрешений
    return false
}
