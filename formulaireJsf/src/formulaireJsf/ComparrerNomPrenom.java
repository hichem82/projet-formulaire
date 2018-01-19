package formulaireJsf;

import java.util.Collection;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;


@FacesValidator(value="comparrerNomPrenom")
public class ComparrerNomPrenom implements Validator{

	private static final String NOM_EXISTE_DEJA = "le nom est prenom sont identiques";

	@Override
	public void validate(FacesContext arg0, UIComponent component, Object value) throws ValidatorException {
		
		UIInput composantNom = (UIInput) component.getAttributes().get("attributComparaison");
        String nom = (String) composantNom.getValue(); 
        String prenom = (String)value;
        if(nom.equals(prenom)) {
            System.out.println("ytfqcYJTDFCYE");
            FacesMessage fmsg = new FacesMessage(FacesMessage.SEVERITY_ERROR, NOM_EXISTE_DEJA, "votre nom est identique au prenom !");
            throw new ValidatorException(fmsg);
        }
        
	
    
            
		
	}

}
