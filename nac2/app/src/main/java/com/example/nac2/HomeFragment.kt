package com.example.nac2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.nac2.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var bindings: FragmentHomeBinding
    private var resp = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bindings = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        return bindings.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val num1 = Integer.parseInt(bindings.input1.text.toString())
        val num2 = Integer.parseInt(bindings.input2.text.toString())
        bindings.next.setOnClickListener{
            val num1 = Integer.parseInt(bindings.input1.text.toString())
            val num2 = Integer.parseInt(bindings.input2.text.toString())


            val action = HomeFragmentDirections.actionHomeFragmentToResultFragment(resp)
            findNavController().navigate(action)
        }
    }

}