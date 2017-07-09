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

import com.kaltura.client.Params;
import com.kaltura.client.utils.GsonParser;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class YoutubeApiDistributionProfile extends ConfigurableDistributionProfile {

    private String username;
    private Integer defaultCategory;
    private String allowComments;
    private String allowEmbedding;
    private String allowRatings;
    private String allowResponses;
    private String apiAuthorizeUrl;
    private String googleClientId;
    private String googleClientSecret;
    private String googleTokenData;
    private Boolean assumeSuccess;
    private String privacyStatus;

    // username:
    public String getUsername(){
        return this.username;
    }
    public void setUsername(String username){
        this.username = username;
    }

    // defaultCategory:
    public Integer getDefaultCategory(){
        return this.defaultCategory;
    }
    public void setDefaultCategory(Integer defaultCategory){
        this.defaultCategory = defaultCategory;
    }

    // allowComments:
    public String getAllowComments(){
        return this.allowComments;
    }
    public void setAllowComments(String allowComments){
        this.allowComments = allowComments;
    }

    // allowEmbedding:
    public String getAllowEmbedding(){
        return this.allowEmbedding;
    }
    public void setAllowEmbedding(String allowEmbedding){
        this.allowEmbedding = allowEmbedding;
    }

    // allowRatings:
    public String getAllowRatings(){
        return this.allowRatings;
    }
    public void setAllowRatings(String allowRatings){
        this.allowRatings = allowRatings;
    }

    // allowResponses:
    public String getAllowResponses(){
        return this.allowResponses;
    }
    public void setAllowResponses(String allowResponses){
        this.allowResponses = allowResponses;
    }

    // apiAuthorizeUrl:
    public String getApiAuthorizeUrl(){
        return this.apiAuthorizeUrl;
    }
    public void setApiAuthorizeUrl(String apiAuthorizeUrl){
        this.apiAuthorizeUrl = apiAuthorizeUrl;
    }

    // googleClientId:
    public String getGoogleClientId(){
        return this.googleClientId;
    }
    public void setGoogleClientId(String googleClientId){
        this.googleClientId = googleClientId;
    }

    // googleClientSecret:
    public String getGoogleClientSecret(){
        return this.googleClientSecret;
    }
    public void setGoogleClientSecret(String googleClientSecret){
        this.googleClientSecret = googleClientSecret;
    }

    // googleTokenData:
    public String getGoogleTokenData(){
        return this.googleTokenData;
    }
    public void setGoogleTokenData(String googleTokenData){
        this.googleTokenData = googleTokenData;
    }

    // assumeSuccess:
    public Boolean getAssumeSuccess(){
        return this.assumeSuccess;
    }
    public void setAssumeSuccess(Boolean assumeSuccess){
        this.assumeSuccess = assumeSuccess;
    }

    // privacyStatus:
    public String getPrivacyStatus(){
        return this.privacyStatus;
    }
    public void setPrivacyStatus(String privacyStatus){
        this.privacyStatus = privacyStatus;
    }


    public YoutubeApiDistributionProfile() {
       super();
    }

    public YoutubeApiDistributionProfile(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        username = GsonParser.parseString(jsonObject.get("username"));
        defaultCategory = GsonParser.parseInt(jsonObject.get("defaultCategory"));
        allowComments = GsonParser.parseString(jsonObject.get("allowComments"));
        allowEmbedding = GsonParser.parseString(jsonObject.get("allowEmbedding"));
        allowRatings = GsonParser.parseString(jsonObject.get("allowRatings"));
        allowResponses = GsonParser.parseString(jsonObject.get("allowResponses"));
        apiAuthorizeUrl = GsonParser.parseString(jsonObject.get("apiAuthorizeUrl"));
        googleClientId = GsonParser.parseString(jsonObject.get("googleClientId"));
        googleClientSecret = GsonParser.parseString(jsonObject.get("googleClientSecret"));
        googleTokenData = GsonParser.parseString(jsonObject.get("googleTokenData"));
        assumeSuccess = GsonParser.parseBoolean(jsonObject.get("assumeSuccess"));
        privacyStatus = GsonParser.parseString(jsonObject.get("privacyStatus"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaYoutubeApiDistributionProfile");
        kparams.add("username", this.username);
        kparams.add("defaultCategory", this.defaultCategory);
        kparams.add("allowComments", this.allowComments);
        kparams.add("allowEmbedding", this.allowEmbedding);
        kparams.add("allowRatings", this.allowRatings);
        kparams.add("allowResponses", this.allowResponses);
        kparams.add("apiAuthorizeUrl", this.apiAuthorizeUrl);
        kparams.add("googleClientId", this.googleClientId);
        kparams.add("googleClientSecret", this.googleClientSecret);
        kparams.add("googleTokenData", this.googleTokenData);
        kparams.add("assumeSuccess", this.assumeSuccess);
        kparams.add("privacyStatus", this.privacyStatus);
        return kparams;
    }

}
