package com.example.android.oslotourguide;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MuseumFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate( R.layout.fragment_list, container, false );

        //create list of museums
        final ArrayList<Oslo> list = new ArrayList<>();
        list.add( new Oslo( R.drawable.scream, R.string.munch, R.string.munch_paragraph ) );
        list.add( new Oslo( R.drawable.fram, R.string.polar, R.string.fram_paragraph ) );
        list.add( new Oslo( R.drawable.viking, R.string.viking, R.string.viking_paragraph ) );

        //Create list as a recyclerview
        RecyclerView recyclerView = root.findViewById( R.id.oslo_list );

        //Adapting the recycler
        OsloAdapter mAdapter = new OsloAdapter( list );

        //Manage layout
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager( getActivity() );
        recyclerView.setLayoutManager( mLayoutManager );

        //adding divder item to seperate list items
        recyclerView.addItemDecoration( new DividerItemDecoration( getContext(), LinearLayoutManager.VERTICAL ) );

        //Setting the view
        recyclerView.setAdapter( mAdapter );

        return root;
    }
}
