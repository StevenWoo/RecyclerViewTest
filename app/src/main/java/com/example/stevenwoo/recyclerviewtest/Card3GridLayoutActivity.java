package com.example.stevenwoo.recyclerviewtest;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * Created by stevenwoo on 10/3/15.
 */
public class Card3GridLayoutActivity extends RecyclerViewGridActivity {
    private static final String[] items={"lorem", "ipsum", "dolor",
            "sit", "amet",
            "consectetuer", "adipiscing", "elit", "morbi", "vel",
            "ligula", "vitae", "arcu", "aliquet", "mollis",
            "etiam", "vel", "erat", "placerat", "ante",
            "porttitor", "sodales", "pellentesque", "augue", "purus"};

    public class IconicAdapter extends RecyclerView.Adapter<RowHolder> {
        @Override
        public RowHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return(new RowHolder(getLayoutInflater() .inflate(R.layout.row, parent, false)));
        }

        @Override
        public void onBindViewHolder(RowHolder holder, int position) {
            holder.bindModel(items[position]);
        }

        @Override
        public int getItemCount() {
            return(items.length);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setLayoutManager(new GridLayoutManager(this, 1));
        setAdapter(new IconicAdapter());
    }
}
