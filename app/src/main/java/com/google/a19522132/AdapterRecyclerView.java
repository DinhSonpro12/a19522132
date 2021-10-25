package com.google.a19522132;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.DataViewHolder> {

    private List<Employee> employee;
    private Context context;

    public AdapterRecyclerView(Context context, List<Employee> employee)
    {
        this.context = context;
        this.employee = employee;
    }
    @NonNull
    @Override
    public AdapterRecyclerView.DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.item_recyclerview, parent, false);

        return new DataViewHolder(contactView);
    }



    @Override
    public void onBindViewHolder(@NonNull DataViewHolder  holder, int position) {
        String name = employee.get(position).getName();
        String  id = employee.get(position).getId();
        Boolean bool = employee.get(position).isManager();
        String text ;
        if (bool)
        {
            text = id + " " + name + " --> " + " FULLTIME --> 500";
        }
        else
        {
            text = id + " " + name + " --> " + " PARTTIME --> 350";
        }
        TextView tv = holder.itemView.findViewById(R.id.tv_name);
        tv.setText(text);
    }

    @Override
    public int getItemCount() {
        return employee == null ? 0: employee.size();
    }


//    private class listViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
//
//        private TextView mTextView;
//
//        public listViewHolder(View itemView) {
//            super(itemView);
//
//            mTextView = (TextView) itemView.findViewById(R.id.tv_name);
//        }
//
//        public void bindView(int position) {
//
//
//            mTextView.setText(employee.get(position).getName().toString());
//
//        }
//
//        @Override
//        public void onClick(View v) {
//
//        }
//
//}
public static  class DataViewHolder extends RecyclerView.ViewHolder
{
    private  TextView tvName;
    public DataViewHolder(View view)
    {
        super(view);
        tvName = (TextView) view.findViewById(R.id.tv_name);
    }
}



}



