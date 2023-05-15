package org.example.backend.two;

import org.example.api.IStuffA;

public class TwoStuffA implements IStuffA {
	@Override
	public String getAttributeOne() {
		return null;
	}

	@Override
	public String getAttributeTwo() {
		return null;
	}

	@Override
	public int getSomeCount() {
		return 0;
	}

	public int getMyCount() {
		return getSomeCount();
	}
}
