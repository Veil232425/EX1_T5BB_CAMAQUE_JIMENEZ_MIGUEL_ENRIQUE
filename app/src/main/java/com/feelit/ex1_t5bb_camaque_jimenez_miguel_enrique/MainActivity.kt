package com.feelit.ex1_t5bb_camaque_jimenez_miguel_enrique

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.feelit.ex1_t5bb_camaque_jimenez_miguel_enrique.bean.Cliente
import kotlinx.android.synthetic.main.activity_main.*




class MainActivity : AppCompatActivity() {

    var Costo: Double = 0.0
    var Cantidad: Double = 0.0
    var Total: Double = 0.0
    var Descuento: Double = 0.0
    var CostoDelivery: Double = 0.0
    var TotalPagar: Double = 0.0

    var duo_CServicio: Double = 109.00
    var trio_CServicio: Double = 159.00
    var sI_CServicio: Double = 89.00
    var sT_CServicio: Double = 59.00
    var sC_CServicio: Double = 79.00

    var duo_CInstal: Double = 35.00
    var trio_CInstal: Double = 60.00
    var sI_CInstal: Double = 15.00
    var sT_CInstal: Double = 12.00
    var sC_CInstal: Double = 15.00

    var duo_desc: Double = 0.05
    var trio_desc: Double = 0.1
    var sI_desc: Double = 0.02
    var sT_desc: Double = 0.02
    var sC_desc: Double = 0.01

    var descuento1: Double = 0.0
    var descuento2: Double = 0.0
    var descuento3: Double = 0.0
    var descuento4: Double = 0.0
    var descuento5: Double = 0.0

    var TotalPagar1: Double = 0.0
    var TotalPagar2: Double = 0.0
    var TotalPagar3: Double = 0.0
    var TotalPagar4: Double = 0.0
    var TotalPagar5: Double = 0.0

    var nombreCliente: String =""
    var DNI: String = ""
    var seleccionado: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_click_me = findViewById(R.id.btnCalcular) as Button
        rgInstalacion.setOnCheckedChangeListener { group, checkedId ->
            if (checkedId == R.id.rbDuo) {
                EdtServicio.setText(duo_CServicio.toString());
                EdtInstalacion.setText(duo_CInstal.toString());
                btn_click_me.setOnClickListener {
                    descuento1 = duo_CServicio * duo_desc
                    EdtDescuento.setText(descuento1.toString())
                    TotalPagar1 = (duo_CServicio - descuento1) + duo_CInstal
                    EdtTotalPagar.setText(TotalPagar1.toString())

                    nombreCliente = EdtNombre.text.toString()
                    DNI = EdtDNI.text.toString()
                    seleccionado = rbDuo.text.toString()
                }
            }
            if(checkedId == R.id.rbTrio) {
                EdtServicio.setText(trio_CServicio.toString());
                EdtInstalacion.setText(trio_CInstal.toString());
                btn_click_me.setOnClickListener {
                    descuento2 = trio_CServicio * trio_desc
                    EdtDescuento.setText(descuento1.toString())
                    TotalPagar2 = (trio_CServicio - descuento2) + trio_CInstal
                    EdtTotalPagar.setText(TotalPagar2.toString())
                    nombreCliente = EdtNombre.toString()
                    DNI = EdtDNI.toString()
                    seleccionado = rbTrio.text.toString()
                }
            }

             if (checkedId == R.id.rbSoloInter) {
                 EdtServicio.setText(sI_CServicio.toString());
                 EdtInstalacion.setText(sI_CInstal.toString());
                 btn_click_me.setOnClickListener {
                 descuento3 = sI_CServicio * sI_desc
                 EdtDescuento.setText(descuento3.toString())
                 TotalPagar3 = (sI_CServicio - descuento3) + sI_CInstal
                 EdtTotalPagar.setText(TotalPagar3.toString())
                     nombreCliente = EdtNombre.toString()
                     DNI = EdtDNI.toString()
                     seleccionado = rbSoloInter.text.toString()
                 }
             }

         if (checkedId == R.id.rbSoloTel) {
             EdtServicio.setText(sT_CServicio.toString());
             EdtInstalacion.setText(sT_CInstal.toString());
             btn_click_me.setOnClickListener {
                 descuento4 = sT_CServicio * sT_desc
                 EdtDescuento.setText(descuento4.toString())
                 TotalPagar4 = (sT_CServicio - descuento4) + sT_CInstal
                 EdtTotalPagar.setText(TotalPagar4.toString())
                 nombreCliente = EdtNombre.toString()
                 DNI = EdtDNI.toString()
                 seleccionado = rbSoloTel.text.toString()
             }
         }

        if(checkedId == R.id.rbSoloCable) {
            EdtServicio.setText(sC_CServicio.toString())
            EdtInstalacion.setText(sC_CInstal.toString())
            btn_click_me.setOnClickListener {
                descuento5 = sC_CServicio * sC_desc
                EdtDescuento.setText(descuento5.toString())
                TotalPagar5 = (sC_CServicio - descuento5) + sC_CInstal
                EdtTotalPagar.setText(TotalPagar5.toString())
                nombreCliente = EdtNombre.toString()
                DNI = EdtDNI.toString()
                seleccionado = rbSoloCable.text.toString()
            }
        }
        }

    }
    public fun btnImprimir_OnClick(v: View)
    {


            var oVentanaImprimir:Intent=Intent(this,Imprimir::class.java)
            oVentanaImprimir.putExtra("NombreCliente", EdtNombre.text.toString())
            oVentanaImprimir.putExtra("DNI", EdtDNI.text.toString())

            oVentanaImprimir.putExtra("ServicioInstalacion", seleccionado)
            oVentanaImprimir.putExtra("CServicio", EdtServicio.text.toString())
            oVentanaImprimir.putExtra("CInstalacion", EdtInstalacion.text.toString())
            oVentanaImprimir.putExtra("Descuento", EdtDescuento.text.toString())
            oVentanaImprimir.putExtra("TotalPagar", EdtTotalPagar.text.toString())


            startActivity(oVentanaImprimir)
        }

    }


