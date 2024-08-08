package com.test1;

public class AlternateAngularIdToVue {
	private String angularId;
	private String vueCode;
	private String qualityGrade;
	private String angularIdToVueSystem;
	private String angularIdToVueSystemCode;
	private String angularIdToVueSystemDescription;
	private String knownQualityIssues;
	private Integer riskLevel;
	private String mitigation;
	private String approvalCode;
	private String entityState;

	public AlternateAngularIdToVue() {

	}

	public AlternateAngularIdToVue(String angularId, String vueCode, String qualityGrade, String angularIdToVueSystem,
			String angularIdToVueSystemCode, String angularIdToVueSystemDescription, String knownQualityIssues,
			Integer riskLevel, String mitigation, String approvalCode, String entityState) {
		super();
		this.angularId = angularId;
		this.vueCode = vueCode;
		this.qualityGrade = qualityGrade;
		this.angularIdToVueSystem = angularIdToVueSystem;
		this.angularIdToVueSystemCode = angularIdToVueSystemCode;
		this.angularIdToVueSystemDescription = angularIdToVueSystemDescription;
		this.knownQualityIssues = knownQualityIssues;
		this.riskLevel = riskLevel;
		this.mitigation = mitigation;
		this.approvalCode = approvalCode;
		this.entityState = entityState;
	}

	public String getAngularId() {
		return angularId;
	}

	public void setAngularId(String angularId) {
		this.angularId = angularId;
	}

	public String getVueCode() {
		return vueCode;
	}

	public void setVueCode(String vueCode) {
		this.vueCode = vueCode;
	}

	public String getQualityGrade() {
		return qualityGrade;
	}

	public void setQualityGrade(String qualityGrade) {
		this.qualityGrade = qualityGrade;
	}

	public String getAngularIdToVueSystem() {
		return angularIdToVueSystem;
	}

	public void setAngularIdToVueSystem(String angularIdToVueSystem) {
		this.angularIdToVueSystem = angularIdToVueSystem;
	}

	public String getAngularIdToVueSystemCode() {
		return angularIdToVueSystemCode;
	}

	public void setAngularIdToVueSystemCode(String angularIdToVueSystemCode) {
		this.angularIdToVueSystemCode = angularIdToVueSystemCode;
	}

	public String getAngularIdToVueSystemDescription() {
		return angularIdToVueSystemDescription;
	}

	public void setAngularIdToVueSystemDescription(String angularIdToVueSystemDescription) {
		this.angularIdToVueSystemDescription = angularIdToVueSystemDescription;
	}

	public String getKnownQualityIssues() {
		return knownQualityIssues;
	}

	public void setKnownQualityIssues(String knownQualityIssues) {
		this.knownQualityIssues = knownQualityIssues;
	}

	public Integer getRiskLevel() {
		return riskLevel;
	}

	public void setRiskLevel(Integer riskLevel) {
		this.riskLevel = riskLevel;
	}

	public String getMitigation() {
		return mitigation;
	}

	public void setMitigation(String mitigation) {
		this.mitigation = mitigation;
	}

	public String getApprovalCode() {
		return approvalCode;
	}

	public void setApprovalCode(String approvalCode) {
		this.approvalCode = approvalCode;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
