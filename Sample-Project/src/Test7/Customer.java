package Test7;

public class Customer {
    private String username;
    private String password;
    private String address;
    private String paymentDetails;

    public Customer(String username, String password, String address, String paymentDetails) {
        this.username = username;
        this.password = password;
        this.address = address;
        this.paymentDetails = paymentDetails;
    }

    // Getters and Setters for customer information
    public String getUsername() {
    	return username; 
    	}
    public void setUsername(String username) { 
    	this.username = username; 
    	}

    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public void updateAddress(String newAddress) {
        this.address = newAddress;
    }

    public void updatePaymentDetails(String newPaymentDetails) {
        this.paymentDetails = newPaymentDetails;
    }

	public String getPassword() {
		return password;
	}

	public String getAddress() {
		return address;
	}

	public String getPaymentDetails() {
		return paymentDetails;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPaymentDetails(String paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
}
