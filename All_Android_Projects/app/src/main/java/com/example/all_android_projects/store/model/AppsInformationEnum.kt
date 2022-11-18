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
    val premiumGameRating: String,
    val categoryNameApp: String,
    val categoryNameGame: String
) {
    APP_ONE(
        "Subway Surf", "arcade", "7.8  100 MB ", "1",
        "Instagram", "Social network", "8.1   89 MB",
        "Shadow fight 2", "action", "4.6  4.88$",
        "Watch apps", "Action"
    ),
    APP_TWO(
        "Candy Crush Saga", "arcade", "8.1  120 MB ", "2",
        "Telegram", "Social network", "9.1   100 MB",
        "Zenge", "arcade", "4.3  0.37$",
        "Watch faces", "Adventure"
    ),
    APP_TREE(
        "Piano Star", "music", "7.5  60 MB ", "3",
        "WatsApp", "Social network", "7.9   110 MB",
        "Ploy Bridge", "arcade", "4.5  0.87$",
        "Art & Design", "Arcade"
    ),
    APP_FOUR(
        "Tic Tac Toy", "arcade", "7.8  19 MB ", "4",
        "Facebook", "Social network", "8.6   59 MB",
        "Real Drift Car", "track", "4.2  0.78$",
        "Augmented reality", "Board"
    ),
    APP_FIVE(
        "Roblox", "arcade", "6.9  70 MB ", "5",
        "Tik Tok", "Social network", "1.0   99 MB",
        "Shadow fight 2", "action", "4.6  4.88$",
        "Auto & Vehicles", "Card"
    ),
    APP_SIX(
        "Going Balls", "arcade", "6.1  50 MB ", "6",
        "Viber", "Social network", "7.9   89 MB",
        "Vector full", "action", "4.8  0.78$",
        "Beauty", "Casino"
    ),
    APP_SEVEN(
        "Snake Lite", "arcade", "7.8  100 MB ", "7",
        "Shazam", "music ", "8.3   60 MB",
        "WindWings: Space", "action", "4.6  1.81$",
        "Books & reference", "Casual"
    ),
    APP_EYT(
        "Cut the Root", "arcade", "6.8  97 MB ", "8",
        "Snapchat", "photo ", "8.8   97 MB",
        "Dead Cells", "action", "4.4  8.80$",
        "Communication", "Puzzle"
    ),
    APP_NINE(
        "Pacman", "arcade", "9.8  78 MB ", "9",
        "Messenger", "message network ", "8.0   48 MB",
        "GRID Auto sport", "action", "4.5 10.10$",
        "Business", "Education"
    ),
    APP_TEN(
        "APEX Legends", "action", "9.9  1350 MB ", "10",
        "Steak", "foot bol", "8.3   60 MB",
        "Trail Boss BMX", "action", "4.6  4.02$",
        "Comics", "Music"
    ),
    CATEGORY_ELEVEN(
        "Mobile Legends", "action", "9.9   500 MB", "11",
        "Calculator", "calculator", "5.6   24 MB",
        "Mobile Legends", "action", "9.9   500 MB",
        "Dating", "Racing"
    ),
    CATEGORY_TWELFTH(
        "Drift Car", "race", "8.6   200MB", "12",
        "Yandex Taxi", "drive", " 6.3   92 MB",
        "Drift Car", "race", "8.6   200MB",
        "Education", "Role Playing"
    ),
    CATEGORY_THIRTEEN(
        "Piano perfect", "music", "7.7   67 MB", "13",
        "Google Photo", "photo", "5.6  98 MB",
        "Piano perfect", "music", "7.7   67 MB",
        "Entertainment", "Simulation"
    ),
    CATEGORY_FOURTEEN(
        "Hill climb", "race", "7.6   123 MB", "14",
        "GG taxi", "drive", "3.2  86 MB",
        "Hill climb", "race", "7.6   123 MB",
        "Events", "Sports"
    ),
    CATEGORY_SIXTEN(
        "Shadow fight 3", "arcade", "7.6   99 MB", "15",
        "Photoshop mobile", "photo", "6.9   149 MB",
        "Shadow fight 3", "arcade", "7.6   99 MB",
        "Finance", "Strategy"
    ),
    CATEGORY_SEVENTEEN(
        "Shadow matic", "logic", "9.5  145 MB", "16",
        "Freeze cam", "photo", "6.9   98 MB",
        "Shadow matic", "logic", "9.5  145 MB",
        "Food & Drink", "Trivia"
    ),
    CATEGORY_EIGHTEEN(
        "Gangsta vegas", "action", "7.7   1.69 GB", "17",
        "Lensa", "photo", "4.6   49 MB",
        "Gangsta vegas", "action", "7.7   1.69 GB",
        "Games", "Word"
    )
}