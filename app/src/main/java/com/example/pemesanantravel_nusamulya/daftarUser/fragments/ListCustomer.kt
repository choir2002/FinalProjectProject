package com.example.pemesanantravel_nusamulya.daftarUser.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pemesanantravel_nusamulya.R
import com.example.pemesanantravel_nusamulya.daftarUser.viewmodel.DaftarViewModel
import com.example.pemesanantravel_nusamulya.pesanTravel.viewmodel.PesanViewModel
import kotlinx.android.synthetic.main.fragment_list_customer.view.*

class ListCustomer : Fragment() {
    private lateinit var mDaftarViewModel: DaftarViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list_customer, container, false)

        val adapter = ListAdapterDaftar()
        val rv = view.recyclerView
        rv.adapter = adapter
        rv.layoutManager = LinearLayoutManager(requireContext())
        rv.addItemDecoration(DividerItemDecoration(context, LinearLayoutManager.VERTICAL))

        mDaftarViewModel = ViewModelProvider(this).get(DaftarViewModel::class.java)
        mDaftarViewModel.bacaSemuaData.observe(viewLifecycleOwner,
            { daftar -> adapter.tampilkanData(daftar) })

        setHasOptionsMenu(true)
        return view
    }

}