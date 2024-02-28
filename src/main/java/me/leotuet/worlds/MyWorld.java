package me.leotuet.worlds;

// WARNING: This file is auto-generated and any changes to it will be overwritten
import greenfoot.World;
import me.leotuet.actors.ILikeToMoveIt;

/**
 * 
 */
public class MyWorld extends World {

	/**
	 * Constructor for objects of class MyWorld.
	 */
	public MyWorld() {
		super(600, 400, 1);

		var iLikeToMoveIt = new ILikeToMoveIt();
		addObject(iLikeToMoveIt, 300, 200);
	}
}
