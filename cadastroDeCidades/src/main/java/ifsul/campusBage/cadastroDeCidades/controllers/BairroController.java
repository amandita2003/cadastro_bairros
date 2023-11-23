package ifsul.campusBage.cadastroDeCidades.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ifsul.campusBage.cadastroDeCidades.models.Bairros;
import ifsul.campusBage.cadastroDeCidades.repositories.BairroRepository;

@Controller
public class BairroController {

	@Autowired // o Spring instancia e injeta neste atributo o repository
	BairroRepository bairroRepository;

	@GetMapping("/exibirForm")
	public String exibirFormCadastrarCidade(Model model) {

		Bairros bairrosAux = new Bairros();
		bairrosAux.setNome("");
		bairrosAux.setPopulacao(0);
		model.addAttribute("umBairro", bairrosAux);

		return "form-cadastro-bairro.jsp";

	}
	@PostMapping("/salvarBairro")
	public String inserirCidadeNoBD(Model model, Bairros bairro) {
	//se o método recebe uma classe de modelo como argumento,
	//o framework Spring cria automaticamente um objeto cidade
	//com os dados recebidos do formulário de cadastro de cidade
	//(para isto ocorrer os campos e atributos DEVEM ter o mesmo nome)
	//salva no banco de dados a cidade (método herdado no repository)
	bairroRepository.save(bairro);
	model.addAttribute("mensagem", "Bairro cadastrado com sucesso");
	return "form-cadastro-bairro.jsp";
	}
	@GetMapping("/listarTodosBairros")
	public String buscarTodosBairros(Model model) {

	List<Bairros> listaAux = (List<Bairros>) bairroRepository.findAll();

	model.addAttribute("listaDeBairros", listaAux);

	return "lista-de-bairros.jsp";

	}
	@GetMapping("/bairrosPopulosos")
	public String buscarBairrosPopulosos(Model model) {

	List<Bairros> listaPop = (List<Bairros>) bairroRepository.listarPopulacao();

	model.addAttribute("listaDeBairrosPopulacao", listaPop);

	return "lista-de-bairros-pop.jsp";

	}
	
}
