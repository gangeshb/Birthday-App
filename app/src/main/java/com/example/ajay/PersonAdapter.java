package com.example.ajay;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class PersonAdapter extends ArrayAdapter<Person> {
    private Context mContext;
    private int mResource;

    public PersonAdapter(Context context, int i, ArrayList<Person> arrayList) {
        super(context, i, arrayList);
        this.mContext = context;
        this.mResource = i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(this.mContext).inflate(this.mResource, viewGroup, false);
        ((ImageView) inflate.findViewById(R.id.image1)).setImageResource(((Person) getItem(i)).getImage());
        ((TextView) inflate.findViewById(R.id.txtName)).setText(((Person) getItem(i)).getName());
        ((TextView) inflate.findViewById(R.id.txtDes)).setText(((Person) getItem(i)).getDes());
        return inflate;
    }
}
