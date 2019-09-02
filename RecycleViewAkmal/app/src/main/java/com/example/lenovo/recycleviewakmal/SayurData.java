package com.example.lenovo.recycleviewakmal;

import java.util.ArrayList;

public class SayurData {
    public static String[][] data = new String[][]{
            {"Bayam", "Bayam adalah salah satu sayuran yang mengandung vitamin dan mineral yang cukup lengkap. Adapun kandungan vitamin yang dimiliki bayam mulai dari vitamin A, vitamin B, vitamin C, dan vitamin K. Selain itu, mineral-mineral utama yang dimiliki bayam adalah magnesium, zat besi, asam folat, kalsium, potasium, dan sodium.", "https://doktersehat.com/wp-content/uploads/2018/10/manfaat-bayam-doktersehat-696x461.jpg"},
            {"Kangkung", "Salah satu jenis sayur yang paling mudah ditemui di Indonesia adalah kangkung. Harganya juga cenderung murah sehingga bisa kita konsumsi kapan saja. Hanya saja, ada yang menyebut kangkung sebagai salah satu sayuran yang bisa membantu menurunkan kadar kolesterol tubuh.", "https://i2.wp.com/resepkoki.id/wp-content/uploads/2018/08/kangkung.jpg?fit=1200%2C852&ssl=1"},
            {"Wortel", "Wortel termasuk dalam sayuran yang sering dikonsumsi masyarakat Indonesia. Sayangnya, karena rasanya yang cenderung manis, ada sebagian penderita diabetes yang mengaku khawatir untuk mengonsumsinya.", "http://www.sajadah.co/wp-content/uploads/2017/10/manfaat-wortel-bagi-kesehatan.jpg"},
            {"Cabai", "Salah satu bumbu dapur yang paling sering dikonsumsi oleh masyarakat Indonesia adalah cabai rawit. Tanpa adanya cabai rawit yang bisa digunakan sebagai bahan utama dari sambal atau campuran dari berbagai macam masakan ini, kita tentu tidak akan mendapatkan sensasi pedas dan nikmat saat menyantap makanan.", "https://cdn.idntimes.com/content-images/post/20170120/manfaatcabai-0344b147044619eeb840af7071b7934a_600x400.jpg"},
            {"Terong", "Terong termasuk dalam sayuran yang cukup digemari masyarakat di seluruh dunia, termasuk Indonesia. Terong sendiri bisa diolah menjadi makanan yang lezat untuk dijadikan lauk. Namun, tahukah anda jika selain memberikan rasa yang nikmat, terong ternyata juga bisa memberikan banyak manfaat bagi kesehatan tubuh.", "https://hellosehat.com/wp-content/uploads/2016/12/shutterstock_521754532.jpg"},
            {"Sawi", "Sawi merupakan sekelompok tumbuhan yang berasal dari marga Brassica. Sawi memiliki banyak sekali jenis mulai dari jenis sawi hijau seperti caisim dan pakcoy, sawi pahit atau mustard greens, hingga sawi putih. Meskipun jenisnya berbeda-beda, tetapi kandungan nutrisi yang terkandung di dalamnya tidak jauh berbeda.", "https://hellosehat.com/wp-content/uploads/2018/08/Kupas-Tuntas-Sayur-Pakcoy-Si-Sawi-Hijau-Kaya-Nutrisi.jpg"},
    };
    public static ArrayList<Sayur> getListData(){
        ArrayList<Sayur> list = new ArrayList<>();
        for (String[] aData : data) {
            Sayur sayur = new Sayur();
            sayur.setName(aData[0]);
            sayur.setDesc(aData[1]);
            sayur.setPhoto(aData[2]);
            list.add(sayur);
        }
        return list;
    }
}
