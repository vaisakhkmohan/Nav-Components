package com.vaisakh.hustler.navcomponents

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_second.view.*


class SecondFragment : Fragment() {

    val args : SecondFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)

        val number = args.number
        view.textview2.setText("  $number")
        Log.e(TAG, "onCreateView: ${args.str}" )
        view.textview2.setOnClickListener { Navigation.findNavController(view).navigate(R.id.to_firstFragment) }

        return view
    }


}