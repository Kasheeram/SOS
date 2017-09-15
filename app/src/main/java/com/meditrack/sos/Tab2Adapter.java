package com.meditrack.sos;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import static com.meditrack.sos.MainActivity.displayHeight;
import static com.meditrack.sos.MainActivity.displayWidth;


public class Tab2Adapter extends RecyclerView.Adapter<Tab2Adapter.Tab2ViewHolder> {
    private Context context;
    public static Tab2Adapter.Tab2ViewHolder viewHolder;


    public Tab2Adapter(Context context) {
        this.context = context;
    }
    @Override
    public Tab2Adapter.Tab2ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.tab2_item, null);
        viewHolder = new Tab2Adapter.Tab2ViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(final Tab2Adapter.Tab2ViewHolder holder, final int position) {

        holder.medicine_name_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.tab2_item_on_edit.setVisibility(View.VISIBLE);
                holder.medicine_name_txt.setVisibility(View.GONE);
            }
        });
        holder.tab2_item_update_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Details Updated", Toast.LENGTH_SHORT).show();
                holder.tab2_item_on_edit.setVisibility(View.GONE);
                holder.medicine_name_txt.setVisibility(View.VISIBLE);
            }
        });


    }
    @Override
    public int getItemCount() {
        return 10;
    }
    class Tab2ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout parent;
        LinearLayout tab2_item_on_edit;
        TextView medicine_name_txt;
        EditText tab2_item_medicine_name, tab2_item_dose, tab2_item_quantity, tab2_item_number_per_day;
        Button tab2_item_update_btn;

        private Tab2ViewHolder(View view){
            super(view);

            this.parent = view.findViewById(R.id.tab2_item_parent_layout);
            this.tab2_item_on_edit = view.findViewById(R.id.tab2_item_on_edit);
            this.medicine_name_txt = view.findViewById(R.id.medicine_name_txt);
            this.tab2_item_medicine_name = view.findViewById(R.id.tab2_item_medicine_name);
            this.tab2_item_dose = view.findViewById(R.id.tab2_item_dose);
            this.tab2_item_quantity = view.findViewById(R.id.tab2_item_quantity);
            this.tab2_item_number_per_day = view.findViewById(R.id.tab2_item_number_per_day);
            this.tab2_item_update_btn = view.findViewById(R.id.tab2_item_update_btn);

            LinearLayout.LayoutParams textP = new LinearLayout.LayoutParams(displayWidth, ViewGroup.LayoutParams.WRAP_CONTENT);
            textP.setMargins(0,0,0,0);
            parent.setLayoutParams(textP);
        }
    }
}
