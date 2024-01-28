/*
1. Crear una clase Persona que tenga nombre, peso (en kg con decimales), altura (en metros con decimales) y su imc.
2. Crear un constructor primario con todos los atributos, excepto el nombre y el imc, que se calculará en un bloque init que situarás a continuación de la declaración del atributo de la clase imc.
3. Crear un constructor secundario que también incluya el nombre de la persona cómo parámetro.
4. En el main() crear 3 personas diferentes, utilizando el constructor primario y secundario, y realizar lo siguiente:
    La persona1 debe modificar su nombre y para ello debes solicitarlo al usuario por consola.
    Mostrar el nombre, peso y altura de la persona 2.
    Actualizar imc de la persona3 haciendo el cálculo con su peso y altura.
 */

/**
 * Clase que representa a una persona con atributos como nombre, peso, altura y su índice de masa corporal (IMC).
 *
 * @property peso Peso de la persona en kilogramos.
 * @property altura Altura de la persona en metros.
 * @property nombre Nombre de la persona.
 * @property imc Índice de Masa Corporal (IMC) de la persona, calculado automáticamente.
 */
class Persona(val peso: Double, val altura: Double) {
    var nombre: String = ""
    var imc: Double

    /**
     * Inicializador que calcula el IMC de la persona a partir del peso y la altura proporcionados.
     */
    init {
        this.imc = this.peso / (this.altura * this.altura)
    }

    /**
     * Constructor secundario que incluye el nombre de la persona.
     */
    constructor(nombre: String, peso: Double, altura: Double) : this(peso, altura) {
        this.nombre = nombre
    }
}

/**
 * Función principal que crea y realiza operaciones con objetos de la clase Persona.
 */
fun main() {
    // Crear persona1 utilizando el constructor primario y modificar su nombre.
    val persona1 = Persona(70.0, 1.74)
    println("Introduce tu nombre:")
    persona1.nombre = readln()

    // Crear persona2 utilizando el constructor secundario e imprimir su nombre, peso y altura.
    val persona2 = Persona("Pepe", 80.0, 1.8)
    println("${persona2.nombre} pesa ${persona2.peso} kg y mide ${persona2.altura} metros.")

    // Crear persona3 utilizando el constructor secundario y calcular su IMC.
    val persona3 = Persona("Arturo", 90.0, 1.9)
    println("El IMC de ${persona3.nombre} es: ${persona3.imc}")
}