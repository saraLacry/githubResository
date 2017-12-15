package com.lxit.crm.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxit.crm.entity.ClientResource;
import com.lxit.crm.entity.Goods;
import com.lxit.crm.entity.Indent;
import com.lxit.crm.entity.Indentgoods;
import com.lxit.crm.entity.Pager;
import com.lxit.crm.entity.StatisticsIndent;
import com.lxit.crm.entity.User;
import com.lxit.crm.service.CilentResourceService;
import com.lxit.crm.service.GoodsService;
import com.lxit.crm.service.IndentGoodsService;
import com.lxit.crm.service.IndentSerivce;
import com.whalin.MemCached.MemCachedClient;

@Component("myJobquartz")
@Controller
public class IndentController {
	@Autowired
	CilentResourceService cilentResourceService;
	@Autowired
	IndentSerivce indentSerivce;
	@Autowired
	IndentGoodsService indentGoodsService;
	@Autowired
	GoodsService goodsService;

	@RequestMapping("/replaceindent")
	public String replaceindent() {
		return "replaceindent";
	}

	@ResponseBody
	@RequestMapping("/getclientindent")
	public Map<String, Object> getclientindent(String way, String sousuo, int page, int rows, HttpSession session) {
		User u = (User) session.getAttribute("user");
		Object[] array = { way, sousuo, page, rows, u.getRole().getRoleName(), u.getUserId() };
		Pager<ClientResource> clientResourcelist = cilentResourceService.listClientResource(array);
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println("getclientindent======" + clientResourcelist.getData());
		map.put("total", clientResourcelist.getSumCount());
		map.put("rows", clientResourcelist.getData());
		return map;
	}

	@ResponseBody
	@RequestMapping("/getclientindent2")
	public Map<String, Object> getclientindent2(String sousuo_1, int page, int rows, HttpSession session) {
		User u = (User) session.getAttribute("user");
		Object[] array = { null, sousuo_1, page, rows, u.getRole().getRoleName(), u.getUserId() };
		System.out.println(array[0]);
		Map<String, Object> map = new HashMap<String, Object>();
		Pager<ClientResource> clientResourcelist = cilentResourceService.listClientResource2(array);
		System.out.println("getclientindent======" + clientResourcelist.getData());
		map.put("total", clientResourcelist.getSumCount());
		map.put("rows", clientResourcelist.getData());
		return map;
	}

	// 下单
	@RequestMapping("/indentmanage")
	public String indentmanage() {
		return "indentmanage";
	}

	// 查看详情
	@ResponseBody
	@RequestMapping("/details")
	public ClientResource details(int id, HttpSession session) {
		ClientResource clientResource = cilentResourceService.getClientResourceById(id);
		session.setAttribute("clientResource", clientResource);
		return clientResource;
	}

	// 查看详情
	@ResponseBody
	@RequestMapping("/details2")
	public ClientResource details2(int id, HttpSession session) {
		ClientResource clientResource = cilentResourceService.getClientResourceById2(id);
		System.out.println("details2=============" + clientResource);
		session.setAttribute("clientResource", clientResource);
		return clientResource;
	}

	// 订单查询
	@RequestMapping("/indentquery")
	public String indentquery() {
		return "indentquery";
	}

	// 订单信息列表
	@ResponseBody
	@RequestMapping("/indentquerytable")
	public Map<String, Object> indentquerytable(String like, String sousuo, String ddone, String ddTwo,
			String INDEN_TSTATE, int page, int rows) {
		System.out.println("===" + like);
		int pagetwo = (page - 1) * rows;
		Object[] array = { like, sousuo, ddone, ddTwo, INDEN_TSTATE, pagetwo, rows };
		Map<String, Object> map = new HashMap<String, Object>();
		Pager<Indent> Indentlist = indentSerivce.getIndentList(array);
		System.out.println("Indentlist======" + Indentlist.getData());
		map.put("total", Indentlist.getSumCount());
		map.put("rows", Indentlist.getData());
		return map;
	}

	// 订单信息列表查询订单信息
	@ResponseBody
	@RequestMapping("/queryindentxixi")
	public Map<String, Object> queryindentxixi(int id) {
		Indent indent = indentSerivce.getIndentById(id);
		System.out.println("queryindentxixi======" + indent);
		List<Indentgoods> indentgoodslist = indentGoodsService.getindentGoodsxixi(indent.getIndentNumber());
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("indent", indent);
		map.put("indentgoodslist", indentgoodslist);
		for (Indentgoods indentgoods : indentgoodslist) {
			System.out.println("商品西西===" + indentgoods);
		}
		return map;
	}

