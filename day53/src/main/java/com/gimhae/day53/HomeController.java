package com.gimhae.day53;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.gimhae.day53.model.GuestDao;
import com.gimhae.day53.model.GuestVo;

@Controller
public class HomeController {
	@Autowired
	GuestDao guestDao;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("list", guestDao.list());
		return "index";
	}
	
	@GetMapping("/add")
	public void add() {}
	
	@PostMapping("/")
	public String add(String name,MultipartFile file,HttpServletRequest req ){
		String origin=file.getOriginalFilename();
		String newName=System.currentTimeMillis()+origin;
		GuestVo bean=GuestVo.builder()
							.name(name)
							.file(origin)
							.path(newName)
							.build();
		try {
			File upload=new File(req.getRealPath("./resources"));
			file.transferTo(upload);
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		
//		try (
//			FileOutputStream os = new FileOutputStream(upload+"/"+newName);
//			InputStream is=file.getInputStream();
//			){
//			int cnt=-1;
//			while((cnt=is.read())!=-1) {
//				os.write(cnt);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		guestDao.add(bean);
		return "redirect:./";
	}
}













