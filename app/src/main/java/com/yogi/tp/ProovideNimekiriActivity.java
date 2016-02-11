package com.yogi.tp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ListView;
import android.widget.TextView;

import com.activeandroid.query.Select;

import java.util.Collections;
import java.util.List;

import mudelid.TeeProov;

public class ProovideNimekiriActivity extends AppCompatActivity {

    private ListView mListAll;
    private TeeProovListAdapter mAdapter;
    private TextView mTextEmptyList;
    private LayoutInflater mInflater;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proovide_nimekiri);

        mListAll = (ListView) findViewById(R.id.list_all);
        mTextEmptyList = (TextView) findViewById(R.id.list_empty_message);
        mInflater = LayoutInflater.from(this);
        initListWithData();
    }

    private void initListWithData() {
        List<TeeProov> teeProov = new Select()
                .all()
                .from(TeeProov.class)
                .execute();

        // keerab listi teistpidi, et kuvaks kõige uuema esimesena
        Collections.reverse(teeProov);

        mAdapter = new TeeProovListAdapter(this);
        mAdapter.setProoviList(teeProov);
        mListAll.setAdapter(mAdapter);
        mListAll.setEmptyView(mTextEmptyList);
//        mListAll.setOnItemClickListener(this);

    }
}
