package com.example.helloworld;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

public class FragmentTop extends Fragment {
    private static final String TAG =FragmentTop.class.getSimpleName();

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        Log.i(TAG, "onCreateView: FragmentTop");
        return inflater.inflate(R.layout.fragment_top, container, false);
    }
}
