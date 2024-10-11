package com.ise.latam.ise_mobile.fragmentos

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import android.widget.ProgressBar
import com.ise.latam.ise_mobile.R
import com.ise.latam.ise_mobile.adapters.ImageAdapter
import com.ise.latam.ise_mobile.modelos.ImageItem
import java.util.UUID

class InicioFragment : Fragment(R.layout.fragment_inicio) {

    private lateinit var viewPager1: ViewPager2
    private lateinit var viewPager2: ViewPager2
    private lateinit var viewPager3: ViewPager2
    private lateinit var adapter1: ImageAdapter
    private lateinit var adapter2: ImageAdapter
    private lateinit var adapter3: ImageAdapter
    private lateinit var progressBar: ProgressBar

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Infla el layout para este fragmento
        val view = inflater.inflate(R.layout.fragment_inicio, container, false)

        // Inicializa los ViewPagers y el ProgressBar
        viewPager1 = view.findViewById(R.id.viewpagerDeslizante)
        viewPager2 = view.findViewById(R.id.viewpagerDeslizante2)
        viewPager3 = view.findViewById(R.id.viewpagerDeslizante3)
        progressBar = view.findViewById(R.id.progressBarBanner)

        // Crea los adaptadores
        adapter1 = ImageAdapter()
        adapter2 = ImageAdapter()
        adapter3 = ImageAdapter()

        // Asigna los adaptadores a los ViewPagers
        viewPager1.adapter = adapter1
        viewPager2.adapter = adapter2
        viewPager3.adapter = adapter3

        // Muestra el ProgressBar mientras se cargan las imágenes
        progressBar.visibility = View.VISIBLE
        viewPager1.visibility = View.GONE
        viewPager2.visibility = View.GONE
        viewPager3.visibility = View.GONE

        // Aquí se crean las listas de imágenes
        val imagenes1 = arrayListOf(
            ImageItem(
                UUID.randomUUID().toString(),
                Uri.parse("android.resource://" + requireContext().packageName + "/" + R.drawable.curso1)
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                Uri.parse("android.resource://" + requireContext().packageName + "/" + R.drawable.curso2)
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                Uri.parse("android.resource://" + requireContext().packageName + "/" + R.drawable.curso3)
            )
        )

        val imagenes2 = arrayListOf(
            ImageItem(
                UUID.randomUUID().toString(),
                Uri.parse("android.resource://" + requireContext().packageName + "/" + R.drawable.curso11)
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                Uri.parse("android.resource://" + requireContext().packageName + "/" + R.drawable.curso12)
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                Uri.parse("android.resource://" + requireContext().packageName + "/" + R.drawable.curso13)
            )
        )

        val imagenes3 = arrayListOf(
            ImageItem(
                UUID.randomUUID().toString(),
                Uri.parse("android.resource://" + requireContext().packageName + "/" + R.drawable.curso14)
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                Uri.parse("android.resource://" + requireContext().packageName + "/" + R.drawable.curso15)
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                Uri.parse("android.resource://" + requireContext().packageName + "/" + R.drawable.curso16)
            )
        )

        // Configura los adaptadores con las listas de imágenes correspondientes
        adapter1.submitList(imagenes1)
        adapter2.submitList(imagenes2)
        adapter3.submitList(imagenes3)

        // Oculta el ProgressBar y muestra los ViewPagers después de cargar
        viewPager1.post {
            progressBar.visibility = View.GONE
            viewPager1.visibility = View.VISIBLE
            viewPager2.visibility = View.VISIBLE
            viewPager3.visibility = View.VISIBLE
        }

        return view
    }
}
