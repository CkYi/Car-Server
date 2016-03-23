package com.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//2016/1/30/20:09
@Entity
@Table(name = "parameter_table")
public class Car_Parameter {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	// 56
	@Temporal(TemporalType.DATE)
	@Column(name = "date")
	private Date date;// 日期

	@Column(name = "btaddr")
	private String btaddr;// 日期

	@Column(name = "phonenum")
	private String phonenum;

	@Column(name = "status")
	private boolean status; // 汽车状态是否正常

	@Column(name = "oil_situation")
	private double oil_situation = 0;

	@Column(name = "calculate_load")
	private double calculate_load = 0;

	@Column(name = "coolant")
	private double coolant = 0;// 冷却液温度

	@Column(name = "short_oil_update_1")
	private double short_oil_update_1 = 0;

	@Column(name = "long_oil_update_1")
	private double long_oil_update_1 = 0;

	@Column(name = "short_oil_update_2")
	private double short_oil_update_2 = 0;

	@Column(name = "long_oil_update_2")
	private double long_oil_update_2 = 0;

	@Column(name = "oil_press")
	private double oil_press = 0;

	@Column(name = "tank_value")
	private double tank_value = 0;// 油箱压力值

	@Column(name = "rpm")
	private double rpm = 0;// 引擎转速

	@Column(name = "speed")
	private double speed = 0;// 车速

	@Column(name = "ignition")
	private double ignition = 0;

	@Column(name = "oiltank_air_temp")
	private double oiltank_air_temp = 0;

	@Column(name = "air_speed")
	private double air_speed = 0;// MAF空气流量速率

	@Column(name = "throttle")
	private double throttle = 0;

	@Column(name = "second_air")
	private double second_air = 0;

	@Column(name = "oxygen_sensor")
	private double oxygen_sensor = 0;

	@Column(name = "oxygen_sensor_volt1_channel1")
	private double oxygen_sensor_volt1_channel1 = 0;// 通道1氧传感器电压1

	@Column(name = "oxygen_sensor_volt2_channel1")
	private double oxygen_sensor_volt2_channel1 = 0;

	@Column(name = "oxygen_sensor_volt3_channel1")
	private double oxygen_sensor_volt3_channel1 = 0;

	@Column(name = "oxygen_sensor_volt4_channel1")
	private double oxygen_sensor_volt4_channel1 = 0;

	@Column(name = "oxygen_sensor_volt1_channel2")
	private double oxygen_sensor_volt1_channel2 = 0;

	@Column(name = "oxygen_sensor_volt2_channel2")
	private double oxygen_sensor_volt2_channel2 = 0;

	@Column(name = "oxygen_sensor_volt3_channel2")
	private double oxygen_sensor_volt3_channel2 = 0;

	@Column(name = "oxygen_sensor_volt4_channel2")
	private double oxygen_sensor_volt4_channel2 = 0;

	@Column(name = "en_startruntime")
	private double en_startruntime = 0;

	@Column(name = "oil_pressure_manifold")
	private double oil_pressure_manifold = 0;

	@Column(name = "oil_pressure_sprinkle")
	private double oil_pressure_sprinkle = 0;

	@Column(name = "oil_lvl")
	private double oil_lvl = 0;

	@Column(name = "steam_press")
	private double steam_press = 0;

	@Column(name = "pressure")
	private double pressure = 0;

	@Column(name = "catalyzer_channel1_sensor1")
	private double catalyzer_channel1_sensor1 = 0;

	@Column(name = "catalyzer_channel2_sensor1")
	private double catalyzer_channel2_sensor1 = 0;

	@Column(name = "catalyzer_channel1_sensor2")
	private double catalyzer_channel1_sensor2 = 0;

	@Column(name = "catalyzer_channel2_sensor2")
	private double catalyzer_channel2_sensor2 = 0;

	@Column(name = "ctrl_module_voltage")
	private double ctrl_module_voltage = 0;

	@Column(name = "abs_load")
	private double abs_load = 0;

	@Column(name = "equivalent")
	private double equivalent = 0;

	@Column(name = "relative_throttle")
	private double relative_throttle = 0;

