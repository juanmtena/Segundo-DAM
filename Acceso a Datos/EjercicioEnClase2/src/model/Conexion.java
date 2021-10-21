package model;

public class Conexion {

	String host;
	String port;
	String dbName;
	String userName;
	String userPass;
	
	public Conexion(String host, String port, String dbName, String userName, String userPass) {
		
		this.host = host;
		this.port = port;
		this.dbName = dbName;
		this.userName = userName;
		this.userPass = userPass;
	}

	public Conexion() {
		this.host = "";
		this.port = "";
		this.dbName = "";
		this.userName = "";
		this.userPass = "";
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	@Override
	public String toString() {
		return "host = " + host + ", port = " + port + ", dbName = " + dbName + ", userName = " + userName
				+ ", userPass = " + userPass;
	}
	
}
