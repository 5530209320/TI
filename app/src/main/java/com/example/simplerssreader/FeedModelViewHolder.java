package com.example.simplerssreader;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Pongsakorn on 8/12/2560.
 */

public class FeedModelViewHolder extends RecyclerView.ViewHolder {

    public View rssFeedView;

    public FeedModelViewHolder(View v) {
        super(v);
        rssFeedView = v;
    }
}
