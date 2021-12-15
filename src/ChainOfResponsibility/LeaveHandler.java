/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ChainOfResponsibility;

/**
 *
 * @author hp
 */
public abstract class LeaveHandler {
    protected LeaveHandler superVisor;

    public void setSuperVisor(LeaveHandler superVisor) {
        this.superVisor = superVisor;
    }

    public abstract String applyLeave(Leave leave);
}
