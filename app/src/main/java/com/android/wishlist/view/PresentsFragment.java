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
import com.android.wishlist.viewmodel.PresentsViewModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class PresentsFragment extends Fragment {

    private PresentsViewModel mViewModel;
    private FloatingActionButton btnAdd;
    AddPresentFragment addPresentFragment = new AddPresentFragment();

    public static PresentsFragment newInstance() {
        return new PresentsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_presents, container, false);

        btnAdd = view.findViewById(R.id.fbAddFriend);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, addPresentFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(PresentsViewModel.class);
        // TODO: Use the ViewModel
    }

}