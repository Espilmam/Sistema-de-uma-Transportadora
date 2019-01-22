package beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import model.UsuarioCadastrado;

@ManagedBean
@ViewScoped
public class UsuarioBean {
	private UsuarioCadastrado usuario = new UsuarioCadastrado();

	public UsuarioCadastrado getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioCadastrado usuario) {
		this.usuario = usuario;
	}
	
	
	public void cadastrar () {
		 //FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Fatal!", "System Error"));
	}
	
	public void login () {
		
	}
	
	public boolean vazio () {
		return false;
	}
}
