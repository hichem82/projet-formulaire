package formulaireJsf;

import java.util.Collection;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator
public class ValideNom implements Validator{

	private static final String NOM_EXISTE_DEJA = "Ce nom n'est pas valide";

	@Override
	public void validate(FacesContext arg0, UIComponent component, Object value) throws ValidatorException {
		// TODO Auto-generated method stub
		System.out.println("essai de validation");
        String nom = (String) value;
        
        
       // try {
            if (nom.length()<2 ) {
            	System.out.println("Le nom est invalide");
            	FacesMessage fmsg= new FacesMessage( FacesMessage.SEVERITY_ERROR, NOM_EXISTE_DEJA, null ) ;
                throw new ValidatorException(fmsg);
                       // (Collection<FacesMessage>) new FacesMessage( FacesMessage.SEVERITY_ERROR, summary:"Erreur de validation", null ) );
            }
     /*   } catch ( ValidatorException e ) {
           
            FacesMessage message = new FacesMessage( FacesMessage.SEVERITY_ERROR, e.getMessage(), null );
            FacesContext facesContext = FacesContext.getCurrentInstance();
            facesContext.addMessage( component.getClientId( facesContext ), message );
        }*/
            
		
	}

}
