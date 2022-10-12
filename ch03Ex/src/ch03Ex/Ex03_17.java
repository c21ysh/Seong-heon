package ch03Ex;

public class Ex03_17 {

	public static void main(String[] args) {
		int x,y,z;
		int absX, absY, absZ;
		char signX, signY, signZ;
		
		x = 10;
		y = -5;
		z = 0;
		
		absX = x >= 0 ? x:-x;
		absY = y >= 0 ? y:-y;
		absZ = z >= 0 ? z:-z;
		
		signX = x > 0 ? '+' : (x==0 ? ' ' : '-');
		signY = y > 0 ? '+' : (y==0 ? ' ' : '-');
		signZ = z > 0 ? '+' : (z==0 ? ' ' : '-');
		
		System.out.println("signX : " + signX + "absX : " + absX);
		System.out.println("signY : " + signY + "absY : " + absY);
		System.out.println("signZ : " + signZ + "absZ : " + absZ);
	}

}