	@ResponseBody
	@RequestMapping("/addIndent")
	public Boolean addIndent(String pay, String delivery, String clientName, String workPhone, String adress,
			HttpSession session) {
		Indent indent = new Indent();
		/*
		 * String r = new Random().nextInt() + ""; int indentnumber =
		 * Integer.parseInt(r.substring(1));
		 */

		Random ran = new Random();
		String indentnumber = ran.nextDouble() + "";
		indentnumber = indentnumber.substring(3, 9);

		indent.setIndentNumber(indentnumber + "");
		ClientResource clientResource = (ClientResource) session.getAttribute("clientResource");
		indent.setClientresource(clientResource);
		User user = (User) session.getAttribute("user");
		indent.setUser(user);
		if (pay == "线上支付") {
			indent.setPaymentId(1);
		} else {
			indent.setPaymentId(2);
		}
		if (delivery == "邮寄") {
			indent.setIndentdelivery(1);
		} else {
			indent.setIndentdelivery(2);
		}
		String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		indent.setIndentTime(time);
		indent.setIndentState("72");
		// indent.setIndentAddess(indentAddess);
		System.out.println("+==" + clientResource);
		if (clientName != clientResource.getClientName() || workPhone != clientResource.getWorkPhone()
				|| adress != clientResource.getAdress()) {
			ClientResource client = new ClientResource();
			client.setClientCode(clientResource.getClientCode());
			client.setClientName(clientName);
			client.setWorkPhone(workPhone);
			client.setAdress(adress);
			int d = cilentResourceService.updateClientIndent(client);
		}
		int count = indentSerivce.insertIndent(indent);
		List<Goods> goods = (List<Goods>) session.getAttribute("indentgoodslist");
		for (Goods goods2 : goods) {
			int count22 = goodsService.updateGoods(goods2);
			Indentgoods indentgoods = new Indentgoods();
			indentgoods.setGoods(goods2);
			indentgoods.setIndent(indent);
			indentgoods.setIndentGoodsMoney(goods2.getGoodsMoney());
			indentgoods.setIndentGoodsNumber(goods2.getNumber());
			int countTwo = indentGoodsService.insertIndentgoods(indentgoods);
		}
		return true;
	}
	// 进入订单统计

	@RequestMapping("/indentstatistics")
	public String getindentstatistics() {
		return "indentstatistics";
	}

	@ResponseBody
	@RequestMapping("/getListstatistics")
	public Map<String, Object> getListstatistics(int page, int rows, String data1, String data2, HttpSession session) {
		User u = (User) session.getAttribute("user");
		Map<String, Object> map = new HashMap<String, Object>();
		Pager<StatisticsIndent> Indentlist = indentSerivce.getListstatistics(page, rows, data1, data2);
		map.put("total", Indentlist.getSumCount());
		map.put("rows", Indentlist.getData());
		return map;
	}

	public void test() {
		System.out.println("早上好！======" + new Date());
		JavaMailSenderImpl senderImpl = new JavaMailSenderImpl();
		// 设定mail server
		senderImpl.setHost("smtp.qq.com");
		senderImpl.setProtocol("smtp");
		senderImpl.setUsername("2804846047@qq.com");
		senderImpl.setPassword("xvaiusaiwladdchg");
		senderImpl.setPort(587);// 587/465
		senderImpl.setDefaultEncoding("UTF-8");
		// 建立邮件消息
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		List<ClientResource> list = cilentResourceService.getList();
		int count = 0;
		String[] array = new String[200];
		for (ClientResource clientResource : list) {
			if (clientResource.getClientType() == 38) {
				array[count] = clientResource.getEmail();
				count++;
			}
		}
		// 设置收件人，寄件人 用数组发送多个邮件
		// String[] array = new String[] {"979285136@qq.com"};
		mailMessage.setTo(array);
		mailMessage.setFrom("2452502042@qq.com");

		mailMessage.setSubject("对公司vip客户表达感谢");
		mailMessage.setText("非常感谢您对我公司的信任,来年我们将做的更好，为你提供更好的产品");
		Properties prop = new Properties();
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.timeout", "10000");
		senderImpl.setJavaMailProperties(prop);
		// 发送邮件
		senderImpl.send(mailMessage);
		System.out.println(" 邮件发送成功.. ");

	}
}
