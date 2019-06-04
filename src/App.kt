
import javax.swing.JOptionPane

fun main() {
    val obx = Plantilla("Miguel", "Bazo", 10, 20)
    val obxX = Xogador("Roi", "Falcon", 7, 26, 18, "Delantero")
    val obxB = Adestrador("Carlos", "Jimenez", 23, 40, "753158p")
    val obxM = Masaxista("Juan", "Benitez", 30, 30, 6, "Fisioterapeuta")
    obx.concentrarse()
    obx.viaxar()
    JOptionPane.showMessageDialog(null, obx.toString())
    obxX.viaxar()
    JOptionPane.showMessageDialog(null, obxX.toString())
    obxB.viaxar()
    JOptionPane.showMessageDialog(null, obxB.toString())
    obxM.viaxar()
    JOptionPane.showMessageDialog(null, obxM.toString())
}