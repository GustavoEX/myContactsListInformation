package com.example.gustavorodrigues.mycontaclistinformation;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class ContactListAdapter extends RecyclerView.Adapter<ContactListAdapter.ContactViewHolder>{
    private ArrayList<Contact> ContactDataSet;

    public ContactListAdapter(ArrayList<Contact> contactDataSet) {
        ContactDataSet = contactDataSet;
    }

    @NonNull
    @Override
    public ContactListAdapter.ContactViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.contact_list_item, viewGroup, false);
        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactListAdapter.ContactViewHolder contactViewHolder, int i) {
        contactViewHolder.mDisplayName.setText(ContactDataSet.get(i).getDisplayName());
        contactViewHolder.mPhoneNumber.setText(ContactDataSet.get(i).getPhoneNumber());
    }

    @Override
    public int getItemCount() {
        return ContactDataSet.size();
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder{
        public TextView mDisplayName;
        public TextView mPhoneNumber;
        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
            mDisplayName = (TextView) itemView.findViewById(R.id.tv_contact_name);
            mPhoneNumber = (TextView) itemView.findViewById(R.id.tv_contact_phone);
        }
    }
}
