/*
 * Copyright (C) 2011 Paul Stoellberger
 *
 * This program is free software; you can redistribute it and/or modify it 
 * under the terms of the GNU General Public License as published by the Free 
 * Software Foundation; either version 2 of the License, or (at your option) 
 * any later version.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along 
 * with this program; if not, write to the Free Software Foundation, Inc., 
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA 
 *
 */

package org.saiku.olap.dto;

public class SaikuQuery extends AbstractSaikuObject {

	private SaikuCube cube;

	public SaikuQuery() {
		super(null,null);
		throw new RuntimeException("Unsupported Constructor. Serialization only");
	}

	public SaikuQuery(String name, SaikuCube cube) {
		super(name,name);
		this.cube = cube;
	}

	@Override
	public String getUniqueName() {
		String uniqueName = cube.getUniqueName() + ".[" + getName() + "]";
		return uniqueName;
	}
	
	public SaikuCube getCube() {
			return cube;
	}
}

