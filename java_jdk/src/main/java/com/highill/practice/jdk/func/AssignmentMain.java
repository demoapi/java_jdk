package com.highill.practice.jdk.func;

public class AssignmentMain {

	public void assignment(Info info)
	{
		info = new Info();
		info.setInfoId(1000);
		info.setInfo("Info1000");
		System.out.println("----- assignment infoId=" + info.getInfoId() + ", info=" + info.getInfo());
	}

	public void assignment(int i)
	{
		i = 100;
		System.out.println("----- assignment int=" + i);
	}

	public static void main(String[] args)
	{
		System.out.println("\n\n\n----- ----- ----- test class type ----- ----- -----");
		Info info = new Info();
		info.setInfoId(2000);
		info.setInfo("Info2000");

		System.out.println("----- main infoId=" + info.getInfoId() + ", info=" + info.getInfo());

		AssignmentMain assignmentMain = new AssignmentMain();
		assignmentMain.assignment(info);
		System.out.println("---- main function infoId=" + info.getInfoId() + ", info=" + info.getInfo());

		System.out.println("\n\n\n----- ----- ---- test basic type ----- ----- -----");
		int i = 1;
		System.out.println("----- main i=" + i);

		assignmentMain.assignment(i);
		System.out.println("----- main function i=" + i);

	}

}
