package util;

// bom  para ser usado como primarys key das tabelas, mas pode ser melhor repensada
public class ID {

	private Long id;
	
	public ID(long id) {
		this.id = id;
	}
	
//	private ID getInstance(){
//		if (id == null){
//			id = new Long(0);
//		}
//		return this;
//	}
//	
//	public long getNewID () {
//		
//		return 
//	}
	
	public Long getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object idRecebido) {
		if (this == idRecebido)
			return true;
		if (idRecebido == null)
			return false;
		if (!(idRecebido instanceof ID))
			return false;
		return ((ID) idRecebido).getId() == this.getId();
	}
}
