package server;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import jakarta.websocket.OnClose;
import jakarta.websocket.OnError;
import jakarta.websocket.OnMessage;
import jakarta.websocket.OnOpen;
import jakarta.websocket.Session;
import jakarta.websocket.server.ServerEndpoint;

import controllers.*;


@ServerEndpoint("/getfile")
public class MyWebSocket {
    private Queue<String> fileName = new LinkedList<>();
    private ArrayList<String> allFiles;
    
    
    
    @OnOpen
    public void onOpen(Session session) {

    	String keyword = session.getRequestParameterMap().get("keyword").get(0);
    	String directory = session.getRequestParameterMap().get("directory").get(0);
    	String phone = session.getRequestParameterMap().get("phone").get(0);
    	
        System.out.println("onOpen fired by:" + session.getId());
        this.allFiles = new GetFiles().getAllFiles(directory, keyword,session);
        System.out.println(allFiles);
        this.onMessage("null", session);
        if(!this.fileName.isEmpty()) {
        	new DataSourceController().saveHistory(directory, keyword, phone);
        }


    }
    
    @OnClose
    public void onClose(Session session) {
        System.out.println("onClose fired by:" +  session.getId());
    }
    
    @OnMessage
    public void onMessage(String message, Session session) {
    	
    	System.out.println("---------Inside Java----------");
        System.out.println("onMessage fired by:" + session.getId() + " fileName=" + message);

        
        try {
            session.getBasicRemote().sendText(message);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
    @OnError
    public void onError(Throwable t) {
        System.out.println("onError fired by:" + t.getMessage());
    }
}