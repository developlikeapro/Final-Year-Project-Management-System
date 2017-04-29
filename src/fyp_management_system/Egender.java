package fyp_management_system;

import java.io.Serializable;

public enum Egender implements Serializable
{
	Male,
	Female,
	Other;

	public static final int SIZE = java.lang.Integer.SIZE;

	public int getValue()
	{
		return this.ordinal();
	}

	public static Egender forValue(int value)
	{
		return values()[value];
	}
}