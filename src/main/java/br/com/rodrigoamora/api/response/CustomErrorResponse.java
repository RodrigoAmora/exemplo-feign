package br.com.rodrigoamora.api.response;

public class CustomErrorResponse {
	
    private int status;
    private String message;
    private String timestamp;

    //Constructor
    public CustomErrorResponse(int status, String message, String timestamp) {
        this.status = status;
        this.message = message;
        this.timestamp = timestamp;
    }

    //Getters
    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

     public String getTimestamp() {
        return timestamp;
    }
    
}
