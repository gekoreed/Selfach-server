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
public class PhotoRecord extends org.jooq.impl.UpdatableRecordImpl<PhotoRecord> implements org.jooq.Record5<Integer, Integer, String, String, Integer> {

	private static final long serialVersionUID = 1059980727;

	/**
	 * Setter for <code>selfach.Photo.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>selfach.Photo.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>selfach.Photo.userId</code>.
	 */
	public void setUserid(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>selfach.Photo.userId</code>.
	 */
	public Integer getUserid() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>selfach.Photo.format</code>.
	 */
	public void setFormat(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>selfach.Photo.format</code>.
	 */
	public String getFormat() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>selfach.Photo.created</code>.
	 */
	public void setCreated(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>selfach.Photo.created</code>.
	 */
	public String getCreated() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>selfach.Photo.cameraId</code>.
	 */
	public void setCameraid(Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>selfach.Photo.cameraId</code>.
	 */
	public Integer getCameraid() {
		return (Integer) getValue(4);
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
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<Integer, Integer, String, String, Integer> fieldsRow() {
		return (org.jooq.Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<Integer, Integer, String, String, Integer> valuesRow() {
		return (org.jooq.Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<Integer> field1() {
		return com.selfach.dao.jooq.tables.Photo.PHOTO.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<Integer> field2() {
		return com.selfach.dao.jooq.tables.Photo.PHOTO.USERID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<String> field3() {
		return com.selfach.dao.jooq.tables.Photo.PHOTO.FORMAT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<String> field4() {
		return com.selfach.dao.jooq.tables.Photo.PHOTO.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<Integer> field5() {
		return com.selfach.dao.jooq.tables.Photo.PHOTO.CAMERAID;
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
	public Integer value2() {
		return getUserid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getFormat();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getCameraid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhotoRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhotoRecord value2(Integer value) {
		setUserid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhotoRecord value3(String value) {
		setFormat(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhotoRecord value4(String value) {
		setCreated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhotoRecord value5(Integer value) {
		setCameraid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhotoRecord values(Integer value1, Integer value2, String value3, String value4, Integer value5) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PhotoRecord
	 */
	public PhotoRecord() {
		super(com.selfach.dao.jooq.tables.Photo.PHOTO);
	}

	/**
	 * Create a detached, initialised PhotoRecord
	 */
	public PhotoRecord(Integer id, Integer userid, String format, String created, Integer cameraid) {
		super(com.selfach.dao.jooq.tables.Photo.PHOTO);

		setValue(0, id);
		setValue(1, userid);
		setValue(2, format);
		setValue(3, created);
		setValue(4, cameraid);
	}
}