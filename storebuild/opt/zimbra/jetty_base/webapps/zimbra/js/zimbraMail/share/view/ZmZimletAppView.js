/*
 * ***** BEGIN LICENSE BLOCK *****
 * Zimbra Collaboration Suite Web Client
 * Copyright (C) 2008, 2009, 2010, 2013, 2014, 2016 Synacor, Inc.
 *
 * The contents of this file are subject to the Common Public Attribution License Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at: https://www.zimbra.com/license
 * The License is based on the Mozilla Public License Version 1.1 but Sections 14 and 15
 * have been added to cover use of software over a computer network and provide for limited attribution
 * for the Original Developer. In addition, Exhibit A has been modified to be consistent with Exhibit B.
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied.
 * See the License for the specific language governing rights and limitations under the License.
 * The Original Code is Zimbra Open Source Web Client.
 * The Initial Developer of the Original Code is Zimbra, Inc.  All rights to the Original Code were
 * transferred by Zimbra, Inc. to Synacor, Inc. on September 14, 2015.
 *
 * All portions of the code are Copyright (C) 2008, 2009, 2010, 2013, 2014, 2016 Synacor, Inc. All Rights Reserved.
 * ***** END LICENSE BLOCK *****
 */

/**
 * @extends		DwtComposite
 * @private
 */
ZmZimletAppView = function(parent, controller) {
	DwtComposite.call(this, {parent:parent, posStyle:DwtControl.ABSOLUTE_STYLE });
};
ZmZimletAppView.prototype = new DwtComposite;
ZmZimletAppView.prototype.constructor = ZmZimletAppView;

ZmZimletAppView.prototype.toString = function() {
	return "ZmZimletAppView";
};

//
// Public methods
//

ZmZimletAppView.prototype.setContent = function(html) {
	var el = this.getHtmlElement();
	el.innerHTML = html;
};

ZmZimletAppView.prototype.setView = function(view) {
	var el = this.getHtmlElement();
	el.innerHTML = "";
	view.reparent(this);
};