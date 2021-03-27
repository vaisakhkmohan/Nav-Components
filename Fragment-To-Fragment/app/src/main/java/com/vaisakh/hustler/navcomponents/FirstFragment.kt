package com.vaisakh.hustler.navcomponents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_first.view.*


class FirstFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_first, container, false)
        val action = FirstFragmentDirections.toSecondFragment(42,"krishna")
        view.textview1.setOnClickListener { Navigation.findNavController(view).navigate(action) }
        return view
    }

}