package com.generation.recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.generation.recyclerview.R
import com.generation.recyclerview.model.Nomes

class NomesAdapter : RecyclerView.Adapter<NomesAdapter.NomesViewHolder>(){

    var listNomes = emptyList<Nomes>()

    class NomesViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val textNome = view.findViewById<TextView>(R.id.textNome)
    }

    //Configurar a ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NomesViewHolder {
        val layout = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_layout, parent, false)
        return NomesViewHolder(layout)
    }

    //Pegar os dados da lista e processar dentro do textView
    override fun onBindViewHolder(holder: NomesViewHolder, position: Int) {
        val item = listNomes[position]

        holder.textNome.text = item.nome
    }

    //Saber quantos itens gerar dentro do RecyclerView
    override fun getItemCount(): Int {
        return listNomes.size
    }

    fun setLista(list: List<Nomes>){
        listNomes = list
        notifyDataSetChanged()
    }

}