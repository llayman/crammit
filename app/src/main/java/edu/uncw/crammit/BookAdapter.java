//        Copyright 2018 Lucas Layman Licensed under the
//        Educational Community License, Version 2.0 (the "License"); you may
//        not use this file except in compliance with the License. You may
//        obtain a copy of the License at
//
//        http://www.osedu.org/licenses/ECL-2.0
//
//        Unless required by applicable law or agreed to in writing,
//        software distributed under the License is distributed on an "AS IS"
//        BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
//        or implied. See the License for the specific language governing
//        permissions and limitations under the License.

package edu.uncw.crammit;

import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.MyViewHolder> {

    private Listener listener;

    interface Listener {
        void onClick(int position);
    }

    void setListener(Listener listener) {
        this.listener = listener;
    }


    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    class MyViewHolder extends RecyclerView.ViewHolder {
        public ConstraintLayout layout;
        TextView courseNumberView;
        TextView titleView;

        MyViewHolder(ConstraintLayout v) {
            super(v);
            layout = v;
            courseNumberView = v.findViewById(R.id.item_course);
            titleView = v.findViewById(R.id.item_title);
        }
    }

    // Create new views (invoked by the layout manager)
    @Override
    @NonNull
    public BookAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                       int viewType) {
        // create a new view
        ConstraintLayout v = (ConstraintLayout) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.book_list_item, parent, false);

        return new MyViewHolder(v);
    }


    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        myViewHolder.courseNumberView.setText(Book.books[i].courseNumber);
        myViewHolder.titleView.setText(Book.books[i].title);
        myViewHolder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (listener != null) {
                    listener.onClick(myViewHolder.getAdapterPosition());
                }
            }
        });
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return Book.books.length;
    }
}