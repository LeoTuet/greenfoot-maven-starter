package me.leotuet.actors;

import greenfoot.Actor;
import greenfoot.Greenfoot;

public class ILikeToMoveIt extends Actor {
	public void act() {
		move();
	}

	public void move() {
		if (Greenfoot.isKeyDown("up")) {
			this.setLocation(getX(), getY() - 1);
		}

		if (Greenfoot.isKeyDown("down")) {
			this.setLocation(getX(), getY() + 1);
		}

	}
}
