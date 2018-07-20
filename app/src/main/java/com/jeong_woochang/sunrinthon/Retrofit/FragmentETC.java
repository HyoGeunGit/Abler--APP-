package com.jeong_woochang.sunrinthon.Retrofit;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.jeong_woochang.sunrinthon.R;

/**
 * Created by jeong-woochang on 2018. 7. 20..
 */

public class FragmentETC extends Fragment {
    public FragmentETC(){}
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        PlayRecyclerAdapter tipRecyclerAdapter=new PlayRecyclerAdapter();
        LinearLayout layout=(LinearLayout)inflater.inflate(R.layout.fragment_etc,container,false);
        RecyclerView recyclerView=(RecyclerView)layout.findViewById(R.id.etc_recyclerView);
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);
        recyclerView.setAdapter(tipRecyclerAdapter);
        tipRecyclerAdapter.addItem("Title", "Content");
        return layout;
    }
}
