package Homework.LoginSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Homework.LoginSystem.define.Processor;
import Homework.LoginSystem.define.Request;
import Homework.LoginSystem.define.Response;


public class Login {
	public static List<Student> data = new ArrayList<Student>();
	public static Map<String,Processor> commandMap = new HashMap<String,Processor>();
	public final static Scanner input = new Scanner(System.in);
	public final static String DEFAULT_COMMAND = "M";
	
	

	public static void main(String[] args) {
		Processor processor = new Processor(
		new Request(){
			public boolean input() {
				return true;
			}
		},
		new Response(){
			public void render(Request request) {
				System.out.println("------���ѽ------");
				System.out.println("  ��Ϣ��ѯ�밴��A����");
				System.out.println("  ��Ϣ�Ǽ��밴��B����");
				System.out.println("  �����밴��C������");
				System.out.println("----------------");
			}
		});
		commandMap.put(DEFAULT_COMMAND, processor);
		processor.handle();
		while(input.hasNextLine()){
			String command = input.nextLine();
			Processor _p = commandMap.get(command.toUpperCase());
			if(_p!=null){
				_p.handle();
			}else{
				System.out.println("NO!��ȥ��");
				Processor _m = commandMap.get(DEFAULT_COMMAND);
				_m.handle();
			}
		}
	}
}
