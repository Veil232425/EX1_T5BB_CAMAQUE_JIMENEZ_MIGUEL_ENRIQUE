package com.feelit.ex1_t5bb_camaque_jimenez_miguel_enrique

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_imprimir2.*

class Imprimir : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imprimir2)

        val NombreCliente=intent.getStringExtra("NombreCliente")
        val DNI=intent.getStringExtra("DNI")
        val ServicioInstalacion=intent.getStringExtra("ServicioInstalacion")
        val CServicio=intent.getStringExtra("CServicio")
        val CInstalacion=intent.getStringExtra("CInstalacion")
        val Descuento=intent.getStringExtra("Descuento")
        val TotalPagar=intent.getStringExtra("TotalPagar")

        edt2NomCliente.setText(NombreCliente)
        edt2DNI.setText(DNI)
        edt2Servicio.setText(ServicioInstalacion)
        edt2CServicio.setText(CServicio)
        edt2CInstalacion.setText(CInstalacion)
        edt2Descuento.setText(Descuento)
        edt2TotalPagar.setText(TotalPagar)
        /* oVentanaImprimir.putExtra("NombreCliente", EdtNombre.text)
           oVentanaImprimir.putExtra("DNI", EdtDNI.text)
           oVentanaImprimir.putExtra("ServicioInstalacion", seleccionado)
           oVentanaImprimir.putExtra("CServicio", EdtServicio.text)
           oVentanaImprimir.putExtra("CInstalacion", EdtInstalacion.text)
           oVentanaImprimir.putExtra("Descuento", EdtDescuento.text)
           oVentanaImprimir.putExtra("TotalPagar", EdtTotalPagar.toString())
           */
    }
}
