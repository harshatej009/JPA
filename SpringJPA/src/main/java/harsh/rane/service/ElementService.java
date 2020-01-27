package harsh.rane.service;

import java.util.List;

import harsh.rane.model.Element;

public interface ElementService {

	public Element getById(int id);
	public List<Element> getBySourceName(String name);
	public void deleteById(int id);
	public void deleteBySourceName(String name);
	public Iterable<Element> getAllElement();
	public void updateById(int id);
}
