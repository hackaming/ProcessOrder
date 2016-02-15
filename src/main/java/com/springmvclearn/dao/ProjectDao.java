package com.springmvclearn.dao;

import java.util.List;

import com.springmvclearn.model.Project;

public interface ProjectDao {
	public void addProject(Project project);
	public void deleteProject(Project project);
	public void deleteProjectById(int id);
	public List<Project> findAll();
	public Project findById(int id);
}
