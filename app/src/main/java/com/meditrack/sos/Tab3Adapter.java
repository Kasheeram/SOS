package com.meditrack.sos;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.meditrack.sos.MainActivity.displayHeight;
import static com.meditrack.sos.MainActivity.displayWidth;


public class Tab3Adapter extends RecyclerView.Adapter<Tab3Adapter.Tab3ViewHolder> {
    private Context context;
    public static Tab3Adapter.Tab3ViewHolder viewHolder;

    ArrayList<AddMedicineDetails> al=new ArrayList<AddMedicineDetails>();



    public Tab3Adapter(Context context) {
            this.context = context;

//        Intent intent = new Intent(context,Tab1Adapter.class);
//        intent.putExtra("medicine",al);
//        context.startActivity(intent);


    }
    @Override
    public Tab3Adapter.Tab3ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.tab3_item, null);
        viewHolder = new Tab3Adapter.Tab3ViewHolder(view);

        return viewHolder;
    }
    @Override
    public void onBindViewHolder(final Tab3Adapter.Tab3ViewHolder holder, final int position) {

        holder.tab3_user_detail_items_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.tab3_user_detail_items_edt.setVisibility(View.VISIBLE);
                holder.tab3_user_detail_items_txt.setVisibility(View.GONE);

            }
        });
        holder.tab3_add_medicine_details_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.tab3_add_medicine_details_edt.setVisibility(View.VISIBLE);
                holder.tab3_add_medicine_details_txt.setVisibility(View.GONE);
            }
        });
        holder.tab3_sos_setting_details_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.tab3_sos_setting_details_edt.setVisibility(View.VISIBLE);
                holder.tab3_sos_setting_details_txt.setVisibility(View.GONE);
            }
        });

        holder.tab3_user_detail_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.tab3_user_detail_items_edt.setVisibility(View.GONE);
                holder.tab3_user_detail_items_txt.setVisibility(View.VISIBLE);
            }
        });
        holder.tab3_add_medicine_details_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.tab3_add_medicine_details_edt.setVisibility(View.GONE);
                holder.tab3_add_medicine_details_txt.setVisibility(View.VISIBLE);
            }
        });
        holder.tab3_sos_setting_details_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.tab3_sos_setting_details_edt.setVisibility(View.GONE);
                holder.tab3_sos_setting_details_txt.setVisibility(View.VISIBLE);
            }
        });


       holder.updateMedicinDetails.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) {

               String mName=holder.medicinName.getText().toString();
               String dFrequency =holder.doseFrequency.getText().toString();
               String dosePerDay =holder.numberofDosePerDay.getText().toString();
               String dquantity = holder.quantity.getText().toString();
               String time1 = holder.setTime1.getText().toString();
               String time2 = holder.setTime2.getText().toString();
               String numberofPurchase = holder.numberofMedicinePurchased.getText().toString();

               AddMedicineDetails amd = new AddMedicineDetails(mName,dFrequency,dosePerDay,dquantity,time1,time2,numberofPurchase);
               al.add(amd);
               Model model = new Model();
               model.setAl(al);
//               ArrayList<AddMedicineDetails> als=model.getAl();
//               AddMedicineDetails amd1 = als.get(0);
//               Toast.makeText(context, "Description : Saved data in ArrayList " + amd1.name, Toast.LENGTH_SHORT).show();



               try {
                   AddMedicineDetails amd2 = al.get(0);
                   Toast.makeText(context, "Description : Saved data in ArrayList", Toast.LENGTH_SHORT).show();
               }catch (Exception e){

               }

           }



       });



    }




    @Override
    public int getItemCount() {
        return 1;
    }
    class Tab3ViewHolder extends RecyclerView.ViewHolder {
       LinearLayout parent;
       ImageView tab3_user_detail_edt, tab3_add_medicine_edt, tab3_sos_setting_edt;
        LinearLayout tab3_user_detail_items_edt, tab3_add_medicine_details_edt, tab3_sos_setting_details_edt;
        LinearLayout tab3_user_detail_items_txt, tab3_add_medicine_details_txt, tab3_sos_setting_details_txt;

        Button tab3_user_detail_btn, tab3_add_medicine_details_btn, tab3_sos_setting_details_btn;


        Button updateMedicinDetails;
        EditText medicinName;
        EditText doseFrequency;
        EditText quantity;
        EditText numberofDosePerDay;
        EditText setTime1;
        EditText setTime2;
        EditText numberofMedicinePurchased;

        private Tab3ViewHolder(View view){
            super(view);

            this.parent = view.findViewById(R.id.tab3_item_parent_layout);
            LinearLayout.LayoutParams textP = new LinearLayout.LayoutParams((int)displayWidth, ViewGroup.LayoutParams.WRAP_CONTENT);
            textP.setMargins(0,0,0,0);
            parent.setLayoutParams(textP);
//image button
           tab3_user_detail_edt = view.findViewById(R.id.tab3_user_detail_edt);
            tab3_add_medicine_edt = view.findViewById(R.id.tab3_add_medicine_edt);
            tab3_sos_setting_edt = view.findViewById(R.id.tab3_sos_setting_edt);

//edit text detail layout
            tab3_user_detail_items_edt = view.findViewById(R.id.tab3_user_detail_items_edt);
            tab3_add_medicine_details_edt = view.findViewById(R.id.tab3_add_medicine_details_edt);
            tab3_sos_setting_details_edt = view.findViewById(R.id.tab3_sos_setting_details_edt);

//txt layout
            tab3_user_detail_items_txt = view.findViewById(R.id.tab3_user_detail_items_txt);
            tab3_add_medicine_details_txt = view.findViewById(R.id.tab3_add_medicine_details_txt);
            tab3_sos_setting_details_txt = view.findViewById(R.id.tab3_sos_setting_details_txt);

//update button
            tab3_user_detail_btn = view.findViewById(R.id.tab3_user_detail_btn);
            tab3_add_medicine_details_btn = view.findViewById(R.id.tab3_add_medicine_details_btn);
            tab3_sos_setting_details_btn = view.findViewById(R.id.tab3_sos_setting_details_btn);



            updateMedicinDetails = (Button)view.findViewById(R.id.tab3_add_medicine_details_btn);
            doseFrequency = (EditText)view.findViewById(R.id.edit_dose_frequency);
            medicinName = (EditText)view.findViewById(R.id.edit_madicine_name);
            numberofDosePerDay=(EditText)view.findViewById(R.id.edit_numberof_dose_perday);
            quantity = (EditText)view.findViewById(R.id.edit_quantity);
            setTime1 = (EditText)view.findViewById(R.id.edit_set_time1);
            setTime2 = (EditText)view.findViewById(R.id.edit_set_time2);
            numberofMedicinePurchased = (EditText)view.findViewById(R.id.edit_numberof_medicine_purchased);


        }


    }
}