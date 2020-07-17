package com.example.inews.newsitem

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import com.example.inews.R
import com.example.inews.databinding.FragmentNewsItemBinding

/**
 * A simple [Fragment] subclass.
 * Use the [NewsItemFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class NewsItemFragment : Fragment() {

    private val viewModel : NewsItemViewModel by lazy {
        ViewModelProviders.of(this).get(NewsItemViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentNewsItemBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_news_item,
            container, false)
        binding.fragmentnewsitemButton.setOnClickListener(Navigation.createNavigateOnClickListener(
            R.id.action_newsItemFragment_to_detailedNewsFragment))


        // Allows Data Binding to Observe LiveData with the lifecycle of this Fragment
        binding.lifecycleOwner = this
        // Giving the binding access to the NewsItemViewModel
        binding.viewModel = viewModel


        return binding.root
    }

}