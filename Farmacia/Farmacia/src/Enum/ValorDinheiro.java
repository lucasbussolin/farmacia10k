package Enum;

public enum ValorDinheiro {
 	CincoCentavos 	(0.05),
	DezCentavos		(0.1),
	VinteECincoCentavos(0.25),
	CinquentaCentavos(0.5),
	Umreal(1),
	Doisreais(2),
	Cincoreais(5),
	Dezreais(10),
	Vintereais(20),
	Cinquentareais(50),
	Cemreais(100);
	
	private final double value;
	
	ValorDinheiro ( double value )
    {
         this . value = value ;
    }

	public double getValue() {
		return value;
	}

}