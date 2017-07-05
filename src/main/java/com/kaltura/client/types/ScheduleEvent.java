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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.types.ScheduleEventRecurrence;
import com.kaltura.client.enums.ScheduleEventStatus;
import com.kaltura.client.enums.ScheduleEventClassificationType;
import com.kaltura.client.enums.ScheduleEventRecurrenceType;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public abstract class ScheduleEvent extends ObjectBase {

	/**  Auto-generated unique identifier  */
    private Integer id;
    private Integer partnerId;
    private Integer parentId;
	/**  Defines a short summary or subject for the event  */
    private String summary;
    private String description;
    private ScheduleEventStatus status;
    private Integer startDate;
    private Integer endDate;
    private String referenceId;
    private ScheduleEventClassificationType classificationType;
	/**  Specifies the global position for the activity  */
    private Double geoLatitude;
	/**  Specifies the global position for the activity  */
    private Double geoLongitude;
	/**  Defines the intended venue for the activity  */
    private String location;
    private String organizer;
    private String ownerId;
	/**  The value for the priority field.  */
    private Integer priority;
	/**  Defines the revision sequence number.  */
    private Integer sequence;
    private ScheduleEventRecurrenceType recurrenceType;
	/**  Duration in seconds  */
    private Integer duration;
	/**  Used to represent contact information or alternately a reference to contact
	  information.  */
    private String contact;
	/**  Specifies non-processing information intended to provide a comment to the
	  calendar user.  */
    private String comment;
    private String tags;
	/**  Creation date as Unix timestamp (In seconds)  */
    private Integer createdAt;
	/**  Last update as Unix timestamp (In seconds)  */
    private Integer updatedAt;
    private ScheduleEventRecurrence recurrence;

    // id:
    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    // partnerId:
    public Integer getPartnerId(){
        return this.partnerId;
    }
    public void setPartnerId(Integer partnerId){
        this.partnerId = partnerId;
    }

    // parentId:
    public Integer getParentId(){
        return this.parentId;
    }
    public void setParentId(Integer parentId){
        this.parentId = parentId;
    }

    // summary:
    public String getSummary(){
        return this.summary;
    }
    public void setSummary(String summary){
        this.summary = summary;
    }

    // description:
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    // status:
    public ScheduleEventStatus getStatus(){
        return this.status;
    }
    public void setStatus(ScheduleEventStatus status){
        this.status = status;
    }

    // startDate:
    public Integer getStartDate(){
        return this.startDate;
    }
    public void setStartDate(Integer startDate){
        this.startDate = startDate;
    }

    // endDate:
    public Integer getEndDate(){
        return this.endDate;
    }
    public void setEndDate(Integer endDate){
        this.endDate = endDate;
    }

    // referenceId:
    public String getReferenceId(){
        return this.referenceId;
    }
    public void setReferenceId(String referenceId){
        this.referenceId = referenceId;
    }

    // classificationType:
    public ScheduleEventClassificationType getClassificationType(){
        return this.classificationType;
    }
    public void setClassificationType(ScheduleEventClassificationType classificationType){
        this.classificationType = classificationType;
    }

    // geoLatitude:
    public Double getGeoLatitude(){
        return this.geoLatitude;
    }
    public void setGeoLatitude(Double geoLatitude){
        this.geoLatitude = geoLatitude;
    }

    // geoLongitude:
    public Double getGeoLongitude(){
        return this.geoLongitude;
    }
    public void setGeoLongitude(Double geoLongitude){
        this.geoLongitude = geoLongitude;
    }

    // location:
    public String getLocation(){
        return this.location;
    }
    public void setLocation(String location){
        this.location = location;
    }

    // organizer:
    public String getOrganizer(){
        return this.organizer;
    }
    public void setOrganizer(String organizer){
        this.organizer = organizer;
    }

    // ownerId:
    public String getOwnerId(){
        return this.ownerId;
    }
    public void setOwnerId(String ownerId){
        this.ownerId = ownerId;
    }

    // priority:
    public Integer getPriority(){
        return this.priority;
    }
    public void setPriority(Integer priority){
        this.priority = priority;
    }

    // sequence:
    public Integer getSequence(){
        return this.sequence;
    }
    public void setSequence(Integer sequence){
        this.sequence = sequence;
    }

    // recurrenceType:
    public ScheduleEventRecurrenceType getRecurrenceType(){
        return this.recurrenceType;
    }
    public void setRecurrenceType(ScheduleEventRecurrenceType recurrenceType){
        this.recurrenceType = recurrenceType;
    }

    // duration:
    public Integer getDuration(){
        return this.duration;
    }
    public void setDuration(Integer duration){
        this.duration = duration;
    }

    // contact:
    public String getContact(){
        return this.contact;
    }
    public void setContact(String contact){
        this.contact = contact;
    }

    // comment:
    public String getComment(){
        return this.comment;
    }
    public void setComment(String comment){
        this.comment = comment;
    }

    // tags:
    public String getTags(){
        return this.tags;
    }
    public void setTags(String tags){
        this.tags = tags;
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

    // recurrence:
    public ScheduleEventRecurrence getRecurrence(){
        return this.recurrence;
    }
    public void setRecurrence(ScheduleEventRecurrence recurrence){
        this.recurrence = recurrence;
    }


    public ScheduleEvent() {
       super();
    }

    public ScheduleEvent(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseInt(jsonObject.get("id"));
        partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
        parentId = GsonParser.parseInt(jsonObject.get("parentId"));
        summary = GsonParser.parseString(jsonObject.get("summary"));
        description = GsonParser.parseString(jsonObject.get("description"));
        status = ScheduleEventStatus.get(GsonParser.parseInt(jsonObject.get("status")));
        startDate = GsonParser.parseInt(jsonObject.get("startDate"));
        endDate = GsonParser.parseInt(jsonObject.get("endDate"));
        referenceId = GsonParser.parseString(jsonObject.get("referenceId"));
        classificationType = ScheduleEventClassificationType.get(GsonParser.parseInt(jsonObject.get("classificationType")));
        geoLatitude = GsonParser.parseDouble(jsonObject.get("geoLatitude"));
        geoLongitude = GsonParser.parseDouble(jsonObject.get("geoLongitude"));
        location = GsonParser.parseString(jsonObject.get("location"));
        organizer = GsonParser.parseString(jsonObject.get("organizer"));
        ownerId = GsonParser.parseString(jsonObject.get("ownerId"));
        priority = GsonParser.parseInt(jsonObject.get("priority"));
        sequence = GsonParser.parseInt(jsonObject.get("sequence"));
        recurrenceType = ScheduleEventRecurrenceType.get(GsonParser.parseInt(jsonObject.get("recurrenceType")));
        duration = GsonParser.parseInt(jsonObject.get("duration"));
        contact = GsonParser.parseString(jsonObject.get("contact"));
        comment = GsonParser.parseString(jsonObject.get("comment"));
        tags = GsonParser.parseString(jsonObject.get("tags"));
        createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
        updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
        recurrence = GsonParser.parseObject(jsonObject.getAsJsonObject("recurrence"), ScheduleEventRecurrence.class);

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaScheduleEvent");
        kparams.add("summary", this.summary);
        kparams.add("description", this.description);
        kparams.add("startDate", this.startDate);
        kparams.add("endDate", this.endDate);
        kparams.add("referenceId", this.referenceId);
        kparams.add("classificationType", this.classificationType);
        kparams.add("geoLatitude", this.geoLatitude);
        kparams.add("geoLongitude", this.geoLongitude);
        kparams.add("location", this.location);
        kparams.add("organizer", this.organizer);
        kparams.add("ownerId", this.ownerId);
        kparams.add("priority", this.priority);
        kparams.add("sequence", this.sequence);
        kparams.add("recurrenceType", this.recurrenceType);
        kparams.add("duration", this.duration);
        kparams.add("contact", this.contact);
        kparams.add("comment", this.comment);
        kparams.add("tags", this.tags);
        kparams.add("recurrence", this.recurrence);
        return kparams;
    }

}

