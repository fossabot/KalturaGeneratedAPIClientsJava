// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platfroms allow them to do with
// text.
//
// Copyright (C) 2006-2018  Kaltura Inc.
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU Affero General Public License as
// published by the Free Software Foundation, either version 3 of the
// License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Affero General Public License for more details.
//
// You should have received a copy of the GNU Affero General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.
//
// @ignore
// ===================================================================================================
package com.kaltura.client.types;

import com.google.gson.JsonObject;
import com.kaltura.client.Params;
import com.kaltura.client.enums.BatchJobErrorTypes;
import com.kaltura.client.enums.EntryDistributionFlag;
import com.kaltura.client.enums.EntryDistributionStatus;
import com.kaltura.client.enums.EntryDistributionSunStatus;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.List;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(EntryDistribution.Tokenizer.class)
public class EntryDistribution extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String createdAt();
		String updatedAt();
		String submittedAt();
		String entryId();
		String partnerId();
		String distributionProfileId();
		String status();
		String sunStatus();
		String dirtyStatus();
		String thumbAssetIds();
		String flavorAssetIds();
		String assetIds();
		String sunrise();
		String sunset();
		String remoteId();
		String plays();
		String views();
		RequestBuilder.ListTokenizer<DistributionValidationError.Tokenizer> validationErrors();
		String errorType();
		String errorNumber();
		String errorDescription();
		String hasSubmitResultsLog();
		String hasSubmitSentDataLog();
		String hasUpdateResultsLog();
		String hasUpdateSentDataLog();
		String hasDeleteResultsLog();
		String hasDeleteSentDataLog();
	}

	/**
	 * Auto generated unique id
	 */
	private Integer id;
	/**
	 * Entry distribution creation date as Unix timestamp (In seconds)
	 */
	private Integer createdAt;
	/**
	 * Entry distribution last update date as Unix timestamp (In seconds)
	 */
	private Integer updatedAt;
	/**
	 * Entry distribution submission date as Unix timestamp (In seconds)
	 */
	private Integer submittedAt;
	private String entryId;
	private Integer partnerId;
	private Integer distributionProfileId;
	private EntryDistributionStatus status;
	private EntryDistributionSunStatus sunStatus;
	private EntryDistributionFlag dirtyStatus;
	/**
	 * Comma separated thumbnail asset ids
	 */
	private String thumbAssetIds;
	/**
	 * Comma separated flavor asset ids
	 */
	private String flavorAssetIds;
	/**
	 * Comma separated asset ids
	 */
	private String assetIds;
	/**
	 * Entry distribution publish time as Unix timestamp (In seconds)
	 */
	private Integer sunrise;
	/**
	 * Entry distribution un-publish time as Unix timestamp (In seconds)
	 */
	private Integer sunset;
	/**
	 * The id as returned from the distributed destination
	 */
	private String remoteId;
	/**
	 * The plays as retrieved from the remote destination reports
	 */
	private Integer plays;
	/**
	 * The views as retrieved from the remote destination reports
	 */
	private Integer views;
	private List<DistributionValidationError> validationErrors;
	private BatchJobErrorTypes errorType;
	private Integer errorNumber;
	private String errorDescription;
	private Boolean hasSubmitResultsLog;
	private Boolean hasSubmitSentDataLog;
	private Boolean hasUpdateResultsLog;
	private Boolean hasUpdateSentDataLog;
	private Boolean hasDeleteResultsLog;
	private Boolean hasDeleteSentDataLog;

	// id:
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}

	public void id(String multirequestToken){
		setToken("id", multirequestToken);
	}

	// createdAt:
	public Integer getCreatedAt(){
		return this.createdAt;
	}
	public void setCreatedAt(Integer createdAt){
		this.createdAt = createdAt;
	}

	public void createdAt(String multirequestToken){
		setToken("createdAt", multirequestToken);
	}

	// updatedAt:
	public Integer getUpdatedAt(){
		return this.updatedAt;
	}
	public void setUpdatedAt(Integer updatedAt){
		this.updatedAt = updatedAt;
	}

	public void updatedAt(String multirequestToken){
		setToken("updatedAt", multirequestToken);
	}

	// submittedAt:
	public Integer getSubmittedAt(){
		return this.submittedAt;
	}
	public void setSubmittedAt(Integer submittedAt){
		this.submittedAt = submittedAt;
	}

	public void submittedAt(String multirequestToken){
		setToken("submittedAt", multirequestToken);
	}

	// entryId:
	public String getEntryId(){
		return this.entryId;
	}
	public void setEntryId(String entryId){
		this.entryId = entryId;
	}

	public void entryId(String multirequestToken){
		setToken("entryId", multirequestToken);
	}

	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	public void setPartnerId(Integer partnerId){
		this.partnerId = partnerId;
	}

	public void partnerId(String multirequestToken){
		setToken("partnerId", multirequestToken);
	}

	// distributionProfileId:
	public Integer getDistributionProfileId(){
		return this.distributionProfileId;
	}
	public void setDistributionProfileId(Integer distributionProfileId){
		this.distributionProfileId = distributionProfileId;
	}

	public void distributionProfileId(String multirequestToken){
		setToken("distributionProfileId", multirequestToken);
	}

	// status:
	public EntryDistributionStatus getStatus(){
		return this.status;
	}
	public void setStatus(EntryDistributionStatus status){
		this.status = status;
	}

	public void status(String multirequestToken){
		setToken("status", multirequestToken);
	}

	// sunStatus:
	public EntryDistributionSunStatus getSunStatus(){
		return this.sunStatus;
	}
	public void setSunStatus(EntryDistributionSunStatus sunStatus){
		this.sunStatus = sunStatus;
	}

	public void sunStatus(String multirequestToken){
		setToken("sunStatus", multirequestToken);
	}

	// dirtyStatus:
	public EntryDistributionFlag getDirtyStatus(){
		return this.dirtyStatus;
	}
	public void setDirtyStatus(EntryDistributionFlag dirtyStatus){
		this.dirtyStatus = dirtyStatus;
	}

	public void dirtyStatus(String multirequestToken){
		setToken("dirtyStatus", multirequestToken);
	}

	// thumbAssetIds:
	public String getThumbAssetIds(){
		return this.thumbAssetIds;
	}
	public void setThumbAssetIds(String thumbAssetIds){
		this.thumbAssetIds = thumbAssetIds;
	}

	public void thumbAssetIds(String multirequestToken){
		setToken("thumbAssetIds", multirequestToken);
	}

	// flavorAssetIds:
	public String getFlavorAssetIds(){
		return this.flavorAssetIds;
	}
	public void setFlavorAssetIds(String flavorAssetIds){
		this.flavorAssetIds = flavorAssetIds;
	}

	public void flavorAssetIds(String multirequestToken){
		setToken("flavorAssetIds", multirequestToken);
	}

	// assetIds:
	public String getAssetIds(){
		return this.assetIds;
	}
	public void setAssetIds(String assetIds){
		this.assetIds = assetIds;
	}

	public void assetIds(String multirequestToken){
		setToken("assetIds", multirequestToken);
	}

	// sunrise:
	public Integer getSunrise(){
		return this.sunrise;
	}
	public void setSunrise(Integer sunrise){
		this.sunrise = sunrise;
	}

	public void sunrise(String multirequestToken){
		setToken("sunrise", multirequestToken);
	}

	// sunset:
	public Integer getSunset(){
		return this.sunset;
	}
	public void setSunset(Integer sunset){
		this.sunset = sunset;
	}

	public void sunset(String multirequestToken){
		setToken("sunset", multirequestToken);
	}

	// remoteId:
	public String getRemoteId(){
		return this.remoteId;
	}
	public void setRemoteId(String remoteId){
		this.remoteId = remoteId;
	}

	public void remoteId(String multirequestToken){
		setToken("remoteId", multirequestToken);
	}

	// plays:
	public Integer getPlays(){
		return this.plays;
	}
	public void setPlays(Integer plays){
		this.plays = plays;
	}

	public void plays(String multirequestToken){
		setToken("plays", multirequestToken);
	}

	// views:
	public Integer getViews(){
		return this.views;
	}
	public void setViews(Integer views){
		this.views = views;
	}

	public void views(String multirequestToken){
		setToken("views", multirequestToken);
	}

	// validationErrors:
	public List<DistributionValidationError> getValidationErrors(){
		return this.validationErrors;
	}
	public void setValidationErrors(List<DistributionValidationError> validationErrors){
		this.validationErrors = validationErrors;
	}

	// errorType:
	public BatchJobErrorTypes getErrorType(){
		return this.errorType;
	}
	public void setErrorType(BatchJobErrorTypes errorType){
		this.errorType = errorType;
	}

	public void errorType(String multirequestToken){
		setToken("errorType", multirequestToken);
	}

	// errorNumber:
	public Integer getErrorNumber(){
		return this.errorNumber;
	}
	public void setErrorNumber(Integer errorNumber){
		this.errorNumber = errorNumber;
	}

	public void errorNumber(String multirequestToken){
		setToken("errorNumber", multirequestToken);
	}

	// errorDescription:
	public String getErrorDescription(){
		return this.errorDescription;
	}
	public void setErrorDescription(String errorDescription){
		this.errorDescription = errorDescription;
	}

	public void errorDescription(String multirequestToken){
		setToken("errorDescription", multirequestToken);
	}

	// hasSubmitResultsLog:
	public Boolean getHasSubmitResultsLog(){
		return this.hasSubmitResultsLog;
	}
	public void setHasSubmitResultsLog(Boolean hasSubmitResultsLog){
		this.hasSubmitResultsLog = hasSubmitResultsLog;
	}

	public void hasSubmitResultsLog(String multirequestToken){
		setToken("hasSubmitResultsLog", multirequestToken);
	}

	// hasSubmitSentDataLog:
	public Boolean getHasSubmitSentDataLog(){
		return this.hasSubmitSentDataLog;
	}
	public void setHasSubmitSentDataLog(Boolean hasSubmitSentDataLog){
		this.hasSubmitSentDataLog = hasSubmitSentDataLog;
	}

	public void hasSubmitSentDataLog(String multirequestToken){
		setToken("hasSubmitSentDataLog", multirequestToken);
	}

	// hasUpdateResultsLog:
	public Boolean getHasUpdateResultsLog(){
		return this.hasUpdateResultsLog;
	}
	public void setHasUpdateResultsLog(Boolean hasUpdateResultsLog){
		this.hasUpdateResultsLog = hasUpdateResultsLog;
	}

	public void hasUpdateResultsLog(String multirequestToken){
		setToken("hasUpdateResultsLog", multirequestToken);
	}

	// hasUpdateSentDataLog:
	public Boolean getHasUpdateSentDataLog(){
		return this.hasUpdateSentDataLog;
	}
	public void setHasUpdateSentDataLog(Boolean hasUpdateSentDataLog){
		this.hasUpdateSentDataLog = hasUpdateSentDataLog;
	}

	public void hasUpdateSentDataLog(String multirequestToken){
		setToken("hasUpdateSentDataLog", multirequestToken);
	}

	// hasDeleteResultsLog:
	public Boolean getHasDeleteResultsLog(){
		return this.hasDeleteResultsLog;
	}
	public void setHasDeleteResultsLog(Boolean hasDeleteResultsLog){
		this.hasDeleteResultsLog = hasDeleteResultsLog;
	}

	public void hasDeleteResultsLog(String multirequestToken){
		setToken("hasDeleteResultsLog", multirequestToken);
	}

	// hasDeleteSentDataLog:
	public Boolean getHasDeleteSentDataLog(){
		return this.hasDeleteSentDataLog;
	}
	public void setHasDeleteSentDataLog(Boolean hasDeleteSentDataLog){
		this.hasDeleteSentDataLog = hasDeleteSentDataLog;
	}

	public void hasDeleteSentDataLog(String multirequestToken){
		setToken("hasDeleteSentDataLog", multirequestToken);
	}


	public EntryDistribution() {
		super();
	}

	public EntryDistribution(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
		submittedAt = GsonParser.parseInt(jsonObject.get("submittedAt"));
		entryId = GsonParser.parseString(jsonObject.get("entryId"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		distributionProfileId = GsonParser.parseInt(jsonObject.get("distributionProfileId"));
		status = EntryDistributionStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		sunStatus = EntryDistributionSunStatus.get(GsonParser.parseInt(jsonObject.get("sunStatus")));
		dirtyStatus = EntryDistributionFlag.get(GsonParser.parseInt(jsonObject.get("dirtyStatus")));
		thumbAssetIds = GsonParser.parseString(jsonObject.get("thumbAssetIds"));
		flavorAssetIds = GsonParser.parseString(jsonObject.get("flavorAssetIds"));
		assetIds = GsonParser.parseString(jsonObject.get("assetIds"));
		sunrise = GsonParser.parseInt(jsonObject.get("sunrise"));
		sunset = GsonParser.parseInt(jsonObject.get("sunset"));
		remoteId = GsonParser.parseString(jsonObject.get("remoteId"));
		plays = GsonParser.parseInt(jsonObject.get("plays"));
		views = GsonParser.parseInt(jsonObject.get("views"));
		validationErrors = GsonParser.parseArray(jsonObject.getAsJsonArray("validationErrors"), DistributionValidationError.class);
		errorType = BatchJobErrorTypes.get(GsonParser.parseInt(jsonObject.get("errorType")));
		errorNumber = GsonParser.parseInt(jsonObject.get("errorNumber"));
		errorDescription = GsonParser.parseString(jsonObject.get("errorDescription"));
		hasSubmitResultsLog = GsonParser.parseBoolean(jsonObject.get("hasSubmitResultsLog"));
		hasSubmitSentDataLog = GsonParser.parseBoolean(jsonObject.get("hasSubmitSentDataLog"));
		hasUpdateResultsLog = GsonParser.parseBoolean(jsonObject.get("hasUpdateResultsLog"));
		hasUpdateSentDataLog = GsonParser.parseBoolean(jsonObject.get("hasUpdateSentDataLog"));
		hasDeleteResultsLog = GsonParser.parseBoolean(jsonObject.get("hasDeleteResultsLog"));
		hasDeleteSentDataLog = GsonParser.parseBoolean(jsonObject.get("hasDeleteSentDataLog"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaEntryDistribution");
		kparams.add("entryId", this.entryId);
		kparams.add("distributionProfileId", this.distributionProfileId);
		kparams.add("thumbAssetIds", this.thumbAssetIds);
		kparams.add("flavorAssetIds", this.flavorAssetIds);
		kparams.add("assetIds", this.assetIds);
		kparams.add("sunrise", this.sunrise);
		kparams.add("sunset", this.sunset);
		kparams.add("validationErrors", this.validationErrors);
		return kparams;
	}

}

