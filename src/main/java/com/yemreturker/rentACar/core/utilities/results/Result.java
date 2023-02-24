package com.yemreturker.rentACar.core.utilities.results;

import lombok.Getter;

@Getter
public class Result {
    private  boolean Success;
    private  String Message;
    public  Result(boolean success) {
        this.Success = success;
    }
    public  Result(boolean success, String message) {
        this(success);
        this.Message = message;
    }
}