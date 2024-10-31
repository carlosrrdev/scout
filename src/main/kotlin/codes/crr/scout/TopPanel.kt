package codes.crr.scout

import java.awt.Dimension
import java.awt.Color
import java.awt.GridLayout
import java.awt.Font
import javax.swing.JPanel
import javax.swing.BorderFactory
import javax.swing.Box
import javax.swing.BoxLayout
import javax.swing.JButton
import javax.swing.JTextField

fun topPanel (): JPanel {
    val topPanel = JPanel().apply {
        preferredSize = Dimension(800, 60)
        background = Color(0xf7f7f7)
        border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color(0xdddddd))
    }

    val loadSqlBtn = JButton("Load SQL").apply {
        font = Font(this.font.name, Font.PLAIN, 12)
        isFocusPainted = false
    }
    val scoutDirBtn = JButton("Scout Directory").apply {
        font = Font(this.font.name, Font.PLAIN, 12)
        isFocusPainted = false
    }
    val searchField = JTextField("Search").apply {
        font = Font(this.font.name, Font.PLAIN, 12)
        preferredSize = Dimension(400, 30)
    }

    val containerPanel = ContainerPanel().apply {
        layout = BoxLayout(this, BoxLayout.X_AXIS)
        add(loadSqlBtn)
        add(Box.createHorizontalStrut(10))
        add(scoutDirBtn)
        add(Box.createHorizontalStrut(10))
        add(searchField)
    }

    topPanel.add(containerPanel)
    return topPanel
}