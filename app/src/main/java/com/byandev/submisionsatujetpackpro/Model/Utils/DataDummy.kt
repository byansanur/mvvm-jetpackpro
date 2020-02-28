package com.byandev.submisionsatujetpackpro.Model.Utils

import com.byandev.submisionsatujetpackpro.Model.Data.MovieEntity
import com.byandev.submisionsatujetpackpro.Model.Data.MovieTvEntity

object DataDummy {

    fun generateDummymovies(): List<MovieEntity> {

        val movies = ArrayList<MovieEntity>()
        //1
        movies.add(MovieEntity("m1",
                "Black Widow",
                "Black Widow adalah film pahlawan super Amerika Serikat tahun 2020 yang didasarkan dari karakter Marvel Comics bernama sama. Film ini diproduksi Marvel Studios dan disalurkan Walt Disney Studios Motion Pictures. Film ini adalah film ke-24 Marvel Cinematic Universe (MCU). Film ini disutradarai Cate Shortland, ditulis Jac Schaeffer dan Ned Benson, serta dibintangi Scarlett Johansson, David Harbour, Florence Pugh, O-T Fagbenle, dan Rachel Weisz. The Eternals dijadwalkan akan ditayangkan di Amerika Serikat pada 1 Mei 2020.",
                "Cate Shortland",
                "Kevin Feige",
                "- Jac Schaeffer\n- Ned Benson",
                "Marvel Studio","1 Mei 2020",
                "https://cdns.klimg.com/kapanlagi.com/p/blackwidow_poster.jpg"))
        //2
        movies.add(MovieEntity("m2",
            "Onward",
            "Alkisah di dunia fantasi dimana mahluk gaib tinggal di sana. Dua peri remaja, Ian Lightfoot (Tom Holland) dan Barley Lightfoot (Chris Pratt) memulai sebuah pencarian ke tempat-tempat magis untuk menemukan sebuah jawaban.",
            "Dan Scanlon",
            "Kori Rae",
            "- Jason Headley\n- Dan Scanlon\n- Keith Bunin",
            "Walt Disney Pictures",
            "4 Maret 2020",
            "https://media.21cineplex.com/webcontent/gallery/pictures/158208273597221_287x421.jpg"))
        //3
        movies.add(MovieEntity("m3",
            "Sebelum Iblis Menjemput Ayat 2",
            "Dua tahun setelah lepas dari teror iblis, Alfie (Chelsea Islan) dan Nara (Hadijah Shahab) mencoba melanjutkan kehidupan mereka.\n" +
                    "Namun Alfie masih terus dihantui perasaan bersalah dan penglihatan tidak wajar. Mimpi terburuk Alfie nyatanya baru dimulai dan\n" +
                    "bahaya yang menunggu semakin mengancam, sosok kegelapan yang begitu haus akan jiwa bangkit untuk menjemput nyawa mereka.",
            "Timo Tjahjanto",
            "- Wicky V. Olindo\n- Timo Tjahjanto",
            "Timo Tjahjanto",
            "- Frontier Pictures\n" +
                    "- Legacy Pictures\n" +
                    "- Rapi Films",
            "27 Februari 2020",
            "https://media.21cineplex.com/webcontent/gallery/pictures/158166731915304_287x421.jpg"))
        //4
        movies.add(MovieEntity("m4",
            "The Invisible Man",
            "Cecilia Kass (Elisabeth Moss) tidak pernah percaya bahwa mantan kekasihnya yang tempramental bunuh diri dan meninggalkan warisan kepadanya. Cecilia berusaha membuktikan bahwa ia sedang diburu oleh seseorang yang tidak terlihat oleh siapapun.",
            "Leigh Whannell",
            "- Jason Blum\n- Kylie Du Fresne",
            "Leigh Whannell",
            "Universal Pictures",
            "26 Februari 2020",
            "https://media.21cineplex.com/webcontent/gallery/pictures/158261967229822_287x421.jpg"))
        //5
        movies.add(MovieEntity("m5",
            "Riki Rhino",
            "Riki adalah Badak Sumatera muda yang kehilangan culanya, setelah diambil oleh pemburu Mr. Jak.\n" +
                    "Untuk mendapatkan kembali cula yang telah dicuri, Riki memulai petualangan seru bersama Beni.\n" +
                    "Riki kemudian mendapatkan cula dengan kekuatan tersembunyi yang diperoleh dari hewan yang diselamatkannya.",
            "Erwin Budiono",
            "- Lucki Lukman Hakim\n- Genesis Timotius",
            "Cassandra Massardi",
            "Marvel Studio",
            "27 Februari 2020",
            "https://media.21cineplex.com/webcontent/gallery/pictures/158012720277390_287x421.jpg"))
        //6
        movies.add(MovieEntity("m6",
            "Teman Tapi Menikah 2",
            "Belum puas menikmati momen sebagai pasangan baru, Ayu tiba-tiba hamil. Kepribadiannya berubah total. Dari yang tadinya semangat nemenin Ditto ke mana-mana, ia jadi mager dan parahnya, super sensitif! Ditto pun harus menahan diri dan pura-pura tidak cemburu dengan perhatian yang Ayu berikan ke si janin. Pertengkaran yang sering terjadi membuat Ayu dan Ditto harus memilih mana yang mau dipertahankan; pernikahan mereka atau si bayi?",
            "Rako Prijanto",
            "Frederica",
            "Johanna Watimena",
            "Falcon Pictures","27 Februari 2020",
            "https://media.21cineplex.com/webcontent/gallery/pictures/157977149691218_287x421.jpg"))
        //7
        movies.add(MovieEntity("m7",
            "Sonic the Hedgehog",
            "Setelah menemukan landak kecil berwarna biru dan berlari sangat cepat, Tom Wachowski (James Marsden) seorang perwira polisi kota kecil harus membantunya mengalahkan Dr. Ivo Robotnik (Jim Carrey) yang ingin melakukan percobaan kepada landak tersebut.",
            "Jeff Fowler",
            "- Neal H. Moritz\n" +
                    "- Takeshi Ito\n" +
                    "- Toby Ascher\n" +
                    "- Toru Nakahara",
            "- Pat Casey\n" +
                    "- Josh Miller",
            "Paramount Pictures","22 Februari 2020",
            "https://media.21cineplex.com/webcontent/gallery/pictures/158080773148231_287x421.jpg"))
        //8
        movies.add(MovieEntity("m8",
            "The Call of the Wild",
            "Diadaptasi dari kisah sastra klasik kesayangan, The Call of the Wild berkisah tentang Buck,\n" +
                    "seekor anjing peliharaan berhati besar yang hidupnya berubah 180 derajat ketika dia tiba-tiba diculik dari rumahnya di California dan\n" +
                    "dipindahkan ke belantara eksotis Yukon Alaska pada masa Demam Emas Klondike di tahun 1890-an.\n" +
                    "Buck menjadi pendatang baru di regu anjing penarik kereta salju pengiriman surat - dan kemudian menjadi pemimpinnya -\n" +
                    "Buck mengalami petualangan yang tidak terlupakan, hingga akhirnya menemukan tempat sejatinya di dunia dan menjadi tuan atas dirinya sendiri.",
            "Chris Sanders",
            "Erwin Stoff",
            "Michael Green",
            "Walt Disney Pictures",
            "21 Februari 2020",
            "https://media.21cineplex.com/webcontent/gallery/pictures/158028525665328_287x421.jpg"))
        //9
        movies.add(MovieEntity("m9",
            "Bhoot: The Haunted Ship",
            "Black Widow adalah film pahlawan super Amerika Serikat tahun 2020 yang didasarkan dari karakter Marvel Comics bernama sama. Film ini diproduksi Marvel Studios dan disalurkan Walt Disney Studios Motion Pictures. Film ini adalah film ke-24 Marvel Cinematic Universe (MCU). Film ini disutradarai Cate Shortland, ditulis Jac Schaeffer dan Ned Benson, serta dibintangi Scarlett Johansson, David Harbour, Florence Pugh, O-T Fagbenle, dan Rachel Weisz. The Eternals dijadwalkan akan ditayangkan di Amerika Serikat pada 1 Mei 2020.",
            "Bhanu Pratap Singh",
            "- Hiroo Johar\n- Karan Johar\n- Shashank Khaitan\n- Apoorva Mehta",
            "Bhanu Pratap Singh",
            "Dharma Productions","21 Februari 2020",
            "https://media.21cineplex.com/webcontent/gallery/pictures/158226729734565_287x421.jpg"))
        //10
        movies.add(MovieEntity("m10",
            "Milea Suara dari Dilan",
            "Tidak ada kisah yang lebih Indah dari kisah cinta di SMA. Sama halnya dengan kisah cinta Dilan dan Milea.\n" +
                    "Dari yang awalnya benci hingga saling mencintai. Dari yang awalnya manis hingga menjadi rumit. Menjelang reuni akbar, Dilan memutuskan untuk menceritakan kembali\n" +
                    "masa masa itu. Mulai dari kali pertama mereka bertemu, menjalin kasih, hingga berjuang untuk bertahan.\n" +
                    "Masa yang tidak selalu indah, namun terus membekas dibenaknya. Ini adalah cara Dilan mengingat Milea. Ini adalah cara Dilan mengingat sebuah cinta yang\n" +
                    "ia pikir akan bertahan selamanya.",
            "- Fajar Bustomi\n- Pidi Baiq",
            "Ody Mulya Hidayat",
            "- Pidi Baiq\n- Titien Wattimena",
            "MAX Pictures","13 Februari 2020",
            "https://media.21cineplex.com/webcontent/gallery/pictures/157900005966681_287x421.jpg"))

        return movies
    }

