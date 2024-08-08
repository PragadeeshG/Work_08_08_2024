package com.test1;

public class CloudMigrationInclusionLineItems {
	private Integer lineItemCode;
	private String cloudMigrationInclusionRef;
	private boolean exclusionValid;
	private Integer accompaniedRuleContentCode;
	private String accompaniedRuleContent;
	private String metadata;
	private Integer keyIdentifier;
	private Integer secretCode;
	private String hashicorpOnboarded;
	private Integer secretStoreForCertificates;
	private String keyRoationSchedule;
	private String status;
	private String remarks;

	public CloudMigrationInclusionLineItems() {

	}

	public CloudMigrationInclusionLineItems(Integer lineItemCode, String cloudMigrationInclusionRef,
			boolean exclusionValid, Integer accompaniedRuleContentCode, String accompaniedRuleContent, String metadata,
			Integer keyIdentifier, Integer secretCode, String hashicorpOnboarded, Integer secretStoreForCertificates,
			String keyRoationSchedule, String status, String remarks) {
		super();
		this.lineItemCode = lineItemCode;
		this.cloudMigrationInclusionRef = cloudMigrationInclusionRef;
		this.exclusionValid = exclusionValid;
		this.accompaniedRuleContentCode = accompaniedRuleContentCode;
		this.accompaniedRuleContent = accompaniedRuleContent;
		this.metadata = metadata;
		this.keyIdentifier = keyIdentifier;
		this.secretCode = secretCode;
		this.hashicorpOnboarded = hashicorpOnboarded;
		this.secretStoreForCertificates = secretStoreForCertificates;
		this.keyRoationSchedule = keyRoationSchedule;
		this.status = status;
		this.remarks = remarks;
	}

	public Integer getLineItemCode() {
		return lineItemCode;
	}

	public void setLineItemCode(Integer lineItemCode) {
		this.lineItemCode = lineItemCode;
	}

	public String getCloudMigrationInclusionRef() {
		return cloudMigrationInclusionRef;
	}

	public void setCloudMigrationInclusionRef(String cloudMigrationInclusionRef) {
		this.cloudMigrationInclusionRef = cloudMigrationInclusionRef;
	}

	public boolean isExclusionValid() {
		return exclusionValid;
	}

	public void setExclusionValid(boolean exclusionValid) {
		this.exclusionValid = exclusionValid;
	}

	public Integer getAccompaniedRuleContentCode() {
		return accompaniedRuleContentCode;
	}

	public void setAccompaniedRuleContentCode(Integer accompaniedRuleContentCode) {
		this.accompaniedRuleContentCode = accompaniedRuleContentCode;
	}

	public String getAccompaniedRuleContent() {
		return accompaniedRuleContent;
	}

	public void setAccompaniedRuleContent(String accompaniedRuleContent) {
		this.accompaniedRuleContent = accompaniedRuleContent;
	}

	public String getMetadata() {
		return metadata;
	}

	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}

	public Integer getKeyIdentifier() {
		return keyIdentifier;
	}

	public void setKeyIdentifier(Integer keyIdentifier) {
		this.keyIdentifier = keyIdentifier;
	}

	public Integer getSecretCode() {
		return secretCode;
	}

	public void setSecretCode(Integer secretCode) {
		this.secretCode = secretCode;
	}

	public String getHashicorpOnboarded() {
		return hashicorpOnboarded;
	}

	public void setHashicorpOnboarded(String hashicorpOnboarded) {
		this.hashicorpOnboarded = hashicorpOnboarded;
	}

	public Integer getSecretStoreForCertificates() {
		return secretStoreForCertificates;
	}

	public void setSecretStoreForCertificates(Integer secretStoreForCertificates) {
		this.secretStoreForCertificates = secretStoreForCertificates;
	}

	public String getKeyRoationSchedule() {
		return keyRoationSchedule;
	}

	public void setKeyRoationSchedule(String keyRoationSchedule) {
		this.keyRoationSchedule = keyRoationSchedule;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
