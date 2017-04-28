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
public class Cnotification {

    private String message;

    public final String getmessage() {
        return message;
    }

    public final void setmessage(String value) {
        message = value;
    }
    private Esub subject = Esub.values()[0];

    public final Esub getsubject() {
        return subject;
    }

    public final void setsubject(Esub value) {
        subject = value;
    }
    private Erole from;

    public final Erole getfrom() {
        return from;
    }

    public final void setfrom(Erole value) {
        from = value;
    }
    private Erole to;

    public final Erole getto() {
        return to;
    }

    public final void setto(Erole value) {
        to = value;
    }

    public Cnotification(String message, Esub subject, Erole from, Erole to) {
        this.setmessage(message);
        this.setsubject(subject);
        this.setfrom(from);
        this.setto(to);
    }

    public void printresomendation() {
        System.out.println(this.message);
    }

}
