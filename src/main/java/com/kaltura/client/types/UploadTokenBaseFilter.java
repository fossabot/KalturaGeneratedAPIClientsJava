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
import com.kaltura.client.enums.UploadTokenStatus;
import com.kaltura.client.utils.GsonParser;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public abstract class UploadTokenBaseFilter extends Filter {

    private String idEqual;
    private String idIn;
    private String userIdEqual;
    private UploadTokenStatus statusEqual;
    private String statusIn;
    private String fileNameEqual;
    private Double fileSizeEqual;

    // idEqual:
    public String getIdEqual(){
        return this.idEqual;
    }
    public void setIdEqual(String idEqual){
        this.idEqual = idEqual;
    }

    // idIn:
    public String getIdIn(){
        return this.idIn;
    }
    public void setIdIn(String idIn){
        this.idIn = idIn;
    }

    // userIdEqual:
    public String getUserIdEqual(){
        return this.userIdEqual;
    }
    public void setUserIdEqual(String userIdEqual){
        this.userIdEqual = userIdEqual;
    }

    // statusEqual:
    public UploadTokenStatus getStatusEqual(){
        return this.statusEqual;
    }
    public void setStatusEqual(UploadTokenStatus statusEqual){
        this.statusEqual = statusEqual;
    }

    // statusIn:
    public String getStatusIn(){
        return this.statusIn;
    }
    public void setStatusIn(String statusIn){
        this.statusIn = statusIn;
    }

    // fileNameEqual:
    public String getFileNameEqual(){
        return this.fileNameEqual;
    }
    public void setFileNameEqual(String fileNameEqual){
        this.fileNameEqual = fileNameEqual;
    }

    // fileSizeEqual:
    public Double getFileSizeEqual(){
        return this.fileSizeEqual;
    }
    public void setFileSizeEqual(Double fileSizeEqual){
        this.fileSizeEqual = fileSizeEqual;
    }


    public UploadTokenBaseFilter() {
       super();
    }

    public UploadTokenBaseFilter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        idEqual = GsonParser.parseString(jsonObject.get("idEqual"));
        idIn = GsonParser.parseString(jsonObject.get("idIn"));
        userIdEqual = GsonParser.parseString(jsonObject.get("userIdEqual"));
        statusEqual = UploadTokenStatus.get(GsonParser.parseInt(jsonObject.get("statusEqual")));
        statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
        fileNameEqual = GsonParser.parseString(jsonObject.get("fileNameEqual"));
        fileSizeEqual = GsonParser.parseDouble(jsonObject.get("fileSizeEqual"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaUploadTokenBaseFilter");
        kparams.add("idEqual", this.idEqual);
        kparams.add("idIn", this.idIn);
        kparams.add("userIdEqual", this.userIdEqual);
        kparams.add("statusEqual", this.statusEqual);
        kparams.add("statusIn", this.statusIn);
        kparams.add("fileNameEqual", this.fileNameEqual);
        kparams.add("fileSizeEqual", this.fileSizeEqual);
        return kparams;
    }

}

