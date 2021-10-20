package app.hiskia.foodmenu;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {

    private final ArrayList<Food> foods;
    Context context;

    public FoodAdapter(ArrayList<Food> foods, Context context) {
        this.foods = foods;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewHolder holder = new ViewHolder(inflater.inflate(R.layout.activity_main_item, viewGroup, false));

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodAdapter.ViewHolder viewHolder, int i) {
        Food food = foods.get(i);
        Glide.with(this.context).load(food.getImage()).diskCacheStrategy(DiskCacheStrategy.ALL).into(viewHolder.ivImage);
        viewHolder.tvName.setText(food.getName());
        viewHolder.tvPrice.setText(food.getPrice());

        viewHolder.itemLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), DetailActivity.class);
                intent.putExtra("image", food.getImage());
                intent.putExtra("name", food.getName());
                intent.putExtra("desc", food.getDesc());
                intent.putExtra("price", food.getPrice());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return foods.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView ivImage;
        public TextView tvName, tvPrice;
        public ConstraintLayout itemLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivImage = itemView.findViewById(R.id.iv_image);
            tvName = itemView.findViewById(R.id.tv_name);
            tvPrice = itemView.findViewById(R.id.tv_price);
            itemLayout = itemView.findViewById(R.id.layout_item);
        }
    }
}
