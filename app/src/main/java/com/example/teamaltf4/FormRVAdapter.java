package com.example.teamaltf4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FormRVAdapter extends RecyclerView.Adapter<FormRVAdapter.ViewHolder> {

    private ArrayList<FormModel> formModelArrayList;
    private Context context;

    public FormRVAdapter(ArrayList<FormModel> formModelArrayList, Context context) {
        this.formModelArrayList = formModelArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.form_rv_item, parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        FormModel model = formModelArrayList.get(position);
        holder.chemNameTV.setText(model.getChemName());
        holder.appDateTV.setText(model.getAppDate());
        holder.areaSprayedTV.setText(model.getAreaSprayed());
        holder.regNumTV.setText(model.getRegNum());
    }
    @Override
    public int getItemCount() {
        return formModelArrayList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView chemNameTV, appDateTV, areaSprayedTV, regNumTV;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            chemNameTV = itemView.findViewById(R.id.idTVChemName);
            appDateTV = itemView.findViewById(R.id.idTVAppDate);
            areaSprayedTV = itemView.findViewById(R.id.idTVAreaSprayed);
            regNumTV = itemView.findViewById(R.id.idTVRegNumber);
        }

    }

}
