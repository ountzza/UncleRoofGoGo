package com.example.pondd.uncleroofgogo.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.pondd.uncleroofgogo.R;

/**
 * Created by nuuneoi on 11/16/2014.
 */
public class MainListViewItem extends RelativeLayout {

    private TextView tvName;

    public MainListViewItem(Context context) {
        super(context);
        initInflate();
        initInstances();
    }

    public MainListViewItem(Context context, AttributeSet attrs) {
        super(context, attrs);
        initInflate();
        initInstances();
        initWithAttrs(attrs);
    }

    public MainListViewItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initInflate();
        initInstances();
        initWithAttrs(attrs);
    }

    private void initInflate() {
        LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.main_list_view_item, this);
    }

    private void initInstances() {
        tvName = (TextView) findViewById(R.id.tvName);
    }

    private void initWithAttrs(AttributeSet attrs) {

    }
}
