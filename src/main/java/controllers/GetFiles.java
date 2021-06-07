package controllers;


import java.util.*;
import server.MyWebSocket;
import jakarta.websocket.Session;



public class GetFiles {

	Queue<String> files = new LinkedList<>();
	Session user;
	private String keyword;
	private String directory;
	
	
	static {
    	System.loadLibrary("libnativeGetFiles");
    }
	
	
    public GetFiles(){
    	
    }
    
    
    public native void getFiles(String directory,String keyword);
    
    public void addFile(String fn) {
    	if(directory.endsWith("/")) {
    		fn = directory + fn;
    	}
    	else {
    		fn = directory + "/" + fn;
    	}
    	if(fn.contains(".")) {
    		fn = fn + "," + "File";
    	}
    	else {
    		fn = fn + "," + "Folder";
    	}
    	this.files.add(fn);
    	new MyWebSocket().onMessage(fn,user);
    	
    }
    
    public Queue<String> getAllFiles(String directory,String keyword,Session session) {
    	this.directory = directory;
    	this.keyword = keyword;
    	user = session;
    	getFiles(directory,keyword);
    	return files;
    }
    
            
  }




        
