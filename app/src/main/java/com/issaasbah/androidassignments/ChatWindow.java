package com.issaasbah.androidassignments;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ChatWindow extends AppCompatActivity {

    ListView listView;
    EditText editText;
    Button send;

    ArrayList list = new ArrayList<String>();

    ChatAdapter messageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_window);

        messageAdapter = new ChatAdapter( this );
        listView.setAdapter(messageAdapter);

        listView = findViewById(R.id.chatView);
        editText = findViewById(R.id.editText);
        send = findViewById(R.id.sendBtn);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                messageAdapter.notifyDataSetChanged();
                String textInput = editText.getText().toString();
                list.add(textInput);;

            }
        });



    }

    private class ChatAdapter extends ArrayAdapter<String> {

        public ChatAdapter(Context ctx) {
            super(ctx, 0);

        }

        public int getCount() {
            return list.size();
        }

        public String getItem(int position) {
            return (String) list.get(position);
        }

        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater inflater = ChatWindow.this.getLayoutInflater();

            View result = null;

            if(position%2 == 0)
                result = inflater.inflate(R.layout.chat_row_incoming, null);
            else
                result = inflater.inflate(R.layout.chat_row_outgoing, null);

            TextView message = result.findViewById(R.id.message_text);
            message.setText(getItem(position)); // get the string at position
            return result;



        }
    }
}
