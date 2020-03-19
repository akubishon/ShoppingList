package com.slepnev.shoppinglist.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.slepnev.shoppinglist.R
import com.slepnev.shoppinglist.model.Product
import kotlinx.android.synthetic.main.item_product.view.*

class ProductAdapter(private val products:List<Product>):
RecyclerView.Adapter<ProductAdapter.ViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_product, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return products.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(products[position])
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(product: Product) {
            itemView.tvProductName.text = product.name
            itemView.tvProductCount.text = product.quantity.toString()
        }
    }
}