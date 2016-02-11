package com.yogi.tp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import mudelid.TeeProov;

/**
 * Created by yogi on 11.02.2016.
 */
public class TeeProovListAdapter extends BaseAdapter {

    private List<TeeProov> prooviList;
    private LayoutInflater mInflater;

    public TeeProovListAdapter(Context context) {
        mInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public List<TeeProov> getProoviList() {
        return prooviList;
    }

    public void setProoviList(List<TeeProov> prooviList) {
        this.prooviList = prooviList;
        if (prooviList != null) {
            notifyDataSetChanged();
        }
    }


    @Override
    public int getCount() {
        if (prooviList != null && !prooviList.isEmpty()) {
            return prooviList.size();
        }
        return 0;
    }

    @Override
    public TeeProov getItem(int position) {
        if (prooviList != null && !prooviList.isEmpty()) {
            return prooviList.get(position);
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
                    .inflate(R.layout.activity_yks_proov_nimekirjas, parent, false);
            holder = new ViewHolder(row);
            row.setTag(holder);
        } else {
            holder = (ViewHolder) row.getTag();
        }
        if (prooviList != null && !prooviList.isEmpty()) {
            TeeProov currentTeeObjekt = prooviList.get(position);
            initValues(holder, currentTeeObjekt);
        }
        return row;
    }

    // // TODO: 11.02.2016
    // siin vist saab panna nii objekti kui ka seaotud projektid
    // tundub oluline koht, peab põhjalikumalt uurima
    public void initValues(ViewHolder holder, TeeProov currentTeeProov) {
        holder.proovivotukoht
                .setText(currentTeeProov.prooviVotuKoht);

        holder.materjaliNimetus
                .setText(currentTeeProov.materjaliNimetus);

        //// TODO: 11.02.2016 siin hetkel pooleli 
        holder.proovisObjektiNimetus
                .setText(currentTeeProov.);

    }

    class ViewHolder {
        TextView proovivotukoht;
        TextView materjaliNimetus;
        
        //objekti info
        TextView proovisObjektiNimetus;


        public ViewHolder(View view) {
            proovivotukoht = (TextView) view
                    .findViewById(R.id.text_value_proovivotukoht);

            materjaliNimetus = (TextView) view
                    .findViewById(R.id.text_value_materjaliNimetus);

            proovisObjektiNimetus = (TextView) view
                    .findViewById(R.id.text_value_proovisObjektiNimetus);


        }
    }


}
