package org.child;

import org.base.ParentBase;
import org.openqa.selenium.WebElement;

public class Child	extends ParentBase {
	public static void main(String[] args) {
		ParentBase p=new ParentBase();
		p.getDriver("chrome");
		p.launchUrl("http://demo.guru99.com/test/drag_drop.html");
		WebElement src = p.findBy("id", "fourth");
		WebElement dsc = p.findBy("id", "amt7");
		p.dragAndDrop(src, dsc);
		
		
	}

}
