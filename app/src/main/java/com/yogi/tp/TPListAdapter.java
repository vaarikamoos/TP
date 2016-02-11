package com.yogi.tp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import mudelid.TeeObjekt;

/**
 * Created by yogi on 11.02.2016.
 */
public class TPListAdapter extends BaseAdapter {

    //// TODO: 11.02.2016
    // võimalik, et siin peaks hoopis teeProov objekti asemel olema
    private ArrayList<TeeObjekt> mData;
    private LayoutInflater mInflater;

    public TPListAdapter(Context context) {
        mInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public ArrayList<TeeObjekt> getData() {
        return mData;
    }

    public void setData(ArrayList<TeeObjekt> Data) {
        this.mData = Data;
        if (Data != null) {
            notifyDataSetChanged();
        }
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        if (mData != null && !mData.isEmpty()) {
            return mData.size();
        }
        return 0;
    }

    @Override
    public TeeObjekt getItem(int position) {
        // TODO Auto-generated method stub
        if (mData != null && !mData.isEmpty()) {
            return mData.get(position);
        }
        return null;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View row = convertView;
        ViewHolder holder = null;
        if (row == null)
        {
            row = mInflater
                    .inflate(R.layout.activity_yks_objekt_nimekirjas, parent, false);
            holder = new ViewHolder(row);
            row.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) row.getTag();
        }
        if (mData != null && !mData.isEmpty()) {
            TeeObjekt currentTeeObjekt = mData.get(position);
            initValues(holder, currentTeeObjekt);
        }

        return row;
    }

    // // TODO: 11.02.2016
    // siin vist saab panna nii objekti kui ka seaotud projektid
    // tundub oluline koht, peab põhjalikumalt uurima
    public void initValues(ViewHolder holder, TeeObjekt currentTeeObjekt) {
        holder.objektiNimetus
                .setText(currentTeeObjekt.objNimetus);

        holder.teeNimetus
                .setText(currentTeeObjekt.teeNimetus);


    }

    class ViewHolder {
        TextView objektiNimetus;
        TextView teeNimetus;


        public ViewHolder(View view) {
            // TODO Auto-generated constructor stub
            objektiNimetus = (TextView) view
                    .findViewById(R.id.text_value_objNimetus);

            teeNimetus = (TextView) view
                    .findViewById(R.id.text_value_teeNimetus);


        }
    }


}
