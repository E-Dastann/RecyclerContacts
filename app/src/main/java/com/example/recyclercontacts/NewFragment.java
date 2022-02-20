package com.example.recyclercontacts;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class NewFragment extends Fragment {
    private ArrayList<String> contacts;
    private RecyclerView recyclerView;
    private ContactsAdapter contactsAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_new, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadContact();
        recyclerView = view.findViewById(R.id.RecyclerView);
        contactsAdapter = new ContactsAdapter(contacts);
        recyclerView.setAdapter(contactsAdapter);

    }

    private void loadContact() {
        contacts = new ArrayList<>();
contacts.add("Адам");
contacts.add("Адриан");
contacts.add("Альберт ");
contacts.add("Александр");
contacts.add("Альфред");
contacts.add("Андерсон");
contacts.add("Эндрю ");
contacts.add("Энтони");
contacts.add("Арнольд");
contacts.add("Артур");
contacts.add("Эшли");
contacts.add("Остин");
contacts.add("Бенджамин");
contacts.add("Бернард");
contacts.add("Брайан");
contacts.add("Кэйлеб");
contacts.add("Кельвин");
contacts.add("Карл");
contacts.add("Чад");

    }
}