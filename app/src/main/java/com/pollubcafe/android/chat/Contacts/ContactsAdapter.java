package com.pollubcafe.android.chat.Contacts;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.pollubcafe.android.chat.R;

import java.util.List;

public class ContactsAdapter extends ArrayAdapter<Contact> {


    public ContactsAdapter(Activity context, List<Contact> contacts) {
        super(context, 0, contacts);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;

        // tworzenie widoku gdy nie istanieje
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(
                    R.layout.contacts_list_item, parent, false);
        }

        // kontakt
        Contact contact = getItem(position);

        // definicja widoków
        TextView name = (TextView) view.findViewById(R.id.contacts_name);
        TextView date = (TextView) view.findViewById(R.id.last_message_date);
        TextView lastMessage = (TextView) view.findViewById(R.id.last_message);

        // umieszczanie zawartości
        name.setText(contact.getName());
        date.setText(contact.getDate());
        lastMessage.setText(contact.getLastMessage());

        return view;
    }
}
