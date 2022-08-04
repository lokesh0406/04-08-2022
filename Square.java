package com.abstractt.shape;

public  class Square extends Rectangle
{
		
	public  Square()
	{
		
	}
	
	public Square( double side)
	{
		length=side;
		width=side;
	}
	public Square( double side, String color, boolean filled)
	{
		//super(color,filled);
		length=side;
		width=side;
		this.color = color;
		this.filled = filled;
	}

	public double getSide()
{
		return length;
	}

	public void setSide(double side)
	{
		this.length = side;
	}

	@Override
	public String toString() {
		return "Square [side=" + length + ", width=" + width + ", length=" + length + ", color=" + color + ", filled="
				+ filled + "]";
	}
	
}
