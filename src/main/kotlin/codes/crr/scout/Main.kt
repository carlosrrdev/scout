package codes.crr.scout

import java.awt.BorderLayout
import javax.swing.JFrame
import javax.swing.UIManager

fun main() {

    try {
        for (info in UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus" == info.name) {
                UIManager.setLookAndFeel(info.className)
                break
            }
        }
    }catch (e: Exception) {
        e.printStackTrace()
    }

    val frame = JFrame().apply {
        title = "Scout"
        setSize(800, 500)
        layout = BorderLayout()
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        setLocationRelativeTo(null)
        isResizable = false
    }

    frame.add(topPanel(), BorderLayout.NORTH)
    frame.add(botPanel(), BorderLayout.SOUTH)

    // TODO Add JPanels to main frame

    frame.isVisible = true
}