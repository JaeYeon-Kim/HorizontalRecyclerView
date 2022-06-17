package com.kjy.horizontalrecyclerview

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kjy.horizontalrecyclerview.databinding.ItemRecyclerBinding


class MyRecyclerAdapter: RecyclerView.Adapter<MyViewHolder>() {

    val TAG: String = "로그"

    // 모델 리스트 선언
    private var modelList = ArrayList<MyModel>()

    // 뷰 홀더가 생성 되었을때
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ItemRecyclerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    // 뷰와 뷰홀더가 묶였을때
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        Log.d(TAG, "MyRecyclerAdapter - onBindViewHolder() called / position = $position")
        holder.bind(this.modelList[position])
    }

    // 목록의 아이템 수
    override fun getItemCount(): Int {
        return this.modelList.size
    }

    fun submitList(modelList: ArrayList<MyModel>) {
        this.modelList = modelList

    }

}


