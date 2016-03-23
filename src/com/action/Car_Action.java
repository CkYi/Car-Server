package com.action;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

import com.opensymphony.xwork2.ActionSupport;
import com.pojo.Car_Parameter;

public class Car_Action extends ActionSupport {

	private Connection con = null;
	private Statement st = null;
	JSONObject json = null;
	private Car_Parameter parameter = null;

	private String Result = new String("regular");
	private Boolean DEBUG = false;
	ServiceRegistryBuilder srb = new ServiceRegistryBuilder();

	Configuration config = null;
	Session session = null;
	Transaction transaction = null;

	public void insert_info() {
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");

		String s = null;
		String data = "";

		try {
			BufferedReader in = new BufferedReader(
					new InputStreamReader(ServletActionContext.getRequest()
							.getInputStream(), "UTF-8"));
			while ((s = in.readLine()) != null) {
				data += s;
			}
			System.out.println("data:" + data);

			json = JSONObject.fromObject(data);
			System.out.println("lalala");
			parameter = new Car_Parameter();

			// String phonenum = (String) json.get("PN");
			parameter.setPhonenum("123");

			// 2016/1/30/20:09
			int count = 0;

			String btaddr = (String) json.get("BTaddr");
			parameter.setBtaddr(btaddr);
			if (DEBUG) {
				System.out.println(count++);
			}

			String oil_situation = (String) json.get("03");
			double oil_situation_1 = Integer.parseInt(oil_situation, 16);
			parameter.setOil_situation(oil_situation_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String calculate_load = (String) json.get("04");
			double calculate_load_1 = Integer.parseInt(calculate_load, 16) * 100 / 255;
			parameter.setCalculate_load(calculate_load_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String coolant = (String) json.get("05");
			double cl = Integer.parseInt(coolant, 16) - 40;
			parameter.setCoolant(cl);
			if (DEBUG) {
				System.out.println(count++);
			}

			String short_oil_update_1 = (String) json.get("06");
			double short_oil_update_1_1 = (Integer.parseInt(short_oil_update_1,
					16) - 128) * 100 / 128;
			parameter.setShort_oil_update_1(short_oil_update_1_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String long_oil_update_1 = (String) json.get("07");
			double long_oil_update_1_1 = (Integer.parseInt(long_oil_update_1,
					16) - 128) * 100 / 128;
			parameter.setLong_oil_update_1(long_oil_update_1_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String short_oil_update_2 = (String) json.get("08");
			double short_oil_update_2_1 = (Integer.parseInt(short_oil_update_2,
					16) - 128) * 100 / 128;
			parameter.setShort_oil_update_2(short_oil_update_2_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String long_oil_update_2 = (String) json.get("09");
			double long_oil_update_2_1 = (Integer.parseInt(long_oil_update_2,
					16) - 128) * 100 / 128;
			parameter.setShort_oil_update_2(long_oil_update_2_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String oil_press = (String) json.get("0A");
			double oil_press_1 = Integer.parseInt(oil_press, 16) * 3;
			parameter.setOil_press(oil_press_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String tank_value = (String) json.get("0B");
			double tv = Integer.parseInt(tank_value, 16);
			parameter.setTank_value(tv);
			if (DEBUG) {
				System.out.println(count++);
			}

			String rpm = (String) json.get("0C");
			double rm = Integer.parseInt(rpm, 16) / 4;
			parameter.setRpm(rm);
			if (DEBUG) {
				System.out.println(count++);
			}

			String speed = (String) json.get("0D");
			double spd = Integer.parseInt(speed, 16);
			parameter.setSpeed(spd);
			if (DEBUG) {
				System.out.println(count++);
			}

			String ignition = (String) json.get("0E");
			double ignition_1 = (Integer.parseInt(ignition, 16) - 128) / 2;
			parameter.setIgnition(ignition_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String oiltank_air_temp = (String) json.get("0F");
			double oiltank_air_temp_1 = Integer.parseInt(oiltank_air_temp, 16) - 40;
			parameter.setOiltank_air_temp(oiltank_air_temp_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String air_speed = (String) json.get("10");
			double air_s = Integer.parseInt(air_speed, 16) / 100;
			parameter.setAir_speed(air_s);
			if (DEBUG) {
				System.out.println(count++);
			}

			String throttle = (String) json.get("11");
			double throttle_1 = Integer.parseInt(throttle, 16) * 100 / 255;
			parameter.setThrottle(throttle_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String second_air = (String) json.get("12");
			double second_air_1 = Integer.parseInt(second_air, 16);
			parameter.setSecond_air(second_air_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String oxygen_sensor = (String) json.get("13");
			double oxygen_sensor_1 = Integer.parseInt(oxygen_sensor, 16);
			parameter.setOxygen_sensor(oxygen_sensor_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String oxygen_sensor_volt1_channel1 = (String) json.get("14");
			double osv = Integer.parseInt(oxygen_sensor_volt1_channel1, 16) / 128;
			parameter.setOxygen_sensor_volt1_channel1(osv);
			if (DEBUG) {
				System.out.println(count++);
			}

			String oxygen_sensor_volt2_channel1 = (String) json.get("15");
			double oxygen_sensor_volt2_channel1_1 = Integer.parseInt(
					oxygen_sensor_volt2_channel1, 16);
			parameter
					.setOxygen_sensor_volt2_channel1(oxygen_sensor_volt2_channel1_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String oxygen_sensor_volt3_channel1 = (String) json.get("16");
			double oxygen_sensor_volt3_channel1_1 = Integer.parseInt(
					oxygen_sensor_volt3_channel1, 16);
			parameter
					.setOxygen_sensor_volt3_channel1(oxygen_sensor_volt3_channel1_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String oxygen_sensor_volt4_channel1 = (String) json.get("17");
			double oxygen_sensor_volt4_channel1_1 = Integer.parseInt(
					oxygen_sensor_volt4_channel1, 16);
			parameter
					.setOxygen_sensor_volt4_channel1(oxygen_sensor_volt4_channel1_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String oxygen_sensor_volt1_channel2 = (String) json.get("18");
			double oxygen_sensor_volt1_channel2_1 = Integer.parseInt(
					oxygen_sensor_volt1_channel2, 16);
			parameter
					.setOxygen_sensor_volt1_channel2(oxygen_sensor_volt1_channel2_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String oxygen_sensor_volt2_channel2 = (String) json.get("19");
			double oxygen_sensor_volt2_channel2_1 = Integer.parseInt(
					oxygen_sensor_volt2_channel2, 16);
			parameter
					.setOxygen_sensor_volt2_channel2(oxygen_sensor_volt2_channel2_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String oxygen_sensor_volt3_channel2 = (String) json.get("1A");
			double oxygen_sensor_volt3_channel2_1 = Integer.parseInt(
					oxygen_sensor_volt3_channel2, 16);
			parameter
					.setOxygen_sensor_volt3_channel2(oxygen_sensor_volt3_channel2_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String oxygen_sensor_volt4_channel2 = (String) json.get("1B");
			double oxygen_sensor_volt4_channel2_1 = Integer.parseInt(
					oxygen_sensor_volt4_channel2, 16);
			parameter
					.setOxygen_sensor_volt4_channel2(oxygen_sensor_volt4_channel2_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String en_startruntime = (String) json.get("1F");
			double en_startruntime_1 = Integer.parseInt(en_startruntime, 16);
			parameter.setEn_startruntime(en_startruntime_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String oil_pressure_manifold = (String) json.get("22");
			double oil_pressure_manifold_1 = Integer.parseInt(
					oil_pressure_manifold, 16) * 0.079;
			parameter.setOil_pressure_manifold(oil_pressure_manifold_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String oil_pressure_sprinkle = (String) json.get("23");
			double oil_pressure_sprinkle_1 = Integer.parseInt(
					oil_pressure_sprinkle, 16) * 10;
			parameter.setOil_pressure_sprinkle(oil_pressure_sprinkle_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String oil_lvl = (String) json.get("2F");
			double oil_lvl_1 = Integer.parseInt(oil_lvl, 16) * 100 / 255;
			parameter.setOil_lvl(oil_lvl_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String steam_press = (String) json.get("32");
			double steam_press_1 = Integer.parseInt(steam_press, 16) / 4;
			parameter.setSteam_press(steam_press_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String pressure = (String) json.get("33");
			double pressure_1 = Integer.parseInt(pressure, 16);
			parameter.setPressure(pressure_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String catalyzer_channel1_sensor1 = (String) json.get("3C");
			double catalyzer_channel1_sensor1_1 = Integer.parseInt(
					catalyzer_channel1_sensor1, 16) / 10 - 40;
			parameter
					.setCatalyzer_channel1_sensor1(catalyzer_channel1_sensor1_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String catalyzer_channel2_sensor1 = (String) json.get("3D");
			double catalyzer_channel2_sensor1_1 = Integer.parseInt(
					catalyzer_channel2_sensor1, 16) / 10 - 40;
			parameter
					.setCatalyzer_channel2_sensor1(catalyzer_channel2_sensor1_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String catalyzer_channel1_sensor2 = (String) json.get("3E");
			double catalyzer_channel1_sensor2_1 = Integer.parseInt(
					catalyzer_channel1_sensor2, 16) / 10 - 40;
			parameter
					.setCatalyzer_channel1_sensor2(catalyzer_channel1_sensor2_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String catalyzer_channel2_sensor2 = (String) json.get("3F");
			double catalyzer_channel2_sensor2_1 = Integer.parseInt(
					catalyzer_channel2_sensor2, 16) / 10 - 40;
			parameter
					.setCatalyzer_channel2_sensor2(catalyzer_channel2_sensor2_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String ctrl_module_voltage = (String) json.get("42");
			double ctrl_module_voltage_1 = Integer.parseInt(
					ctrl_module_voltage, 16) / 1000;
			parameter.setCtrl_module_voltage(ctrl_module_voltage_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String abs_load = (String) json.get("43");
			double abs_load_1 = Integer.parseInt(abs_load, 16) * 100 / 255;
			parameter.setAbs_load(abs_load_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String relative_throttle = (String) json.get("45");
			double relative_throttle_1 = Integer
					.parseInt(relative_throttle, 16) * 100 / 255;
			parameter.setRelative_throttle(relative_throttle_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String envi_oidtank_press = (String) json.get("46");
			double envi_oidtank_press_1 = Integer.parseInt(envi_oidtank_press,
					16) - 40;
			parameter.setEnvi_oidtank_press(envi_oidtank_press_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String absolute_throttle_B = (String) json.get("47");
			double absolute_throttle_B_1 = Integer.parseInt(
					absolute_throttle_B, 16) * 100 / 255;
			parameter.setAbsolute_throttle_B(absolute_throttle_B_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String absolute_throttle_A = (String) json.get("48");
			double absolute_throttle_A_1 = Integer.parseInt(
					absolute_throttle_A, 16) * 100 / 255;
			parameter.setAbsolute_throttle_A(absolute_throttle_A_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String accelarate_D = (String) json.get("49");
			double accelarate_D_1 = Integer.parseInt(accelarate_D, 16) * 100 / 255;
			parameter.setAccelarate_D(accelarate_D_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String accelarate_E = (String) json.get("4A");
			double accelarate_E_1 = Integer.parseInt(accelarate_E, 16) * 100 / 255;
			parameter.setAccelarate_E(accelarate_E_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String accelarate_F = (String) json.get("4B");
			double accelarate_F_1 = Integer.parseInt(accelarate_F, 16) * 100 / 255;
			parameter.setAccelarate_F(accelarate_F_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String throttle_control = (String) json.get("4C");
			double throttle_control_1 = Integer.parseInt(throttle_control, 16) * 100 / 255;
			parameter.setThrottle_control(throttle_control_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String ethanol_percent = (String) json.get("52");
			double ethanol_percent_1 = Integer.parseInt(ethanol_percent, 16) * 100 / 255;
			parameter.setEthanol_percent(ethanol_percent_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String absolute_oil_pressure = (String) json.get("59");
			double absolute_oil_pressure_1 = Integer
					.parseInt(absolute_oil_pressure) * 10;
			parameter.setAbsolute_oil_pressure(absolute_oil_pressure_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String relative_acc_position = (String) json.get("5A");
			double relative_acc_position_1 = Integer.parseInt(
					relative_acc_position, 16) * 100 / 255;
			parameter.setRelative_acc_position(relative_acc_position_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String en_oil_temp = (String) json.get("5C");
			double en_oil_temp_1 = Integer.parseInt(en_oil_temp, 16) - 40;
			parameter.setEn_oil_temp(en_oil_temp_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String oil_cos = (String) json.get("5E");
			double oil_cos_1 = Integer.parseInt(oil_cos, 16) * 0.05;
			parameter.setOil_cos(oil_cos_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String require_torque = (String) json.get("61");
			double require_torque_1 = Integer.parseInt(require_torque, 16) - 125;
			parameter.setRequire_torque(require_torque_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String practical_torque = (String) json.get("62");
			double practical_torque_1 = Integer.parseInt(practical_torque, 16) - 125;
			parameter.setPractical_torque(practical_torque_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			String refer_torque = (String) json.get("63");
			double refer_torque_1 = Integer.parseInt(refer_torque, 16);
			parameter.setRefer_torque(refer_torque_1);
			if (DEBUG) {
				System.out.println(count++);
			}

			parameter.setStatus(false);

			System.out.println("lalala");
			String time = null;
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			Date date = new Date();
			try {
				time = sdf.format(date);
				date = sdf.parse(time);
				parameter.setDate(date);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(parameter.getAir_speed() + ","
					+ parameter.getCoolant() + "," + parameter.getRpm() + ","
					+ "," + parameter.getSpeed() + parameter.getDate() + ","
					+ parameter.getStatus());

			try {
				config = new Configuration();
				config.configure("/hibernate.cfg.xml");// 一定要写，否则出现mapping
														// exception
				SessionFactory sf = config
						.buildSessionFactory(new ServiceRegistryBuilder()
								.buildServiceRegistry());
				session = sf.openSession();
				transaction = session.beginTransaction();
				session.persist(parameter);
				transaction.commit();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				transaction.rollback();
				e.printStackTrace();
			} finally {
				session.close();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch blockc
			e.printStackTrace();
		}

		// response.setCharacterEncoding("utf-8");
		// PrintWriter pw=null;
		// try {
		// pw = response.getWriter();
		// pw.write(Result);
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// pw.flush();
		// pw.close();
	}
}
