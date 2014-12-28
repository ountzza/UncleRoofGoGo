package com.example.pondd.uncleroofgogo.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pondd.uncleroofgogo.R;

/**
 * Created by nuuneoi on 11/16/2014.
 */
public class FragmentMainListView extends Fragment {

    public FragmentMainListView() {
        super();
    }

    public static FragmentMainListView newInstance() {
        FragmentMainListView fragment = new FragmentMainListView();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main_list_view, container, false);
        initInstances(rootView);
        return rootView;
    }

    private void initInstances(View rootView) {
        // init instance with rootView.findViewById here
        setRetainInstance(true);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }
}
