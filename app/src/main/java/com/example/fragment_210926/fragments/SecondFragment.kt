package com.example.fragment_210926.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.fragment_210926.MainActivity
import com.example.fragment_210926.R
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        fragToastBtn.setOnClickListener {

//            코드적는곳:부품
//            토스트의 재료로 필요한것:화면
//            화면을 불러내려면??

            Toast.makeText(requireContext(), "버튼눌림", Toast.LENGTH_SHORT).show()
            Log.d("두번째부품","버튼눌림")
        }
    }
}