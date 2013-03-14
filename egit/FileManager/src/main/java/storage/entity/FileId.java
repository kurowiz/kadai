package storage.entity;

import javax.persistence.Column;

public class FileId {

	public static final String TABLE = "file_id";
	@Column(name = "file_id")
	public Integer fileId;

	public Integer getFileId() {
		return fileId;
	}

	public void setFileId(Integer fileId) {
		this.fileId = fileId;
	}

}