    fun generateDummymoviesTv(): List<MovieTvEntity> {

        val moviesTv = ArrayList<MovieTvEntity>()
        //1
        moviesTv.add(MovieTvEntity("mt1",
            "Black Widow",
            "Black Widow adalah film pahlawan super Amerika Serikat tahun 2020 yang didasarkan dari karakter Marvel Comics bernama sama. Film ini diproduksi Marvel Studios dan disalurkan Walt Disney Studios Motion Pictures. Film ini adalah film ke-24 Marvel Cinematic Universe (MCU). Film ini disutradarai Cate Shortland, ditulis Jac Schaeffer dan Ned Benson, serta dibintangi Scarlett Johansson, David Harbour, Florence Pugh, O-T Fagbenle, dan Rachel Weisz. The Eternals dijadwalkan akan ditayangkan di Amerika Serikat pada 1 Mei 2020.",
            "Cate Shortland",
            "Kevin Feige",
            "Jac Schaeffer, Ned Benson",
            "Marvel Studio","1 Mei 2020 (Amerika Serikat)",
            "https://cdns.klimg.com/kapanlagi.com/p/blackwidow_poster.jpg"))
        //2
        moviesTv.add(MovieTvEntity("mt2",
            "Black Widow",
            "Black Widow adalah film pahlawan super Amerika Serikat tahun 2020 yang didasarkan dari karakter Marvel Comics bernama sama. Film ini diproduksi Marvel Studios dan disalurkan Walt Disney Studios Motion Pictures. Film ini adalah film ke-24 Marvel Cinematic Universe (MCU). Film ini disutradarai Cate Shortland, ditulis Jac Schaeffer dan Ned Benson, serta dibintangi Scarlett Johansson, David Harbour, Florence Pugh, O-T Fagbenle, dan Rachel Weisz. The Eternals dijadwalkan akan ditayangkan di Amerika Serikat pada 1 Mei 2020.",
            "Cate Shortland",
            "Kevin Feige",
            "Jac Schaeffer, Ned Benson",
            "Marvel Studio","1 Mei 2020 (Amerika Serikat)",
            "https://cdns.klimg.com/kapanlagi.com/p/blackwidow_poster.jpg"))
        //3
        moviesTv.add(MovieTvEntity("mt3",
            "Black Widow",
            "Black Widow adalah film pahlawan super Amerika Serikat tahun 2020 yang didasarkan dari karakter Marvel Comics bernama sama. Film ini diproduksi Marvel Studios dan disalurkan Walt Disney Studios Motion Pictures. Film ini adalah film ke-24 Marvel Cinematic Universe (MCU). Film ini disutradarai Cate Shortland, ditulis Jac Schaeffer dan Ned Benson, serta dibintangi Scarlett Johansson, David Harbour, Florence Pugh, O-T Fagbenle, dan Rachel Weisz. The Eternals dijadwalkan akan ditayangkan di Amerika Serikat pada 1 Mei 2020.",
            "Cate Shortland",
            "Kevin Feige",
            "Jac Schaeffer, Ned Benson",
            "Marvel Studio","1 Mei 2020 (Amerika Serikat)",
            "https://cdns.klimg.com/kapanlagi.com/p/blackwidow_poster.jpg"))
        //4
        moviesTv.add(MovieTvEntity("mt4",
            "Black Widow",
            "Black Widow adalah film pahlawan super Amerika Serikat tahun 2020 yang didasarkan dari karakter Marvel Comics bernama sama. Film ini diproduksi Marvel Studios dan disalurkan Walt Disney Studios Motion Pictures. Film ini adalah film ke-24 Marvel Cinematic Universe (MCU). Film ini disutradarai Cate Shortland, ditulis Jac Schaeffer dan Ned Benson, serta dibintangi Scarlett Johansson, David Harbour, Florence Pugh, O-T Fagbenle, dan Rachel Weisz. The Eternals dijadwalkan akan ditayangkan di Amerika Serikat pada 1 Mei 2020.",
            "Cate Shortland",
            "Kevin Feige",
            "Jac Schaeffer, Ned Benson",
            "Marvel Studio","1 Mei 2020 (Amerika Serikat)",
            "https://cdns.klimg.com/kapanlagi.com/p/blackwidow_poster.jpg"))
        //5
        moviesTv.add(MovieTvEntity("mt5",
            "Black Widow",
            "Black Widow adalah film pahlawan super Amerika Serikat tahun 2020 yang didasarkan dari karakter Marvel Comics bernama sama. Film ini diproduksi Marvel Studios dan disalurkan Walt Disney Studios Motion Pictures. Film ini adalah film ke-24 Marvel Cinematic Universe (MCU). Film ini disutradarai Cate Shortland, ditulis Jac Schaeffer dan Ned Benson, serta dibintangi Scarlett Johansson, David Harbour, Florence Pugh, O-T Fagbenle, dan Rachel Weisz. The Eternals dijadwalkan akan ditayangkan di Amerika Serikat pada 1 Mei 2020.",
            "Cate Shortland",
            "Kevin Feige",
            "Jac Schaeffer, Ned Benson",
            "Marvel Studio","1 Mei 2020 (Amerika Serikat)",
            "https://cdns.klimg.com/kapanlagi.com/p/blackwidow_poster.jpg"))
        //6
        moviesTv.add(MovieTvEntity("mt6",
            "Black Widow",
            "Black Widow adalah film pahlawan super Amerika Serikat tahun 2020 yang didasarkan dari karakter Marvel Comics bernama sama. Film ini diproduksi Marvel Studios dan disalurkan Walt Disney Studios Motion Pictures. Film ini adalah film ke-24 Marvel Cinematic Universe (MCU). Film ini disutradarai Cate Shortland, ditulis Jac Schaeffer dan Ned Benson, serta dibintangi Scarlett Johansson, David Harbour, Florence Pugh, O-T Fagbenle, dan Rachel Weisz. The Eternals dijadwalkan akan ditayangkan di Amerika Serikat pada 1 Mei 2020.",
            "Cate Shortland",
            "Kevin Feige",
            "Jac Schaeffer, Ned Benson",
            "Marvel Studio","1 Mei 2020 (Amerika Serikat)",
            "https://cdns.klimg.com/kapanlagi.com/p/blackwidow_poster.jpg"))
        //7
        moviesTv.add(MovieTvEntity("mt7",
            "Black Widow",
            "Black Widow adalah film pahlawan super Amerika Serikat tahun 2020 yang didasarkan dari karakter Marvel Comics bernama sama. Film ini diproduksi Marvel Studios dan disalurkan Walt Disney Studios Motion Pictures. Film ini adalah film ke-24 Marvel Cinematic Universe (MCU). Film ini disutradarai Cate Shortland, ditulis Jac Schaeffer dan Ned Benson, serta dibintangi Scarlett Johansson, David Harbour, Florence Pugh, O-T Fagbenle, dan Rachel Weisz. The Eternals dijadwalkan akan ditayangkan di Amerika Serikat pada 1 Mei 2020.",
            "Cate Shortland",
            "Kevin Feige",
            "Jac Schaeffer, Ned Benson",
            "Marvel Studio","1 Mei 2020 (Amerika Serikat)",
            "https://cdns.klimg.com/kapanlagi.com/p/blackwidow_poster.jpg"))
        //8
        moviesTv.add(MovieTvEntity("mt8",
            "Black Widow",
            "Black Widow adalah film pahlawan super Amerika Serikat tahun 2020 yang didasarkan dari karakter Marvel Comics bernama sama. Film ini diproduksi Marvel Studios dan disalurkan Walt Disney Studios Motion Pictures. Film ini adalah film ke-24 Marvel Cinematic Universe (MCU). Film ini disutradarai Cate Shortland, ditulis Jac Schaeffer dan Ned Benson, serta dibintangi Scarlett Johansson, David Harbour, Florence Pugh, O-T Fagbenle, dan Rachel Weisz. The Eternals dijadwalkan akan ditayangkan di Amerika Serikat pada 1 Mei 2020.",
            "Cate Shortland",
            "Kevin Feige",
            "Jac Schaeffer, Ned Benson",
            "Marvel Studio","1 Mei 2020 (Amerika Serikat)",
            "https://cdns.klimg.com/kapanlagi.com/p/blackwidow_poster.jpg"))
        //9
        moviesTv.add(MovieTvEntity("mt9",
            "Black Widow",
            "Black Widow adalah film pahlawan super Amerika Serikat tahun 2020 yang didasarkan dari karakter Marvel Comics bernama sama. Film ini diproduksi Marvel Studios dan disalurkan Walt Disney Studios Motion Pictures. Film ini adalah film ke-24 Marvel Cinematic Universe (MCU). Film ini disutradarai Cate Shortland, ditulis Jac Schaeffer dan Ned Benson, serta dibintangi Scarlett Johansson, David Harbour, Florence Pugh, O-T Fagbenle, dan Rachel Weisz. The Eternals dijadwalkan akan ditayangkan di Amerika Serikat pada 1 Mei 2020.",
            "Cate Shortland",
            "Kevin Feige",
            "Jac Schaeffer, Ned Benson",
            "Marvel Studio","1 Mei 2020 (Amerika Serikat)",
            "https://cdns.klimg.com/kapanlagi.com/p/blackwidow_poster.jpg"))
        //10
        moviesTv.add(MovieTvEntity("mt10",
            "Black Widow",
            "Black Widow adalah film pahlawan super Amerika Serikat tahun 2020 yang didasarkan dari karakter Marvel Comics bernama sama. Film ini diproduksi Marvel Studios dan disalurkan Walt Disney Studios Motion Pictures. Film ini adalah film ke-24 Marvel Cinematic Universe (MCU). Film ini disutradarai Cate Shortland, ditulis Jac Schaeffer dan Ned Benson, serta dibintangi Scarlett Johansson, David Harbour, Florence Pugh, O-T Fagbenle, dan Rachel Weisz. The Eternals dijadwalkan akan ditayangkan di Amerika Serikat pada 1 Mei 2020.",
            "Cate Shortland",
            "Kevin Feige",
            "Jac Schaeffer, Ned Benson",
            "Marvel Studio","1 Mei 2020 (Amerika Serikat)",
            "https://cdns.klimg.com/kapanlagi.com/p/blackwidow_poster.jpg"))

        return moviesTv
    }


}