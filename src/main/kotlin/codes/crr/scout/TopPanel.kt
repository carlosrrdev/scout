package codes.crr.scout

import java.awt.Dimension
import java.awt.Color
import javax.swing.JPanel
import javax.swing.BorderFactory

fun topPanel (): JPanel {
    val topPanel = JPanel().apply {
        preferredSize = Dimension(800, 100)
        background = Color(0xf7f7f7)
        border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color(0xdddddd))
    }

    return topPanel
}