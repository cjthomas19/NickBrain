package util;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import math.Vec2;

public class MouseInput implements MouseListener {
	
	private boolean pressed;
	
	public MouseInput() {
		pressed = false;
	}
	
	public boolean isPressed() {
		return pressed;
	}
	
	public Vec2 getPosition() {
		Point p = MouseInfo.getPointerInfo().getLocation();
		return new Vec2(p.getX(),p.getY());
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		pressed = true;
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		pressed = false;
	}
}
