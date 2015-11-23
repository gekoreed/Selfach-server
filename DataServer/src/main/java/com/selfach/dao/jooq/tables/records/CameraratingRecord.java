/**
 * This class is generated by jOOQ
 */
package com.selfach.dao.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.5" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CameraratingRecord extends org.jooq.impl.UpdatableRecordImpl<com.selfach.dao.jooq.tables.records.CameraratingRecord> implements org.jooq.Record4<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = 694983411;

	/**
	 * Setter for <code>selfach.CameraRating.id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>selfach.CameraRating.id</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>selfach.CameraRating.cameraId</code>.
	 */
	public void setCameraid(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>selfach.CameraRating.cameraId</code>.
	 */
	public java.lang.Integer getCameraid() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>selfach.CameraRating.userId</code>.
	 */
	public void setUserid(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>selfach.CameraRating.userId</code>.
	 */
	public java.lang.Integer getUserid() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>selfach.CameraRating.raiting</code>.
	 */
	public void setRaiting(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>selfach.CameraRating.raiting</code>.
	 */
	public java.lang.Integer getRaiting() {
		return (java.lang.Integer) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.selfach.dao.jooq.tables.Camerarating.CAMERARATING.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return com.selfach.dao.jooq.tables.Camerarating.CAMERARATING.CAMERAID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return com.selfach.dao.jooq.tables.Camerarating.CAMERARATING.USERID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return com.selfach.dao.jooq.tables.Camerarating.CAMERARATING.RAITING;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getCameraid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getUserid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getRaiting();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CameraratingRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CameraratingRecord value2(java.lang.Integer value) {
		setCameraid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CameraratingRecord value3(java.lang.Integer value) {
		setUserid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CameraratingRecord value4(java.lang.Integer value) {
		setRaiting(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CameraratingRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.Integer value3, java.lang.Integer value4) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CameraratingRecord
	 */
	public CameraratingRecord() {
		super(com.selfach.dao.jooq.tables.Camerarating.CAMERARATING);
	}

	/**
	 * Create a detached, initialised CameraratingRecord
	 */
	public CameraratingRecord(java.lang.Integer id, java.lang.Integer cameraid, java.lang.Integer userid, java.lang.Integer raiting) {
		super(com.selfach.dao.jooq.tables.Camerarating.CAMERARATING);

		setValue(0, id);
		setValue(1, cameraid);
		setValue(2, userid);
		setValue(3, raiting);
	}
}