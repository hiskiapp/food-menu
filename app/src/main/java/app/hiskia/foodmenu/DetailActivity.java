package app.hiskia.foodmenu;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class DetailActivity extends AppCompatActivity {
    TextView tvName, tvPrice, tvDesc;
    ImageView ivImage;
    String name, price, desc, image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Detail Makanan: ");

        image = getIntent().getStringExtra("image");
        name = getIntent().getStringExtra("name");
        price = getIntent().getStringExtra("price");
        desc = getIntent().getStringExtra("desc");

        setTitle("Detail Makanan: "+name);
        ivImage = findViewById(R.id.iv_image);
        Glide.with(this).load(image).diskCacheStrategy(DiskCacheStrategy.ALL).into(ivImage);
        tvName = findViewById(R.id.tv_name); tvName.setText(name);
        tvPrice = findViewById(R.id.tv_price); tvPrice.setText("Harga: " + price);
        tvDesc = findViewById(R.id.tv_desc); tvDesc.setText(desc);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(intent, 0);
        return true;
    }
}