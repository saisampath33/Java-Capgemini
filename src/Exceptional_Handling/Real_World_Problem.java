package Exceptional_Handling;

import java.util.*;
import java.io.*;
public class Real_World_Problem{
    public static void main(String[] args){
        String filePath = "error.txt";
        try {
            new FileWriter(filePath, false).close();   // overwrite mode clears file
        } catch(IOException e) {
            System.out.println("An I/O error occurred.");
        }
        LogWriter writer = new LogWriter(filePath);
        writer.logError(new ErrorLog("NULL_POINTER", "Null value encountered", "2024-10-01 12:30"));
        writer.logError(new ErrorLog("IO_EXCEPTION", "File not found", "2024-10-01 13:15"));
        writer.logError(new ErrorLog("ARITHMETIC_EXCEPTION", "Divide by zero", "2024-10-02 09:45"));


        LogAnalyzer analyzer = new LogAnalyzer(filePath);

        System.out.println("All Error Logs:");
        analyzer.readAllLogs();

        System.out.println("\nLogs of type: IO_EXCEPTION");
        analyzer.filterLogsByType("IO_EXCEPTION");

        System.out.println("\nError Frequency:");
        analyzer.countErrorFrequency();
    }
}
class ErrorLog{
    String errorType;
    String errorMessage;
    String timestamp;

    ErrorLog(String errorType,String errorMessage,String timestamp){
        this.errorType = errorType;
        this.errorMessage = errorMessage;
        this.timestamp = timestamp;
    }
    public String toString(){
        return errorType+","+errorMessage+","+timestamp;
    }
}

class LogWriter{
    String logFilePath;
    LogWriter(String logFilePath){
        this.logFilePath = logFilePath;
    }
    // void logError(String errorType,String message,String timestamp){
    //     try(FileWriter fw = new FileWriter(logFilePath,true)){
    //         fw.write(errorType+","+message+","+timestamp+"\n");
    //     }catch(IOException e){
    //         System.out.println("An I/O error occured.");
    //     }
    // }
    void logError(ErrorLog log) {
    try (FileWriter fw = new FileWriter(logFilePath, true)) {
        fw.write(log.toString() + "\n");
    } catch (IOException e) {
        System.out.println("An I/O error occurred.");
    }
    }

}
class LogAnalyzer {
    String logFilePath;
    LogAnalyzer(String logFilePath){
        this.logFilePath = logFilePath;
    }
    void readAllLogs(){
          try (BufferedReader br = new BufferedReader(new FileReader(logFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An I/O error occurred.");
        }
    }
    void filterLogsByType(String Type){
        try(BufferedReader br = new BufferedReader(new FileReader(logFilePath))){
            String line;
            while((line = br.readLine())!=null){
                String[] str = line.split(",");
                if(str[0].equals(Type)){
                    System.out.println(line);
                }
            }
        }catch(IOException e){
            System.out.println("An error occured");
        }
    }

    void countErrorFrequency(){
        HashMap<String,Integer> mpp = new HashMap<>();
        try(BufferedReader br = new BufferedReader(new FileReader(logFilePath))){
            String line;
            while((line = br.readLine())!=null){
                String type = line.split(",")[0];
                mpp.put(type,mpp.getOrDefault(type,0)+1);
            }
        }catch(IOException e){
            System.out.println("An error occured");
        }
        for(Map.Entry<String,Integer> entry : mpp.entrySet()){
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}
