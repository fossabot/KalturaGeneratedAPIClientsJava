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
import com.kaltura.client.enums.ResponseType;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Evaluates PHP statement, depends on the execution context  */
@SuppressWarnings("serial")
public class HttpNotificationObjectData extends HttpNotificationData {

	/**  Kaltura API object type  */
    private String apiObjectType;
	/**  Data format  */
    private ResponseType format;
	/**  Ignore null attributes during serialization  */
    private Boolean ignoreNull;
	/**  PHP code  */
    private String code;

    // apiObjectType:
    public String getApiObjectType(){
        return this.apiObjectType;
    }
    public void setApiObjectType(String apiObjectType){
        this.apiObjectType = apiObjectType;
    }

    // format:
    public ResponseType getFormat(){
        return this.format;
    }
    public void setFormat(ResponseType format){
        this.format = format;
    }

    // ignoreNull:
    public Boolean getIgnoreNull(){
        return this.ignoreNull;
    }
    public void setIgnoreNull(Boolean ignoreNull){
        this.ignoreNull = ignoreNull;
    }

    // code:
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }


    public HttpNotificationObjectData() {
       super();
    }

    public HttpNotificationObjectData(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        apiObjectType = GsonParser.parseString(jsonObject.get("apiObjectType"));
        format = ResponseType.get(GsonParser.parseInt(jsonObject.get("format")));
        ignoreNull = GsonParser.parseBoolean(jsonObject.get("ignoreNull"));
        code = GsonParser.parseString(jsonObject.get("code"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaHttpNotificationObjectData");
        kparams.add("apiObjectType", this.apiObjectType);
        kparams.add("format", this.format);
        kparams.add("ignoreNull", this.ignoreNull);
        kparams.add("code", this.code);
        return kparams;
    }

}
