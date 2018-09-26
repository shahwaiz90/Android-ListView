package io.smd.listview.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import io.smd.listview.R;
import io.smd.listview.adapter.CustomAdapter;
import io.smd.listview.model.Player;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Player> userArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView        =       findViewById(R.id.listView);
        userArrayList   =       new ArrayList<Player>();

        userArrayList.add(new Player("Fakhar Zaman", 204));
        userArrayList.add(new Player("Imam", 22));
        userArrayList.add(new Player("Babar", 22));
        userArrayList.add(new Player("Sarfaraz", 26));
        userArrayList.add(new Player("Shoaib Malik", 22));
        userArrayList.add(new Player("Hassan Ali", 22));
        userArrayList.add(new Player("Sarfaraz", 22));
        userArrayList.add(new Player("Asif", 22));
        userArrayList.add(new Player("Saad", 22));
        userArrayList.add(new Player("Shadab", 22));
        userArrayList.add(new Player("Amir", 22));

        CustomAdapter userListViewAdapter = new CustomAdapter(userArrayList, this);
        listView.setAdapter(userListViewAdapter);

    }
}
