package com.iut.nicolas.ecoledesloustics.adapters;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.iut.nicolas.ecoledesloustics.R;
import com.iut.nicolas.ecoledesloustics.holders.CategoryViewHolder;
import com.iut.nicolas.ecoledesloustics.models.Category;

import java.util.List;

/**
 * Created by eric on 26/03/2017.
 */

public class CategoryAdapter extends ArrayAdapter<Category>{

    public CategoryAdapter(Context context, List<Category> categories) {super(context, 0, categories);}

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_category, parent, false);
        }

        CategoryViewHolder categoryHolder = (CategoryViewHolder) convertView.getTag();

        if(categoryHolder == null) {
            categoryHolder = new CategoryViewHolder();
            categoryHolder.mName = (TextView) convertView.findViewById(R.id.holderCategoryName);
            //pour l'image ---> userHolder.mFirstName = (TextView) convertView.findViewById(R.id.holderFirstName);
            convertView.setTag(categoryHolder);
        }
        Category category = getItem(position);

        //il ne reste plus qu'à remplir notre vue
        categoryHolder.mName.setText(category.getName());
        //SET IMAGE ICI
        categoryHolder.mIcone.setImageDrawable(new ColorDrawable(0xffff0000));

        //////////////


        return convertView;
    }
}
