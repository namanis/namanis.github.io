package br.com.alpi.olamundo.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;


@Action(value = "/ola", results = { @Result(name = "success", location = "/ola.jsp") })
public class OlaMundoAction {
private String name;

public String execute() throws Exception {
return "success";
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}
}