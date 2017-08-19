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
// Copyright (C) 2006-2017  Kaltura Inc.
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
import com.kaltura.client.enums.FileAssetObjectType;
import com.kaltura.client.enums.FileAssetStatus;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(FileAsset.Tokenizer.class)
public class FileAsset extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String partnerId();
		String fileAssetObjectType();
		String objectId();
		String name();
		String systemName();
		String fileExt();
		String version();
		String createdAt();
		String updatedAt();
		String status();
	}

	private Integer id;
	private Integer partnerId;
	private FileAssetObjectType fileAssetObjectType;
	private String objectId;
	private String name;
	private String systemName;
	private String fileExt;
	private Integer version;
	private Integer createdAt;
	private Integer updatedAt;
	private FileAssetStatus status;

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

	// fileAssetObjectType:
	public FileAssetObjectType getFileAssetObjectType(){
		return this.fileAssetObjectType;
	}
	public void setFileAssetObjectType(FileAssetObjectType fileAssetObjectType){
		this.fileAssetObjectType = fileAssetObjectType;
	}

	public void fileAssetObjectType(String multirequestToken){
		setToken("fileAssetObjectType", multirequestToken);
	}

	// objectId:
	public String getObjectId(){
		return this.objectId;
	}
	public void setObjectId(String objectId){
		this.objectId = objectId;
	}

	public void objectId(String multirequestToken){
		setToken("objectId", multirequestToken);
	}

	// name:
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}

	public void name(String multirequestToken){
		setToken("name", multirequestToken);
	}

	// systemName:
	public String getSystemName(){
		return this.systemName;
	}
	public void setSystemName(String systemName){
		this.systemName = systemName;
	}

	public void systemName(String multirequestToken){
		setToken("systemName", multirequestToken);
	}

	// fileExt:
	public String getFileExt(){
		return this.fileExt;
	}
	public void setFileExt(String fileExt){
		this.fileExt = fileExt;
	}

	public void fileExt(String multirequestToken){
		setToken("fileExt", multirequestToken);
	}

	// version:
	public Integer getVersion(){
		return this.version;
	}
	public void setVersion(Integer version){
		this.version = version;
	}

	public void version(String multirequestToken){
		setToken("version", multirequestToken);
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

	// status:
	public FileAssetStatus getStatus(){
		return this.status;
	}
	public void setStatus(FileAssetStatus status){
		this.status = status;
	}

	public void status(String multirequestToken){
		setToken("status", multirequestToken);
	}


	public FileAsset() {
		super();
	}

	public FileAsset(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		fileAssetObjectType = FileAssetObjectType.get(GsonParser.parseString(jsonObject.get("fileAssetObjectType")));
		objectId = GsonParser.parseString(jsonObject.get("objectId"));
		name = GsonParser.parseString(jsonObject.get("name"));
		systemName = GsonParser.parseString(jsonObject.get("systemName"));
		fileExt = GsonParser.parseString(jsonObject.get("fileExt"));
		version = GsonParser.parseInt(jsonObject.get("version"));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
		status = FileAssetStatus.get(GsonParser.parseString(jsonObject.get("status")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaFileAsset");
		kparams.add("fileAssetObjectType", this.fileAssetObjectType);
		kparams.add("objectId", this.objectId);
		kparams.add("name", this.name);
		kparams.add("systemName", this.systemName);
		kparams.add("fileExt", this.fileExt);
		return kparams;
	}

}

