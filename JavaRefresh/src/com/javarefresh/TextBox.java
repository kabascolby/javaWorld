package com.javarefresh;

public class TextBox extends UIControl{
	public TextBox(boolean isEnabled) {
		super(isEnabled);
		System.out.println("TextBox");
	}

	public String text = "";

	public void setText(String text) {
		this.text = text;
	}

	public void clear() {
		text = "";
	}
	@Override
	public String toString() {
		return text;
	}
	@Override
	public void render() {
		System.out.println("render textbox");
	}
}
