package com.example.recycleapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FruitsAdapter(
    private val fruitsList: List<Fruit>
) : RecyclerView.Adapter<FruitsAdapter.FruitViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {
        val itemMovieView = LayoutInflater.from(parent.context).inflate(R.layout.fruit_item, parent , false)
        return FruitViewHolder(itemMovieView)
    }

    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {
        val currentMovie = fruitsList[position]
        holder.bind(currentMovie)
    }

    override fun getItemCount(): Int {
        return fruitsList.size
    }

    inner class FruitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val fruitN: TextView
        private val fruitI: ImageView

        init {
            fruitN = itemView.findViewById(R.id.fruit_name)
            fruitI = itemView.findViewById(R.id.fruit_image)
            fruitI.setOnClickListener{
                val currentFruit = fruitsList[layoutPosition]
                val intent : Intent = Intent(itemView.context ,FruitDetails :: class.java)
                intent.putExtra("FRUIT", currentFruit)
                itemView.context.startActivity(intent)
            }
        }

        fun bind(fruit: Fruit){
            fruitN.text = fruit.fruitName
            fruitI.setImageResource(fruit.fruitImage)
        }
    }
}