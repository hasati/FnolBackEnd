package com.fnol.dto;

import java.util.Arrays;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as=FileUploadDTO.class)
@JsonTypeInfo(use =JsonTypeInfo.Id.NONE,
include = JsonTypeInfo.As.PROPERTY,
property = "file")
@JsonSubTypes({
    @JsonSubTypes.Type(value = DriverDetailsDTO.class, name = "DriverDetailsDTO"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class FileUploadDTO {
	
	@JsonProperty
		private String fileDescription; 
	@JsonProperty(value="file")    
	private MultipartFile fileDatas;
	    
		public String getFileDescription() {
			return fileDescription;
		}
		public void setFileDescription(String fileDescription) {
			this.fileDescription = fileDescription;
		}
		public MultipartFile getFileDatas() {
			return fileDatas;
		}
		public void setFileDatas(MultipartFile fileDatas) {
			this.fileDatas = fileDatas;
		}
		@Override
		public String toString() {
			return "FileUploadDTO [fileDescription=" + fileDescription
					+ ", fileDatas=" + fileDatas + "]";
		}
	  
	    

}