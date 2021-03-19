package main

object Paciente extends App {

class Paciente {
  var nombre = "chester"
  var primer_ap = "chente"
  var segundo_ap = "spain"
  var edad = 23
  var fechas = List("05-12-2012","11-12-2012","15-12-2012","25-12-2012","31-12-2012")
  var horas = List("21:04","22:08","17:00","15:33","17:21")
  var nivelesDeBienestar = List(2,5,3,1,2)
  var temperaturas = List(22.2,12.4,55.4,12.4,11.9)
  var humedades = List(21.2,44.2,55.2,12.7,55.2)

  def obtenerPromedioNivelaBienestar():Double = {
  nivelesDeBienestar.sum.toDouble / nivelesDeBienestar.length.toDouble
  }

  def obtenerTemperaturaMayor():Unit = {
    var mayor = 0.0
    var nivelBinenestarMayor = 0
    var fechaMayor = ""


    for( i <- 0 until temperaturas.length){
      if (temperaturas(i) > mayor)
        {
          mayor = temperaturas(i)
          nivelBinenestarMayor = nivelesDeBienestar(i)
          fechaMayor = fechas(i)
        }
      //println(s"$i is ${temperaturas(i)}")
    }

    println(s"La Temperatura Mayor es [$mayor] la fecha de registro es:[$fechaMayor] y el nivel" +
      s" de bienestar es:[$nivelBinenestarMayor]")

  }

  def obtenerTemperaturaMenor():Unit = {
    var menor = 1000000.0
    var nivelBinenestarMenor = 0
    var fechaMenor = ""


    for( i <- 0 until temperaturas.length){
      if (temperaturas(i) < menor)
      {
        menor = temperaturas(i)
        nivelBinenestarMenor = nivelesDeBienestar(i)
        fechaMenor = fechas(i)
      }
      //println(s"$i is ${temperaturas(i)}")
    }

    println(s"La Temperatura Menor es [$menor] la fecha de registro es:[$fechaMenor] y el nivel" +
      s" de bienestar es:[$nivelBinenestarMenor]")

  }

}
  // Pruebas
  val miPaciente = new Paciente
  println("Promedio de Nivel de Bienestar:"+miPaciente.obtenerPromedioNivelaBienestar())
  miPaciente.obtenerTemperaturaMayor()
  miPaciente.obtenerTemperaturaMenor()





}
