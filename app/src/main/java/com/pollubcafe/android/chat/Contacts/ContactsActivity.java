package com.pollubcafe.android.chat.Contacts;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.pollubcafe.android.chat.R;

import java.util.ArrayList;

public class ContactsActivity extends AppCompatActivity {

    private ContactsAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contacts_activity);

        // zastępcze kontakty
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("fajnaksywa546", "14:00",
                "Tutaj będzie"));
        contacts.add(new Contact("etopiryna2000", "wczoraj",
                "wyświetlana ostatnia wiadomość"));
        contacts.add(new Contact("Siema eniu", "7 77 7777",
                "albo nie wiem"));
        contacts.add(new Contact("Bardzo długa ksywa której nikt nie pamięta", "7 77 7777",
                "test bardzo dlugiej wiadomości, o taaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaak długiej, powinno uciąć"));
        contacts.add(new Contact("więcej nazw", "13 13 13",
                "blaa blaa blaa"));
        contacts.add(new Contact("s2ilil334", "7 77 7777",
                "blaa blaa blaa"));
        contacts.add(new Contact("s23lmili34", "7 77 7777",
                "blaa blaa blaa"));
        contacts.add(new Contact("s23lmhl34", "7 77 7777",
                "blaa blaa blaa"));
        contacts.add(new Contact("s23bfubnl34", "7 77 7777",
                "blaa blaa blaa"));
        contacts.add(new Contact("s23uiuh34", "7 77 7777",
                "blaa blaa blaa"));
        contacts.add(new Contact("wcale nie wsiskam losowo klawiszy", "7 77 7777",
                "blaa blaa blaa"));
        contacts.add(new Contact("sdfebbyvn       kljklkj234", "7 77 7777",
                "blaa blaa blaa"));
        contacts.add(new Contact("sjdfjssdf", "7 77 7777",
                "blaa blaa blaa"));

        // ustawienie listy
        ListView contactsListView = (ListView) findViewById(R.id.contacts_list);

        // pusty widok, może się przydać przy braku dostępu do kontaktów
        TextView emptyView = (TextView) findViewById(R.id.contacts_empty_view);
        contactsListView.setEmptyView(emptyView);

        // ustawienie adaptera
        adapter = new ContactsAdapter(this, contacts);
        contactsListView.setAdapter(adapter);

        // działanie po kliknięciu w kontakt, w przyszłości może przenosić do chatu
        contactsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Contact contact = adapter.getItem(position);

                Toast toast = Toast.makeText(getApplicationContext(),
                        "Chat z " + contact.getName() + "\nPrzejście do czatu?", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}

