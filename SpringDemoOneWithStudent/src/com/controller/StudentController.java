/*--------------------------------------Start Relationship in Hibernate MVC using Spring-----------------------------*/
package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.service.CourseService;
import com.service.StudentService;
import com.vo.CourseVo;
import com.vo.StudentVo;

@Controller
public class StudentController
{
	@Autowired
	StudentService studentService;
	
	@Autowired
	CourseService courseService;
		
	@RequestMapping("/redirect")
	protected ModelAndView redirect()
	{	
		ModelAndView modelAndView = new ModelAndView("insert-page");
		List list = courseService.getCourseList();
		modelAndView.addObject("courseList", list);
		return modelAndView;
	}

	@RequestMapping("/insertStudent")
	protected ModelAndView insertStudent(@ModelAttribute ("StudentVo") StudentVo studentVo, @ModelAttribute ("CourseVo") CourseVo courseVo)
	{
		
		
		
		studentVo.setCourseVo(courseVo);
		
		studentService.insertStudent(studentVo);
		
		return new ModelAndView("redirect:/viewStudent");
	}
	
	@RequestMapping("/viewStudent")
	protected ModelAndView viewStudent()
	{
		ModelAndView modelAndView = new ModelAndView("view-page");
		List list = new ArrayList();
		list = studentService.viewStudent();
		modelAndView.addObject("studentList", list);
		return modelAndView;
	}
	
	@RequestMapping("/editStudent/{a}")
	protected ModelAndView editStudent(@PathVariable ("a") String id)
	{
		ModelAndView modelAndView = new ModelAndView("edit-page");
		StudentVo studentVo = new StudentVo();
		studentVo.setStudentId(Long.parseLong(id));
		List list = studentService.editStudent(studentVo);
		List courseList = courseService.getCourseList();
		modelAndView.addObject("courseList", courseList);
		modelAndView.addObject("studentList",list);
		return modelAndView;
	}
	
	@RequestMapping("/updateStudent")
	protected ModelAndView updateStudent(@ModelAttribute ("StudentVo") StudentVo studentVo, @ModelAttribute ("CourseVo") CourseVo courseVo)
	{	
		studentVo.setCourseVo(courseVo);
		studentService.updateStudent(studentVo);
		return new ModelAndView("redirect:/viewStudent");
	}
	
	@RequestMapping("/courseList")
	protected ModelAndView courseList()
	{
		ModelAndView modelAndView = new ModelAndView("test-course");
		List list = courseService.getCourseList();
		modelAndView.addObject("courseList", list);
		return modelAndView;
	}
}
/*--------------------------------------End Relationship in Hibernate MVC using Spring-----------------------------*/

/*--------------------------------------------------Start Simple MVC demo using Spring-------------------------------------*/
/*package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.service.StudentService;
import com.service.StudentServiceImpl;
import com.vo.FirstVo;
import com.vo.StudentVo;

@Controller
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/redirect")
	protected ModelAndView redirect()
	{
		
		return new ModelAndView("insert-page");
	}
	@RequestMapping("/insertStudent")
	protected ModelAndView insertStudent(@ModelAttribute ("StudentVo") StudentVo studentVo)
	{
		 
		//-----------BI here------------------
		System.out.println("name---------->"+studentVo.getStudentName());
		System.out.println("city---------->"+studentVo.getStudentCity());
		System.out.println("mob no---------->"+studentVo.getStudentMob());
		
		studentService.insertStudent(studentVo);
		
		
		return new ModelAndView("redirect:/viewStudent");
	}
	
	@RequestMapping("/viewStudent")
	protected ModelAndView viewStudent()
	{
		ModelAndView modelAndView = new ModelAndView("view-page");
		List list = new ArrayList();
		list = studentService.viewStudent();
		modelAndView.addObject("studentList", list);
		return modelAndView;
	}
	
	@RequestMapping("/deleteStudent/{a}")
	protected ModelAndView deleteStudent(@PathVariable("a") String id)
	{
		StudentVo studentVo = new StudentVo();
		studentVo.setStudentId(Long.parseLong(id));
		System.out.println("delete--------->>id======="+studentVo.getStudentId());
		studentService.deleteStudent(studentVo);
		return new ModelAndView("redirect:/viewStudent");
	}
	
	@RequestMapping("/editStudent/{a}")
	protected ModelAndView editStudent(@PathVariable ("a") String id)
	{
		ModelAndView modelAndView = new ModelAndView("edit-page");
		StudentVo studentVo = new StudentVo();
		studentVo.setStudentId(Long.parseLong(id));
		List list = studentService.editStudent(studentVo);
		modelAndView.addObject("studentList",list);
		return modelAndView;
	}
	
	@RequestMapping("/updateStudent")
	protected ModelAndView updateStudent(@ModelAttribute ("StudentVo") StudentVo studentVo)
	{
		System.out.println("id--------------->"+studentVo.getStudentId());
		System.out.println("name---------->"+studentVo.getStudentName());
		System.out.println("city---------->"+studentVo.getStudentCity());
		System.out.println("mob------------>"+studentVo.getStudentMob());
		studentService.updateStudent(studentVo);
		return new ModelAndView("redirect:/viewStudent");
	}
	
	@RequestMapping("/detailofStudent/{a}")
	protected ModelAndView detailofStudent(@PathVariable ("a") String id)
	{
		ModelAndView  modelAndView = new ModelAndView("detail-page");
		StudentVo studentVo = new StudentVo();
		studentVo.setStudentId(Long.parseLong(id));
		List list = studentService.detailofStudent(studentVo);
		modelAndView.addObject("studentDetail", list);
		return modelAndView;
	}
}
*/
/*----------------------------------------------End Simple MVC demo using Spring-------------------------------------------*/



