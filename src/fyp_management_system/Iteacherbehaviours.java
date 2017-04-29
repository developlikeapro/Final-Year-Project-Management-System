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
public interface Iteacherbehaviours extends Serializable{
    void provide_recommendation(int studid);

    void view_project(int studid);
}
