package org.jsp.controller;

import org.jsp.dao.MobileDao;
import org.jsp.dto.Mobile;
import org.jsp.dto.OS;

public class MobileController {

	public static void main(String[] args) {
    OS os = new OS();
	Mobile mobile = new Mobile();
	MobileDao dao = new MobileDao();
	mobile.setId(11);
	mobile.setBrand("mi");
	mobile.setPrice(16898.89);
	os.setId(61);
	os.setOs("android 11");
	os.setBit("32bit");
	mobile.setOs(os);
//	dao.update(mobile);
	dao.findById(10);
	dao.deleteByOSId(61);
//	dao.saveOS(os);
	}
}