package com.yogi.tp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

import mudelid.TeeObjekt;

/**
 * Created by yogi on 11.02.2016.
 */
public class TeeObjektListAdapter extends BaseAdapter {

    private List<TeeObjekt> objektiList;
    private LayoutInflater mInflater;

    public TeeObjektListAdapter(Context context) {
        mInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public List<TeeObjekt> getObjektiList() {
        return objektiList;
    }

    public void setObjektiList(List<TeeObjekt> ObjektiList) {
        this.objektiList = ObjektiList;
        if (ObjektiList != null) {
            notifyDataSetChanged();
        }
    }

    @Override
    public int getCount() {
        if (objektiList != null && !objektiList.isEmpty()) {
            return objektiList.size();
        }
        return 0;
    }

    @Override
    public TeeObjekt getItem(int position) {
        if (objektiList != null && !objektiList.isEmpty()) {
            return objektiList.get(position);
        }
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ViewHolder holder = null;
        if (row == null) {
            row = mInflater
                    .inflate(R.layout.activity_yks_objekt_nimekirjas, parent, false);
            holder = new ViewHolder(row);
            row.setTag(holder);
        } else {
            holder = (ViewHolder) row.getTag();
        }
        if (objektiList != null && !objektiList.isEmpty()) {
            TeeObjekt currentTeeObjekt = objektiList.get(position);
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

        //teeProov, vale koht vist
        //TextView objektisProoviAndmed;


        public ViewHolder(View view) {
            objektiNimetus = (TextView) view
                    .findViewById(R.id.text_value_objNimetus);

            teeNimetus = (TextView) view
                    .findViewById(R.id.text_value_teeNimetus);



        }
    }


}
