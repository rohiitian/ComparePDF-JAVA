package com.springproject.pdfcompare.controller;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;

@RestController
@RequestMapping("/pdf")
public class PDFController {

    @GetMapping(value = "/download", produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<byte[]> downloadPdf() throws IOException {
        // Load the PDF from the classpath (resource folder)
        Resource pdfResource = new ClassPathResource("static/sample.pdf");

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
