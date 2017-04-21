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
package com.kaltura.client.enums;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */
public enum KalturaBaseEntryCloneOptions implements KalturaEnumAsString {
    AD_CUE_POINTS ("adCuePoint.AD_CUE_POINTS"),
    ANNOTATION_CUE_POINTS ("annotation.ANNOTATION_CUE_POINTS"),
    CODE_CUE_POINTS ("codeCuePoint.CODE_CUE_POINTS"),
    THUMB_CUE_POINTS ("thumbCuePoint.THUMB_CUE_POINTS"),
    USERS ("1"),
    CATEGORIES ("2"),
    CHILD_ENTRIES ("3"),
    ACCESS_CONTROL ("4");

    public String hashCode;

    KalturaBaseEntryCloneOptions(String hashCode) {
        this.hashCode = hashCode;
    }

    public String getHashCode() {
        return this.hashCode;
    }

    public void setHashCode(String hashCode) {
        this.hashCode = hashCode;
    }

    public static KalturaBaseEntryCloneOptions get(String hashCode) {
        if (hashCode.equals("adCuePoint.AD_CUE_POINTS"))
        {
           return AD_CUE_POINTS;
        }
        else 
        if (hashCode.equals("annotation.ANNOTATION_CUE_POINTS"))
        {
           return ANNOTATION_CUE_POINTS;
        }
        else 
        if (hashCode.equals("codeCuePoint.CODE_CUE_POINTS"))
        {
           return CODE_CUE_POINTS;
        }
        else 
        if (hashCode.equals("thumbCuePoint.THUMB_CUE_POINTS"))
        {
           return THUMB_CUE_POINTS;
        }
        else 
        if (hashCode.equals("1"))
        {
           return USERS;
        }
        else 
        if (hashCode.equals("2"))
        {
           return CATEGORIES;
        }
        else 
        if (hashCode.equals("3"))
        {
           return CHILD_ENTRIES;
        }
        else 
        if (hashCode.equals("4"))
        {
           return ACCESS_CONTROL;
        }
        else 
        {
           return AD_CUE_POINTS;
        }
    }
}
