package day17.coffee;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	// 싱글톤 패턴 : 객체를 하나만 만든다 
	private static Menu instance = new Menu();
	private List<MenuItem> items;
	
	public static Menu getInstance() {
		return instance;
	}
	private Menu() {
		items = new ArrayList<MenuItem>(); 
		items.add(new MenuItem("아메리카노", 1500));
		items.add(new MenuItem("카페모카", 2000));
		items.add(new MenuItem("자몽허니블랙티", 2500));
		items.add(new MenuItem("바닐라라떼", 2500));
		items.add(new MenuItem("아인슈페너", 3000));
		items.add(new MenuItem("콜드브루", 3000));
	}
	public MenuItem choose(String menuName) {
		for(MenuItem menuitem : items) {
			if(menuitem.getName().equals(menuName)) {
				return menuitem;
			}
		}
		return null;
	} 

}
