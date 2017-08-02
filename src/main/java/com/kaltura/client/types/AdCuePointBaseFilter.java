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
import com.kaltura.client.enums.AdProtocolType;
import com.kaltura.client.utils.GsonParser;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public abstract class AdCuePointBaseFilter extends CuePointFilter {

    private AdProtocolType protocolTypeEqual;
    private String protocolTypeIn;
    private String titleLike;
    private String titleMultiLikeOr;
    private String titleMultiLikeAnd;
    private Integer endTimeGreaterThanOrEqual;
    private Integer endTimeLessThanOrEqual;
    private Integer durationGreaterThanOrEqual;
    private Integer durationLessThanOrEqual;

    // protocolTypeEqual:
    public AdProtocolType getProtocolTypeEqual(){
        return this.protocolTypeEqual;
    }
    public void setProtocolTypeEqual(AdProtocolType protocolTypeEqual){
        this.protocolTypeEqual = protocolTypeEqual;
    }

    // protocolTypeIn:
    public String getProtocolTypeIn(){
        return this.protocolTypeIn;
    }
    public void setProtocolTypeIn(String protocolTypeIn){
        this.protocolTypeIn = protocolTypeIn;
    }

    // titleLike:
    public String getTitleLike(){
        return this.titleLike;
    }
    public void setTitleLike(String titleLike){
        this.titleLike = titleLike;
    }

    // titleMultiLikeOr:
    public String getTitleMultiLikeOr(){
        return this.titleMultiLikeOr;
    }
    public void setTitleMultiLikeOr(String titleMultiLikeOr){
        this.titleMultiLikeOr = titleMultiLikeOr;
    }

    // titleMultiLikeAnd:
    public String getTitleMultiLikeAnd(){
        return this.titleMultiLikeAnd;
    }
    public void setTitleMultiLikeAnd(String titleMultiLikeAnd){
        this.titleMultiLikeAnd = titleMultiLikeAnd;
    }

    // endTimeGreaterThanOrEqual:
    public Integer getEndTimeGreaterThanOrEqual(){
        return this.endTimeGreaterThanOrEqual;
    }
    public void setEndTimeGreaterThanOrEqual(Integer endTimeGreaterThanOrEqual){
        this.endTimeGreaterThanOrEqual = endTimeGreaterThanOrEqual;
    }

    // endTimeLessThanOrEqual:
    public Integer getEndTimeLessThanOrEqual(){
        return this.endTimeLessThanOrEqual;
    }
    public void setEndTimeLessThanOrEqual(Integer endTimeLessThanOrEqual){
        this.endTimeLessThanOrEqual = endTimeLessThanOrEqual;
    }

    // durationGreaterThanOrEqual:
    public Integer getDurationGreaterThanOrEqual(){
        return this.durationGreaterThanOrEqual;
    }
    public void setDurationGreaterThanOrEqual(Integer durationGreaterThanOrEqual){
        this.durationGreaterThanOrEqual = durationGreaterThanOrEqual;
    }

    // durationLessThanOrEqual:
    public Integer getDurationLessThanOrEqual(){
        return this.durationLessThanOrEqual;
    }
    public void setDurationLessThanOrEqual(Integer durationLessThanOrEqual){
        this.durationLessThanOrEqual = durationLessThanOrEqual;
    }


    public AdCuePointBaseFilter() {
       super();
    }

    public AdCuePointBaseFilter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        protocolTypeEqual = AdProtocolType.get(GsonParser.parseString(jsonObject.get("protocolTypeEqual")));
        protocolTypeIn = GsonParser.parseString(jsonObject.get("protocolTypeIn"));
        titleLike = GsonParser.parseString(jsonObject.get("titleLike"));
        titleMultiLikeOr = GsonParser.parseString(jsonObject.get("titleMultiLikeOr"));
        titleMultiLikeAnd = GsonParser.parseString(jsonObject.get("titleMultiLikeAnd"));
        endTimeGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("endTimeGreaterThanOrEqual"));
        endTimeLessThanOrEqual = GsonParser.parseInt(jsonObject.get("endTimeLessThanOrEqual"));
        durationGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("durationGreaterThanOrEqual"));
        durationLessThanOrEqual = GsonParser.parseInt(jsonObject.get("durationLessThanOrEqual"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaAdCuePointBaseFilter");
        kparams.add("protocolTypeEqual", this.protocolTypeEqual);
        kparams.add("protocolTypeIn", this.protocolTypeIn);
        kparams.add("titleLike", this.titleLike);
        kparams.add("titleMultiLikeOr", this.titleMultiLikeOr);
        kparams.add("titleMultiLikeAnd", this.titleMultiLikeAnd);
        kparams.add("endTimeGreaterThanOrEqual", this.endTimeGreaterThanOrEqual);
        kparams.add("endTimeLessThanOrEqual", this.endTimeLessThanOrEqual);
        kparams.add("durationGreaterThanOrEqual", this.durationGreaterThanOrEqual);
        kparams.add("durationLessThanOrEqual", this.durationLessThanOrEqual);
        return kparams;
    }

}

