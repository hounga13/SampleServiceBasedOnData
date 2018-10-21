package com.hounga.sampleservicebasedondata.presenter.quote;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.hounga.sampleservicebasedondata.R;
import com.hounga.sampleservicebasedondata.entity.Quote;

import java.util.ArrayList;

public class QuoteAdapter extends RecyclerView.Adapter<QuoteAdapter.QuoteViewHolder> {
    private ArrayList<Quote> mList;
    private LayoutInflater mInflate;
    private Context mContext;

    public QuoteAdapter(Context context, ArrayList<Quote> list) {
        this.mList = list;
        this.mContext = context;
        this.mInflate = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public QuoteViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = mInflate.inflate(R.layout.layout_listitem_quote, viewGroup, false);
        QuoteViewHolder viewHolder = new QuoteViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull QuoteViewHolder viewHolder, int i) {
        viewHolder.quoteTextView.setText("\"" + mList.get(i).getQuote()+ "\"");
        viewHolder.quthorTextView.setText("-" + mList.get(i).getAuthor());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    static class QuoteViewHolder extends RecyclerView.ViewHolder {
        public TextView quoteTextView;
        public TextView quthorTextView;

        public QuoteViewHolder(@NonNull View itemView) {
            super(itemView);

            quoteTextView = (TextView) itemView.findViewById(R.id.textview_quote);
            quthorTextView = (TextView) itemView.findViewById(R.id.textview_author);
        }
    }
}