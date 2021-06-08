package ficheroArrayPartido;



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MainPartido {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		
		ArrayList<PartidoFutbol> partidos=new ArrayList<PartidoFutbol>();
		String path=("Partidos.txt");
		
		
	
		try {
			
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(path)));
			bw.write("atletico:barsa:3:2");
			bw.newLine();
			bw.write("madrid:celta:2:3");
			bw.newLine();
			bw.write("sevilla:valencia:2:2");
			bw.close();
		}catch(Exception e) {
			System.out.println("Error de lectura");
		}
		
		
		try {
			
			Scanner s = new Scanner(new File(path));
			while(s.hasNextLine()) {
				String linea = s.nextLine();
				System.out.println(linea);
				
				String[] cortarString=linea.split(":");
				
				PartidoFutbol partido = new PartidoFutbol();
				
				partido.setLocal(cortarString[0]);
				partido.setVisitante(cortarString[1]);
				partido.setPtsLocal(Integer.parseInt((cortarString[2])));
				partido.setPtsVisitante(Integer.parseInt(cortarString[3]));
				
				partidos.add(partido);
				
				
			}
			
		}catch(Exception e) {
			System.out.println("Error de lectura 2");
		}
		System.out.println("-----------+-----------");
		System.out.println("Se han guardado "+partidos.size()+" partidos de fútbol");
		System.out.println("-----------+-----------");
		System.out.println("Resultados de los partidos de fútbol");
		
		for(PartidoFutbol partido:partidos) {
			
				System.out.println(partido.getLocal()+" "+partido.getPtsLocal()
				+" - "+partido.getVisitante()+ " "+partido.getPtsVisitante());
			
		}
		System.out.println("-----------+-----------");
		System.out.println("Partidos empatados");
		Iterator<PartidoFutbol> itPartido=partidos.iterator();
		while(itPartido.hasNext()) {
			PartidoFutbol partido=itPartido.next();
			if(partido.getPtsLocal()!=partido.getPtsVisitante())
				itPartido.remove();
		}
		
		
		itPartido=partidos.iterator();
		while(itPartido.hasNext()) {
			PartidoFutbol partido=itPartido.next();
			System.out.println(partido.getLocal()+" "+partido.getPtsLocal()
								+" - "+partido.getVisitante()+ " "+partido.getPtsVisitante());
		}
	}
		
	}


