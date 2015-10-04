package com.example.stevenwoo.recyclerviewtest;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * Created by stevenwoo on 8/31/15.
 */
public class RecyclerViewGridActivity extends Activity {


    private RecyclerView rv=null;
    public void setAdapter(RecyclerView.Adapter adapter) { getRecyclerView().setAdapter(adapter);
    }
    public RecyclerView.Adapter getAdapter() { return(getRecyclerView().getAdapter());
    }
    public void setLayoutManager(RecyclerView.LayoutManager mgr) { getRecyclerView().setLayoutManager(mgr);
    }
    public RecyclerView getRecyclerView() {
        if (rv==null) {
            rv=new RecyclerView(this); rv.setHasFixedSize(true); setContentView(rv);
        }
        return(rv);
    }

}