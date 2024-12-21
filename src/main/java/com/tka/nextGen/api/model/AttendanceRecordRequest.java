package com.tka.nextGen.api.model;

import java.util.List;

public class AttendanceRecordRequest {
	private String username;
	private Long subjectId;
	private String date;
	private String time;
    private int numberOfStudents;

	private List<Long> studentIds;

	public AttendanceRecordRequest() {
		// TODO Auto-generated constructor stub
	}

	
	public AttendanceRecordRequest(String username, Long subjectId, int numberOfStudents, List<Long> studentIds) {
		super();
		this.username = username;
		this.subjectId = subjectId;
		this.numberOfStudents = numberOfStudents;
		this.studentIds = studentIds;
	}


	public AttendanceRecordRequest(String username, Long subjectId, String date, String time, int numberOfStudents,
			List<Long> studentIds) {
		super();
		this.username = username;
		this.subjectId = subjectId;
		this.date = date;
		this.time = time;
		this.numberOfStudents = numberOfStudents;
		this.studentIds = studentIds;
	}

	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public List<Long> getStudentIds() {
		return studentIds;
	}

	public void setStudentIds(List<Long> studentIds) {
		this.studentIds = studentIds;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}
	
	

}