/*--------------------------------------Start Introduction Block---------------------------------------------------------*/

/*package com.controller;




import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vo.FirstVo;


public class FirstController extends AbstractController
{
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception
	{
		ModelAndView modelAndView = new ModelAndView("FirstPage");
		String string1="Hello This is First Demo Application for Spring";
		modelAndView.addObject("msg",string1);
		return modelAndView;
	}
}


@Controller
public class FirstController
{
	
	@RequestMapping("/welcome")
	protected ModelAndView first()
	{
		
		ModelAndView modelAndView = new ModelAndView("FirstPage");
		String string1="Hello This is First Demo Application for Spring";
		modelAndView.addObject("msg",string1);
		return modelAndView;
	}

	@RequestMapping("/profile")
	protected ModelAndView second()
	{
		ModelAndView modelAndView = new ModelAndView("ProfilePage");
		String string1="This is your Profile for First Demo Application for Spring";
		modelAndView.addObject("msg",string1);
		return modelAndView;
	}
	
	@RequestMapping("/welcome/{a}/{b}")
	protected ModelAndView first1( @PathVariable("a") String x, @PathVariable("b") String y)
	{
		
		
			ModelAndView modelAndView = new ModelAndView("FirstPage");
			String string1="Hello This is First Demo Application for Spring";
			modelAndView.addObject("msg",string1+" "+x+" "+y);
			return modelAndView;

	}
	
	@RequestMapping("/welcome/{a}")
	protected ModelAndView first(@PathVariable Map<String, String> x)
	{
		ModelAndView modelAndView = new ModelAndView("FirstPage");
		String string1="Hello This is First Demo Application for Spring";
		modelAndView.addObject("msg",string1+" "+x.get("a")+" ");
		return modelAndView;
	}
	
	@RequestMapping("/redirect")
	protected ModelAndView redirect( @ModelAttribute ("FirstVo") FirstVo firstVo)
	{
		
		
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		return modelAndView;
	}
	
	@RequestMapping("/hello")
	protected ModelAndView hello(@RequestParam("txtname") String name,@RequestParam("txtsurname") String surname)
	{
		ModelAndView modelAndView = new ModelAndView("ProfilePage");
		String string1="Hello";
		modelAndView.addObject("msg",string1+" "+name+" "+surname);
		
		return modelAndView;
	}
	

	@RequestMapping("/hello")
	protected ModelAndView hello(@RequestParam Map<String,String>n)
	{
		ModelAndView modelAndView = new ModelAndView("ProfilePage");
		String string1="Hello";
		modelAndView.addObject("msg",string1+" "+n.get("txtname")+" "+n.get("txtsurname"));
		return modelAndView;
	}
	
	
	@RequestMapping("/hello")
	protected ModelAndView hello(@Validated @ModelAttribute ("FirstVo") FirstVo firstVo,BindingResult bindingResult)
	{
		
		if (bindingResult.hasErrors()) {
	         return new ModelAndView("ProfilePage");
	      }
		
		ModelAndView modelAndView = new ModelAndView("ProfilePage");
		//String string1="Hello";
		modelAndView.addObject("msg",firstVo);
		return modelAndView;
	}
	
	
	
}
*/

/*--------------------------------------End Introduction Block---------------------------------------------------------*/

