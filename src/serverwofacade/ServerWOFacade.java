/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serverwofacade;

import facade.ScheduleServer;

public class ServerWOFacade {
    public static void main(String[] args) {
        ScheduleServer obj = ScheduleServer.getScheduleServerObject();
        obj.startServer();
        obj.stopServer();
    }
    
}
