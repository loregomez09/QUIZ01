fun main() {

    //LADY LORENA GOMEZ FORERO ID 702526

    val tarifa = 8500
    val des = tarifa - 0.45

    println("MENU")

    var cantidadViajes = 0
    var cantidadDescuentos = 0
    var opcion: Int

    do {
        println("Menú:")
        println("1. CANTIDAD DE TRAYECTOS")
        println("2. CANTIDAD DE DESCUENTOS")
        println("3. DESEA SU DESCUENTO ")
        println("4. SALIR")
        print("SELECCIONE UNA OPCION: ")

        val input = readLine()
        opcion = input?.toIntOrNull() ?: 0

        when (opcion) {
            1 -> {
                print("INGRESE LA CANTIDAD DE TRAYECTOS: ")
                val viajesInput = readLine()?.toIntOrNull()
                if (viajesInput != null) {
                    cantidadViajes = viajesInput
                    println("CANTIDAD TOTAL DE TRAYECTOS: $cantidadViajes")
                }

            }
            2 -> {
                print("INGRESE LA CANTIDAD DE DESCUENTOS: ")
                val descuentosInput = readLine()?.toIntOrNull()
                if (descuentosInput != null) {
                    cantidadDescuentos = descuentosInput
                    println("CANTIDAD TOTAL DE DESCUENTOS: $cantidadDescuentos")
                }
            }
            3 -> {
                println("DESCUENTO POR EDAD")
                println("INGRESE EDAD")
                var edad = readln().toInt()

                when (edad) {
                    in 0..1 -> {
                        println("ES ADULTO MAYOR, SE LE APLICA DESCUENTO")
                        println("SU VALOR DE TRAYECTO ES $des ")
                    }

                    in 60..1000 -> {
                        println("SU RESPUESTA ES: ")
                        println("ES ADULTO MAYOR, SE LE APLICA DESCUENTO")
                        println("SU VALOR DE TRAYECTO ES $des ")

                    }

                    else -> println("NO SE ENCUENTRA EN EL RANGO DE EDAD REQUERIDA")


                }

            }
            4 -> {
                println("SALIR")
            }

        }
    } while (opcion != 4)




}