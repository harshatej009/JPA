package harsh.rane.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import harsh.rane.dao.ElementRepositoryInt;
import harsh.rane.model.Element;


@Service
public class ElementServiceImpl implements ElementService{

	
	@Autowired
	ElementRepositoryInt elementRepository;
	
	@Override
	public Element getById(int id) {
		// TODO Auto-generated method stub
		//return elementRepository.findByElement_Id(id);
		return null;
	}

	@Override
	public List<Element> getBySourceName(String name) {
		// TODO Auto-generated method stub
		return elementRepository.findByElement_Source_Name(name);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		elementRepository.delete(id);
	}

	@Override
	public void deleteBySourceName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iterable<Element> getAllElement() {
		
		return elementRepository.findAll();
		
	}

	@Override
	public void updateById(int id) {
		// TODO Auto-generated method stub
		
	}

}
