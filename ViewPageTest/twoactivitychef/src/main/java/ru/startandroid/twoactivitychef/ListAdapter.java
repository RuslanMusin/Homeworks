package ru.startandroid.twoactivitychef;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by user on 10.07.2017.
 */

public class ListAdapter  extends RecyclerView.Adapter<ListAdapter.QuestViewHolder> {

    public List<Recepie> recepies;

    ChiefOnClickListener chiefOnClickListener;

    public ListAdapter(List<Recepie> recepies,ChiefOnClickListener chiefOnClickListener){
        this.recepies = recepies;
        this.chiefOnClickListener = chiefOnClickListener;
    }


    public static class QuestViewHolder extends RecyclerView.ViewHolder{

        public TextView titleTextView;
        public RelativeLayout linearLayout;

        public QuestViewHolder(View itemView){
            super(itemView);

            titleTextView = (TextView) itemView.findViewById(R.id.text_view_title);
            linearLayout = (RelativeLayout) itemView.findViewById(R.id.linear);

        }
    }

    @Override
    public QuestViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recepie_layout,parent,false);
        return new QuestViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final QuestViewHolder holder, final int position) {
        final Recepie recepie = recepies.get(position);

        holder.titleTextView.setText(recepie.getNameOfDish());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                chiefOnClickListener.doDish(recepies.get(holder.getAdapterPosition()));

            }
        });

  }

    @Override
    public int getItemCount() {
        return recepies.size();
    }

    public interface ChiefOnClickListener{
        void doDish(Recepie recepie);

    }
}
