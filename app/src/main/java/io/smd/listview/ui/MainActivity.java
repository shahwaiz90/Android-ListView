package io.smd.listview.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import io.smd.listview.R;
import io.smd.listview.adapter.CustomAdapter;
import io.smd.listview.model.Player;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Player> userArrayList;
    List<String> userList;
    private CustomAdapter userListViewAdapter;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView        =       findViewById(R.id.listView);
        userList        =       new ArrayList<String>();

        //For ArrayAdapter
        userList.add("Sarfaraz");
        userList.add("Asif");
        userList.add("Saad");
        userList.add("Shadab");
        userList.add("Amir");

        arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, userList);
        listView.setAdapter(arrayAdapter);




        //For Custom Adapter
//        userArrayList = new ArrayList<>();
//        userArrayList.add(new Player("Fakhar Zaman", 204));
//        userArrayList.add(new Player("Imam", 22));
//        userArrayList.add(new Player("Babar", 22));
//        userArrayList.add(new Player("Sarfaraz", 26));
//        userArrayList.add(new Player("Shoaib Malik", 22));
//        userArrayList.add(new Player("Hassan Ali", 22));
//
////        Attach Custom Adapter
//         userListViewAdapter = new CustomAdapter(userArrayList, this);
//        listView.setAdapter(userListViewAdapter);
//
//
//        userListViewAdapter.notifyDataSetChanged();

    }

    public void AddPlayer(View view) {

        //For ArrayAdapter
        userList.add("Ahmad Shahzad");
        arrayAdapter.notifyDataSetChanged();
        //For Custom Adapter
//        userArrayList.add(new Player("Ahmad Shahwaiz", 22));
//        userListViewAdapter.notifyDataSetChanged();
    }
}
