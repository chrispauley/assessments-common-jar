package org.hros.assessments.bod;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

import javax.xml.bind.JAXBException;

import junit.framework.TestCase;

import org.hros.assessments.model.*;
import org.hros.common.model.Serializer;

public class ShowAssessmentReportStatus extends TestCase {

	private final String FILENAME = "Step_03_ShowAssessmentReportStatus_";
	private final String ALT_ID = "AssessmentsWorkGroup_StepByStepTest_01";
	private final String DOCUMENT_ID = "doc_01";
	private final String SUPPLIER_PARTY = "Healthcare SKA Assessments, Inc.";
	private final String PACKAGE_ID = "packageId_01";
	private final String SUBJECT_NAME = "John Smith";

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testCreateReports() {
		ArrayList<AssessmentStatusCodeType> sts = new ArrayList<>();
		sts.add(AssessmentStatusCodeType.ERROR);
		sts.add(AssessmentStatusCodeType.ORDER_ACKNOWLEDGED);
		sts.add(AssessmentStatusCodeType.ORDER_IN_PROGRESS);
		sts.add(AssessmentStatusCodeType.TEST_PENDING_SCHEDULING);
		sts.add(AssessmentStatusCodeType.TEST_SCHEDULED);
		sts.add(AssessmentStatusCodeType.COMPLETED_TEST_PENDING_SCORING);
		sts.add(AssessmentStatusCodeType.SCORED_TEST_PENDING_REVIEW);
		sts.add(AssessmentStatusCodeType.ORDER_COMPLETE);

		for (int i = 0; i < sts.size(); i++) {
			System.out.println(sts.get(i));
			createReport(i, sts.get(i));
		}
	}

	private void createReport(int counter, AssessmentStatusCodeType as) {
		AssessmentReportType ar = new AssessmentReportType();

		ar.setDocumentId(DOCUMENT_ID);
		ar.getAlternateDocumentIds().add(FILENAME + counter);
		ar.getAlternateDocumentIds().add(ALT_ID);
		ar.setSupplierParty(createPartyType(SUPPLIER_PARTY));
		ar.setAssessmentSubject(createAssessmentSubject());
		ar.setAssessmentResult(createAssessmentResult(as));
		System.out.println("Result: "
				+ ar.getAssessmentResult().getAssessmentStatus()
						.getAssessmentStatusCode());

		try {
			String filename = "./data/Assessments/" + FILENAME + counter
					+ ".json";
			File file = new File(filename);
			FileOutputStream fos = new FileOutputStream(file);
			Serializer.marshalJSON(ar, fos);
			fos.close();
		} catch (JAXBException | IOException e) {
			e.printStackTrace();
		}
	}

	private AssessmentResultType createAssessmentResult(
			AssessmentStatusCodeType as) {
		AssessmentResultType ar = new AssessmentResultType();
		ar.setPackageId(PACKAGE_ID);
		ar.setAssessmentStatus(createAssessmentStatus(as));

		if (as.equals(AssessmentStatusCodeType.ORDER_COMPLETE)) {
			ar.setAssessmentOverallResult(createOverallResult());
		}
		return ar;
	}

	private AssessmentScoreType createOverallResult() {
		AssessmentScoreType ast = new AssessmentScoreType();
		ast.setPassedIndicator(Boolean.TRUE);
		ast.setAssessedCompetency(createSpecifiedCompetency());
		ast.setScore(createScore());
		return ast;
	}

	private ScoreType createScore() {
		ScoreType score = new ScoreType();
		score.getScoreNumeric().add(createScoreNumeric());
		return score;
	}

	private ScoreNumericType createScoreNumeric() {
		ScoreNumericType n = new ScoreNumericType();
		n.setScoreNumericCode(BigDecimal.valueOf(100));
		return n;
	}

	private SpecifiedCompetencyType createSpecifiedCompetency() {
		SpecifiedCompetencyType comp = new SpecifiedCompetencyType();
		comp.setCompetencyName("Record Keeping");
		return comp;
	}

	private AssessmentStatusType createAssessmentStatus(
			AssessmentStatusCodeType asc) {
		AssessmentStatusType ast = new AssessmentStatusType();
		ast.setAssessmentStatusCode(asc);
		// ast.getDescription().add("Client has not completed the test.");
		if (asc.equals(AssessmentStatusCodeType.ERROR)) {
			ast.getDescription().add("Document not found.");
			return ast;
		} else if (asc.equals(AssessmentStatusCodeType.ORDER_ACKNOWLEDGED)) {
			ast.getDescription().add("We got your order. Thx!");
			return ast;
		} else if (asc.equals(AssessmentStatusCodeType.ORDER_IN_PROGRESS)) {
			ast.getDescription().add("Working on it...");
			return ast;
		} else if (asc.equals(AssessmentStatusCodeType.TEST_PENDING_SCHEDULING)) {
			ast.getDescription().add("Pick a time, ok?");
			return ast;
		} else if (asc.equals(AssessmentStatusCodeType.TEST_SCHEDULED)) {
			ast.getDescription().add("The test will happen on...");
			return ast;
		} else if (asc
				.equals(AssessmentStatusCodeType.COMPLETED_TEST_PENDING_SCORING)) {
			ast.getDescription().add(
					"The test was completed. Waiting for the scoring.");
			return ast;
		} else if (asc
				.equals(AssessmentStatusCodeType.SCORED_TEST_PENDING_REVIEW)) {
			ast.getDescription().add(
					"The test was completed and scored. Waiting for review.");
			return ast;
		} else if (asc.equals(AssessmentStatusCodeType.ORDER_COMPLETE)) {
			ast.getDescription().add("All done. Here are the results.");
			return ast;
		}
		return ast;
	}

	public void testShowAssessmentReportStatus() {
		AssessmentReportType ar = new AssessmentReportType();

		ar.setDocumentId(DOCUMENT_ID);
		ar.getAlternateDocumentIds().add(FILENAME);
		ar.setSupplierParty(createPartyType(SUPPLIER_PARTY));
		ar.setAssessmentSubject(createAssessmentSubject());
		ar.setAssessmentResult(createAssessmentResult());
		System.out.println("Result: "
				+ ar.getAssessmentResult().getAssessmentStatus()
						.getAssessmentStatusCode());
		try {
			String filename = "./data/Assessments/" + FILENAME + ".json";
			File file = new File(filename);
			FileOutputStream fos = new FileOutputStream(file);
			Serializer.marshalJSON(ar, fos);
			fos.close();
		} catch (JAXBException | IOException e) {
			e.printStackTrace();
		}
	}

	private AssessmentSubjectType createAssessmentSubject() {
		AssessmentSubjectType as = new AssessmentSubjectType();
		as.setPersonName(SUBJECT_NAME);
		return as;
	}

	private PartyType createPartyType(String taxId) {
		PartyType pt = new PartyType();
		pt.setName(taxId);
		return pt;
	}

	private AssessmentResultType createAssessmentResult() {
		AssessmentResultType ar = new AssessmentResultType();
		ar.setPackageId(PACKAGE_ID);
		ar.setAssessmentStatus(createAssessmentStatus());
		return ar;
	}

	private AssessmentStatusType createAssessmentStatus() {
		AssessmentStatusType as = new AssessmentStatusType();
		as.setAssessmentStatusCode(AssessmentStatusCodeType.ORDER_ACKNOWLEDGED);
		as.getDescription().add("Client has not completed the test.");
		return as;
	}

}
