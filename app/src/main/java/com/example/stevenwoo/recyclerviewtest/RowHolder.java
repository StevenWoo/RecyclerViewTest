package com.example.stevenwoo.recyclerviewtest;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by stevenwoo on 8/31/15.
 */
public class RowHolder extends RecyclerView.ViewHolder {
    TextView label = null;
    TextView size = null;
    ImageView icon=null;
    String template=null;

    RowHolder(View row) {
        super(row);
        label=(TextView)row.findViewById(R.id.label);
        size=(TextView)row.findViewById(R.id.size);
        icon=(ImageView)row.findViewById(R.id.icon);
        template=size.getContext().getString(R.string.size_template);
    }

    void bindModel(String item) {
        label.setText(item);
        size.setText(String.format(template, item.length()));
        if (item.length()>4) {
            icon.setImageResource(android.R.drawable.button_onoff_indicator_off);
        }
        else {
            icon.setImageResource(android.R.drawable.button_onoff_indicator_on);
        }
    }
}