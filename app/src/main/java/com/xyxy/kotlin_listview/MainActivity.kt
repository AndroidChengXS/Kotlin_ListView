package com.xyxy.kotlin_listview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var string: String = "haha"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mListView = findViewById<ListView>(R.id.lv_ListView);
        val arrayList = ArrayList<String>();
//          Lv_BaseAdapter ?: adapter= Lv_BaseAdapter(mListView, this)
//        loop@ for (i in 1..100) {
//            arrayList.add(string + i);
//        }
        loop@ for (i in 1..100) {
            arrayList.add(string + i);
        }
        val myAdapter = Lv_BaseAdapter(arrayList, this);
        mListView.adapter = myAdapter;

    }
}