	@Column(name = "envi_oidtank_press")
	private double envi_oidtank_press = 0;

	@Column(name = "absolute_throttle_B")
	private double absolute_throttle_B = 0;

	@Column(name = "absolute_throttle_A")
	private double absolute_throttle_A = 0;

	@Column(name = "accelarate_D")
	private double accelarate_D = 0;

	@Column(name = "accelarate_E")
	private double accelarate_E = 0;

	@Column(name = "accelarate_F")
	private double accelarate_F = 0;

	@Column(name = "throttle_control")
	private double throttle_control = 0;

	@Column(name = "ethanol_percent")
	private double ethanol_percent = 0;

	@Column(name = "absolute_oil_pressure")
	private double absolute_oil_pressure = 0;

	@Column(name = "relative_acc_position")
	private double relative_acc_position = 0;

	@Column(name = "en_oil_temp ")
	private double en_oil_temp = 0;

	@Column(name = "oil_cos")
	private double oil_cos = 0;

	@Column(name = "require_torque")
	private double require_torque = 0;

	@Column(name = "practical_torque")
	private double practical_torque = 0;

	@Column(name = "refer_torque")
	private double refer_torque = 0;

	// 2016/1/30/15:01 zhengrenjie

	public double getCalculate_load() {
		return calculate_load;
	}

	public void setCalculate_load(double calculate_load) {
		this.calculate_load = calculate_load;
	}

	public double getOil_press() {
		return oil_press;
	}

	public void setOil_press(double oil_press) {
		this.oil_press = oil_press;
	}

	public double getOiltank_air_temp() {
		return oiltank_air_temp;
	}

	public void setOiltank_air_temp(double oiltank_air_temp) {
		this.oiltank_air_temp = oiltank_air_temp;
	}

	public double getEn_startruntime() {
		return en_startruntime;
	}

	public void setEn_startruntime(double en_startruntime) {
		this.en_startruntime = en_startruntime;
	}

	public double getOil_lvl() {
		return oil_lvl;
	}

	public void setOil_lvl(double oil_lvl) {
		this.oil_lvl = oil_lvl;
	}

	public double getSteam_press() {
		return steam_press;
	}

	public void setSteam_press(double steam_press) {
		this.steam_press = steam_press;
	}

	public double getCtrl_module_voltage() {
		return ctrl_module_voltage;
	}

	public void setCtrl_module_voltage(double ctrl_module_voltage) {
		this.ctrl_module_voltage = ctrl_module_voltage;
	}

	public double getAbs_load() {
		return abs_load;
	}

	public void setAbs_load(double abs_load) {
		this.abs_load = abs_load;
	}

	public double getEnvi_oidtank_press() {
		return envi_oidtank_press;
	}

	public void setEnvi_oidtank_press(double envi_oidtank_press) {
		this.envi_oidtank_press = envi_oidtank_press;
	}

	public double getEn_oil_temp() {
		return en_oil_temp;
	}

	public void setEn_oil_temp(double en_oil_temp) {
		this.en_oil_temp = en_oil_temp;
	}

	public double getOil_cos() {
		return oil_cos;
	}

	public void setOil_cos(double oil_cos) {
		this.oil_cos = oil_cos;
	}

	public double getOil_situation() {
		return oil_situation;
	}

	public void setOil_situation(double oil_situation) {
		this.oil_situation = oil_situation;
	}

	public double getShort_oil_update_1() {
		return short_oil_update_1;
	}

	public void setShort_oil_update_1(double short_oil_update_1) {
		this.short_oil_update_1 = short_oil_update_1;
	}

	public double getLong_oil_update_1() {
		return long_oil_update_1;
	}

	public void setLong_oil_update_1(double long_oil_update_1) {
		this.long_oil_update_1 = long_oil_update_1;
	}

	public double getShort_oil_update_2() {
		return short_oil_update_2;
	}

	public void setShort_oil_update_2(double short_oil_update_2) {
		this.short_oil_update_2 = short_oil_update_2;
	}

	public double getLong_oil_update_2() {
		return long_oil_update_2;
	}

	public void setLong_oil_update_2(double long_oil_update_2) {
		this.long_oil_update_2 = long_oil_update_2;
	}

