package server;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import server.database.Database;

import model.Job;
import model.NamedPipeStream;
import model.VMQueueTime;
import model.VirtualMachine;



public class VMQueue {
	
	private ArrayList<Queue<Job>> jobs;
	private ArrayList<VirtualMachine> vms;
	private ArrayList<VMQueueTime> queueTimes;
	
	private Database db;
	
	private int jobNumber;

  public VMQueue() {
  	Database.initialize();
  	jobNumber = 0;
  	db = new Database("prod");
  	try {
			db.startTransaction();
			vms = (ArrayList<VirtualMachine>) db.getVirtualMachineDB().getAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  	jobs = new ArrayList<Queue<Job>>();
  	for (int i = 0; i < vms.size(); i++) {
  		jobs.set(i, new LinkedList<Job>());
  	}
  }

  
  public void sendSocketStream(String message, String hostIP) {
  	
  }
  
  public boolean isAvailable(int id) throws SQLException {
  	// Query database where id
  	db.startTransaction();
  	boolean result = db.getVirtualMachineDB().getVMAvailable(id);
  	db.endTransaction(true);
  	return result;
  }
  
  public boolean isInQueue(int id) throws SQLException {
  	db.startTransaction();
  	boolean result = db.getVirtualMachineDB().getInQueue(id);
  	db.endTransaction(true);
  	return result;
  }
  
  /**
   * Adds a job to the appropriate queue
   * @param job
   * @return
   */
  private int addToQueue(Job job) {
  	int queue = job.getQueue();
  	jobs.get(queue).add(job);
  	return jobs.get(queue).size();
  }

  private Job buildJob(NamedPipeStream stream) {
  	// Determine Queue
  	// Build Socket String
  	// Build and return job
  
  	String[] result = determineQueue(stream.getTestCase(), stream.getSubTest(), stream.getBrowser(), stream.getBrowserVersion());
  	assert result.length == 3;
  	int queueNumber = Integer.parseInt(result[0]);
  	String hostIP = result[1];
  	String browser = result[2];
  	
  	String socketString = buildSocketString();
  	Job job = new Job(jobNumber++, socketString, stream.getTime(), queueNumber, hostIP);
  }

	/**
	 * @param testCase
	 * @param subTest
	 * @param browser
	 * @param browserVersion
	 * @return
	 */
	private String[] determineQueue(String testCase, String subTest,
			String browser, String browserVersion) {
		// TODO Auto-generated method stub
		return null;
	}
}
