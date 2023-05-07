package org.system;

public class Desktop extends Computer {
	public void desktopsize() {
		System.out.println("16.0*9.0");
	}

	public static void main(String[] args) {
		Desktop call=new Desktop();
		call.ComputerModel();
		call.desktopsize();		
		}
}