	public double getIgnition() {
		return ignition;
	}

	public void setIgnition(double ignition) {
		this.ignition = ignition;
	}

	public double getThrottle() {
		return throttle;
	}

	public void setThrottle(double throttle) {
		this.throttle = throttle;
	}

	public double getSecond_air() {
		return second_air;
	}

	public void setSecond_air(double second_air) {
		this.second_air = second_air;
	}

	public double getOxygen_sensor() {
		return oxygen_sensor;
	}

	public void setOxygen_sensor(double oxygen_sensor) {
		this.oxygen_sensor = oxygen_sensor;
	}

	public double getOxygen_sensor_volt2_channel1() {
		return oxygen_sensor_volt2_channel1;
	}

	public void setOxygen_sensor_volt2_channel1(
			double oxygen_sensor_volt2_channel1) {
		this.oxygen_sensor_volt2_channel1 = oxygen_sensor_volt2_channel1;
	}

	public double getOxygen_sensor_volt3_channel1() {
		return oxygen_sensor_volt3_channel1;
	}

	public void setOxygen_sensor_volt3_channel1(
			double oxygen_sensor_volt3_channel1) {
		this.oxygen_sensor_volt3_channel1 = oxygen_sensor_volt3_channel1;
	}

	public double getOxygen_sensor_volt4_channel1() {
		return oxygen_sensor_volt4_channel1;
	}

	public void setOxygen_sensor_volt4_channel1(
			double oxygen_sensor_volt4_channel1) {
		this.oxygen_sensor_volt4_channel1 = oxygen_sensor_volt4_channel1;
	}

	public double getOxygen_sensor_volt1_channel2() {
		return oxygen_sensor_volt1_channel2;
	}

	public void setOxygen_sensor_volt1_channel2(
			double oxygen_sensor_volt1_channel2) {
		this.oxygen_sensor_volt1_channel2 = oxygen_sensor_volt1_channel2;
	}

	public double getOxygen_sensor_volt2_channel2() {
		return oxygen_sensor_volt2_channel2;
	}

	public void setOxygen_sensor_volt2_channel2(
			double oxygen_sensor_volt2_channel2) {
		this.oxygen_sensor_volt2_channel2 = oxygen_sensor_volt2_channel2;
	}

	public double getOxygen_sensor_volt3_channel2() {
		return oxygen_sensor_volt3_channel2;
	}

	public void setOxygen_sensor_volt3_channel2(
			double oxygen_sensor_volt3_channel2) {
		this.oxygen_sensor_volt3_channel2 = oxygen_sensor_volt3_channel2;
	}

	public double getOxygen_sensor_volt4_channel2() {
		return oxygen_sensor_volt4_channel2;
	}

	public void setOxygen_sensor_volt4_channel2(
			double oxygen_sensor_volt4_channel2) {
		this.oxygen_sensor_volt4_channel2 = oxygen_sensor_volt4_channel2;
	}

	public double getOil_pressure_manifold() {
		return oil_pressure_manifold;
	}

	public void setOil_pressure_manifold(double oil_pressure_manifold) {
		this.oil_pressure_manifold = oil_pressure_manifold;
	}

	public double getOil_pressure_sprinkle() {
		return oil_pressure_sprinkle;
	}

	public void setOil_pressure_sprinkle(double oil_pressure_sprinkle) {
		this.oil_pressure_sprinkle = oil_pressure_sprinkle;
	}

	public double getPressure() {
		return pressure;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
	}

	public double getCatalyzer_channel1_sensor1() {
		return catalyzer_channel1_sensor1;
	}

	public void setCatalyzer_channel1_sensor1(double catalyzer_channel1_sensor1) {
		this.catalyzer_channel1_sensor1 = catalyzer_channel1_sensor1;
	}

	public double getCatalyzer_channel2_sensor1() {
		return catalyzer_channel2_sensor1;
	}

	public void setCatalyzer_channel2_sensor1(double catalyzer_channel2_sensor1) {
		this.catalyzer_channel2_sensor1 = catalyzer_channel2_sensor1;
	}

