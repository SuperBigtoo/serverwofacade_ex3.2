/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serverwofacade;

/**
 *
 * @author sarun
 */
public class ScheduleServer {
    private static ScheduleServer singleton = null;
    private ScheduleServer() {}
    public static ScheduleServer getSingleton() {
        if (singleton == null) {
            singleton = new ScheduleServer();
        }
        return singleton;
    }
    
    public void startServer() {
        startBooting();
	readSystemConfigFile();
	init();
	initializeContext();
	initializeListeners();
	createSystemObjects();
    }
    
    public void shutdownServer() {
        releaseProcesses();
	destory();
	destroySystemObjects();
	destoryListeners();
	destoryContext();
	shutdown();
    }
    
    private void startBooting(){
	System.out.println("Starts booting...");
    }
    private void readSystemConfigFile(){
        System.out.println("Reading system config files...");
    }
    private void init(){
	System.out.println("Initializing...");
    }
    private void initializeContext(){
	System.out.println("Initializing context...");
    }
    private void initializeListeners(){
	System.out.println("Initializing listeners...");
    }
    private void createSystemObjects(){
        System.out.println("Creating system objects...");
    }
    private void releaseProcesses(){
        System.out.println("Releasing processes...");
    }
    private void destory(){
        System.out.println("Destorying...");
    }
    private void destroySystemObjects(){
	System.out.println("Destroying system objects...");
    }
    private void destoryListeners(){
        System.out.println("Destroying listeners...");
    }
    private void destoryContext(){
        System.out.println("Destroying context...");
    }
    private void shutdown(){
        System.out.println("Shutting down...");
    }
}
