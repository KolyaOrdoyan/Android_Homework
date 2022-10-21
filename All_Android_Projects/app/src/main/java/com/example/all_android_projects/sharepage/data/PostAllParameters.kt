package com.example.all_android_projects.sharepage.data

enum class PostAllParameters(val status: String, val image: String, val vebViewUrl: String, val videoUrl: String) {
    STATUS_ONE(
        "«Hello, world!» — программа, результатом работы которой является вывод на экран или иное устройство фразы «Hello, world!»",
        "https://helloworld.gr/share-image.jpg",
        "https://ru.wikipedia.org/wiki/Hello,_world!",
        "https://archive.org/download/ksnn_compilation_master_the_internet/ksnn_compilation_master_the_internet_512kb.mp4"
    ),
    STATUS_TWO(
        "Почему iPhone 14 в России продают по курсу 106 рублей за доллар ",
        "https://img.gazeta.ru/files3/117/15418117/30-pic4_zoom-1500x1500-68887.jpg",
        "https://www.gazeta.ru/tech/2022/09/08/15420079.shtml",
        "https://www.youtube.com/watch?v=rcGirrPli-Y.mp4"
    ),
    STATUS_THREE(
        "Имеет наглость выглядеть героем. В Пентагоне удивились отказу Маска платить за Starlink на Украине",
        "https://img.gazeta.ru/files3/919/15621919/AP20178615076377-pic4_zoom-1500x1500-45658.jpg",
        "https://www.gazeta.ru/tech/2022/10/14/15621823.shtml?updated",
        "https://img.gazeta.ru/files3/919/15621919/AP20178615076377-pic4_zoom-1500x1500-45658.jpg"
    ),
    STATUS_FOUR(
        "Pixel Watch, Pixel 7 Pro и Pixel Tablet. Все анонсы с осенней презентации Google",
        "https://img.gazeta.ru/files3/407/15584407/y2BIVtXvp9-gb1uKFty7ekf0AnPavJDb8MPjYom4U2fg5jWEpvAEwOIdx2kWcJNX5MdAZF3SEixV5xMXg0ZaGs-8OU4kXXixUzs_rw-e365-w1024-pic4_zoom-1500x1500-49329.jpg",
        "https://www.gazeta.ru/tech/2022/10/06/15583513.shtml?updated",
        "https://img.gazeta.ru/files3/407/15584407/y2BIVtXvp9-gb1uKFty7ekf0AnPavJDb8MPjYom4U2fg5jWEpvAEwOIdx2kWcJNX5MdAZF3SEixV5xMXg0ZaGs-8OU4kXXixUzs_rw-e365-w1024-pic4_zoom-1500x1500-49329.jpg",
    ),
    STATUS_FIVE(
        "Дуров призвал всех срочно удалить WhatsApp. Дело в CVE-2022-36934",
        "https://img.gazeta.ru/files3/481/15582481/20220706_gaf_u39_025-pic4_zoom-1500x1500-6370.jpg",
        "https://www.gazeta.ru/tech/2022/10/06/15582265.shtml?updated",
        "https://img.gazeta.ru/files3/481/15582481/20220706_gaf_u39_025-pic4_zoom-1500x1500-6370.jpg"
    ),
    STATUS_SIX(
        "«Оттуда точно все сбегут». Каких майнеров энергетический кризис оставит без денег",
        "https://img.gazeta.ru/files3/945/15409945/man-analyzing-stock-market-charts-financial-data-electronic-board-pic4_zoom-1500x1500-8273.jpg",
        "https://www.gazeta.ru/tech/2022/09/10/15408049.shtml?updated",
        "https://img.gazeta.ru/files3/945/15409945/man-analyzing-stock-market-charts-financial-data-electronic-board-pic4_zoom-1500x1500-8273.jpg"
    )
}