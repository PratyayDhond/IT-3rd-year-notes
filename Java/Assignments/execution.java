package com.company.finalEXE;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class execution extends Applet implements MouseListener, MouseMotionListener {
    String status = "";
    public void init(){
        setLayout(null);
        setBackground(Color.decode("#FFFDD0"));
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    public void paint(Graphics g){
        g.drawString(status, 20, 20);
    }

    public void mouseEntered(MouseEvent e) {
        status = "Mouse Entered";
        repaint();
    }

    public void mouseExited(MouseEvent e) {
        status = "Mouse Exited";
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }



    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}

/*
<applet code="execution.class" width="600" height="600">
</applet>
 */