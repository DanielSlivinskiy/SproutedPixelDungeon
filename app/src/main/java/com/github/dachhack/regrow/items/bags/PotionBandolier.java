package com.github.dachhack.regrow.items.bags;

import com.github.dachhack.regrow.items.Item;
import com.github.dachhack.regrow.items.food.BlueMilk;
import com.github.dachhack.regrow.items.food.DeathCap;
import com.github.dachhack.regrow.items.food.Earthstar;
import com.github.dachhack.regrow.items.food.GoldenJelly;
import com.github.dachhack.regrow.items.food.JackOLantern;
import com.github.dachhack.regrow.items.food.PixieParasol;
import com.github.dachhack.regrow.items.potions.Potion;
import com.github.dachhack.regrow.sprites.ItemSpriteSheet;

/**
 * Created by debenhame on 05/02/2015.
 */
public class PotionBandolier extends Bag {

	{
		name = "potion bandolier";
		image = ItemSpriteSheet.BANDOLIER;

		size = 20;
	}

	@Override
	public boolean grab(Item item) {
		return item instanceof Potion 
				|| item instanceof BlueMilk
				|| item instanceof DeathCap
				|| item instanceof Earthstar
				|| item instanceof GoldenJelly
				|| item instanceof JackOLantern
				|| item instanceof PixieParasol;
	}

	@Override
	public int price() {
		return 50;
	}

	@Override
	public String info() {
		return "This thick bandolier fits around your chest like a sash, it has many small vials to hold your potions.\n\n"
				+ "The vials are made of tempered glass, and should be quite resistant to the cold.\n\n"
				+ "There's also a big jar attached for holding mushrooms. Very nice!";
	}
}
