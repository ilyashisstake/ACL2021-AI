package engine;

import java.util.*; 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Case {

	private int [][] labyrinthe; 
	
	private int [][] portail;
	
	private int [][] bonus;
	
	private int [][] malus;
	
	private int [][] sortie; 
	
	private int [][] cle; 
	
	private int [][] potion; 
	
	private int [][] munition;
	
	
	public Case(){
		
		List<List<Integer>> liste= new ArrayList<List<Integer>>();
		for (int k = 160;k<180;k=k+20) {
			for(int j=0;j<140;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		
		for (int k = 40;k<60;k=k+20) {
			for(int j=80;j<140;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		
		for (int k = 40;k<240;k=k+20) {
			for(int j=120;j<140;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		for (int k = 40;k<120;k=k+20) {
			for(int j=60;j<80;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
	
		for (int k = 0;k<80;k=k+20) {
			for(int j=200;j<220;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		for (int k = 120;k<140;k=k+20) {
			for(int j=120;j<220;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		for (int k = 240;k<260;k=k+20) {
			for(int j=120;j<220;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		for (int k = 180;k<240;k=k+20) {
			for(int j=200;j<220;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		for (int k = 180;k<200;k=k+20) {
			for(int j=220;j<300;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		for (int k = 80;k<200;k=k+20) {
			for(int j=280;j<300;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		
		for (int k = 240;k<260;k=k+20) {
			for(int j=280;j<360;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		
		for (int k = 340;k<360;k=k+20) {
			for(int j=300;j<360;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		for (int k = 340;k<360;k=k+20) {
			for(int j=0;j<80;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		
		
		for (int k = 220;k<300;k=k+20) {
			for(int j=60;j<80;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		
		for (int k = 280;k<360;k=k+20) {
			for(int j=120;j<140;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		for (int k = 280;k<300;k=k+20) {
			for(int j=60;j<140;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		for (int k = 340;k<360;k=k+20) {
			for(int j=140;j<220;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		
		for (int k = 300;k<400;k=k+20) {
			for(int j=260;j<280;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		
		for (int k = 280;k<300;k=k+20) {
			for(int j=200;j<280;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		for (int k = 400;k<420;k=k+20) {
			for(int j=200;j<280;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		for (int k = 360;k<480;k=k+20) {
			for(int j=200;j<220;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		
		for (int k = 460;k<480;k=k+20) {
			for(int j=80;j<220;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		
		for (int k = 400;k<500;k=k+20) {
			for(int j=80;j<100;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		
		for (int k = 400;k<420;k=k+20) {
			for(int j=80;j<180;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		
		for (int k = 400;k<540;k=k+20) {
			for(int j=300;j<320;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		
		labyrinthe=new int[liste.size()][];
		for(int k=0;k<liste.size();k++) {
			 	Object [] l=liste.get(k).toArray();
			 	int[] obj_int = new int[l.length];
			 	for(int i=0; i < l.length; i++)
			 	  
			 	  obj_int[i]=(int) l[i];
			 	labyrinthe[k]=obj_int;
		}
		
		
		portail= new int [][] {{360,280}};
		sortie= new int [][] {{500,320}};
		bonus= new int [][] {{60,100},{220,140},{440,100}};
		malus= new int [][] {{500,100},{340,100}};
		cle= new int [][] {};
		potion= new int [][] {};
		munition= new int [][] {};
	}
	
	public Case(String Fichier) {
		BufferedReader helpReader;
		int j=0;
		List<List<Integer>> liste= new ArrayList<List<Integer>>();
		List<List<Integer>> listebonus= new ArrayList<List<Integer>>();
		List<List<Integer>> listemalus= new ArrayList<List<Integer>>();
		List<List<Integer>> listeportail= new ArrayList<List<Integer>>();
		List<List<Integer>> listesortie= new ArrayList<List<Integer>>();
		List<List<Integer>> listecle= new ArrayList<List<Integer>>();
		List<List<Integer>> listepotion= new ArrayList<List<Integer>>();
		List<List<Integer>> listemunition= new ArrayList<List<Integer>>();
		try {
			helpReader = new BufferedReader(new FileReader(Fichier));
			String ligne;
			while ((ligne = helpReader.readLine()) != null) {
				String[] lignes=ligne.split(" ");
				for (int i = 0; i < lignes.length; i++) {
		            if(lignes[i].equals("M")) {
		            	liste.add(new ArrayList<Integer>());
						liste.get(liste.size()-1).add(i*20);
						liste.get(liste.size()-1).add(j*20);
		            }
		            if(lignes[i].equals("S")) {
		            	listesortie.add(new ArrayList<Integer>());
						listesortie.get(listesortie.size()-1).add(i*20);
						listesortie.get(listesortie.size()-1).add(j*20);
		            }
		            if(lignes[i].equals("B")) {
		            	listebonus.add(new ArrayList<Integer>());
						listebonus.get(listebonus.size()-1).add(i*20);
						listebonus.get(listebonus.size()-1).add(j*20);
		            }
		            if(lignes[i].equals("P")) {
		            	listeportail.add(new ArrayList<Integer>());
						listeportail.get(listeportail.size()-1).add(i*20);
						listeportail.get(listeportail.size()-1).add(j*20);
		            }
		            if(lignes[i].equals("C")) {
		            	listecle.add(new ArrayList<Integer>());
						listecle.get(listecle.size()-1).add(i*20);
						listecle.get(listecle.size()-1).add(j*20);
		            }
		            if(lignes[i].equals("Z")) {
		            	listemalus.add(new ArrayList<Integer>());
						listemalus.get(listemalus.size()-1).add(i*20);
						listemalus.get(listemalus.size()-1).add(j*20);
		            }
		            if(lignes[i].equals("T")) {
		            	listepotion.add(new ArrayList<Integer>());
						listepotion.get(listepotion.size()-1).add(i*20);
						listepotion.get(listepotion.size()-1).add(j*20);
		            }
		            if(lignes[i].equals("O")) {
		            	listemunition.add(new ArrayList<Integer>());
						listemunition.get(listemunition.size()-1).add(i*20);
						listemunition.get(listemunition.size()-1).add(j*20);
		            }
		        }
				j=j+1;
			}
			helpReader.close();
		} catch (IOException e) {
			System.out.println("Plateau not available");
		}
		labyrinthe=new int[liste.size()][];
		for(int k=0;k<liste.size();k++) {
			 	Object [] l=liste.get(k).toArray();
			 	int[] obj_int = new int[l.length];
			 	for(int i=0; i < l.length; i++)
			 	  
			 	  obj_int[i]=(int) l[i];
			 	labyrinthe[k]=obj_int;
		}
		portail=new int[listeportail.size()][];
		for(int k=0;k<listeportail.size();k++) {
			 	Object [] l=listeportail.get(k).toArray();
			 	int[] obj_int = new int[l.length];
			 	for(int i=0; i < l.length; i++)
			 	  
			 	  obj_int[i]=(int) l[i];
			 	portail[k]=obj_int;
		}
		sortie=new int[listesortie.size()][];
		for(int k=0;k<listesortie.size();k++) {
			 	Object [] l=listesortie.get(k).toArray();
			 	int[] obj_int = new int[l.length];
			 	for(int i=0; i < l.length; i++)
			 	  
			 	  obj_int[i]=(int) l[i];
			 	sortie[k]=obj_int;
		}
		bonus=new int[listebonus.size()][];
		for(int k=0;k<listebonus.size();k++) {
			 	Object [] l=listebonus.get(k).toArray();
			 	int[] obj_int = new int[l.length];
			 	for(int i=0; i < l.length; i++)
			 	  
			 	  obj_int[i]=(int) l[i];
			 	bonus[k]=obj_int;
		}
		malus=new int[listemalus.size()][];
		for(int k=0;k<listemalus.size();k++) {
			 	Object [] l=listemalus.get(k).toArray();
			 	int[] obj_int = new int[l.length];
			 	for(int i=0; i < l.length; i++)
			 	  
			 	  obj_int[i]=(int) l[i];
			 	malus[k]=obj_int;
		}
		
		cle=new int[listecle.size()][];
		for(int k=0;k<listecle.size();k++) {
			 	Object [] l=listecle.get(k).toArray();
			 	int[] obj_int = new int[l.length];
			 	for(int i=0; i < l.length; i++)
			 	  
			 	  obj_int[i]=(int) l[i];
			 	cle[k]=obj_int;
		}
		potion=new int[listepotion.size()][];
		for(int k=0;k<listepotion.size();k++) {
			 	Object [] l=listepotion.get(k).toArray();
			 	int[] obj_int = new int[l.length];
			 	for(int i=0; i < l.length; i++)
			 	  
			 	  obj_int[i]=(int) l[i];
			 	potion[k]=obj_int;
		}
		
		munition=new int[listemunition.size()][];
		for(int k=0;k<listemunition.size();k++) {
			 	Object [] l=listemunition.get(k).toArray();
			 	int[] obj_int = new int[l.length];
			 	for(int i=0; i < l.length; i++)
			 	  
			 	  obj_int[i]=(int) l[i];
			 	munition[k]=obj_int;
		}
		
	}
	
	
	public int [][] getLabyrinthe(){
		return labyrinthe;
	}
	public int [][] getSortie(){
		return sortie;
	}
	public int [][] getMalus(){
		return malus;
	}
	public int [][] getBonus(){
		return bonus;
	}
	public int [][] getPortail(){
		return portail;
	}
	
	public int [][] getCle(){
		return cle;
	}
	public int [][] getPotion(){
		return potion;
	}
	
	public int [][] getMunition(){
		return munition;
	}
	
	public void removePotion(int x,int y) {
		 for (int i = 0; i < this.potion.length; i++) {
			 if (this.potion[i][0]==x && this.potion[i][1]==y) {
	                int [][] newArr = new int[this.potion.length - 1][2];
	                for(int index = 0; index < i; index++){
	                    newArr[index] = this.potion[index];
	                }
	                for(int j = i; j < this.potion.length - 1; j++){
	                    newArr[j] = this.potion[j+1];
	                }
	                this.potion=newArr.clone();
	                break;
	            }
	        }
		
	}
	public void removeMunition(int x,int y) {
		 for (int i = 0; i < this.munition.length; i++) {
			 if (this.munition[i][0]==x && this.munition[i][1]==y) {
	                int [][] newArr = new int[this.munition.length - 1][2];
	                for(int index = 0; index < i; index++){
	                    newArr[index] = this.munition[index];
	                }
	                for(int j = i; j < this.munition.length - 1; j++){
	                    newArr[j] = this.munition[j+1];
	                }
	                this.munition=newArr.clone();
	                break;
	            }
	        }
		
	}
	public void removeCle(int x,int y) {
		 for (int i = 0; i < this.cle.length; i++) {
			 if (this.cle[i][0]==x && this.cle[i][1]==y) {
	                int [][] newArr = new int[this.cle.length - 1][2];
	                for(int index = 0; index < i; index++){
	                    newArr[index] = this.cle[index];
	                }
	                for(int j = i; j < this.cle.length - 1; j++){
	                    newArr[j] = this.cle[j+1];
	                }
	                this.cle=newArr.clone();
	                break;
	            }
	        }
		
	}
	public void removeBonus(int x,int y) {
		 for (int i = 0; i < this.bonus.length; i++) {
			 if (this.bonus[i][0]==x && this.bonus[i][1]==y) {
	                int [][] newArr = new int[this.bonus.length - 1][2];
	                for(int index = 0; index < i; index++){
	                    newArr[index] = this.bonus[index];
	                }
	                for(int j = i; j < this.bonus.length - 1; j++){
	                    newArr[j] = this.bonus[j+1];
	                }
	                this.bonus=newArr.clone();
	                break;
	            }
	        }
		
	}
	public void removeMalus(int x,int y) {
		 for (int i = 0; i < this.malus.length; i++) {
			 if (this.malus[i][0]==x && this.malus[i][1]==y) {
	                int [][] newArr = new int[this.malus.length - 1][2];
	                for(int index = 0; index < i; index++){
	                    newArr[index] = this.malus[index];
	                }
	                for(int j = i; j < this.malus.length - 1; j++){
	                    newArr[j] = this.malus[j+1];
	                }
	                this.malus=newArr.clone();
	                break;
	            }
	        }
		
	}
}
