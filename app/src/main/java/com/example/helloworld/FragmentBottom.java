package com.example.helloworld;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class FragmentBottom extends Fragment {
    private static final String TAG = FragmentBottom.class.getSimpleName();

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        Log.i(TAG, "onCreateView: FragmentBottom");
        return inflater.inflate(R.layout.fragment_bottom, container, false);
    }
}
