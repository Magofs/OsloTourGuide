package com.example.android.oslotourguide;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class OsloAdapter extends RecyclerView.Adapter<OsloAdapter.MyViewHolder> {

    private ArrayList<Oslo> list;

    /*Create class to hold the item views in the list*/
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public TextView paragraph;
        public ImageView attraction;

        public MyViewHolder(View view) {
            super( view );
            name = view.findViewById( R.id.oslo_text );
            attraction = view.findViewById( R.id.oslo_image );
            paragraph = view.findViewById( R.id.paragraph );
        }
    }

    /*Class Constructor*/
    public OsloAdapter(ArrayList<Oslo> list) {
        this.list = list;
    }

    /*Creating container to hold single views*/
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View itemView = LayoutInflater.from( viewGroup.getContext() )
                .inflate( R.layout.list_item, viewGroup, false );

        return new MyViewHolder( itemView );
    }

    /*Binding the individual views to the recyler views*/
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int position) {
        Oslo oslo = list.get( position );
        myViewHolder.attraction.setImageResource( oslo.getImageResourceId() );
        myViewHolder.name.setText( oslo.getNameId() );
        myViewHolder.paragraph.setText( oslo.getParagraph() );

    }

    /*Overrides the abstract implementation obligatory*/
    @Override
    public int getItemCount() {
        return list.size();
    }
}
