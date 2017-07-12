package ru.startandroid.viewpagetest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 10.07.2017.
 */

public class EventFragment extends Fragment implements EventAdapter.OnEventClickListener {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.recycler_view_layout,container,false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        List<Event> events = new ArrayList<>();
        for(int  i = 0; i< 30; i++){
            events.add(new Event()
            .setDescription("new")
                            .setEventName("something")
            );


        }

        RecyclerView eventRV = view.findViewById(R.id.recycler_view);
        EventAdapter adapter = new EventAdapter(events);
        eventRV.setAdapter(adapter);
        eventRV.setLayoutManager(new LinearLayoutManager(view.getContext()));


    }

    public void onEventClick(){
        Toast.makeText(getContext(),"Ура",Toast.LENGTH_SHORT).show();
    }

}
