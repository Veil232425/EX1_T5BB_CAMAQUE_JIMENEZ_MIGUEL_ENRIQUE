package com.feelit.ex1_t5bb_camaque_jimenez_miguel_enrique.bean

import java.lang.Boolean.FALSE

public class Cliente {
    var NombreCliente: String = "";
    var DNI: String="";
    var Servicio: Boolean=FALSE;
    var CostoServicio: Double=0.0;
    var CostoInstalacion: Double=0.0;
    var Descuento: Double=0.0;

   constructor(pNombreCliente: String, pDNI: String,
               pServicio: Boolean, pCostoServicio: Double,
               pCostoInstalacion: Double, pDescuento: Double){

       this.NombreCliente = pNombreCliente;
       this.DNI = pDNI;
       this.Servicio = pServicio;
       this.CostoServicio = pCostoServicio;
       this.CostoInstalacion = pCostoInstalacion;
       this.Descuento = pDescuento;

}
    fun TotalPagar():Double
    {
        var Total: Double = 0.0
        Total = (this.CostoServicio - this.Descuento) + this.CostoInstalacion;
        return Total
    }



}