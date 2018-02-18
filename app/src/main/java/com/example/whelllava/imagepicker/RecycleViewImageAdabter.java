package com.example.whelllava.imagepicker;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Whelllava on 2/18/2018.
 */

public class RecycleViewImageAdabter extends RecyclerView.Adapter<RecycleViewImageAdabter.MyViewHolder> {
    Context ctx;
    List<ImageModel> models;

    public RecycleViewImageAdabter(Context ctx, List<ImageModel> models) {
        this.ctx = ctx;
        this.models = models;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(ctx);
        view = inflater.inflate(R.layout.image_content, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder,final int position) {
        holder.img.setImageResource(models.get(position).getImg());
        holder.title.setText(models.get(position).getTitle());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ctx , MainActivity.class);
                intent.putExtra("Image" , models.get(position).getImg());
                intent.putExtra("Title" , models.get(position).getTitle());

                ctx.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView title;
        CardView cardView;

        public MyViewHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.image_choose);
            title = itemView.findViewById(R.id.title_choose);
            cardView = itemView.findViewById(R.id.card_content_picker);
        }
    }
}
