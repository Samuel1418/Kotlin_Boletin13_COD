
import javax.swing.JOptionPane
class Adestrador(nome: String, apelidos: String, id: Int, edad: Int, var idFederacion: String?) :
    Plantilla(nome, apelidos, id, edad) {

    private fun dirixirPartido() {}
    private fun dirixirAdestramento() {}
    //Los metodos va con fun y la llamada del nombre es como java
    override fun viaxar() {
        JOptionPane.showMessageDialog(null, "Viaxa o entrenador:" + super.nome)
    }

    override fun toString(): String {
        return "O adestrador é:\n" + super.toString() + "\nIdFederacion=" + idFederacion
    }

}