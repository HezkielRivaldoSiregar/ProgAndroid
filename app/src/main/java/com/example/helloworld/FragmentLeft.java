package com.example.helloworld;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class FragmentLeft extends Fragment {
    private static final String TAG = FragmentLeft.class.getSimpleName();

//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
//        Log.i(TAG, "onCreateView: FragmentTop");
//        return inflater.inflate(R.layout.fragment_left, container, false);
//    }
        String[] film;
        String[] sinopsis;
        RecyclerView recyclerView;
        int[] image ={R.drawable.babydriver,R.drawable.hacksaw_ridge,R.drawable.this_is_the_end
                ,R.drawable.spiderman_homecoming,R.drawable.spidermanffh
        };
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_left, container, false);
            film = getResources().getStringArray(R.array.DaftarFilm);
            sinopsis = getResources().getStringArray(R.array.Deskripsi);
            recyclerView = view.findViewById(R.id.recyclerView);
            RecyclerViewAdapter recycleViewAdapter = new RecyclerViewAdapter(requireContext(),film,sinopsis,image);
            recyclerView.setAdapter(recycleViewAdapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
            return view;
        }
    }

