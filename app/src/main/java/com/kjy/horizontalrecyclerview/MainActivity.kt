package com.kjy.horizontalrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.kjy.horizontalrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    val TAG: String = "로그"

    // 데이터를 담을 그릇 즉 배열

    var modelList = ArrayList<MyModel>()

    // 어댑터 설정(어댑터를 연결해줄)
    private lateinit var myRecyclerAdapter: MyRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        Log.d(TAG, "MainActivity - onCreate() - called")

        Log.d(TAG, "MainActivity - 반복문 돌리기 전 this.modelList.size: ${this.modelList.size}")

        for(i in 1..10) {
            var myModel = MyModel(name = "스캇 조던 하이 $i", profileImage = "https://kream-phinf.pstatic.net/MjAyMTExMjlfNzIg/MDAxNjM4MTc5MDA4NjI0.JGxDybO8W7WgFuAyOTYJIzg6iC7j6cXY0iQ61FYJsjAg.ZKjgsXCmGGAHmqNsnNS-fTY1CSq8GQy-gJdjJaFPrc8g.JPEG/a_e916d6a476ae4558ba8b0f2ff057fa8a.jpg?type=l")
            this.modelList.add(myModel)
        }

        Log.d(TAG, "MainActivity - 반복문 돌린 후 this.modelList.size: ${this.modelList.size}")

        // 어댑터 인스턴스 생성
        myRecyclerAdapter = MyRecyclerAdapter()

        myRecyclerAdapter.submitList(this.modelList)

        // 리사이클러뷰 설정
        binding.myRecyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false )

            adapter = myRecyclerAdapter
        }

    }
}