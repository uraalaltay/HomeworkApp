package com.example.retrofitexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofitexample.model.Camera
import com.example.retrofitexample.ui.DataAdapter

class CuriosityFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment_curiosity, container, false)
        val rec = view.findViewById<RecyclerView>(R.id.recycler_view)
        getData(rec)

        return view
    }
    private  fun getData(rec:RecyclerView) {
        val response: List<Camera> = RetrofitProvider.marsApi.getHttpMarsList()
        rec.adapter = DataAdapter(response.orEmpty().toMutableList())
        rec.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }
}