package com.android.wishlist.view;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.wishlist.R;
import com.android.wishlist.viewmodel.AddPresentViewModel;

public class AddPresentFragment extends Fragment {

    private AddPresentViewModel mViewModel;

    public static AddPresentFragment newInstance() {
        return new AddPresentFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_add_present, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(AddPresentViewModel.class);
        // TODO: Use the ViewModel
    }

}