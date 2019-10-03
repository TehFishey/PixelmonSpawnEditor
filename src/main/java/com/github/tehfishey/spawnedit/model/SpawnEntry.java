package com.github.tehfishey.spawnedit.model;

import java.util.ArrayList;
import java.util.HashMap;

import com.github.tehfishey.spawnedit.model.helpers.TableEntryFactory;
import com.github.tehfishey.spawnedit.pixelmon.SpawnInfoPokemon;

public class SpawnEntry {

	String spawnSetId;
	int spawnSetIndex;
	SpawnInfoPokemon spawnInfo;
	ArrayList<HashMap<String, Object>> tableEntries;
	
	public SpawnEntry(String spawnSetId, int spawnSetIndex, SpawnInfoPokemon spawnInfo) {
		this.spawnSetId = spawnSetId;
		this.spawnSetIndex = spawnSetIndex;
		this.spawnInfo = spawnInfo;
		this.tableEntries = TableEntryFactory.buildEntries(this);
	}
	
	public ArrayList<HashMap<String, Object>> getTableEntries() {
		return tableEntries;
	}
	
	public String getSpawnSetId() { return spawnSetId; }
	public int getSpawnSetIndex() { return spawnSetIndex; }
	public SpawnInfoPokemon getSpawnInfo() { return spawnInfo; }
	
	
}