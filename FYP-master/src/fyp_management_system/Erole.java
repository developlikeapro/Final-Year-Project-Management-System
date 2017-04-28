package fyp_management_system;


import java.util.*;

public enum Erole
{
	Student,
	Advisor,
	Internal,
	External;

	public static final int SIZE = java.lang.Integer.SIZE;

	public int getValue()
	{
		return this.ordinal();
	}

	public static Erole forValue(int value)
	{
		return values()[value];
	}
}