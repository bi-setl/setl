package model;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class ConceptTransform {
	private String concept;
	private String sourceType;
	private String targetType;
	private String iriValue;
	private String iriValueType;
	private String sourceCommonProperty;
	private String targetCommonProperty;
	private String sourceABoxLocationString;
	private LinkedHashMap<String, MapperTransform> mapperTransformMap;

	public ConceptTransform() {
		super();
		
		this.concept = "";
		this.sourceType = "";
		this.targetType = "";
		this.iriValue = "";
		this.iriValueType = "";
		this.sourceCommonProperty = "";
		this.targetCommonProperty = "";
		this.sourceABoxLocationString = "";
		this.mapperTransformMap = new LinkedHashMap<String, MapperTransform>();
	}

	public ConceptTransform(String concept, String sourceType, String targetType, String iriValue, String iriValueType,
			String sourceCommonProperty, String targetCommonProperty, String sourceABoxLocationString,
			LinkedHashMap<String, MapperTransform> mapperTransformMap) {
		super();
		this.concept = concept;
		this.sourceType = sourceType;
		this.targetType = targetType;
		this.iriValue = iriValue;
		this.iriValueType = iriValueType;
		this.sourceCommonProperty = sourceCommonProperty;
		this.targetCommonProperty = targetCommonProperty;
		this.sourceABoxLocationString = sourceABoxLocationString;
		this.mapperTransformMap = mapperTransformMap;
	}

	public String getSourceABoxLocationString() {
		return sourceABoxLocationString;
	}

	public void setSourceABoxLocationString(String sourceABoxLocationString) {
		this.sourceABoxLocationString = sourceABoxLocationString;
	}

	public String getIriValue() {
		return iriValue;
	}

	public void setIriValue(String iriValue) {
		this.iriValue = iriValue;
	}

	public String getIriValueType() {
		return iriValueType;
	}

	public void setIriValueType(String iriValueType) {
		this.iriValueType = iriValueType;
	}

	public String getConcept() {
		return concept;
	}

	public void setConcept(String concept) {
		this.concept = concept;
	}

	public String getSourceType() {
		return sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public String getTargetType() {
		return targetType;
	}

	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

	public String getSourceCommonProperty() {
		return sourceCommonProperty;
	}

	public void setSourceCommonProperty(String sourceCommonProperty) {
		this.sourceCommonProperty = sourceCommonProperty;
	}

	public String getTargetCommonProperty() {
		return targetCommonProperty;
	}

	public void setTargetCommonProperty(String targetCommonProperty) {
		this.targetCommonProperty = targetCommonProperty;
	}

	public LinkedHashMap<String, MapperTransform> getMapperTransformMap() {
		return mapperTransformMap;
	}

	public void setMapperTransformMap(LinkedHashMap<String, MapperTransform> mapperTransformMap) {
		this.mapperTransformMap = mapperTransformMap;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return concept;
	}
}
