
import javax.swing.JOptionPane


class Masaxista(nome: String, apelidos: String, id: Int, edad: Int, var anosExperiencia: Int, var titulacion: String?) :
     Plantilla(nome, apelidos, id, edad) {

    override fun viaxar() {
        JOptionPane.showMessageDialog(null, "Viaxa o masaxista:" + super.nome)
    }

    fun darMasaxes() {}
 //To String igual que en java pero sin acabar en <;>
    override fun toString(): String {
        return "O masaxistata é:\n" + super.toString() + "\nAnosExperiencia=" + anosExperiencia + "\nTitulacion=" + titulacion
    }


}