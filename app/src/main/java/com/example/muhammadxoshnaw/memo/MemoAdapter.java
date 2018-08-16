package com.example.muhammadxoshnaw.memo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MemoAdapter extends RecyclerView.Adapter<MemoAdapter.Holder> {
    ArrayList<Memo> memos;

    public MemoAdapter(ArrayList<Memo> memos) {
        this.memos = memos;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Holder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.memo_list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        Memo memo = memos.get(position);

        if (memo != null) {
            if (memo.getTitle() != null) {
                holder.title.setText(memo.getTitle());
            }
            if (memo.getDescription() != null) {
                holder.description.setText(memo.getDescription());
            }
        }
    }

    @Override
    public int getItemCount() {
        return memos == null ? 0 : memos.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        public TextView title;
        public TextView description;

        public Holder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title_tv);
            description = itemView.findViewById(R.id.description_tv);
        }
    }

    public void addItems(ArrayList<Memo> memos) {
        this.memos.addAll(memos);
        notifyDataSetChanged();
    }
}
