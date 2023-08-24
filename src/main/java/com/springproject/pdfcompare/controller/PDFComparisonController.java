package com.springproject.pdfcompare.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.pdfcompare.service.PDFComparisonService;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

@RestController
@RequestMapping("/pdf")
public class PDFComparisonController {

    private final PDFComparisonService pdfComparisonService;

    @Autowired
    public PDFComparisonController(PDFComparisonService pdfComparisonService) {
        this.pdfComparisonService = pdfComparisonService;
    }

    @GetMapping(value = "/comparepdf", produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<byte[]> compareAndDownloadPDFs() throws IOException {
//        File pdf1 = new File("D:\\Project\\pdfcompare\\src\\main\\resources\\static/file1.pdf");
//        File pdf2 = new File("D:\\Project\\pdfcompare\\src\\main\\resources\\static/file2.pdf");

        String file1 ="D:\\Project\\pdfcompare\\src\\main\\resources\\static/file1.pdf";
        String file2 ="D:\\Project\\pdfcompare\\src\\main\\resources\\static/file2.pdf";
        pdfComparisonService.generateDifferencePdf(file1, file2);
        Resource pdfResource = new ClassPathResource("static\\output.pdf");

        // Read the PDF content into a byte array
        byte[] pdfBytes;
        try (InputStream inputStream = pdfResource.getInputStream()) {
            pdfBytes = inputStream.readAllBytes();
        }

        // Set headers to indicate PDF content
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF);

        return ResponseEntity.ok()
            .headers(headers)
            .body(pdfBytes);
        
       
    }
}
