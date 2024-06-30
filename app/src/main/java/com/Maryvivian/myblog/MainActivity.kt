package com.Maryvivian.myblog

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.Maryvivian.myblog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvarticles.layoutManager=LinearLayoutManager(this)
        displayArticles()

//        val  articlesList= listOf(
//            Articles("1", "Tales tolly", "Silver Jinat", "https://www.pinterest.com/pin/684899055831224871/","2004-06-30","This article gives insight abou a mythical creature with ten heads","https://www.pinterest.com/pin/684899055831224871/","https://www.theschooloflife.com/article/the-importance-of-books/",)
//
//        )
//
//        val recyclerView=binding.rvarticles
//        val adapter=ArticlesAdapter(articlesList)
//        recyclerView.adapter=adapter
//        recyclerView.layoutManager=LinearLayoutManager(this)

    }

    fun displayArticles(){
        val text=Articles("1","Hurricane","Tyla","Tall","2024","2024","343","https://www.pinterest.com/pin/684899055831224871/")
        val text1=Articles("1","Hurricane","Tyla","Tall","2024","2024","343","https://www.pinterest.com/pin/684899055831224871/")
        val text2=Articles("1","Hurricane","Tyla","Tall","2024","2024","343","https://www.pinterest.com/pin/684899055831224871/")
        val text3=Articles("1","Hurricane","Tyla","Tall","2024","2024","343","https://www.pinterest.com/pin/684899055831224871/")
        val text4=Articles("1","Hurricane","Tyla","Tall","2024","2024","343","https://www.pinterest.com/pin/684899055831224871/")
        val text5=Articles("1","Hurricane","Tyla","Tall","2024","2024","343","https://www.pinterest.com/pin/684899055831224871/")

        val articles= listOf(text1,text2,text3,text4,text5)
        val articlesAdapter=ArticlesAdapter(articles)
        binding.rvarticles.adapter=articlesAdapter
    }
}