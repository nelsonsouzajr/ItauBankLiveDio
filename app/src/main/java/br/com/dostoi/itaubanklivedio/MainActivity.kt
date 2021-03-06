package br.com.dostoi.itaubanklivedio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvList: RecyclerView
    private var adapter = MenuItemAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iniciaViews()
        setItemsLista()
    }

    private fun iniciaViews() {
        rvList = findViewById(R.id.rv_list)
        rvList.adapter = adapter
        rvList.layoutManager = GridLayoutManager(this,2)
    }

    private fun setItemsLista() {
        adapter.setItensList(
            arrayListOf(
                MenuItemModel(
                    "cartões"
                ),MenuItemModel(
                    "extrato"
            ),MenuItemModel(
                    "Investimentos"
            ),MenuItemModel(
                    "contabilidade"
            ),MenuItemModel(
                    "cartões"
            ),MenuItemModel(
                    "cartões"
            ),MenuItemModel(
                    "cartões"
            ),MenuItemModel(
                    "cartões"
            ),
            )
        )
    }
}