package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by moshw on 11/2/2017.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(@NonNull Context context, @NonNull List<Earthquake> objects) {
        super(context, 0, objects);
    }

    @Nullable
    @Override
    public Earthquake getItem(int position) {
        return super.getItem(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View row = convertView;

        if (row == null)
        {
            row= LayoutInflater.from(getContext()).inflate(R.layout.row,parent,false);
        }

        Earthquake currentEarthquake = getItem(position);

        TextView magnitude = (TextView) row.findViewById(R.id.mag);
        magnitude.setText(currentEarthquake.getmMagnitude());

        TextView place = (TextView) row.findViewById(R.id.place);
        place.setText(currentEarthquake.getmPlace());

        TextView date = (TextView) row.findViewById(R.id.date);
        date.setText(currentEarthquake.getmDate());

        return row;
    }
}
