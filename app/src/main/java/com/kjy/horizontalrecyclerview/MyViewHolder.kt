package com.kjy.horizontalrecyclerview

import android.graphics.Color
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.kjy.horizontalrecyclerview.databinding.ItemRecyclerBinding

class MyViewHolder(val binding: ItemRecyclerBinding): RecyclerView.ViewHolder(binding.root) {

    val TAG: String = "로그"

    private val profileImageView = binding.profileImg

    // 기본 생성자
    init {
        Log.d(TAG, "MyViewHolder - init() called")
    }

    // 데이터와 뷰를 묶는다.
    fun bind(myModel: MyModel) {
        Log.d(TAG, "MyViewHolder - bind() called")

        // Glide 라이브러리를 통해 이미지 불러오기
        Glide
            .with(App.instance)
            .load("http://naver.com")
            .placeholder(R.drawable.scottdunk)
            .into(profileImageView)

        binding.profileImg.setBackgroundColor(Color.parseColor("#FFFFFF"))
    }

}