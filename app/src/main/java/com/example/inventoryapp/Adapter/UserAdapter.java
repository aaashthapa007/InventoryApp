package com.example.inventoryapp.Adapter;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.inventoryapp.R;
import com.example.inventoryapp.models.LoginResponse;
import com.example.inventoryapp.models.User;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.util.List;


public class UserAdapter extends RecyclerView.Adapter<UserAdapter.Holder> {
   private Context context;
   private List<User> userList;

    public UserAdapter(Context context, List<User> userList) {
        this.context = context;
        this.userList = userList;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_user, viewGroup,false);
        return new Holder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int i) {
        User user = userList.get(i);
        holder.tvPname.setText(user.getUsername());
        holder.tvProductSize.setText(user.getAge());
        holder.tvQuantity.setText(user.getAddress());
        holder.tvProductType.setText(user.getEmail());

//        String imagePath = "localhost:5000/uploads/images/ashish.jpg";
//        strictMode();
//        try{
//            URL url = new URL(imagePath);
//            image.setImageBitmap(BitmapFactory.decodeStream((InputStream) url.getContext()));
//        } catch (MalformedURLException e){
//            e.printStackTrace();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class Holder extends RecyclerView.ViewHolder{
            private TextView tvPname,tvProductType,tvProductSize,tvQuantity;
        public Holder(@NonNull View itemView) {
            super(itemView);
            tvPname = itemView.findViewById(R.id.tvPname);
            tvProductType = itemView.findViewById(R.id.tvProductType);
            tvProductSize = itemView.findViewById(R.id.tvProductSize);
            tvQuantity = itemView.findViewById(R.id.tvQuantity);

        }
    }
}
