package ar.edu.unq.po2.tp7.streams;

public enum LesionDermatologica {
	
	ROJO("Grave",4){
		public LesionDermatologica siguiente() {
			return MIEL;
		}

	},
	GRIS("Moderado",3){
		public LesionDermatologica siguiente() {
			return ROJO;
		}
	},
	AMARILLO("Leve",2){
		public LesionDermatologica siguiente() {
			return GRIS;
		}
	},
	MIEL("Sano",1){
		public LesionDermatologica siguiente() {
			return AMARILLO;
		}
	};
	
	private String descripcion;
	private int riesgo;
	
	LesionDermatologica(String descripcion,int riesgo) {
		this.descripcion = descripcion;
		this.riesgo 	 = riesgo;
	}
	
	public abstract LesionDermatologica siguiente();
		
	
	
}
