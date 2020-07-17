package com.example.inews.detailednews

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.inews.R
import com.example.inews.databinding.FragmentDetailedNewsBinding

/**
 * A simple [Fragment] subclass.
 * Use the [DetailedNewsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DetailedNewsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentDetailedNewsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_detailed_news,
            container, false)


        return binding.root
    }
}