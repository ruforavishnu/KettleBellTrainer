package com.efgh.kettlebelltrainer;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class BeginnersProgramActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginners_program);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        try {
            ArrayList<String> beginnersProgramArrayList = new ArrayList<String>();
            Resources res = getResources();
            int listLength = res.getStringArray(R.array.BeginnersProgram).length;

            String[] beginnersProgramArray = res.getStringArray(R.array.BeginnersProgram);
            ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,beginnersProgramArray);
            ListView beginnersProgramListView = (ListView)findViewById(R.id.listViewBeginnersProgram);
            beginnersProgramListView.setAdapter(arrayAdapter);

            beginnersProgramListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
            {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id)
                {
                    String item = ((TextView)view).getText().toString();
                    Toast.makeText(getBaseContext(),item,Toast.LENGTH_SHORT).show();

                    Intent excerciseIntent = new Intent(getApplicationContext(),ExcerciseActivity.class);

                    startActivity(excerciseIntent);

                }
            });
        }
        catch (Resources.NotFoundException e) {
            e.printStackTrace();
        }


    }

}
