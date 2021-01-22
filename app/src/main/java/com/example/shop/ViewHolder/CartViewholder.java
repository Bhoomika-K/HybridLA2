package com.example.shop.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shop.Interface.ItemClickListener;
import com.example.shop.R;

public class CartViewholder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView txtProductName, getTxtProductPrice, txtProductQuantity;
    private ItemClickListener itemClickListener;

    public CartViewholder(@NonNull View itemView)
    {
        super(itemView);
        txtProductName = itemView.findViewById(R.id.cart_product_name);
        getTxtProductPrice = itemView.findViewById(R.id.cart_product_price);
        txtProductQuantity = itemView.findViewById(R.id.cart_product_quantity);
    }

    @Override
    public void onClick(View v)
    {
        itemClickListener.onClick(v, getAdapterPosition(), false);
    }

    public void setItemClickListener(ItemClickListener itemClickListener)
    {
        this.itemClickListener = itemClickListener;
    }
}
