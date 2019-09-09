package com.fnol.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fnol.dto.DriverDetailsDTO;
import com.fnol.serviceImp.DriverDetailServiceImp;

@RestController
public class DriverDetailsController {


	@Autowired
	DriverDetailServiceImp driverDetailsServiceImp;

	@RequestMapping(value = "/insertDriverDetails", method = RequestMethod.POST, consumes = { "multipart/form-data" })
	public void insertDriverDetails(
			@RequestPart("driverDetails") List<DriverDetailsDTO> driverDetails,
			@RequestPart("file") MultipartFile[] file,
			@RequestPart("file1") MultipartFile[] file2,
			@RequestPart("file3") MultipartFile[] file3,
			@RequestPart("insuredPersonName") String insuredPersonName,
			@RequestPart("insuredPersonCaseNumber") String insuredPersonCaseNumber,
			@RequestPart("insuredPersonEmailId") String insuredPersonEmailId) {
		try {
			driverDetailsServiceImp.checkInsuredDetails(driverDetails,insuredPersonCaseNumber,insuredPersonName,insuredPersonEmailId, file, file2, file3);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// MultipartFile f1;
	/*
	 * @PostMapping("/fileUpload") public void insertInseruedPersonDetails(
	 * 
	 * @RequestParam(value="file") MultipartFile fileFormData) throws
	 * IOException { System.out.println(fileFormData.getName());
	 * System.out.println(fileFormData.getSize()); f1=fileFormData;
	 * BufferedReader bufferedReader = new BufferedReader(new
	 * InputStreamReader(fileFormData.getInputStream(),
	 * StandardCharsets.UTF_8)); byte[] arrayByte=fileFormData.getBytes();
	 * String str = new String(fileFormData.getBytes(), "UTF-8");
	 * System.out.println(str); //
	 * insuredPersonService.insertInsuredPersonDetails(details);
	 * 
	 * }
	 */

	/*
	 * @GetMapping("/getFile") public HttpEntity getDocument(HttpServletResponse
	 * respons) throws IOException { System.out.println(f1);
	 * System.out.println(f1.getOriginalFilename()); HttpHeaders httpHeaders =
	 * new HttpHeaders(); httpHeaders.setContentType(MediaType.IMAGE_JPEG);
	 * String headerKey = "Content-Disposition"; String headerValue =
	 * String.format("attachment; filename=\"%s\"", "Image.jpg");
	 * httpHeaders.set(headerKey, headerValue); byte file[]=f1.getBytes();
	 * //System.out.println(file); // System.out.println(file[2]+"  "+file[3]);
	 * // return new ResponseEntity(file, httpHeaders, HttpStatus.OK);
	 * 
	 * return ResponseEntity.ok() .headers(httpHeaders)
	 * .contentLength(file.length) .body(file);
	 * 
	 * }
	 */

	/*@RequestMapping(value = "/verifyMail")
	public void verifyMail() throws AddressException, MessagingException {
		mailTriggerForVerify.sendHtmlEmail("Himanshu",
				"himanshuasati249@gmail.com", "AXFP123AA");
	}*/

}
