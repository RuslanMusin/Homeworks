package ru.startandroid.viewpagetest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by user on 10.07.2017.
 */

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.EventViewHolder>{

    public EventAdapter(List<Event> events) {
        this.events = events;
    }

    List<Event> events;
    OnEventClickListener listener;

    public EventAdapter(List<Event> events, OnEventClickListener listener) {
        this.events = events;
        this.listener = listener;
    }

    @Override
    public EventViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new EventViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.event_fragment,parent,false));
    }

    @Override
    public void onBindViewHolder(EventViewHolder holder, int position) {
        holder.eventName.setText(events.get(position).getEventName());
        holder.description.setText(events.get(position).getDescription());
       // Picasso.with(holder.eventName.getContext()).load(events.get(position).getImage()).into(holder.imageView);

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onEventClick();
            }
        });
    }

    @Override
    public int getItemCount() {
        return events.size();
    }

    public class EventViewHolder extends RecyclerView.ViewHolder {

        TextView eventName;
        TextView description;
        ImageView imageView;
        RelativeLayout relativeLayout;

        public EventViewHolder(View itemView) {
            super(itemView);
            eventName = itemView.findViewById(R.id.event_name);
            description = itemView.findViewById(R.id.description);
            imageView = itemView.findViewById(R.id.event_image);
            relativeLayout = itemView.findViewById(R.id.relative_layout);

        }


    }

    interface OnEventClickListener{
        void onEventClick();
    }
}