	public double getCatalyzer_channel1_sensor2() {
		return catalyzer_channel1_sensor2;
	}

	public void setCatalyzer_channel1_sensor2(double catalyzer_channel1_sensor2) {
		this.catalyzer_channel1_sensor2 = catalyzer_channel1_sensor2;
	}

	public double getCatalyzer_channel2_sensor2() {
		return catalyzer_channel2_sensor2;
	}

	public void setCatalyzer_channel2_sensor2(double catalyzer_channel2_sensor2) {
		this.catalyzer_channel2_sensor2 = catalyzer_channel2_sensor2;
	}

	public double getEquivalent() {
		return equivalent;
	}

	public void setEquivalent(double equivalent) {
		this.equivalent = equivalent;
	}

	public double getRelative_throttle() {
		return relative_throttle;
	}

	public void setRelative_throttle(double relative_throttle) {
		this.relative_throttle = relative_throttle;
	}

	public double getAbsolute_throttle_B() {
		return absolute_throttle_B;
	}

	public void setAbsolute_throttle_B(double absolute_throttle_B) {
		this.absolute_throttle_B = absolute_throttle_B;
	}

	public double getAbsolute_throttle_A() {
		return absolute_throttle_A;
	}

	public void setAbsolute_throttle_A(double absolute_throttle_A) {
		this.absolute_throttle_A = absolute_throttle_A;
	}

	public double getAccelarate_D() {
		return accelarate_D;
	}

	public void setAccelarate_D(double accelarate_D) {
		this.accelarate_D = accelarate_D;
	}

	public double getAccelarate_E() {
		return accelarate_E;
	}

	public void setAccelarate_E(double accelarate_E) {
		this.accelarate_E = accelarate_E;
	}

	public double getAccelarate_F() {
		return accelarate_F;
	}

	public void setAccelarate_F(double accelarate_F) {
		this.accelarate_F = accelarate_F;
	}

	public double getThrottle_control() {
		return throttle_control;
	}

	public void setThrottle_control(double throttle_control) {
		this.throttle_control = throttle_control;
	}

	public double getEthanol_percent() {
		return ethanol_percent;
	}

	public void setEthanol_percent(double ethanol_percent) {
		this.ethanol_percent = ethanol_percent;
	}

	public double getAbsolute_oil_pressure() {
		return absolute_oil_pressure;
	}

	public void setAbsolute_oil_pressure(double absolute_oil_pressure) {
		this.absolute_oil_pressure = absolute_oil_pressure;
	}

	public double getRelative_acc_position() {
		return relative_acc_position;
	}

	public void setRelative_acc_position(double relative_acc_position) {
		this.relative_acc_position = relative_acc_position;
	}

	public double getRequire_torque() {
		return require_torque;
	}

	public void setRequire_torque(double require_torque) {
		this.require_torque = require_torque;
	}

	public double getPractical_torque() {
		return practical_torque;
	}

	public void setPractical_torque(double practical_torque) {
		this.practical_torque = practical_torque;
	}

	public double getRefer_torque() {
		return refer_torque;
	}

	public void setRefer_torque(double refer_torque) {
		this.refer_torque = refer_torque;
	}

	public String getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getCoolant() {
		return coolant;
	}

	public void setCoolant(double coolant) {
		this.coolant = coolant;
	}

	public double getTank_value() {
		return tank_value;
	}

	public void setTank_value(double tank_value) {
		this.tank_value = tank_value;
	}

	public double getRpm() {
		return rpm;
	}

	public void setRpm(double rpm) {
		this.rpm = rpm;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getAir_speed() {
		return air_speed;
	}

	public void setAir_speed(double air_speed) {
		this.air_speed = air_speed;
	}

	public double getOxygen_sensor_volt1_channel1() {
		return oxygen_sensor_volt1_channel1;
	}

	public void setOxygen_sensor_volt1_channel1(
			double oxygen_sensor_volt1_channel1) {
		this.oxygen_sensor_volt1_channel1 = oxygen_sensor_volt1_channel1;
	}

	public String getBtaddr() {
		return btaddr;
	}

	public void setBtaddr(String btaddr) {
		this.btaddr = btaddr;
	}

}
