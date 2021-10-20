package app.hiskia.foodmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

        ivImage = findViewById(R.id.iv_image);
        tvName = findViewById(R.id.tv_name);
        tvPrice = findViewById(R.id.tv_price);
        tvDesc = findViewById(R.id.tv_desc);

        image = getIntent().getStringExtra("image");
        Glide.with(this).load(image).diskCacheStrategy(DiskCacheStrategy.ALL).into(ivImage);
        name = getIntent().getStringExtra("name");
        tvName.setText(name);
        price = getIntent().getStringExtra("price");
        tvPrice.setText(price);
        desc = getIntent().getStringExtra("desc");
        tvDesc.setText(desc);
    }
}