package com.Maryvivian.myblog

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ArticlesAdapter(val aritcles: List<Articles>):RecyclerView.Adapter<ArticlesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticlesViewHolder {
      var itemView=LayoutInflater.from(parent.context).inflate(R.layout.artical_item, parent, false)
        return ArticlesViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return aritcles.size

    }

    override fun onBindViewHolder(holder: ArticlesViewHolder, position: Int) {
        val article=aritcles[position]
        holder.tvName.text=article.author
        holder.tvPreview.text=article.articlePreview
        holder.tvArticle.text=article.title

    }
}

class ArticlesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvArticle=itemView.findViewById<TextView>(R.id.tvArticle)
    var tvPreview=itemView.findViewById<TextView>(R.id.tvPreview)
}