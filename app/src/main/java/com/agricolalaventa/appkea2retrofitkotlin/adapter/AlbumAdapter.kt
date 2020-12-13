package com.agricolalaventa.appkea2retrofitkotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.agricolalaventa.appkea2retrofitkotlin.R
import com.agricolalaventa.appkea2retrofitkotlin.model.Album

class AlbumAdapter(private val lstAlbum: List<Album>)
    :RecyclerView.Adapter<AlbumAdapter.ViewHolder>()
{
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val tvId: TextView = itemView.findViewById(R.id.tvId)
        val tvTitulo: TextView = itemView.findViewById(R.id.tvTitulo)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(
            layoutInflater.inflate(com.agricolalaventa.appkea2retrofitkotlin.R.layout.item_album,
            parent, false)
        )
    }

    override fun onBindViewHolder(holder: AlbumAdapter.ViewHolder, position: Int) {
        val item = lstAlbum[position]
        holder.tvId.text = item.id.toString()
        holder.tvTitulo.text = item.title
    }

    override fun getItemCount(): Int {
        return lstAlbum.size
    }
}