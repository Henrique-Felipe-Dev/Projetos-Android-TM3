package com.generation.recyclerview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.generation.recyclerview.adapter.NomesAdapter
import com.generation.recyclerview.model.Nomes

class ListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_list, container, false)

        /*
        RecyclerView

        Item - Classe de Modelo e o Modelo Visual
        Adapter com a ViewHolder - Para processar os itens
        Configurar a RecyclerView
         */

        val listNomes = listOf(
            Nomes("Henrique"),
            Nomes("Rodrigo"),
            Nomes("Luiz"),
            Nomes("Elisson"),
            Nomes("Elisson"),
            Nomes("Elisson"),
            Nomes("Elisson"),
            Nomes("Elisson"),
            Nomes("Elisson"),
            Nomes("Elisson"),
            Nomes("Elisson")

        )

        val recyclerNome = view.findViewById<RecyclerView>(R.id.recyclerNome)

        //Criar instancia do adapet
        val nomesAdapter = NomesAdapter()

        recyclerNome.adapter = nomesAdapter

        recyclerNome.layoutManager = LinearLayoutManager(context)
        recyclerNome.setHasFixedSize(true)

        nomesAdapter.setLista(listNomes)

        return view
    }
}