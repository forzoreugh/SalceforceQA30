package dto;

import lombok.*;

@Builder
@Getter
@AllArgsConstructor
public class Account {
    // Account Information
    private String accountName;
    @Builder.Default
    private final String accountNumber = "";
    @Builder.Default
    private final String accountSite = "";
    @Builder.Default
    private final String annualRevenue = "1";
    @Builder.Default
    private final String phone = "";
    @Builder.Default
    private final String fax = "";
    @Builder.Default
    private final String website = "";
    @Builder.Default
    private final String tickerSymbol = "";
    @Builder.Default
    private final String employees = "1";
    @Builder.Default
    private final String sicCode = "1";
    @Builder.Default
    private final String type = "--None--";
    @Builder.Default
    private final String industry = "--None--";
    @Builder.Default
    private final String rating = "--None--";
    @Builder.Default
    private final String ownership = "--None--";
    @Builder.Default
    private final boolean vipClient = true;
    @Builder.Default
    private final boolean teachMeSkills = true;

    // Adress Information
    @Builder.Default
    private final String billingStreet = "";
    private final String billingCity = "";
    private final String billingState = "";
    private final String billingZipCode = "";
    private final String billingCountry = "";
    @Builder.Default
    private final String shippingStreet = "";
    private final String shippingCity = "";
    private final String shippingState = "";
    private final String shippingZipCode = "";
    private final String shippingCountry = "";

    // Additional Information
    private final String customerPriority = "--None--";
    private final String numberofLocations = "";
    private final String active = "--None--";
    private final String sla = "--None--";
    private final String slaSerialNumber = "";
    private final String upsellOpportunity = "--None--";
    private final String description = "";
}