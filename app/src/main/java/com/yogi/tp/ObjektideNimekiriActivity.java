package com.yogi.tp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ListView;
import android.widget.TextView;

import com.activeandroid.query.Select;

import java.util.ArrayList;
import java.util.List;

import mudelid.TeeObjekt;

public class ObjektideNimekiriActivity extends AppCompatActivity {
    //// TODO: 11.02.2016
    // kopeerin siit tavaari osaliselt, peaks hiljem üle vaatama, kas midagi veel juurde vaja

    /**
     * The ListView which will display all the TeeObjektid objects from the database
     */
    private ListView mListAll;

    /**
     * The Adapter which will store all the TeeObjektid objects from the database.
     */
    private TPListAdapter mAdapter;

    /**
     * The TextView containing the message to be displayed to the user when the
     * ListView is Empty
     */
    private TextView mTextEmptyList;
    private LayoutInflater mInflater;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objektide_nimekiri);

        mListAll = (ListView) findViewById(R.id.list_all);
        mTextEmptyList = (TextView) findViewById(R.id.list_empty_message);
        mInflater = LayoutInflater.from(this);
        initListWithData();

    }

    private void initListWithData() {
        List<TeeObjekt> teeObjekt = new Select()
                .all()
                .from(TeeObjekt.class)
                .execute();
        mAdapter = new TPListAdapter(this);
        mAdapter.setData(teeObjekt);
        mListAll.setAdapter(mAdapter);
        mListAll.setEmptyView(mTextEmptyList);
//        mListAll.setOnItemClickListener(this);

    }


















}
