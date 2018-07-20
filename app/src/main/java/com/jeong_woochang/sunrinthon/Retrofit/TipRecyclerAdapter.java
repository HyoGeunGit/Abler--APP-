package com.jeong_woochang.sunrinthon.Retrofit;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jeong_woochang.sunrinthon.R;

import java.util.ArrayList;

/**
 * Created by jeong-woochang on 2018. 7. 20..
 */

class TipRecyclerAdapter extends RecyclerView.Adapter<TipRecyclerAdapter.ViewHolder> {

    ArrayList<TipData> arrayList=new ArrayList<>();

    public TipRecyclerAdapter(){}

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LinearLayout layout=(LinearLayout) LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tip,parent,false);
        ViewHolder vh=new ViewHolder(layout);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TipData tmp=arrayList.get(position);
        TextView title=(TextView)holder.layout.findViewById(R.id.title);
        TextView content=(TextView)holder.layout.findViewById(R.id.content);
        title.setText(tmp.getTitle());
        content.setText(tmp.getContent());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public LinearLayout layout;

        public ViewHolder(LinearLayout _layout) {
            super(_layout);
            layout=_layout;
        }
    }

    public void addItem(String title, String content){
        TipData data=new TipData();
        data.setTitle(title);
        data.setContent(content);
        arrayList.add(data);
    }
}
