package com.example.list_presidenri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.list_presidenri.adapter.Presiden_Adapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val nama_presiden = arrayOf<String>("Ir.Soekarno", "Soeharto", "Bacharudin Jusuf Habibie",
        "Abdurahman Wahid", "Megawati Soekarno Putri","Susilo Bambang Yudhoyono","Joko Widodo")

    val deskripsi_pres = arrayOf<String>(
        "Presiden Pertama, Menjabat Tahun(1945-1966)",
        "Presiden Kedua, Menjabat Tahun (1966-1998)",
        "Presiden Ketiga, Menjabat Tahun (1998-1999)",
        "Presiden Keempat, Menjabat Tahun (1999-2001)",
        "Presiden Kelima, Menjabat Tahun (2001-2004)",
        "Presiden Keenam, Menjabat Tahun (2004-2014)",
        "Presiden Ketujuh, Menjabat Tahun (2014-2014)"
    )

    val  idimage_pres = arrayOf<Int>(
        R.drawable.soekarna,
        R.drawable.soeharto,
        R.drawable.habibie,
        R.drawable.gusdur,
        R.drawable.megawati,
        R.drawable.sby,
        R.drawable.jokowi
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val presiden_adapter = Presiden_Adapter(this,nama_presiden,deskripsi_pres,idimage_pres)
        list_viewpresiden.adapter = presiden_adapter

        list_viewpresiden.setOnItemClickListener() { adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)
            Toast.makeText(this, "${nama_presiden[position]} Adalah : ${deskripsi_pres[position]}",
                Toast.LENGTH_LONG
        ).show()
        }
    }
}
