package codes.crr.scout

import javafx.application.Application
import javafx.scene.Scene
import javafx.fxml.FXMLLoader
import javafx.stage.Stage
import javafx.stage.StageStyle

class ScoutApplication: Application() {
    override fun start(stage: Stage) {
        stage.initStyle(StageStyle.DECORATED)
        val fmxLoader = FXMLLoader(ScoutApplication::class.java.getResource("/fxml/main.fxml"))
        val scene = Scene(fmxLoader.load(), 800.0, 500.0)
        scene.stylesheets.add(ScoutApplication::class.java.getResource("/styles/styles.css")?.toExternalForm())

        stage.apply {
            title = "Scout"
            this.scene = scene
            show()
        }
    }
}

fun main(args: Array<String>) {
    Application.launch(ScoutApplication::class.java, *args)
}