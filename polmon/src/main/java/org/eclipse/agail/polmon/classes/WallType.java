/*********************************************************************
* Copyright (c) 2017-11-28 Christoph Uran (TU Graz)
*
* This program and the accompanying materials are made
* available under the terms of the Eclipse Public License 2.0
* which is available at https://www.eclipse.org/legal/epl-2.0/
*
* SPDX-License-Identifier: EPL-2.0
**********************************************************************/

package org.eclipse.agail.polmon.classes;

public class WallType {
	private int		id;
	private String	wallpaper = "",
					plasticCladding = "",
					woodenPanels = "",
					moquette = "",
					tiles = "",
					plaster = "";
	
	public WallType(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public String getWallpaper() {
		return wallpaper;
	}
	public String getPlasticCladding() {
		return plasticCladding;
	}
	public String getWoodenPanels() {
		return woodenPanels;
	}
	public String getMoquette() {
		return moquette;
	}
	public String getTiles() {
		return tiles;
	}
	public String getPlaster() {
		return plaster;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setWallpaper(String wallpaper) {
		this.wallpaper = wallpaper;
	}
	public void setPlasticCladding(String plasticCladding) {
		this.plasticCladding = plasticCladding;
	}
	public void setWoodenPanels(String woodenPanels) {
		this.woodenPanels = woodenPanels;
	}
	public void setMoquette(String moquette) {
		this.moquette = moquette;
	}
	public void setTiles(String tiles) {
		this.tiles = tiles;
	}
	public void setPlaster(String plaster) {
		this.plaster = plaster;
	}
}
