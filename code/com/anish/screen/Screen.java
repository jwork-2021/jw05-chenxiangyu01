package com.anish.screen;

import java.awt.event.KeyEvent;
import java.io.IOException;

import asciiPanel.AsciiPanel;

public interface Screen{
    public void displayOutput(AsciiPanel terminal);

    public Screen respondToUserInput(KeyEvent key);

    
    public Screen A() throws IOException,ClassNotFoundException;
}
