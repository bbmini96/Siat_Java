package model;

public class Cafe {

	private String cafeName;
	private Menu[] menuList;
	
	public Cafe(String cafeName, Menu[] menuList) {
		super();
		this.cafeName = cafeName;
		this.menuList = menuList;
	}
	
	public String getCafeName() {
		return cafeName;
	}
	public void setCafeName(String cafeName) {
		this.cafeName = cafeName;
	}
	public Menu[] getMenuList() {
		return menuList;
	}
	public void setMenuList(Menu[] menuList) {
		this.menuList = menuList;
	}
	

	
}
