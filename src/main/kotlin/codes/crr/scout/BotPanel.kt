package codes.crr.scout

import java.awt.Dimension
import java.awt.Color
import javax.swing.JPanel

fun botPanel (): JPanel {
    val botPanel = JPanel().apply {
        preferredSize = Dimension(800, 440)
        background = Color(0xffffff)
    }

    return botPanel
}