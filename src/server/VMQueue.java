package server;

import java.sql.SQLException;
import java.util.ArrayList;

import server.database.Database;

import model.Job;
import model.VirtualMachine;



public class VMQueue {
	
	private ArrayList<Job> jobs;
	private ArrayList<VirtualMachine> vms;
	private Database db;

  public VMQueue() {
  	Database.initialize();
  	try {
			db.startTransaction();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  	try {
			vms = (ArrayList<VirtualMachine>) db.getVirtualMachineDB().getAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  	jobs = null; 
  }



}
