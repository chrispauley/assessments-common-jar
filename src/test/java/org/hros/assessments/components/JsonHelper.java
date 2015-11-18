package org.hros.assessments.components;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.fge.jsonschema.report.ProcessingMessage;
import com.github.fge.jsonschema.report.ProcessingReport;
import com.github.fge.jsonschema.util.JsonLoader;

public class JsonHelper {

    private static final String PKGBASE;

    static {
        final String pkgName = JsonHelper.class.getPackage().getName();
        PKGBASE = '/' + pkgName.replace(".", "/");
    }
    
    /**
     * Print a validation report to stdout
     *
     * <p>Will print whether validation succeeded. In the event of a failure,
     * dumps validation error messages.</p>
     *
     * @param report the report
     */
    protected static void printReport(final ProcessingReport report)
    {
        final boolean success = report.isSuccess();
        System.out.println("Validation " + (success ? "succeeded" : "failed"));

        if (!success) {
            System.out.println("---- BEGIN REPORT ----");
            for (final ProcessingMessage message : report)
                System.out.println(message);
            System.out.println("---- END REPORT ----");
        }
    }

    /**
     * Load one resource from the current package as a {@link JsonNode}
     *
     * @param name name of the resource (<b>MUST</b> start with {@code /}
     * @return a JSON document
     * @throws IOException resource not found
     */
    protected static JsonNode loadResource(final String name)
        throws IOException
    {
        return JsonLoader.fromResource(PKGBASE + name);
    }
}
