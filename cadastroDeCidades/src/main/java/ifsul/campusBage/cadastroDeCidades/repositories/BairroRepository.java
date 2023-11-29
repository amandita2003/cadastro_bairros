package ifsul.campusBage.cadastroDeCidades.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import ifsul.campusBage.cadastroDeCidades.models.Bairros;
import ifsul.campusBage.cadastroDeCidades.models.Cidade;

public interface BairroRepository extends CrudRepository<Bairros, Long> {
	List<Bairros> findAll();
	@Query(value = "SELECT * FROM public.tbl_bairros ORDER BY populacao DESC LIMIT 5", nativeQuery = true)	
	   List<Bairros> listarPopulacao();
	

}
