package com.example.nekr0s.get_my_driver_card.views.create.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.nekr0s.get_my_driver_card.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class RenewFragment extends Fragment {


    public RenewFragment() {
        // Required empty public constructor
    }

    public static Fragment newInstance() {
        return new RenewFragment();
    }

    @BindView(R.id.some_button)
    Button mSomebutton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_renew, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

    @OnClick(R.id.some_button)


    @Override
    public void onDetach() {
        super.onDetach();
        getActivity().finish();
    }
}
