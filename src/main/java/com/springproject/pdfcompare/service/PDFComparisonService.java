package com.springproject.pdfcompare.service;

import de.redsix.pdfcompare.PdfComparator;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

@Service
public class PDFComparisonService {

    public void generateDifferencePdf(String pdf1, String pdf2) throws IOException {
//        File resultPdf = new File("path-to-result.pdf");
        String resultPdf ="D:\\Project\\pdfcompare\\src\\main\\resources\\static\\output";
        PdfComparator comparator = new PdfComparator(pdf1, pdf2);
//        comparator.highlightPdfDifferences(resultPdf);
        comparator.compare().writeTo(resultPdf);

       
    }
}
