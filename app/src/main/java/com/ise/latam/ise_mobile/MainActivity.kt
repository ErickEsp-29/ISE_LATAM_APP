package com.ise.latam.ise_mobile

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView
import com.ise.latam.ise_mobile.R
import androidx.appcompat.widget.Toolbar
import androidx.navigation.ui.navigateUp
import com.ise.latam.ise_mobile.databinding.ActivityMainBinding
import com.ise.latam.ise_mobile.fragmentos.*
import androidx.navigation.ui.setupActionBarWithNavController

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(findViewById(R.id.toolbar))
        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_inicio,
                R.id.nav_desarrollo,
                R.id.nav_proyectos,
                R.id.nav_toolbox,
                R.id.nav_millionMiners,
                R.id.nav_conocenos,
                R.id.nav_preguntasfrecuentes,
                R.id.nav_politicaPrivacidad,
                R.id.nav_terminosCondiciones,
                R.id.nav_ajustes
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
        navView.setItemIconTintList(null);

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}

/*
class MainActivity : AppCompatActivity() {

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navView: NavigationView
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        drawerLayout = binding.drawerLayout
        navView = binding.navView

        //setSupportActionBar(binding.toolbar) // Configurar la ActionBar con el toolbar

        val navController = findNavController(R.id.nav_host_fragment_content_main)

        // Configurar ActionBar con el NavController
        appBarConfiguration = AppBarConfiguration(
            setOf(
                //R.id.nav_inicio,
                R.id.nav_desarrollo,
                R.id.nav_proyectos,
                R.id.nav_toolbox,
                R.id.nav_millionMiners,
                R.id.nav_conocenos,
                R.id.nav_preguntasfrecuentes,
                R.id.nav_politicaPrivacidad,
                R.id.nav_terminosCondiciones,
                R.id.nav_ajustes
            ),
            drawerLayout
        )

        //setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        navView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_desarrollo -> {
                    replaceFragment(DesarrolloFragment())
                }
                R.id.nav_proyectos -> {
                    replaceFragment(ProyectosFragment())
                }
                R.id.nav_toolbox -> {
                    replaceFragment(ToolboxFragment())
                }
                R.id.nav_millionMiners -> {
                    replaceFragment(MillionMinersFragment())
                }
                R.id.nav_conocenos -> {
                    replaceFragment(ConocenosFragment())
                }
                R.id.nav_preguntasfrecuentes -> {
                    replaceFragment(PreguntasFragment())
                }
                R.id.nav_politicaPrivacidad -> {
                    replaceFragment(PoliticaPrivacidadFragment())
                }
                R.id.nav_terminosCondiciones -> {
                    replaceFragment(TerminosCondicionesFragment())
                }
                R.id.nav_ajustes -> {
                    replaceFragment(AjustesFragment())
                }
            }
            drawerLayout.closeDrawer(GravityCompat.START)
            true
        }

        if (savedInstanceState == null) {
            val fragmentInicio = InicioFragment()
            supportFragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment_content_main, fragmentInicio)
                .commit()
        }
    }
/*
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Abrir/cerrar el drawer cuando se presiona el ícono de hamburguesa en la ActionBar
        if (item.itemId == android.R.id.home) {
            if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                drawerLayout.closeDrawer(GravityCompat.START)
            } else {
                drawerLayout.openDrawer(GravityCompat.START)
            }
            return true
        }
        return super.onOptionsItemSelected(item)
    }*/

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.nav_host_fragment_content_main, fragment)
            .commit()
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}
*/