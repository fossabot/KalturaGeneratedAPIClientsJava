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
 * @date Sat, 12 Sep 15 02:29:48 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */
public enum KalturaTrackEntryEventType implements KalturaEnumAsInt {
    UPLOADED_FILE (1),
    WEBCAM_COMPLETED (2),
    IMPORT_STARTED (3),
    ADD_ENTRY (4),
    UPDATE_ENTRY (5),
    DELETED_ENTRY (6);

    public int hashCode;

    KalturaTrackEntryEventType(int hashCode) {
        this.hashCode = hashCode;
    }

    public int getHashCode() {
        return this.hashCode;
    }

    public void setHashCode(int hashCode) {
        this.hashCode = hashCode;
    }

    public static KalturaTrackEntryEventType get(int hashCode) {
        switch(hashCode) {
            case 1: return UPLOADED_FILE;
            case 2: return WEBCAM_COMPLETED;
            case 3: return IMPORT_STARTED;
            case 4: return ADD_ENTRY;
            case 5: return UPDATE_ENTRY;
            case 6: return DELETED_ENTRY;
            default: return UPLOADED_FILE;
        }
    }
}
