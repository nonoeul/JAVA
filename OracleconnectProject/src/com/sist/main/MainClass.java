package com.sist.main;
import java.util.*;
import com.sist.dao.*;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpDAO dao = new EmpDAO();
		List<EmpVO> list = dao.empListData();
		for(EmpVO vo:list) {
			System.out.println(vo.getEmpno() + 
					" " + vo.getEname() 
					+ " " + vo.getJob() 
					+ " " + vo.getSal());
		}
	}

}
// 내용읇 변경한다음 ctrl + F11번을 누르면 그 전껄로 인식해 실행하기 때문에
// 파일이 맞더라도 오류가 발생할 수 있다. 
// Run as job applicaton으로 실행해서 새롭게 인식시켜줘야 한다. 
// 