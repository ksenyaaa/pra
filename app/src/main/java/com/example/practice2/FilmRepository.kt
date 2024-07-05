package com.example.practice2

import android.adservices.adid.AdId

object FilmRepository {
    val films: List<Film> = listOf(
        Film(id = 0, name="Intestellar", types="Fantasy", url = "https://trueposters.ru/pictures/product/big/5469_big.jpg"),
        Film(id = 1, name="The Shawshank Redemption", types="FDrama", url = "https://pic.rutubelist.ru/video/ac/a8/aca823155688e35e5a60bc0fe9499c47.jpg"),
        Film(id = 2, name="1+1", types="Fantasy", url = "https://i.artfile.me/wallpaper/15-11-2019/1920x1080/kino-filmy-1-1-intouchables-filipp-driss-1486045.jpg"),
        Film(id = 3, name="The Green Mile", types="Drama", url = "https://u2.9111s.ru/uploads/202303/29/d044399891090bf6ce1b09fc3e33be87.jpg"),
        Film(id = 4, name="After", types="Melodrama", url = "https://m.media-amazon.com/images/M/MV5BOGI2ZWNiNzQtOGQ1MS00MjA4LWE2YmEtYjZkMGZkZGVlYWI3XkEyXkFqcGdeQXVyNjA5NDgxNTg@._V1_.jpg"),
        Film(id = 5, name="Through my window", types="Melodrama", url = "http://images-s.kinorium.com/movie/poster/2745982/w1500_51618516.jpg"),
        Film(id = 6, name="Spider man", types="Fantasy", url = "https://www.osnmedia.ru/wp-content/uploads/2022/01/xg.jpg"),
    )
    fun getFilmById() {

    }

}
