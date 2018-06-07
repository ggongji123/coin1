package mms.member.controller;

import java.util.Scanner;

import mms.member.action.Action;

public class FrontController {
	
	public void processRequest(Action ac, Scanner sc) {
		ac.execute(sc); //자식어떤것이 담겨있느냐에 따라 다른것이 실행됌.
	}
}
