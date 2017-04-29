/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fyp_management_system;

import java.io.Serializable;

/**
 *
 * @author M GHOUS
 */
public enum Esub implements Serializable
{
	Feedback,
	Meeting,
	Proposed_Idea,
        Project_Accepted,
        Project_Rejected,
	Recomendation, Update, InternalEvaluation, ExternalEvaluation;

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
