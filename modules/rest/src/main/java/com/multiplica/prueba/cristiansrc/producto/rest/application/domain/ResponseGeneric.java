package com.multiplica.prueba.cristiansrc.producto.rest.application.domain;

public class ResponseGeneric {
	private Integer code = 200;
	private String detail = "";
	
	public Integer getCode() {
		return code;
	}
	
	public void setCode(Integer code) {
		this.code = code;
	}
	
	public String getDetail() {
		return detail;
	}
	
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	
}
