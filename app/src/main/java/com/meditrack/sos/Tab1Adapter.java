package com.meditrack.sos;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.meditrack.sos.MainActivity.displayWidth;


public class Tab1Adapter  extends RecyclerView.Adapter<Tab1Adapter.Tab1ViewHolder> {
    private Context context;
    ArrayList<AddMedicineDetails> al;
    public static Tab1Adapter.Tab1ViewHolder viewHolder;
    ArrayList<String> str;


    public Tab1Adapter(Context context) {
        this.context = context;
//        Intent intent = new Intent();
//       ArrayList<AddMedicineDetails> al = intent.getExtras("medicine");
        str =  new ArrayList<String>();
        str.add("ajay");
        str.add("vijay");
        str.add("akash");
        str.add("chayan");


        try {
            Model model = new Model();
            al = model.getAl();
            AddMedicineDetails adm1 = al.get(0);
            System.out.println("medicine name:" + adm1.name);
            Toast.makeText(context, "Description : Saved data in ArrayList " + adm1.name, Toast.LENGTH_SHORT).show();
        }catch (Exception e){

        }
    }
    @Override
    public Tab1Adapter.Tab1ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.tab1_item, null);
        viewHolder = new Tab1Adapter.Tab1ViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(final Tab1Adapter.Tab1ViewHolder holder, final int position) {


//        try {
//            AddMedicineDetails adm = al.get(position);
//            holder.medicineName.setText(adm.name);
//            holder.doseAmount.setText(adm.quantity);
//            holder.numberofTime.setText(adm.doseFrequency);
//            System.out.println("medicine name:"+adm.name);
//
//        }catch (Exception e){
//            System.out.print("kashee 123"+e);
//        }

        holder.medicineName.setText(str.get(position));
//        holder.doseAmount.setText(adm.quantity);
//        holder.numberofTime.setText(adm.doseFrequency);
//        System.out.println("medicine name:"+adm.name);

    }
    @Override
    public int getItemCount() {
//        try{
//            return  al.size();
//
//        }catch (Exception e){
//
//        }
        return str.size();
    }
    class Tab1ViewHolder extends RecyclerView.ViewHolder {
       LinearLayout parent;

        TextView medicineName;
        TextView doseAmount;
        TextView numberofTime;

        private Tab1ViewHolder(View view){
            super(view);



            this.parent =  view.findViewById(R.id.tab1_item_parent_layout);
            LinearLayout.LayoutParams textP = new LinearLayout.LayoutParams(displayWidth, ViewGroup.LayoutParams.WRAP_CONTENT);
            textP.setMargins(0,0,0,0);
            parent.setLayoutParams(textP);

            medicineName = (TextView)view.findViewById(R.id.tab1_medicine_name);
            doseAmount = (TextView)view.findViewById(R.id.tab1_dose_amount);
            numberofTime = (TextView)view.findViewById(R.id.tab1_number_of_times);

        }
    }
}
