/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author Siraphob.B
 */
public class ScheduleServer {
    private static ScheduleServer scheduleserverObj = null;
    private ScheduleServer() {}
        public static ScheduleServer getScheduleServerObject() {
            if (scheduleserverObj == null) {
                scheduleserverObj = new ScheduleServer();
            } 
            return scheduleserverObj;
        }
        public void startServer() {
            Starting obj = new Starting();
            obj.startBooting();
            obj.readSystemConfigFile();
            obj.init();
            obj.initializeContext();
            obj.initializeListeners();
            obj.createSystemObjects();
            System.out.println("Start working......");
        }
        public void stopServer() {
            Stopping obj = new Stopping();
            System.out.println("After work done.........");
            obj.releaseProcesses();
            obj.destory();
            obj.destroySystemObjects();
            obj.destoryListeners();
            obj.destoryContext();
            obj.shutdown();
        }
}
