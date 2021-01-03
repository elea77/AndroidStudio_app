package fr.vivaneo.googlemap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

import fr.vivaneo.googlemap.models.market.Fields;

public class FieldsAdapter extends ArrayAdapter<Fields> {

    private int resId;

    public FieldsAdapter(@NonNull Context context, int resource, @NonNull List<Fields> objects) {
        super(context, resource, objects);

        resId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {

        // déclaration du ViewHolder
        ViewHolder myViewHolder;

        if(convertView == null) {
            myViewHolder = new ViewHolder(); //instance

            convertView = LayoutInflater.from(getContext()).inflate(resId, null);


            myViewHolder.textViewTitle = convertView.findViewById(R.id.textViewTitle);
            myViewHolder.textViewCategory = convertView.findViewById(R.id.textViewCategory);

            convertView.setTag(myViewHolder);

        } else {
            myViewHolder = (ViewHolder) convertView.getTag();
        }

        Fields item = getItem(position);


        myViewHolder.textViewTitle.setText(item.getName());
        myViewHolder.textViewCategory.setText(item.getProduit());

        return convertView;
    }

    class ViewHolder {
        TextView textViewTitle;
        TextView textViewCategory;

    }
}
