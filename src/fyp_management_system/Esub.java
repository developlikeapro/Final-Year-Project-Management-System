/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fyp_management_system;

/**
 *
 * @author M GHOUS
 */
public enum Esub
{
	Feedback,
	Meeting,
	Proposed_Idea,
        Project_Accepted,
        Project_Rejected,
	Recomendation, Update;

	public static final int SIZE = java.lang.Integer.SIZE;

	public int getValue()
	{
		return this.ordinal();
	}

	public static Esub forValue(int value)
	{
		return values()[value];
	}
}
