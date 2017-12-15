package com.lxit.crm.controller;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxit.crm.entity.Compact;
import com.lxit.crm.entity.Dictionary;
import com.lxit.crm.entity.User;
import com.lxit.crm.service.CompactService;

/**
 * 合同管理
 * 
 * @author Administrator
 *
 */
@Controller
public class CompactController {
	@Autowired
	private CompactService compactService;
	private Map<String, Object> map;

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	// 进入合同管理
	@RequestMapping("/copactManage")
	public String compactManage(HttpSession session) {
		session.setAttribute("lx", compactType());
		session.setAttribute("zt", compactState());
		return "copactManage";
	}

	// 进入合同创建
	@RequestMapping("/compactCreate")
	public String compactCreate(HttpSession session, Compact compact) {
		session.setAttribute("lx", compactType());
		session.setAttribute("zt", compactState());
		return "compactCreate";
	}

	// 进入合同审核
	@RequestMapping("/compactAudit")
	public String compactAudit(HttpSession session) {
		session.setAttribute("lx", compactType());
		session.setAttribute("zt", compactState());
		return "compactAudit";
	}

	// 进入add
	@RequestMapping("/accessAdd")
	public String accessAdd(HttpSession session) {
		session.setAttribute("zt", compactType());
		session.setAttribute("compactUserCelect", userselect());
		return "compactAdd";
	}

	// 进行增加
	@RequestMapping("/CompactAdd")
	public String CompactAdd(Compact compact, Dictionary dictionary, HttpSession session) {
		// 将数据字典的对象放入
		compact.setCompactStatusId(dictionary);
		// 获得user对象
		User user = (User) session.getAttribute("user");
		// 将当当前登录的用户给拿出来放入实体属性内
		compact.setCompactCreateId(user.getUserId());

		compactService.CompactAdd(compact);
		return "homepage";
	}

	// 此注解标记这个方法是json格式
	@ResponseBody
	// 按条件把数据查询出来
	@RequestMapping("/compactselect")
	public Map<String, Object> compactselect(
			//分页条
			@RequestParam(defaultValue = "6", value = "rows") int rows,
			//分页页
			@RequestParam(defaultValue = "1", value = "page") int page,
			//合同对象
			Compact compact,
			//输入的内容
			@RequestParam( value = "name") String name,
			//输入的类型
			@RequestParam( value = "compactType") int compactType,
			//输入的状态
			@RequestParam( value = "compactState") int compactState
			) {
         //new 2个词典对象进行保存数据
		 Dictionary dictionaryType= new Dictionary();
		 Dictionary dictionaryState= new Dictionary();
		 System.out.println(compactType+"------>"+compactState);
		 dictionaryType.setDectionarycodingId(compactType);
		 dictionaryState.setDectionarycodingId(compactState);
		 compact.setCompactTypeId(dictionaryType);
		 compact.setCompactStatusId(dictionaryState);
		 compact.setCompactName(name);
		// 将数据保存到map集合内进行返回
		map = new HashMap<String, Object>();
		// 页数
		int compactPage = (page - 1) * rows;
		System.out.println("当前页数：" + compactPage + "当前条数：" + rows);
		// 将所有页数和条数放入compact对象内一起传入过去
		// 页数
		compact.setCompactPage(compactPage);
		// 条数
		compact.setCompactIndex(rows);

		// 查询出数据
		List<Compact> list = compactService.compactselect(compact);
		// 查询出一共多少条
		int count = compactService.compactCount(compact);

		System.out.println(list);
		map.put("total", count);
		map.put("rows", list);
		return map;
	}
	// 按条件把数据查询出来

	// 此注解标记这个方法是json格式
	@ResponseBody
	// 进行状态的改变

	@RequestMapping("/compactUpdateState")
	public boolean compactUpdateState(Compact compact, Dictionary dictionary, int compactid, HttpSession session) {
		// 获得user对象
		// User user = (User) session.getAttribute("user");

		compact.setCompactId(compactid);
		if (compactService.selectSubmit(compact)) {
			dictionary.setDectionarycodingId(11);
			compact.setCompactStatusId(dictionary);
			compactService.compactUpdateState(compact);
			return true;
		}
		return false;
	}

	// 将状态查询出来进行操作
	public List<Dictionary> compactState() {

		return compactService.compactState();
	}

	// 将类型查询出来进行操作
	public List<Dictionary> compactType() {

		return compactService.compactType();
	}

	// 将所有用户查询出来
	public List<User> userselect() {

		return compactService.userselect();

	}

	// 判断是否是是审核人
	public boolean compactAuditor(int id) {
		return compactService.selectri(id);
	}

	// 信息执行
	@RequestMapping("/xxcompactexecution")
	public String xxcompactexecution(int id, HttpSession sesion) {
		sesion.setAttribute("select", selectId(id));
		sesion.setAttribute("compactUserCelect", userselect());
		return "compactExecution";
	}

