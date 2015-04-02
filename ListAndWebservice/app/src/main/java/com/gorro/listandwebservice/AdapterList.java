package com.gorro.listandwebservice;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by gorro on 02/04/15.
 */
public class AdapterList extends BaseAdapter {

    private Context ctx;
    private ArrayList<ItemList> data = new ArrayList<>();

    public AdapterList(Context ctx, ArrayList<ItemList> data) {
        this.ctx = ctx;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public class HolderView {
        TextView txtName, txtAddress;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View fila = convertView;
        HolderView holder = null;
        if (fila == null) {
            LayoutInflater inflater = ((Activity) ctx).getLayoutInflater();
            fila = inflater.inflate(R.layout.item_list, parent, false);
            holder = new HolderView();
            holder.txtName = (TextView) fila.findViewById(R.id.txtName);
            holder.txtAddress = (TextView) fila.findViewById(R.id.txtAddress);
            fila.setTag(holder);
        } else {
            holder = (HolderView) fila.getTag();
        }

        ItemList item = data.get(position);
        holder.txtName.setText(item.getName());
        holder.txtAddress.setText(item.getAddress());

        return fila;
    }
}
