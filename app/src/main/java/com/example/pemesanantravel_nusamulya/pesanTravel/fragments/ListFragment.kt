package com.example.pemesanantravel_nusamulya.pesanTravel.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pemesanantravel_nusamulya.R
import com.example.pemesanantravel_nusamulya.pesanTravel.viewmodel.PesanViewModel
import kotlinx.android.synthetic.main.fragment_list.view.*

class ListFragment : Fragment() {
    private lateinit var mPesanViewModel: PesanViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list, container, false)

        val adapter = ListAdapter()
        val rv = view.recyclerView
        rv.adapter = adapter
        rv.layoutManager = LinearLayoutManager(requireContext())
        rv.addItemDecoration(DividerItemDecoration(context, LinearLayoutManager.VERTICAL))

        mPesanViewModel = ViewModelProvider(this).get(PesanViewModel::class.java)
        mPesanViewModel.bacaSemuaData.observe(viewLifecycleOwner,
            { pesan -> adapter.tampilkanData(pesan) })

        setHasOptionsMenu(true)
        return view
    }

}