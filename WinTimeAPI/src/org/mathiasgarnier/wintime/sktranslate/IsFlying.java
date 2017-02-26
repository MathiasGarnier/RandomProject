package org.mathiasgarnier.wintime.sktranslate;

import org.bukkit.entity.Player;

public class IsFlying {
	
	private Player p;
	private boolean isFlying;
	
	public IsFlying() {
		
		if (p.isFlying())
			isFlying = true;
		else
			isFlying = false;
	}
	

}
