package Entities;

import Abstract.Entity;

public class Campaign implements Entity{

		private int id;
		private String description;
		
		public Campaign(int id, String description) {
			super();
			this.id = id;
			this.description = description;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		
		
	}