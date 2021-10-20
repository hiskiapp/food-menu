package app.hiskia.foodmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvFood;
    private ArrayList<Food> foods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvFood = findViewById(R.id.rv_food);
        initData();

        rvFood.setAdapter(new FoodAdapter(foods, this));
        rvFood.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData() {
        this.foods = new ArrayList<>();
        foods.add(new Food(
                "Pindang Serani",
                "Pindang serani adalah makanan khas dari Jepara berupa semacam sup ikan laut. Rasa pindang serani merupakan perpaduan rasa pedas, asem dan manis yang umumnya disajikan pada siang hari. Sajian ikan pindang bening dengan ikan laut ini terasa ringan dan segar. Pindang serani ini berbeda dengan sajian pindang ikan Betawi.",
                "https://cdn.idntimes.com/content-images/post/20200505/ser-1928b312ef762340901450f2c2fe22f4_600x400.jpg",
                12000
                ));
        foods.add(new Food(
                "Opor Panggang",
                "Opor Panggang Jepara atau lebih dikenal Opor Panggang Makanan khas pagi warga masyarakat Kabupaten Jepara, tepatnya dulu dari Desa Mayong. Makanan serupa dikenal juga di Kudus dengan nama Opor bakar Kudus dengan perbedaan teknik memasak dengan dibakar, sedangkan Opor panggang Jepara di panggang menggunakan paso.",
                "https://cdn.sindonews.net/dyn/620/content/2018/05/15/185/1306105/opor-ayam-panggang-olahan-lezat-untuk-sahur-0Sl-thumb.jpg",
                32000
                ));
        foods.add(new Food(
                "Singit",
                "Singit adalah masakan tradisional terbuat dari daging sengkel yang diolah dengan bumbu-bumbu bersama santan dan kecap manis. Masakan ini berasal dari Jepara, Jawa Tengah.",
                "https://7terbaik.com/wp-content/uploads/2019/01/Singit-300x203.jpg",
                18000
                ));
        foods.add(new Food(
                "Bongko Meto",
                "Bongko mento adalah salah satu sajian asal Keraton Jepara. Sajian yang dibungus dengan daun pisang ini berisi dadar yang telah diisi dengan tumisan suwiran dada ayam yang dicampur dengan jamur kuping, soun, dan santan. Kudapan ini bisa menjadi pilihan snack gurih untuk arisan atau pesta kecil di rumah.",
                "https://media.suara.com/pictures/970x544/2017/04/22/48567-bongko-mento-salah-satu-kue-basah-tradisional-khas-jepara.jpg",
                24000
                ));
        foods.add(new Food(
                "Soto Jepara",
                "Soto Jepara adalah masakan khas dari Jepara. Sekilas soto ini seperti soto ayam biasa, tetapi soto ini memiliki cita rasa yang gurih yang tidak bisa ditemui pada soto ayam lain. Perbedaan terbesar soto Jepara dengan soto ayam biasa, terletak pada kuah sotonya.",
                "https://factsofindonesia.com/wp-content/uploads/2018/04/Soto-Jepara.jpeg",
                20000
                ));
        foods.add(new Food(
                "Sup Udang",
                "Sup udang adalah sebuah hidangan sup yang disajikan menggunakan udang air tawar atau air laut sebagai hidangan utama.",
                "https://selerasa.com/wp-content/uploads/2015/07/images_ikan_resep_udang_36-sop-udang-jepara.jpg",
                26000
                ));
    }
}