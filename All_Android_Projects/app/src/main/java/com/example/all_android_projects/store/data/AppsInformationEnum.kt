package com.example.all_android_projects.store.data

enum class AppsInformationEnum(
    val gameName: String,
    val gameCategory: String,
    val gameRating: String,
    val appPosition: String,
    val appName: String,
    val appCategory: String,
    val appRating: String
) {
    APP_ONE(
        "Subway Surf", "arcade", "7.8  100 MB ", "1",
        "Instagram", "Social network", "8.1   89 MB"
    ),
    APP_TWO(
        "Candy Crush Saga", "arcade", "8.1  120 MB ", "2",
        "Telegram", "Social network", "9.1   100 MB"
    ),
    APP_TREE(
        "Piano Star", "music", "7.5  60 MB ", "3",
        "WatsApp", "Social network", "7.9   110 MB"
    ),
    APP_FOUR(
        "Tic Tac Toy", "arcade", "7.8  19 MB ", "4",
        "Facebook", "Social network", "8.6   59 MB"
    ),
    APP_FIVE(
        "Roblox", "arcade", "6.9  70 MB ", "5",
        "Tik Tok", "Social network", "1.0   99 MB"
    ),
    APP_SIX(
        "Going Balls", "arcade", "6.1  50 MB ", "6",
        "Viber", "Social network", "7.9   89 MB"
    ),
    APP_SEVEN(
        "Snake Lite", "arcade", "7.8  100 MB ", "7",
        "Shazam", "music ", "8.3   60 MB"
    ),
    APP_EYT(
        "Cut the Root", "arcade", "6.8  97 MB ", "8",
        "Snapchat", "photo ", "8.8   97 MB"
    ),
    APP_NINE(
        "Pacman", "arcade", "9.8  78 MB ", "9",
        "Messenger", "message network ", "8.0   48 MB"
    ),
    APP_TEN(
        "APEX Legends", "action", "9.9  1350 MB ", "10",
        "Steak", "foot bol", "8.3   60 MB"
    )
}