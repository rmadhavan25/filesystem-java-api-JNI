package controllers;

import java.io.*;
import java.util.*;


import models.*;

public class GetFiles {

	
	
        ArrayList<HashMap<String,String>> files = new ArrayList<HashMap<String,String>>();
        ArrayList<String> columns = new ArrayList<String>();
        
        //loading the dynamic/shared library
        static {
    		System.loadLibrary("libnativeGetFiles");
    	}

        //constructor
        public GetFiles(){

        }
        
        //native method
        public native String getFiles(String path,String keyword);
        

        //method to call the native method to get the required files
        public DirectoryModel getAllFiles(String directoryPath, String keyword,String phone,boolean searchbtn){

            

                //---------getting all files----------------------------------------------------
                String[] filesList = getFiles(directoryPath,keyword).split(",");
                int flag = 0;//VARIABLE TO CHECK FOR ANY RESULTS AND TO TRIGGER saveHistory of HistoryController

                if(filesList.length>1){//checking if filesList is empty

                    for(int i = 1;i<filesList.length;i++){
                    		flag = 1;
                            
                            //-------------------adding the files to map-------------------------------------------------------
                            HashMap<String,String> fileInfo = new HashMap<String,String>();
                            String absolutePath = directoryPath+"/"+filesList[i];
                            fileInfo.put("name",absolutePath);

                            //------------------check if the result is directory or file----------------------------------
                            
                            if(!absolutePath.contains(".")){
                                fileInfo.put("type", "Folder");
                                files.add(fileInfo);
                            }
                            else{
                                fileInfo.put("type","File");
                                files.add(fileInfo);
                            }

                            
                            System.out.println(absolutePath);
                        }
//                    CHECK FOR ANY RESULTS AND TO TRIGGER saveHistory of HistoryController
                    if(searchbtn && flag == 1)
                    new DataSourceController().saveHistory(directoryPath, keyword, phone);

                }
                columns.add("ALL FILES");
                columns.add("TYPE");
                return new DirectoryModel(directoryPath,keyword,files,columns);
            }
            
        }

        
