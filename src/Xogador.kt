
import javax.swing.JOptionPane

//En kotlin se hacen los constructores de forma que los datos sean los que hay y valiendo de variable, no como java que despues
// hay que definir
class Xogador(nome: String, apelidos: String, id: Int, edad: Int, var dorsal: Int, var demarcacion: String?) :
    Plantilla(nome, apelidos, id, edad) {

    private fun xogarPartido() {}
    private fun entrenar() {}
    //Al igual que en java override
    override fun viaxar() {
        JOptionPane.showMessageDialog(null, "Viaxan os xogadores:" + super.nome!!)
    }

    override fun toString(): String {
        return "O xogador é:\n" + super.toString() + "\nDorsal=" + dorsal + "\nDemarcacion=" + demarcacion
    }

}