package com.coderdream;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import part1.chapter04.MyFirstTable;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class MyServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6703993436577206766L;

	// protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// PrintWriter pw = resp.getWriter();
	// pw.println("hello Servlet");
	//
	// System.out.println("####");
	// }

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// Document doc = new Document();
		// ByteArrayOutputStream baosPDF = new ByteArrayOutputStream();
		// PdfWriter docWriter = null;
		// try {
		// docWriter = PdfWriter.getInstance(doc, baosPDF);
		//
		// // ...
		// // 用add方法把内容添加到Document中。
		// doc.add(new Paragraph("This document was created by a class named: " + this.getClass().getName()));
		// doc.add(new Paragraph("This document was created on " + new java.util.Date()));
		//
		// } catch (DocumentException e) {
		// e.printStackTrace();
		// }
		//
		// // 当你添加完内容后，要关闭Document和PdfWriter对象。
		// doc.close();
		// docWriter.close();
		// // 当关闭文档后，ByteArrayOutputStream对象返回到调用者。
		// // return baosPDF;
		//
		// resp.setContentType("application/pdf");
		// resp.setContentLength(baosPDF.size());
		// ServletOutputStream out = resp.getOutputStream();
		// baosPDF.writeTo(out);
		// out.flush();

		// com.lowagie.text.DocumentException a = null;
		Document document = new Document(PageSize.A4, 36, 36, 36, 36);
		ByteArrayOutputStream ba = new ByteArrayOutputStream();
		try {
			PdfWriter.getInstance(document, ba);
			document.open();
			document.add(new Paragraph("Hello World, 你好！"));

			document.add(MyFirstTable.createFirstTable());

		} catch (DocumentException de) {
			de.printStackTrace();
			System.err.println("A Document error:" + de.getMessage());
		}
		document.close();
		resp.setContentType("application/pdf");
		resp.setContentLength(ba.size());
		ServletOutputStream out = resp.getOutputStream();
		ba.writeTo(out);
		out.flush();
	}
}