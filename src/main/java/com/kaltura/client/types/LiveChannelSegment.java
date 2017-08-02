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
import com.kaltura.client.enums.LiveChannelSegmentStatus;
import com.kaltura.client.enums.LiveChannelSegmentTriggerType;
import com.kaltura.client.enums.LiveChannelSegmentType;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class LiveChannelSegment extends ObjectBase {

	/**  Unique identifier  */
    private String id;
    private Integer partnerId;
	/**  Segment creation date as Unix timestamp (In seconds)  */
    private Integer createdAt;
	/**  Segment update date as Unix timestamp (In seconds)  */
    private Integer updatedAt;
	/**  Segment name  */
    private String name;
	/**  Segment description  */
    private String description;
	/**  Segment tags  */
    private String tags;
	/**  Segment could be associated with the main stream, as additional stream or as
	  overlay  */
    private LiveChannelSegmentType type;
    private LiveChannelSegmentStatus status;
	/**  Live channel id  */
    private String channelId;
	/**  Entry id to be played  */
    private String entryId;
	/**  Segment start time trigger type  */
    private LiveChannelSegmentTriggerType triggerType;
	/**  Live channel segment that the trigger relates to  */
    private String triggerSegmentId;
	/**  Segment play start time, in mili-seconds, according to trigger type  */
    private Double startTime;
	/**  Segment play duration time, in mili-seconds  */
    private Double duration;

    // id:
    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }

    // partnerId:
    public Integer getPartnerId(){
        return this.partnerId;
    }
    public void setPartnerId(Integer partnerId){
        this.partnerId = partnerId;
    }

    // createdAt:
    public Integer getCreatedAt(){
        return this.createdAt;
    }
    public void setCreatedAt(Integer createdAt){
        this.createdAt = createdAt;
    }

    // updatedAt:
    public Integer getUpdatedAt(){
        return this.updatedAt;
    }
    public void setUpdatedAt(Integer updatedAt){
        this.updatedAt = updatedAt;
    }

    // name:
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    // description:
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    // tags:
    public String getTags(){
        return this.tags;
    }
    public void setTags(String tags){
        this.tags = tags;
    }

    // type:
    public LiveChannelSegmentType getType(){
        return this.type;
    }
    public void setType(LiveChannelSegmentType type){
        this.type = type;
    }

    // status:
    public LiveChannelSegmentStatus getStatus(){
        return this.status;
    }
    public void setStatus(LiveChannelSegmentStatus status){
        this.status = status;
    }

    // channelId:
    public String getChannelId(){
        return this.channelId;
    }
    public void setChannelId(String channelId){
        this.channelId = channelId;
    }

    // entryId:
    public String getEntryId(){
        return this.entryId;
    }
    public void setEntryId(String entryId){
        this.entryId = entryId;
    }

    // triggerType:
    public LiveChannelSegmentTriggerType getTriggerType(){
        return this.triggerType;
    }
    public void setTriggerType(LiveChannelSegmentTriggerType triggerType){
        this.triggerType = triggerType;
    }

    // triggerSegmentId:
    public String getTriggerSegmentId(){
        return this.triggerSegmentId;
    }
    public void setTriggerSegmentId(String triggerSegmentId){
        this.triggerSegmentId = triggerSegmentId;
    }

    // startTime:
    public Double getStartTime(){
        return this.startTime;
    }
    public void setStartTime(Double startTime){
        this.startTime = startTime;
    }

    // duration:
    public Double getDuration(){
        return this.duration;
    }
    public void setDuration(Double duration){
        this.duration = duration;
    }


    public LiveChannelSegment() {
       super();
    }

    public LiveChannelSegment(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseString(jsonObject.get("id"));
        partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
        createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
        updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
        name = GsonParser.parseString(jsonObject.get("name"));
        description = GsonParser.parseString(jsonObject.get("description"));
        tags = GsonParser.parseString(jsonObject.get("tags"));
        type = LiveChannelSegmentType.get(GsonParser.parseString(jsonObject.get("type")));
        status = LiveChannelSegmentStatus.get(GsonParser.parseString(jsonObject.get("status")));
        channelId = GsonParser.parseString(jsonObject.get("channelId"));
        entryId = GsonParser.parseString(jsonObject.get("entryId"));
        triggerType = LiveChannelSegmentTriggerType.get(GsonParser.parseString(jsonObject.get("triggerType")));
        triggerSegmentId = GsonParser.parseString(jsonObject.get("triggerSegmentId"));
        startTime = GsonParser.parseDouble(jsonObject.get("startTime"));
        duration = GsonParser.parseDouble(jsonObject.get("duration"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaLiveChannelSegment");
        kparams.add("name", this.name);
        kparams.add("description", this.description);
        kparams.add("tags", this.tags);
        kparams.add("type", this.type);
        kparams.add("channelId", this.channelId);
        kparams.add("entryId", this.entryId);
        kparams.add("triggerType", this.triggerType);
        kparams.add("triggerSegmentId", this.triggerSegmentId);
        kparams.add("startTime", this.startTime);
        kparams.add("duration", this.duration);
        return kparams;
    }

}

