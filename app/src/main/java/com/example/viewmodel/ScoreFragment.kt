package com.example.viewmodel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.viewmodel.databinding.FragmentScoreBinding


class ScoreFragment : Fragment() {


   private lateinit var  binding: FragmentScoreBinding
    private val viewModel : TestViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
     binding= FragmentScoreBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
        binding.addButton.setOnClickListener{

           viewModel.incrementOnePoints()
            binding.score.text=  viewModel.num.toString()
        }

        binding.subtractButton.setOnClickListener{
         viewModel.subtractPoints()
            binding.score.text=viewModel.num.toString()

        }


        binding.addFourPoints.setOnClickListener{
       viewModel.incrementFourPoints()
            binding.score.text= viewModel.num.toString()

        }
    }
}