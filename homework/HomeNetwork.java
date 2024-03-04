package com.ruby.java.homework;

import java.util.Random;

abstract class Switch {
	boolean status;
	public abstract void turnOn();
	public abstract void turnOff();
}
class SwitchOld extends Switch {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		super.status = true;
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		super.status = false;
	}
	@Override
	public String toString() {
		return "SwitchOld [status=" + status + "]";
	}
	
}
class SwitchRecent extends Switch {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		super.status = true;
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		super.status = false;
	}
	@Override
	public String toString() {
		return "SwitchRecent [status=" + status + "]";
	}
	
}
class SwitchDigital extends Switch {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		super.status = true;
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		super.status = false;
	}

	@Override
	public String toString() {
		return "SwitchDigital [status=" + status + "]";
	}
	
	
}
interface SensorLight {
	boolean isCondition();
}
class SwitchEnterance extends Switch implements SensorLight{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		super.status = true;
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		super.status = false;
	}

	@Override
	public boolean isCondition() {
		// TODO Auto-generated method stub
		Random rand = new Random();
		boolean check = rand.nextBoolean();
		return check;
	}

	@Override
	public String toString() {
		return "SwitchEnterance [status=" + status + "]";
	}
	
	
}
class SwitchVeranda extends Switch implements SensorLight{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		super.status = true;
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		super.status = false;
	}

	@Override
	public boolean isCondition() {
		// TODO Auto-generated method stub
		Random rand = new Random();
		boolean check = rand.nextBoolean();
		return check;
	}

	@Override
	public String toString() {
		return "SwitchVeranda [status=" + status + "]";
	}
	
}
