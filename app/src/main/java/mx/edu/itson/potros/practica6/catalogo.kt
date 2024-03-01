package mx.edu.itson.potros.practica6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class catalogo : AppCompatActivity() {

    var adapter: PeliculaAdapter? = null
    var seriesAdapter: PeliculaAdapter? = null
    var peliculas = ArrayList<Pelicula>()
    var series = ArrayList<Pelicula>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalogo)

        cargarPeliculas()
        cargarSeries()

        adapter = PeliculaAdapter(this, peliculas)
        seriesAdapter = PeliculaAdapter(this, series)
        var gridPelis: GridView = findViewById(R.id.movies_catalago)
        var gridSeries: GridView = findViewById(R.id.series_catalogo)

        gridPelis.adapter = adapter
        gridSeries.adapter = seriesAdapter

    }
}