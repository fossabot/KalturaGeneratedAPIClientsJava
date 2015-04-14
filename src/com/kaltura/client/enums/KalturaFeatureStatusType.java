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
// Copyright (C) 2006-2015  Kaltura Inc.
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
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Tue, 14 Apr 15 00:25:38 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */
public enum KalturaFeatureStatusType implements KalturaEnumAsInt {
    LOCK_CATEGORY (1),
    CATEGORY (2),
    CATEGORY_ENTRY (3),
    ENTRY (4),
    CATEGORY_USER (5),
    USER (6);

    public int hashCode;

    KalturaFeatureStatusType(int hashCode) {
        this.hashCode = hashCode;
    }

    public int getHashCode() {
        return this.hashCode;
    }

    public void setHashCode(int hashCode) {
        this.hashCode = hashCode;
    }

    public static KalturaFeatureStatusType get(int hashCode) {
        switch(hashCode) {
            case 1: return LOCK_CATEGORY;
            case 2: return CATEGORY;
            case 3: return CATEGORY_ENTRY;
            case 4: return ENTRY;
            case 5: return CATEGORY_USER;
            case 6: return USER;
            default: return LOCK_CATEGORY;
        }
    }
}