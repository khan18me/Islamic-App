package com.example.islamicapp.dua;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.util.Pair;
import androidx.recyclerview.widget.RecyclerView;

import com.example.islamicapp.R;
import com.robertlevonyan.views.expandable.Expandable;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

class ExpandableAdapter extends RecyclerView.Adapter<ExpandableViewHolder> {
    private final Context context;
    private final ArrayList<ExpandableModel> models;
    private final ArrayList<Pair<Integer, Integer>> colors;

    public ExpandableAdapter(Context context,ArrayList<ExpandableModel>models,ArrayList<Pair<Integer, Integer>>  colors) {
        this.context = context;
        this.models = models;
        this.colors = colors;
    }

    @NonNull
    @NotNull
    @Override
    public ExpandableViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_expandable, parent, false);
        return new ExpandableViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ExpandableViewHolder holder, int position) {
       ExpandableModel expandableModel = models.get(holder.getAdapterPosition());
       Expandable expandable = holder.getExpandable();
       LinearLayout header = holder.getHeader();
       FrameLayout content = holder.getContent();
       TextView headerText = holder.getHeaderText();
       TextView headerSubText = holder.getHeaderSubText();
       TextView contentText = holder.getContentText();

        Pair<Integer, Integer> color = colors.get(holder.getAdapterPosition());

        expandable.setExpandingListener(new Expandable.ExpandingListener() {
            @Override
            public void onExpanded() {
                Log.e("View", "Expanded");
            }

            @Override
            public void onCollapsed() {
                Log.e("View", "Collapsed");
            }
        });
        expandable.setAnimateExpand(true);
        header.setBackgroundColor(color.first);
        content.setBackgroundColor(color.second);
        headerText.setText(expandableModel.getHeaderText());
        headerSubText.setText(expandableModel.getHeaderSubText());
        contentText.setText(expandableModel.getContentText());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }
}
