package com.java.project8;

public class OddThread extends Thread {
	public void run() {
		for(int i=0; i<=10;i++)
		{
			if(i%2!=0)
			{
				System.out.println("Odd numbers are " + i);
			}
		}
	}
}
