package com.example.skeletonloading;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.facebook.shimmer.ShimmerFrameLayout;

import java.util.ArrayList;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.ViewHolder> {

    ArrayList<Notes> list= new ArrayList<>();
    Context context;

    public NotesAdapter(ArrayList<Notes> list, Context context) {
        this.list = list;
        this.context= context;
    }
    boolean showShummer=true;
    int SHAMMER_ITEM_NUMBER=5;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new ViewHolder(view);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if(showShummer){
            holder.shimmerFrameLayout.startShimmer();
        }
        else{
            holder.shimmerFrameLayout.stopShimmer();
            holder.shimmerFrameLayout.setShimmer(null);
            holder.textTitle.setBackground(null);
            holder.textTitle.setText(list.get(position).getTitle());
            holder.textDeskripsi.setBackground(null);
            holder.textDeskripsi.setText(list.get(position).getDeskripsi());
            holder.imagePost.setImageResource(list.get(position).getGambar());
        }

    }

    @Override
    public int getItemCount() {
        return showShummer?SHAMMER_ITEM_NUMBER:list.size();// return 5 after loading
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ShimmerFrameLayout shimmerFrameLayout;
        TextView textTitle;
        TextView textDeskripsi;
        ImageView imagePost;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textTitle= itemView.findViewById(R.id.text_title);
            textDeskripsi= itemView.findViewById(R.id.text_deskripsi);
            shimmerFrameLayout= itemView.findViewById(R.id.shimmer_layout);
            imagePost= itemView.findViewById(R.id.image_post);
        }
    }
}
