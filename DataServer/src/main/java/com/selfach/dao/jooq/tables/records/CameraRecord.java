/**
 * This class is generated by jOOQ
 */
package com.selfach.dao.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.5" },
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CameraRecord extends org.jooq.impl.UpdatableRecordImpl<CameraRecord> implements org.jooq.Record8<Integer, String, String, String, String, String, Integer, String> {

	private static final long serialVersionUID = 1153356269;

	/**
	 * Setter for <code>selfach.Camera.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>selfach.Camera.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>selfach.Camera.name</code>.
	 */
	public void setName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>selfach.Camera.name</code>.
	 */
	public String getName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>selfach.Camera.url</code>.
	 */
	public void setUrl(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>selfach.Camera.url</code>.
	 */
	public String getUrl() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>selfach.Camera.longitude</code>.
	 */
	public void setLongitude(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>selfach.Camera.longitude</code>.
	 */
	public String getLongitude() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>selfach.Camera.latitude</code>.
	 */
	public void setLatitude(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>selfach.Camera.latitude</code>.
	 */
	public String getLatitude() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>selfach.Camera.vector</code>.
	 */
	public void setVector(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>selfach.Camera.vector</code>.
	 */
	public String getVector() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>selfach.Camera.angle</code>.
	 */
	public void setAngle(Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>selfach.Camera.angle</code>.
	 */
	public Integer getAngle() {
		return (Integer) getValue(6);
	}

	/**
	 * Setter for <code>selfach.Camera.description</code>.
	 */
	public void setDescription(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>selfach.Camera.description</code>.
	 */
	public String getDescription() {
		return (String) getValue(7);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<Integer, String, String, String, String, String, Integer, String> fieldsRow() {
		return (org.jooq.Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<Integer, String, String, String, String, String, Integer, String> valuesRow() {
		return (org.jooq.Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<Integer> field1() {
		return com.selfach.dao.jooq.tables.Camera.CAMERA.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<String> field2() {
		return com.selfach.dao.jooq.tables.Camera.CAMERA.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<String> field3() {
		return com.selfach.dao.jooq.tables.Camera.CAMERA.URL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<String> field4() {
		return com.selfach.dao.jooq.tables.Camera.CAMERA.LONGITUDE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<String> field5() {
		return com.selfach.dao.jooq.tables.Camera.CAMERA.LATITUDE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<String> field6() {
		return com.selfach.dao.jooq.tables.Camera.CAMERA.VECTOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<Integer> field7() {
		return com.selfach.dao.jooq.tables.Camera.CAMERA.ANGLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<String> field8() {
		return com.selfach.dao.jooq.tables.Camera.CAMERA.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getUrl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getLongitude();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getLatitude();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getVector();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value7() {
		return getAngle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CameraRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CameraRecord value2(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CameraRecord value3(String value) {
		setUrl(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CameraRecord value4(String value) {
		setLongitude(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CameraRecord value5(String value) {
		setLatitude(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CameraRecord value6(String value) {
		setVector(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CameraRecord value7(Integer value) {
		setAngle(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CameraRecord value8(String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CameraRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, Integer value7, String value8) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CameraRecord
	 */
	public CameraRecord() {
		super(com.selfach.dao.jooq.tables.Camera.CAMERA);
	}

	/**
	 * Create a detached, initialised CameraRecord
	 */
	public CameraRecord(Integer id, String name, String url, String longitude, String latitude, String vector, Integer angle, String description) {
		super(com.selfach.dao.jooq.tables.Camera.CAMERA);

		setValue(0, id);
		setValue(1, name);
		setValue(2, url);
		setValue(3, longitude);
		setValue(4, latitude);
		setValue(5, vector);
		setValue(6, angle);
		setValue(7, description);
	}
}