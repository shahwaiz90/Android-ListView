package io.smd.listview.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import io.smd.listview.R;
import io.smd.listview.model.Player;

public class CustomAdapter extends BaseAdapter {

    private ArrayList<Player> dataSet;
    private Context mContext;

    // View lookup cache
    private static class ViewHolder {
        TextView username;
        TextView age;
    }

    public CustomAdapter(ArrayList<Player> data, Context context) {
        this.dataSet    =   data;
        this.mContext   =   context;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if(convertView == null) {

            Log.i("CustomAdapter", "convertView is null");
            convertView                 =   LayoutInflater.from(mContext).inflate(R.layout.list_row, parent, false);
            viewHolder                  =   new ViewHolder();

            viewHolder.username         =   convertView.findViewById(R.id.firstLine);
            viewHolder.age              =   convertView.findViewById(R.id.secondLine);
            convertView.setTag(viewHolder);

        }else {

            Log.i("CustomAdapter", "Reused");
            viewHolder              =   (ViewHolder) convertView.getTag();
        }

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "You Clicked: "+dataSet.get(position).getPlayerName(), Toast.LENGTH_SHORT).show();
            }
        });

        viewHolder.username.setText(dataSet.get(position).getPlayerName());
        viewHolder.age.setText("Score: "+dataSet.get(position).getScore());
        return convertView;
    }


    @Override
    public int getCount() {
        return dataSet.size();
    }

    @Override
    public Object getItem(int position) {
        return dataSet.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

}


