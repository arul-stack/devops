package com.example;
import static org.junit.Asset.assetEquals;
import org.junit.Before;
import org.junit.Test;
public class maintest1
	{
		private main1 main;
	}
public void setUp()
	{
		main=new main1();	
	}
public void testGreet()
	{
		assertEquals("Hello ,Jenkins !",main.greet());
	}