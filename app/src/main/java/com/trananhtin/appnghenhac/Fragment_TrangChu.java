package com.trananhtin.appnghenhac;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment_TrangChu#} factory method to
 * create an instance of this fragment.
 */
public class Fragment_TrangChu extends Fragment {

    View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment__trang_chu,container,false);
        return view;
    }
}