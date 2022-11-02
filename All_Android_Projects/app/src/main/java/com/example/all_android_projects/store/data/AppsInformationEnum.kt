package com.example.all_android_projects.store.data

enum class AppsInformationEnum(
    val position: String,
    val appName: String,
    val category: String,
    val rating: String
) {
    APP_ONE(
        "1", "Instagram", "Social network", "8.1   89 MB"
    ),
    APP_TWO(
        "2", "Telegram", "Social network", "9.1   100 MB"
    ),
    APP_TREE(
        "3", "WatsApp", "Social network", "7.9   110 MB"
    ),
    APP_FOUR(
        "4", "Facebook", "Social network", "8.6   59 MB"
    ),
    APP_FIVE(
        "5", "Tik Tok", "Social network", "1.0   99 MB"
    ),
    APP_SIX(
        "6", "Viber", "Social network", "7.9   89 MB"
    )
}