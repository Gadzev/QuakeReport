package com.example.android.quakereport;

import android.app.LauncherActivity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.ArrayList;


public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(@NonNull Context context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        final Earthquake currentEarthquake = getItem(position);

        TextView magnitude = (TextView) listItemView.findViewById(R.id.magnitude_text_view);
        magnitude.setText(String.format("%s", currentEarthquake.getmMagnitude()));

        TextView location = (TextView) listItemView.findViewById(R.id.location_text_view);
        location.setText(currentEarthquake.getmLocation());

        TextView date = (TextView) listItemView.findViewById(R.id.date_text_view);
        date.setText(String.format("%s", currentEarthquake.getmDate()));

        return listItemView;
    }
}
