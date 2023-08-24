package com.springproject.pdfcompare.service;

import de.redsix.pdfcompare.PdfComparator;

public class ComparePDF {
	public static void main(String[] args) throws Exception{
		String file1 ="D:\\Project\\pdfcompare\\src\\main\\resources\\static/file1.pdf";
		String file2 ="D:\\Project\\pdfcompare\\src\\main\\resources\\static/file2.pdf";
		String resultfile ="D:\\Project\\pdfcompare\\src\\main\\resources\\static\\result/output";
		new PdfComparator(file1, file2).compare().writeTo(resultfile);
		System.out.print("Process Complete");
	}

}
