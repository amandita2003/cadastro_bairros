package ifsul.campusBage.cadastroDeCidades.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import ifsul.campusBage.cadastroDeCidades.models.Cidade;

public interface CidadeRepository extends CrudRepository<Cidade, Long> {
    
	   @Query(value = "SELECT * FROM public.cidade WHERE estado NOT IN ('RJ','SP', 'SC' )", nativeQuery = true)	
	   List<Cidade> listarTodasExcetoSP_RJ_SC();
	   @Query(value = "SELECT estado, count(*) as qtd_cidades FROM public.cidadeGROUP BY estado HAVING count(*) >= :qtdMinCidades", nativeQuery = true)	
	   List<Cidade> countCidadesByEstadoHaving(int qtdMinCidade);
	   
	    
}

