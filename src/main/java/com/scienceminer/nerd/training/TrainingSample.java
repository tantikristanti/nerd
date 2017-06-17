package com.scienceminer.nerd.training;

import java.io.*;
import java.util.*;

/**
 *	Abstract class for representing a training sample of textual documents 
 *  with disambiguisation information 
 * 
 * @param <D> the document object
 */
public abstract class TrainingSample<D> {

	protected List<D> sample = null;

	public List<D> getSample() {
		return sample;
	}

	public abstract void save(File file);

	public abstract void load(File file);
}