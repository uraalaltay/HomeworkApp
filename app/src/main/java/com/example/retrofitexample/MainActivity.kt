package com.example.retrofitexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import androidx.viewpager.widget.ViewPager
import com.example.retrofitexample.ui.pageradapter
import com.google.android.material.tabs.TabLayout
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        viewPager.adapter = pageradapter(supportFragmentManager)



        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        tabLayout.setupWithViewPager(viewPager)
        lifecycleScope.launch {
            //getData()
        }

    }
    //Here I tried to set response data that I supposed to get from the RetrofitProvider
    //to be able to show at the RecyclerView

//    val marsApi = RetrofitProvider.retrofit.create<IApiHttpMars>()
//    //apiInterface.enqueue( Callback<List<Movie>>())
//    apiInterface.enqueue( object : Callback<List<Camera>> {
//        override fun onResponse(call: Call<List<Camera>>?, response: Response<List<Camera>>?) {
//
//            if(response?.body() != null)
//                RecyclerView.(response.body()!!)
//        }
//
//        override fun onFailure(call: Call<List<Camera>>?, t: Throwable?) {
//
//        }
//    }


}

