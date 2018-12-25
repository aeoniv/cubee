package com.lacina.cubeeclient.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.lacina.cubeeclient.R;
import com.lacina.cubeeclient.model.Event;

import java.util.ArrayList;

public class EventListAdapter extends BaseAdapter {

    private final ArrayList<Event> items;

    /**
     * Reference to caller context
     */
    private final Context context;

    public EventListAdapter(Context context, ArrayList<Event> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //SET UP ITEM VIEW
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_event_item, parent, false);
        TextView eventName = (TextView) view.findViewById(R.id.nome_event);
        Event event = (Event) getItem(position);

        //SET UP VIEW INFORMATION
        eventName.setText(event.getName());
        return view;
    }

    public Event getItemEvent(int position) {
        return items.get(position);
    }
}