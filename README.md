# Aqui temos uma estrutura que lê o codigo de um candidato em um voto, e depois de 50 votos informa os seguintes dados:
# - total de votos para cada candidato;
# - total de votos nulos;
# - total de votos em branco;

## Algoritmo do Exercicio
    
    INICIO
 	PARA i < 50 FAÇA
		IMPRIMA "Vote nas seguintes opções:"
		       LER VOTO
			CASO 1: PT
			CASO 2: PDT
			CASO 3: PL	
			CASO 4: PSDB
			CASO 5: VOTONULO
			CASO 6: VOTOBRANCO
		PREDEFINIÇÃO IMPRIMA "Vote em uma das opções disponiveis!"
		          FIM CASO       	
       	 FIM PARA
		     
  			IMPRIMA(Total de votos no PT)
  		                IMPRIMA(Total de votos no PDT)
  		                IMPRIMA(Total de votos no PL)
                                                IMPRIMA(Total de votos no PSDB)
                                                IMPRIMA(Total de votos NULO)
                                                IMPRIMA(Total de votos em BRANCO)
  
    FIM
  
  ![fluxograma](https://user-images.githubusercontent.com/104045633/169898715-22c7ed7f-aa86-4ae7-b746-51f35eba91e9.png)
