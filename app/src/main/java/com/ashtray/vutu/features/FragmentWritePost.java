package com.ashtray.vutu.features;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ashtray.vutu.R;
import com.ashtray.vutu.entities.MyFragment;

public class FragmentWritePost extends MyFragment {

    public FragmentWritePost() {
        // Required empty public constructor
    }

    @Override
    public boolean handleBackButtonPressed() {
        return false;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_write_post, container, false);
    }
}
