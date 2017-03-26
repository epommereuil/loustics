package com.iut.nicolas.ecoledesloustics.adapters;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.iut.nicolas.ecoledesloustics.R;
import com.iut.nicolas.ecoledesloustics.holders.UserViewHolder;
import com.iut.nicolas.ecoledesloustics.models.Student;

import java.util.List;

/**
 * Created by eric on 25/03/2017.
 */

public class UserAdapter extends ArrayAdapter<Student>
{
    public UserAdapter(Context context, List<Student> Students) {
        super(context, 0, Students);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_user,parent, false);
        }

        UserViewHolder userHolder = (UserViewHolder) convertView.getTag();
        if(userHolder == null){
            userHolder = new UserViewHolder();
            userHolder.mAge = (TextView) convertView.findViewById(R.id.holderAge);
            userHolder.mName = (TextView) convertView.findViewById(R.id.holderName);
            userHolder.mFirstName = (TextView) convertView.findViewById(R.id.holderFirstName);
            userHolder.mAvatar = (ImageView) convertView.findViewById(R.id.holderAvatar);
            convertView.setTag(userHolder);
        }

        Student student = getItem(position);

        //il ne reste plus qu'à remplir notre vue
        userHolder.mAge.setText(Integer.toString(student.getAge()));
        userHolder.mName.setText(student.getName());
        userHolder.mFirstName.setText(student.getFirsName());
        userHolder.mAvatar.setImageDrawable(new ColorDrawable(0xffff0000));


        return convertView;
    }
/*
    public Student getItem(int position){
        return Student.findById(Student.class,position);
    }
*/

}
