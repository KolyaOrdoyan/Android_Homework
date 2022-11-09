package com.example.all_android_projects.store.model

enum class AppsInformationEnum(
    val gameName: String,
    val gameCategory: String,
    val gameRating: String,
    val appPosition: String,
    val appName: String,
    val appCategory: String,
    val appRating: String,
    val premiumGameName: String,
    val premiumGameCategory: String,
    val premiumGameRating: String
//    val premiumAppName: String,
//    val premiumAppCategory: String,
//    val premiumAppRating: String
) {
    APP_ONE(
        "Subway Surf", "arcade", "7.8  100 MB ", "1",
        "Instagram", "Social network", "8.1   89 MB",
        "Shadow fight 2", "action", "4.6  4.88$"
    ),
    APP_TWO(
        "Candy Crush Saga", "arcade", "8.1  120 MB ", "2",
        "Telegram", "Social network", "9.1   100 MB",
        "Zenge", "arcade", "4.3  0.37$"
    ),
    APP_TREE(
        "Piano Star", "music", "7.5  60 MB ", "3",
        "WatsApp", "Social network", "7.9   110 MB",
        "Ploy Bridge", "arcade", "4.5  0.87$"
    ),
    APP_FOUR(
        "Tic Tac Toy", "arcade", "7.8  19 MB ", "4",
        "Facebook", "Social network", "8.6   59 MB",
        "Real Drift Car", "track", "4.2  0.78$"
    ),
    APP_FIVE(
        "Roblox", "arcade", "6.9  70 MB ", "5",
        "Tik Tok", "Social network", "1.0   99 MB",
        "Shadow fight 2", "action", "4.6  4.88$"
    ),
    APP_SIX(
        "Going Balls", "arcade", "6.1  50 MB ", "6",
        "Viber", "Social network", "7.9   89 MB",
        "Vector full", "action", "4.8  0.78$"
    ),
    APP_SEVEN(
        "Snake Lite", "arcade", "7.8  100 MB ", "7",
        "Shazam", "music ", "8.3   60 MB",
        "WindWings: Space", "action", "4.6  1.81$"
    ),
    APP_EYT(
        "Cut the Root", "arcade", "6.8  97 MB ", "8",
        "Snapchat", "photo ", "8.8   97 MB",
        "Dead Cells", "action", "4.4  8.80$"
    ),
    APP_NINE(
        "Pacman", "arcade", "9.8  78 MB ", "9",
        "Messenger", "message network ", "8.0   48 MB",
        "GRID Auto sport", "action", "4.5 10.10$"
    ),
    APP_TEN(
        "APEX Legends", "action", "9.9  1350 MB ", "10",
        "Steak", "foot bol", "8.3   60 MB",
        "Trail Boss BMX", "action", "4.6  4.02$"
    )
}