	// 进行状态的改变执行
	@RequestMapping("/compactexecution")
	public String compactexecution(Compact compact, Dictionary dictionary, HttpSession session) {

		Compact celect = (Compact) session.getAttribute("select");
		compact.setCompactId(celect.getCompactId());
		System.out.println("1233211234567");
		// compact.setCompactId(compactid);
		dictionary.setDectionarycodingId(14);
		compact.setCompactStatusId(dictionary);

		System.out.println(compactService.compactUpdateState(compact));

		return "homepage";

	}

	// 返回到主页
	@RequestMapping("/compactRe")
	public String compactRe() {
		return "homepage";
	}

	// 跳转到修改页面
	@RequestMapping("/skipUpdatre")
	public String skipUpdatre(int id, HttpSession sesion) {
		System.out.println("skipUpdatre===>>" + id);
		sesion.setAttribute("select", selectId(id));
		sesion.setAttribute("compactUserCelect", userselect());
		return "compactUpdate";
	}

	// 进行修改操作
	@RequestMapping("/update")
	public String update(Compact compact, Dictionary dictionary, HttpSession session) {
		Compact celect = (Compact) session.getAttribute("select");
		compact.setCompactId(celect.getCompactId());
		System.out.println(dictionary.getDectionarycodingId());
		// 将数据字典的对象放入
		compact.setCompactTypeId(dictionary);
		System.out.println(compact);
		System.out.println(compact.getCompactTypeId().getDectionarycodingId());
		System.out.println(compactService.CompactUpdate(compact));
		return "homepage";
	}

	// 按照id查询出他的数据进行 操作
	public Compact selectId(int id) {
		return compactService.selectId(id);
	}

	// 查看详细信息新建
	@RequestMapping("/xxxx")
	public String xxxx(int id, HttpSession sesion) {
		sesion.setAttribute("compactUserCelect", userselect());
		sesion.setAttribute("select", selectId(id));
		return "compactCreateSelect";
	}

	// 信息审核
	@RequestMapping("/xxsh")
	public String xxsh(int id, HttpSession sesion) {
		sesion.setAttribute("select", selectId(id));
		sesion.setAttribute("compactUserCelect", userselect());
		return "compactExamine";
	}

