package Homework.LoginSystem.define;

import Homework.LoginSystem.Login;
//¥¶¿Ì
public class Processor {
	private Request request;
	private Response response;

	public Processor (Request request,Response response){
		this.request = request;
		this.response = response;
	}
	
	public void handle(){
		if(request.input()){
			response.render(request);
		}else{
			Login.commandMap.get(Login.DEFAULT_COMMAND).handle();
		}
	}

}
