package com.peno.learnandroidstudio;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SignupTabFragment extends Fragment {

    public SignupTabFragment() {
        // Required empty public constructor
    }

    public static SignupTabFragment newInstance(String param1, String param2) {
        SignupTabFragment fragment = new SignupTabFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_signup_tab, container, false);
    }
}