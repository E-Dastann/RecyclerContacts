package com.example.recyclercontacts;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder> {
    private ArrayList<String> ipDate;

    public ContactsAdapter(ArrayList<String> ipDate) {
        this.ipDate = ipDate;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContactsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contacts, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder holder, int position) {
        holder.contacts(ipDate.get(position));
    }

    @Override
    public int getItemCount() {
        return ipDate.size();
    }

    class ContactsViewHolder extends RecyclerView.ViewHolder {
        private TextView contacts;

        public ContactsViewHolder(@NonNull View itemView) {
            super(itemView);
            contacts = itemView.findViewById(R.id.contacts);

        }

        public void contacts(String date) {
            contacts.setText(date);
        }
    }
}