	// 审核信息
	@RequestMapping("/shks")
	public String shks(String text, int id, HttpSession sesion) {
		try {
			text = new String(text.getBytes("iso-8859-1"), "utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Compact compact = new Compact();
		Dictionary di = new Dictionary();
		Compact celect = (Compact) sesion.getAttribute("select");
		di.setDectionarycodingId(id);
		compact.setCompactStatusId(di);
		compact.setCompactOpinion(text);
		compact.setCompactId(celect.getCompactId());
		compactService.shks(compact);
		return "homepage";
	}

	// 变更进入
	@RequestMapping("/compactgxxx")
	public String compactgxxx(int id, HttpSession sesion) {
		sesion.setAttribute("select", selectId(id));
		sesion.setAttribute("compactUserCelect", userselect());
		return "compactUpdateChange";
	}

	// 变更开始
	@RequestMapping("/compactgkaishi")
	public String compactgkais(Compact compact, Dictionary dictionary, HttpSession session) {
		Compact celect = (Compact) session.getAttribute("select");
		compact.setCompactId(celect.getCompactId());
		System.out.println("1233211234567");
		// compact.setCompactId(compactid);
		dictionary.setDectionarycodingId(16);
		compact.setCompactStatusId(dictionary);
		System.out.println(compactService.compactgkais(compact));
		return "homepage";
	}

	// 转让
	@RequestMapping("/compactassignment")
	public String compactassignment(int id, HttpSession sesion) {
		sesion.setAttribute("select", selectId(id));
		sesion.setAttribute("compactUserCelect", userselect());
		return "compactAssignment";
	}

	// 解除
	@RequestMapping("/compactremove")
	public String compactremove(int id, HttpSession sesion) {
		sesion.setAttribute("select", selectId(id));
		sesion.setAttribute("compactUserCelect", userselect());
		return "compactRemove";
	}

	// 转让
	@RequestMapping("/compactassignmentk")
	public String compactassignmentk(Compact compact, Dictionary dictionary, HttpSession session) {
		Compact celect = (Compact) session.getAttribute("select");
		compact.setCompactId(celect.getCompactId());
		System.out.println("1233211234567");
		// compact.setCompactId(compactid);
		dictionary.setDectionarycodingId(15);
		compact.setCompactStatusId(dictionary);
		System.out.println(compactService.compactassignmentk(compact));
		return "homepage";
	}

	// 解除
	@RequestMapping("/compactremovek")
	public String compactremovekss(Compact compact, Dictionary dictionary, HttpSession session) {
		Compact celect = (Compact) session.getAttribute("select");
		compact.setCompactId(celect.getCompactId());
		System.out.println("1233211234567");
		// compact.setCompactId(compactid);
		dictionary.setDectionarycodingId(17);
		compact.setCompactStatusId(dictionary);
		System.out.println(compactService.compactremovekss(compact));
		return "homepage";
	}

	// 此注解标记这个方法是json格式
	@ResponseBody
	// 判断状态
	@RequestMapping("/compactrcompactjudge")
	public boolean compactrcompactjudge(int id, int compactId) {
		// TODO Auto-generated method stub
		System.out.println("进入");
		System.out.println(id+"====="+compactId);
		System.out.println(compactService.compactrcompactjudge(id, compactId));
		return compactService.compactrcompactjudge(id, compactId);
	}
	// 此注解标记这个方法是json格式
	@ResponseBody
	// 判断是否是处理人
	@RequestMapping("/userSelectJudge")
	public boolean userSelectJudge( int compactId,HttpSession session) {
		// TODO Auto-generated method stub
		System.out.println("进入");
		// 获得user对象
		User user = (User) session.getAttribute("user");	
		System.out.println(compactService.userSelectJudge(user.getUserId(), compactId));
		return compactService.userSelectJudge(user.getUserId(), compactId);
	}
	
	
	
	// 此注解标记这个方法是json格式 审核
		@ResponseBody
		// 按条件把数据查询出来
		@RequestMapping("/compactselectshh")
		public Map<String, Object> compactselectshh(
				//分页条
				@RequestParam(defaultValue = "6", value = "rows") int rows,
				//分页页
				@RequestParam(defaultValue = "1", value = "page") int page,
				//合同对象
				Compact compact,
				//输入的内容
				@RequestParam( value = "name") String name,
				//输入的类型
				@RequestParam( value = "compactType") int compactType,
				//输入的状态
				@RequestParam( value = "compactState") int compactState
				) {
			System.out.println("compactselectshh");
	         //new 2个词典对象进行保存数据
			 Dictionary dictionaryType= new Dictionary();
			 Dictionary dictionaryState= new Dictionary();
			 System.out.println(compactType+"------>"+compactState);
			 dictionaryType.setDectionarycodingId(compactType);
			 dictionaryState.setDectionarycodingId(compactState);
			 compact.setCompactTypeId(dictionaryType);
			 compact.setCompactStatusId(dictionaryState);
			 compact.setCompactName(name);
			// 将数据保存到map集合内进行返回
			map = new HashMap<String, Object>();
			// 页数
			int compactPage = (page - 1) * rows;
			System.out.println("当前页数：" + compactPage + "当前条数：" + rows);
			// 将所有页数和条数放入compact对象内一起传入过去
			// 页数
			compact.setCompactPage(compactPage);
			// 条数
			compact.setCompactIndex(rows);

			// 查询出数据
			List<Compact> list = compactService.compactselectshh(compact);
			// 查询出一共多少条
			int count = compactService.compactCountshh(compact);

			System.out.println(list);
			map.put("total", count);
			map.put("rows", list);
			return map;
		}
		
		
		// 此注解标记这个方法是json格式
		@ResponseBody
		// 按条件把数据查询出来  管理
		@RequestMapping("/compactselectgl")
		public Map<String, Object> compactselectgl(
		
				//分页条
				@RequestParam(defaultValue = "6", value = "rows") int rows,
				//分页页
				@RequestParam(defaultValue = "1", value = "page") int page,
				//合同对象
				Compact compact,
				//输入的内容
				@RequestParam( value = "name") String name,
				//输入的类型
				@RequestParam( value = "compactType") int compactType,
				//输入的状态
				@RequestParam( value = "compactState") int compactState
				) {
			System.out.println("compactselectguanli");
	         //new 2个词典对象进行保存数据
			 Dictionary dictionaryType= new Dictionary();
			 Dictionary dictionaryState= new Dictionary();
			 System.out.println(compactType+"------>"+compactState);
			 dictionaryType.setDectionarycodingId(compactType);
			 dictionaryState.setDectionarycodingId(compactState);
			 compact.setCompactTypeId(dictionaryType);
			 compact.setCompactStatusId(dictionaryState);
			 compact.setCompactName(name);
			// 将数据保存到map集合内进行返回
			map = new HashMap<String, Object>();
			// 页数
			int compactPage = (page - 1) * rows;
			System.out.println("当前页数：" + compactPage + "当前条数：" + rows);
			// 将所有页数和条数放入compact对象内一起传入过去
			// 页数
			compact.setCompactPage(compactPage);
			// 条数
			compact.setCompactIndex(rows);

			// 查询出数据
			List<Compact> list = compactService.compactselectguanli(compact);
			// 查询出一共多少条
			int count = compactService.compactCountguanli(compact);

			System.out.println(list);
			map.put("total", count);
			map.put("rows", list);
			return map;
		}

}
