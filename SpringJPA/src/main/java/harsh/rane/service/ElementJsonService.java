package harsh.rane.service;

import java.util.List;



public interface ElementJsonService {

	public Element_Json getById(int id);
	public List<Element> getBySourceName(String name);
	public void deleteById(int id);
	public void deleteBySourceName(String name);
	public Iterable<Element> getAllElement();
	public void updateById(int id);
}
