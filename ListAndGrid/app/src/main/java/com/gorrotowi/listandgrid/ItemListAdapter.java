package com.gorrotowi.listandgrid;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemListAdapter extends BaseAdapter {

    private Context ctx;
    private int layoutResource;
    private ArrayList<ItemList> data = new ArrayList<>();

    public ItemListAdapter(Context ctx, int layoutResource, ArrayList<ItemList> data) {
        this.ctx = ctx;
        this.layoutResource = layoutResource;
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
        TextView txtTitle, txtSubtitle;
        ImageView img;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View fila = convertView;
        HolderView holder = null;
        if (fila == null) {
            LayoutInflater inflater = ((Activity) ctx).getLayoutInflater();
            fila = inflater.inflate(layoutResource, parent, false);
            holder = new HolderView();
            holder.txtTitle = (TextView) fila.findViewById(R.id.txtItemListTitle);
            holder.txtSubtitle = (TextView) fila.findViewById(R.id.txtItemListSubTitle);
            holder.img = (ImageView) fila.findViewById(R.id.imgItemList);
            fila.setTag(holder);
        } else {
            holder = (HolderView) fila.getTag();
        }

        ItemList item = (ItemList) data.get(position);
        holder.txtTitle.setText(item.getTitle());
        holder.txtSubtitle.setText(item.getSubtitle());
        holder.img.setImageResource(item.getImg());

        return fila;
    }
}
