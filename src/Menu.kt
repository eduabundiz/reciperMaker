const val HACER_RECETA = "1"
const val VER_MIS_RECETAS = "2"
const val SALIR = "3"

public class Menu {

    constructor() {
    }

    public fun showMenu() {

        do {
            println(
                """
          $HACER_RECETA. Hacer receta
          $VER_MIS_RECETAS. Ver mis recetas
          $SALIR. Salir
          
        """.trimIndent()
            )
            val opc:String? = readLine();
            chooseResponse(opc)
        } while (opc!="3"?:'0')
    }

    fun chooseResponse(response:String?){
        when(response){
            "1" -> {
                makeRecipe()
            }
            "2" -> {
                showRecipes()
            }
            "3" -> {
                exitMenu()
            }
            else ->{
                println("Opcion incorrecta. Intente Nuevamente")
            }

        }
    }

    fun makeRecipe(){
        println("Haciendo la receta")
    }
    fun showRecipes(){
        println("Viendo las recetas")
    }
    fun exitMenu(){
        println("Saliendo...")
    }


}