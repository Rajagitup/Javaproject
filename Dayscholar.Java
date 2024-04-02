package com.tnsifDAY4;



class DayScholar extends Student {

    private int busNumber;

    private float distance;



    

    

    public DayScholar() {

		super();

	}



	// Parameterized constructor

    public DayScholar(int studentId, String studentName, String department, String gender,

                      String category, double collegeFee, int busNumber, float distance) {

        super(studentId, studentName, department, gender, category, collegeFee);

        this.busNumber = busNumber;

        this.distance = distance;

    }



    // Getters and setters for DayScholar-specific attributes



    public int getBusNumber() {

		return busNumber;

	}



	public void setBusNumber(int busNumber) {

		this.busNumber = busNumber;

	}



	public float getDistance() {

		return distance;

	}



	public void setDistance(float distance) {

		this.distance = distance;

	}



	@Override

	public double calculateTotalFee() {

	    double fee = super.getCollegeFee();

	    if (distance > 30.0) {

	        return fee + 28000;

	    } else if (distance > 20.0) {

	        return fee + 20000;

	    } else if (distance > 10.0) {

	        return fee + 12000;

	    } else {

	        return fee + 6000;

	    }

	}



	@Override

	public String toString() {

	    return "DayScholar [Total Fee=" + calculateTotalFee() + "]";

	}



}
