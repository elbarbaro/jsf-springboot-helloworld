package com.barbaro.springprimefaces.view.model;

import java.io.Serializable;

import javax.faces.view.ViewScoped;

import org.springframework.stereotype.Component;

import lombok.Getter;



@Getter
@Component
@ViewScoped
public class MessageMBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private final String content = "Hello, World JoinFaces";
}
