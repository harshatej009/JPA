package harsh.rane.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import harsh.rane.model.Element;

@Repository
public interface ElementRepositoryInt extends CrudRepository<Element, Integer>{

	@Query("FROM Element WHERE element_source_name = ?1")
	List<Element> findByElement_Source_Name(String element_source_name);
	//Element findByElement_Id(int id);
}
