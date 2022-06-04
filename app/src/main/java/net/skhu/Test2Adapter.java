package net.skhu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class Test2Adapter extends RecyclerView.Adapter<Test2Adapter.ViewHolder> {

    class ViewHolder extends RecyclerView.ViewHolder  {
        TextView textView1;

        public ViewHolder(View view) {
            super(view);
            textView1 = view.findViewById(R.id.textView1);
        }

        public void setData(int index) {
            Test1 test = arrayList.get(index);
            textView1.setText(test.getDateFormatted());
        }
    }

    LayoutInflater layoutInflater;
    ArrayList<Test1> arrayList;

    public Test2Adapter(Context context, ArrayList<Test1> arrayList) {
        this.layoutInflater = LayoutInflater.from(context);
        this.arrayList = arrayList;
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = layoutInflater.inflate(R.layout.test2, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, final int index) {
        viewHolder.setData(index);
    }
}

