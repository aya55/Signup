package com.example.signup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class UserAdapter extends ArrayAdapter<User> {

    public UserAdapter(@NonNull Context context, @NonNull ArrayList<User> users) {
        super(context, 0, users);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View currentListView = convertView;
        if (currentListView == null) {

            currentListView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        User currentUser = getItem(position);
        TextView tv_username=currentListView.findViewById(R.id.tv_item_username);
        tv_username.setText(currentUser.getUserName());
        TextView tv_password=currentListView.findViewById(R.id.tv_item_message);
        tv_password.setText(currentUser.getUserMessage());
        ImageView iv_userimage=currentListView.findViewById(R.id.iv_user);
        iv_userimage.setImageResource(currentUser.getUserImage());


        return currentListView;
    }
}
