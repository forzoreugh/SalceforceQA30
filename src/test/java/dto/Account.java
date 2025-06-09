package dto;

public class Account {

    // Account Information
    private String accountName;
    private String accountNumber;
    private String accountSite;
    private String annualRevenue;
    private String phone;
    private String fax;
    private String website;
    private String tickerSymbol;
    private String employees;
    private String sicCode;
    private String type;
    private String industry;
    private String rating;
    private String ownership;
    private boolean vipClient;
    private boolean teachMeSkills;

    // Adress Information
    private String billingStreet;
    private String billingCity;
    private String billingState;
    private String billingZipCode;
    private String billingCountry;
    private String shippingStreet;
    private String shippingCity;
    private String shippingState;
    private String shippingZipCode;
    private String shippingCountry;

    // Additional Information
    private String customerPriority;
    private String numberofLocations;
    private String active;
    private String sla;
    private String slaSerialNumber;
    private String upsellOpportunity;
    private String description;

    public Account(String accountName, String accountNumber, String accountSite, String annualRevenue, String phone,
                   String fax, String website , String tickerSymbol, String employees, String sicCode, String type,
                   String industry, String rating, String ownership, boolean vipClient, boolean teachMeSkills,
                   String billingStreet, String shippingStreet/*, String billingCity, String billingState,
                   String billingZipCode, String billingCountry, String shippingCity, String shippingState,
                   String shippingZipCode, String shippingCountry, String customerPriority, String numberofLocations,
                   String active, String sla, String slaSerialNumber, String upsellOpportunity, String description*/) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountSite = accountSite;
        this.annualRevenue = annualRevenue;
        this.phone = phone;
        this.fax = fax;
        this.website = website;
        this.tickerSymbol = tickerSymbol;
        this.employees = employees;
        this.sicCode = sicCode;
        this.type = type;
        this.industry = industry;
        this.rating = rating;
        this.ownership = ownership;
        this.vipClient = vipClient;
        this.teachMeSkills = teachMeSkills;
        this.billingStreet = billingStreet;
        this.shippingStreet = shippingStreet;
        this.billingCity = billingCity;
        this.billingState = billingState;
        this.billingZipCode = billingZipCode;
        this.billingCountry = billingCountry;
        this.shippingCity = shippingCity;
        this.shippingState = shippingState;
        this.shippingZipCode = shippingZipCode;
        this.shippingCountry = shippingCountry;
        this.customerPriority = customerPriority;
        this.numberofLocations = numberofLocations;
        this.active = active;
        this.sla = sla;
        this.slaSerialNumber = slaSerialNumber;
        this.upsellOpportunity = upsellOpportunity;
        this.description = description;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountSite() {
        return accountSite;
    }

    public String getAnnualRevenue() {
        return annualRevenue;
    }

    public String getPhone() {
        return phone;
    }

    public String getFax() {
        return fax;
    }

    public String getWebsite() {
        return website;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public String getEmployees() {
        return employees;
    }

    public String getSicCode() {
        return sicCode;
    }

    public String getType() {
        return type;
    }

    public String getIndustry() {
        return industry;
    }

    public String getRating() {
        return rating;
    }

    public String getOwnership() {
        return ownership;
    }

    public boolean isVipClient() {
        return vipClient;
    }

    public boolean isTeachMeSkills() {
        return teachMeSkills;
    }

    public String getBillingStreet() {
        return billingStreet;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public String getBillingState() {
        return billingState;
    }

    public String getBillingZipCode() {
        return billingZipCode;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public String getShippingStreet() {
        return shippingStreet;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public String getShippingState() {
        return shippingState;
    }

    public String getShippingZipCode() {
        return shippingZipCode;
    }

    public String getShippingCountry() {
        return shippingCountry;
    }

    public String getCustomerPriority() {
        return customerPriority;
    }

    public String getNumberofLocations() {
        return numberofLocations;
    }

    public String getActive() {
        return active;
    }

    public String getSla() {
        return sla;
    }

    public String getSlaSerialNumber() {
        return slaSerialNumber;
    }

    public String getUpsellOpportunity() {
        return upsellOpportunity;
    }

    public String getDescription() {
        return description;
    }
}