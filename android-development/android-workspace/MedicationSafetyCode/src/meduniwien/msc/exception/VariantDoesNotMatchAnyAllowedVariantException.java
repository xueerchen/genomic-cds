package meduniwien.msc.exception;

/** 
 * Reprsents an error when the decoded safetycode number does not match any allowed genetic variant from the Genomic CDS ontology.
 * 
 * @author Jose Antonio Mi�arro Gim�nez
 * */
public class VariantDoesNotMatchAnyAllowedVariantException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public VariantDoesNotMatchAnyAllowedVariantException(String message) {
		super(message);
	}
}
