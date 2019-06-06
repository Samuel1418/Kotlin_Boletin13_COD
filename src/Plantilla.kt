
import javax.swing.JOptionPane


open class Plantilla(var nome: String?, var apelidos: String?, var id: Int, var edad: Int) {
//Con open se indica que es la clase padre
    fun concentrarse() {
        JOptionPane.showMessageDialog(null, "Concentrase a seleccion.")
    }
    //Tambien se indica con open el metodo que van heredar todas de la calse padre
    open fun viaxar() {
        JOptionPane.showMessageDialog(null, "Viaxa a seleccion")
    }

    override fun toString(): String {
        return "Nome=$nome\nApelidos=$apelidos\nId=$id\nEdad=$edad"
    }

}