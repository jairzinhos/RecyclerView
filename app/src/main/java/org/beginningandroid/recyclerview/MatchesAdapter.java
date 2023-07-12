package org.beginningandroid.recyclerview;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class MatchesAdapter extends RecyclerView.Adapter<MatchesAdapter.MyViewHolder> {
    private List<MatchModel> matchesList;
    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView match, hour, ligue,channel, status;
        Button link;
        MyViewHolder(View view) {
            super(view);
            match = view.findViewById(R.id.match);
            hour = view.findViewById(R.id.hour);
            ligue = view.findViewById(R.id.ligue);
            channel = view.findViewById(R.id.channel);
            status = view.findViewById(R.id.status);
            link = view.findViewById(R.id.link);
        }
    }
    public MatchesAdapter(List<MatchModel> moviesList) {
        this.matchesList = matchesList;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.matches_list, parent, false);
        return new MyViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        MatchModel match = matchesList.get(position);
        holder.match.setText(match.getMatch());
        holder.hour.setText(match.getHour());
        holder.ligue.setText(match.getLigue());
        holder.channel.setText(match.getChannel());
        holder.status.setText(match.getStatus());
        holder.link.setText(match.getLink());
    }
    @Override
    public int getItemCount() {
        return matchesList.size();
    }
}