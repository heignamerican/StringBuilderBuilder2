package heignamerican.StringBuilderBuilder2;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class App extends Application {
	public static void main(final String[] args) {
		launch(args);
	}

	@Override
	public void start(final Stage aStage) throws Exception {
		final TextArea tFromTextArea = new TextArea("from");
		final TextArea tToTextArea = new TextArea("to") {
			{
				setEditable(false);
			}
		};

		final SplitPane tRootPane = new SplitPane() {
			{
				setOrientation(Orientation.VERTICAL);

				getItems().add(new Button("button"));
				getItems().add(new SplitPane() {
					{
						setOrientation(Orientation.HORIZONTAL);

						getItems().add(tFromTextArea);
						getItems().add(tToTextArea);
					}
				});
			}
		};

		final Scene tScene = new Scene(tRootPane);
		tScene.getStylesheets().add(App.class.getResource("app.css").toExternalForm());

		aStage.setScene(tScene);
		aStage.setTitle("サンプル");
		aStage.show();
	}
}
