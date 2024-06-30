package com.Maryvivian.myblog

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ArticlesAdapter(val articles: List<Articles>):RecyclerView.Adapter<ArticlesViewHolder>() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticlesViewHolder {
      var itemView=LayoutInflater.from(parent.context).inflate(R.layout.artical_item, parent, false)
        return ArticlesViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return articles.size

    }

    override fun onBindViewHolder(holder: ArticlesViewHolder, position: Int) {
        val article=articles[position]
        holder.tvArticle.text=article.id
        holder.tvArticle.text=article.title
        holder.tvName.text=article.author
        holder.tvPreview.text=article.articlePreview
        holder.tvArticle.text=article.authorProfilePicture
        holder.tvArticle.text=article.publishingDate
        holder.tvArticle.text=article.articlePhoto
        holder.tvArticle.text=article.link


    }
}

class ArticlesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvArticle=itemView.findViewById<TextView>(R.id.tvArticle)
    var tvPreview=itemView.findViewById<TextView>(R.id.tvPreview)
}