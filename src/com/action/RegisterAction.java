package com.action;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.hibernate.service.ServiceRegistryBuilder;

import com.opensymphony.xwork2.ActionSupport;
import com.pojo.RegisterInfo;

public class RegisterAction extends ActionSupport{
	
	private String MacAdr;
	ServiceRegistryBuilder srb = new ServiceRegistryBuilder();
	
    Configuration config = null;  
    Session session = null;  
    Transaction transaction = null;
    
    private InputStream inputStream; //这个名字和struts.xml中对应，不能写错  
    
    public InputStream getInputStream() {  
        return inputStream;  
    }  
  
    public void setInputStream(InputStream inputStream) {  
        this.inputStream = inputStream;  
    }  
	public void insert_info() throws Exception
	{
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();  
		String PassWord;
		String PhoneNum;
		String s=null;
		String data="";
		try {
			BufferedReader  in = new BufferedReader (new InputStreamReader(ServletActionContext.getRequest().getInputStream(),"UTF-8"));
			while((s=in.readLine())!=null)
			{
				data += s;
			}
			//System.out.println("data:"+data);
			JSONObject json = JSONObject.fromObject(data);
			PhoneNum = (String)json.get("PN");
			PassWord = (String)json.get("PW");			
		
				
			System.out.println("11111");		
			System.out.println(PhoneNum+"+"+PassWord);		
			try{
				config = new Configuration();
				config.configure("/hibernate.cfg.xml");//一定要写，否则出现mapping exception
				SessionFactory sf = config.buildSessionFactory(new ServiceRegistryBuilder().buildServiceRegistry());			   
				session=sf.openSession();
				transaction=session.beginTransaction();
				
				System.out.println("1");
				List test = session.createQuery("from RegisterInfo c where c.password like :password")
						.setParameter("password",PassWord)
						.list();
				//use the class instead of table name;
				System.out.println("2");
				RegisterInfo t1 = (RegisterInfo)test.get(0);
				System.out.println(test.get(0).toString());
				System.out.println(t1.getBluetoothmac());
				MacAdr = t1.getBluetoothmac();
				int i = t1.getId();
				RegisterInfo t2 =(RegisterInfo)session.load(RegisterInfo.class,i);
				t2.setPhonenum(PhoneNum);
				session.update(t2);
				
				transaction.commit();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				session.close();
			}
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			out.println(MacAdr);
		}	catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