/*
    public fun btnCalcularClick(v: View) {
        try{

            val btn_click_me = findViewById(R.id.btnCalcular) as Button
            btn_click_me.setOnClickListener {
                descuento1 = duo_CServicio * duo_desc
                EdtDescuento.setText(descuento1.toString())
                TotalPagar1 = (duo_CServicio - descuento1) + trio_CInstal
                EdtTotalPagar.setText(TotalPagar1.toString())

            }
         rgInstalacion.setOnCheckedChangeListener { group, checkedId ->
            if (checkedId == R.id.rbDuo)
                descuento1 = duo_CServicio * duo_desc
            EdtDescuento.setText(descuento1.toString())
            TotalPagar1 = (duo_CServicio - descuento1) + trio_CInstal
            EdtTotalPagar.setText(TotalPagar1.toString())
        }
     }catch (e: IllegalArgumentException){

            e.printStackTrace()
        }
    }

 */


        /*
    fun CalcularTotales(): Boolean
    {
        if (EdtNombre.text.isEmpty() || EdtNombre.text.equals("0") )
        {
            Toast.makeText(baseContext,"Por favor ingresar el nombre", Toast.LENGTH_LONG).show()
            return false
        }

        Costo = EdtCosto.text.toString().toDouble()
        Cantidad = EdtCantidad.text.toString().toDouble()
        Total = Costo * Cantidad

        if (  Total > 300)
        {
            Descuento = Total * 0.10
        }
        if (chkDElivery.isChecked)
        {
            CostoDelivery = 20.0
        }
        TotalPagar = (Total - Descuento) + CostoDelivery
        return true;
    }

    public fun btnCalcularClick(v: View)
    {
        if (CalcularTotales())
        {
            //Mostrar los datos calculados
            EdtTotal.setText(Total.toString())
            EdtDescuento.setText(Descuento.toString())
            EdtTotalPagar.setText(TotalPagar.toString())
        }
    }

    public fun btnImprimir_OnClick(v: View)
    {
        if (CalcularTotales())
        {
            //Mostrar los datos calculados
            EdtTotal.setText(Total.toString())
            EdtDescuento.setText(Descuento.toString())
            EdtTotalPagar.setText(TotalPagar.toString())

            var oVentanaImprimir: Intent = Intent(this,ConfirmarMenu::class.java)
            oVentanaImprimir.putExtra("DetallePedido", EdtDetallePedido.text)
            oVentanaImprimir.putExtra("Costo", EdtCosto.text)
            oVentanaImprimir.putExtra("Cantidad", EdtCantidad.text)
            oVentanaImprimir.putExtra("Total", EdtTotal.text)
            oVentanaImprimir.putExtra("Descuento", EdtDescuento.text)
            oVentanaImprimir.putExtra("Delivery", CostoDelivery.toString())
            oVentanaImprimir.putExtra("TotalPagar", EdtTotalPagar.toString())
            startActivity(oVentanaImprimir)
        }

    }*/


