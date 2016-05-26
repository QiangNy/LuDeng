package com.ludeng.view.fregment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ludeng.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by chen on 16-5-26.
 */

public class SplashFregment extends Fragment {
    @BindView(R.id.tvLable)
    TextView tvLable;
    // Store instance variables
    private String title;
    private int page;

    // newInstance constructor for creating fragment with arguments
    public static SplashFregment newInstance(int page, String title) {
        SplashFregment fragmentFirst = new SplashFregment();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        fragmentFirst.setArguments(args);
        return fragmentFirst;
    }

    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("someInt", 0);
        title = getArguments().getString("someTitle");
    }

    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        ButterKnife.bind(this, view);
        initView();
        return view;
    }

    private void initView() {
        tvLable.setText(page + " -- " + title);
    }
}