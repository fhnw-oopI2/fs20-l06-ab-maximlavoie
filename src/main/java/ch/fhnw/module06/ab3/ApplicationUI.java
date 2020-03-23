package ch.fhnw.module06.ab3;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

public class ApplicationUI extends BorderPane {
	private Button topButton;
	private Button bottomButton;
	private Button leftButton;
	private Button rightButton;
	private TextArea textarea;

	public ApplicationUI() {
		initializeControls();
		layoutControls();
	}

	private void initializeControls() {
		topButton = new Button("top");
		bottomButton = new Button("bottom");
		leftButton = new Button("left");
		rightButton = new Button("right");
		textarea = new TextArea();

	}

	private void layoutControls() {
		setMargin(topButton, new Insets(5));
		setMargin(leftButton, new Insets(0,5,0,5));
		setMargin(rightButton,new Insets(0,5,0,5));
		setMargin(bottomButton,new Insets(5));

		topButton.setMaxWidth(Double.MAX_VALUE);
		bottomButton.setMaxWidth(Double.MAX_VALUE);
		
		setTop(topButton);
		setLeft(leftButton);
		setRight(rightButton);
		setCenter(textarea);
		setBottom(bottomButton);
		
	}

}
