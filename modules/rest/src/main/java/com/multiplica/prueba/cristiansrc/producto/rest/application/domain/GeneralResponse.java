package com.multiplica.prueba.cristiansrc.producto.rest.application.domain;

import java.io.Serializable;


public class GeneralResponse<T> implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private T data;
	private ResponseGeneric responseInfo = new ResponseGeneric();

    public GeneralResponse() {
    }

    public T getData() {
        return this.data;
    }

    public void setData(final T data) {
        this.data = data;
    }
    
    public ResponseGeneric getResponseInfo() {
    	return this.responseInfo;
    }
    
    public void setResponseInfo(final ResponseGeneric error) {
    	this.responseInfo = error;
    }
}
